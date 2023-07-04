package com.org.voter_application.Controller;

import com.org.voter_application.Dto.LoginDto;
import com.org.voter_application.Dto.VoterRegistrationDto;
import com.org.voter_application.Entity.VoterRegistration;
import com.org.voter_application.Response.LoginResponse;
import com.org.voter_application.Service.VoterRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/voter-reg")
public class VoterRegistrationController {

    @Autowired
    private VoterRegistrationService registrationService;


        @PostMapping(path="/save")
        public String addVoter(@RequestBody VoterRegistrationDto voterRegistrationDto){
                String id = registrationService.registerVoter(voterRegistrationDto);
            return id;
        }

        @GetMapping(path="/getallvoter")
        public List<VoterRegistration> getAllRegisterVoter(){
            return registrationService.findAllVoter();
        }

        @PostMapping(path="/login")
        public ResponseEntity<?> loginVoter(@RequestBody LoginDto loginDto){
            LoginResponse loginResponse = registrationService.loginEmployee(loginDto);
            return ResponseEntity.ok(loginResponse);
        }


}
