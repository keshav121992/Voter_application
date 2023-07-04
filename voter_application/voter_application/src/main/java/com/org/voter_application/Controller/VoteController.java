package com.org.voter_application.Controller;

import com.org.voter_application.Dto.VoteDto;
import com.org.voter_application.Entity.Party;
import com.org.voter_application.Entity.Vote;
import com.org.voter_application.Service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vote")
public class VoteController {

    @Autowired
    private VoteService voteService;


    @PostMapping(path = "/vote")
    public String doVote(@RequestBody VoteDto voteDto){
           String id = voteService.addVote(voteDto);
        return id;
    }

    @GetMapping(path="/getAllVote")
    public List<Vote> getAllVote(){
        return voteService.findAllVote();
    }
}
