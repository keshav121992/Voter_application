package com.org.voter_application.Service;

import com.org.voter_application.Dto.LoginDto;
import com.org.voter_application.Dto.VoterRegistrationDto;
import com.org.voter_application.Entity.VoterRegistration;
import com.org.voter_application.Repository.VoterRegistrationRepository;
import com.org.voter_application.Response.LoginResponse;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VoterRegistrationServiceImpl implements VoterRegistrationService {

    @Autowired
    private VoterRegistrationRepository voterRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String registerVoter(VoterRegistrationDto voterRegistrationDto) {

        VoterRegistration voterRegistration = new VoterRegistration(
                voterRegistrationDto.getId(),
                voterRegistrationDto.getVoterName(),
                voterRegistrationDto.getGender(),
                voterRegistrationDto.getAge(),
                voterRegistrationDto.getWard(),
                voterRegistrationDto.getVoterId(),
                voterRegistrationDto.getAdharNumber(),
                voterRegistrationDto.getMobileNumber(),
                voterRegistrationDto.getAddress(),
                this.passwordEncoder.encode(voterRegistrationDto.getPassword())
        );
        voterRepository.save(voterRegistration);
        return voterRegistration.getVoterName();
    }

    @Override
    public LoginResponse loginEmployee(LoginDto loginDTO) {

            String msg = "";
            VoterRegistration voterRegistration = voterRepository.findByMobileNumber(loginDTO.getMobileNumber());
            if(voterRegistration!=null){
                String password = loginDTO.getPassword();
                String encodedPassword = voterRegistration.getPassword();
                Boolean isPwdRight = passwordEncoder.matches(password,encodedPassword);
                if(isPwdRight){
                    Optional<VoterRegistration> voterRegistration1 = voterRepository.findOneByMobileNumberAndPassword(loginDTO.getMobileNumber(),encodedPassword);
                    if(voterRegistration1.isPresent()){
                        return new LoginResponse("login success",true);
                    }
                    else{
                            return new LoginResponse("login failed", false);
                    }
                }
                else{
                    return new LoginResponse("password not matched",false);
                }
            } else {
                    return new LoginResponse("mobile number not matched", false);
            }
    }

    @Override
    public List<VoterRegistration> findAllVoter() {
        return  voterRepository.findAll();
    }
}
