package com.org.voter_application.Service;

import com.org.voter_application.Dto.VoteDto;
import com.org.voter_application.Entity.Vote;
import com.org.voter_application.Repository.VoteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class VoteServiceImpl implements VoteService{

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public String addVote(VoteDto voteDto) {
       Vote vote= voteRepository.findByVoterId(voteDto.getVoterId());

       if(vote==null){
           Vote vote1 = new Vote();
           vote1.setVoted(voteDto.isVoted());
           vote1.setVoterId(voteDto.getVoterId());
           vote1.setVoterName(voteDto.getVoterName());
           vote1.setPartyId(voteDto.getPartyId());
           vote1.setCandidateVoterId(voteDto.getCandidateVoterId());
               voteRepository.save(vote1);
           return vote1.getVoterName();
           }

        return vote.getVoterName();
    }

    @Override
    public List<Vote> findAllVote() {
        return voteRepository.findAll();
    }
}
