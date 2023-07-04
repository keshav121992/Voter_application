package com.org.voter_application.Service;

import com.org.voter_application.Dto.PartyDto;
import com.org.voter_application.Entity.Party;

import java.util.List;

public interface PartyService {
    String addParty(PartyDto partyDto);

    List<Party> findAllParty();
}
