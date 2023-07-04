package com.org.voter_application.Service;

import com.org.voter_application.Dto.VoteDto;
import com.org.voter_application.Entity.Vote;

import java.util.List;

public interface VoteService {

    String addVote(VoteDto voteDto);

    List<Vote> findAllVote();
}
