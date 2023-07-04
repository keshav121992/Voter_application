package com.org.voter_application.Service;

import com.org.voter_application.Dto.CreateElectionDto;
import com.org.voter_application.Entity.CreateElection;
import com.org.voter_application.Repository.ElectionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ElectionServiceImpl implements ElectionService {

    @Autowired
    private ElectionRepository electionRepository;
    @Override
    public String addElection(CreateElectionDto createElectionDto) {

        CreateElection createElection = new CreateElection(
                createElectionDto.getId(),
                createElectionDto.getName(),
                createElectionDto.getIncludeInstructor(),
                createElectionDto.getAdditionalInstruction(),
                createElectionDto.getStartDateAndTime(),
                createElectionDto.getEndDateAndTime(),
                createElectionDto.isActive()
        );
        electionRepository.save(createElection);
        return createElection.getName();
    }

    @Override
    public List<CreateElection> findAllElection() {
        return electionRepository.findAll();
    }
}
