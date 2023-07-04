package com.org.voter_application.Repository;

import com.org.voter_application.Entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Vote findByVoterId(String voterId);
}
