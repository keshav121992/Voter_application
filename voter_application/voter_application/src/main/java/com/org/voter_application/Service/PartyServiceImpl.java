package com.org.voter_application.Service;

import com.org.voter_application.Dto.PartyDto;
import com.org.voter_application.Entity.Party;
import com.org.voter_application.Repository.PartyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PartyServiceImpl implements PartyService {

    @Autowired
    private PartyRepository partyRepository;
    @Override
    public String addParty(PartyDto partyDto) {
        if(partyRepository.existsByNameOfNewParty(partyDto.getNameOfNewParty())){
            return "Party Already Exist";
        }
            Party party = new Party();
                        party.setNewParty(partyDto.isNewParty());
                        party.setNameOfNewParty(partyDto.getNameOfNewParty());
                        party.setCandidateName(partyDto.getCandidateName());
                        party.setImage(partyDto.getImage());
                        party.setGender(partyDto.getGender());
                        party.setWard(partyDto.getWard());
                        party.setVoterId(partyDto.getVoterId());
                        party.setAge(partyDto.getAge());
        partyRepository.save(party);

        return party.getCandidateName();
    }

    @Override
    public List<Party> findAllParty() {
        return partyRepository.findAll();
    }
}
