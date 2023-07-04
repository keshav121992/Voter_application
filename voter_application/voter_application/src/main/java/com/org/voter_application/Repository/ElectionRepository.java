package com.org.voter_application.Repository;

import com.org.voter_application.Entity.CreateElection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ElectionRepository extends JpaRepository<CreateElection, Long> {
    CreateElection findByName(String electionName);
}
