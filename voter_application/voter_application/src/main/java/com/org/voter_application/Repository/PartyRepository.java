package com.org.voter_application.Repository;

import com.org.voter_application.Entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {
    boolean existsByNameOfNewParty(String nameOfNewParty);
//    Party findById(int id);
}
