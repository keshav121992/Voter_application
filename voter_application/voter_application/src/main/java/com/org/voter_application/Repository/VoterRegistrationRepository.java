package com.org.voter_application.Repository;

import com.org.voter_application.Entity.VoterRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoterRegistrationRepository extends JpaRepository<VoterRegistration,Long> {

    Optional<VoterRegistration> findOneByMobileNumberAndPassword(String mobileno, String encodedPassword);
    VoterRegistration findByMobileNumber(String mobileno);

}
