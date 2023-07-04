package com.org.voter_application.Controller;

import com.org.voter_application.Dto.CreateElectionDto;
import com.org.voter_application.Entity.CreateElection;
import com.org.voter_application.Entity.VoterRegistration;
import com.org.voter_application.Service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/create-election")
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @PostMapping(path="/save")
    public String createElection(@RequestBody CreateElectionDto createElectionDto){
        String id =electionService.addElection(createElectionDto);
        return id;
    }

    @GetMapping(path="/getAllTypeOfElection")
    public List<CreateElection> getAllTypeOfElection(){
        return electionService.findAllElection();
    }
}
