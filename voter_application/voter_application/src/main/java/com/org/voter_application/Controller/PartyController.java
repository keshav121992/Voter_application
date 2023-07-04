package com.org.voter_application.Controller;


import com.org.voter_application.Dto.PartyDto;
import com.org.voter_application.Entity.Party;
import com.org.voter_application.Service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/party")
public class PartyController {

    @Autowired
    private PartyService partyService;

        @PostMapping(path="/save")
        public String addParty(@RequestBody PartyDto partyDto){
                String id = partyService.addParty(partyDto);
            return id;
        }

    @GetMapping(path="/getAllParty")
    public List<Party> getAllParty(){
        return partyService.findAllParty();
    }
}
