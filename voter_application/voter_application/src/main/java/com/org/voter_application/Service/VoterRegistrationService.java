package com.org.voter_application.Service;

import com.org.voter_application.Dto.LoginDto;
import com.org.voter_application.Dto.VoterRegistrationDto;
import com.org.voter_application.Entity.VoterRegistration;
import com.org.voter_application.Response.LoginResponse;

import java.util.List;

public interface VoterRegistrationService {
    String registerVoter(VoterRegistrationDto voterRegistrationDto);

    LoginResponse loginEmployee(LoginDto loginDTO);

    List<VoterRegistration> findAllVoter();
}
