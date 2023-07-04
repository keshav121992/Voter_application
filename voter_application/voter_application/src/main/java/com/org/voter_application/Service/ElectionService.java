package com.org.voter_application.Service;

import com.org.voter_application.Dto.CreateElectionDto;
import com.org.voter_application.Entity.CreateElection;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ElectionService {
    String addElection(CreateElectionDto createElectionDto);

    List<CreateElection> findAllElection();
}
