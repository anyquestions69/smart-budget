package com.cyberslavs.smartbudget.repository;

import com.cyberslavs.smartbudget.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

    Wallet findByEmail(String email);
    // Custom query
//    @Query("SELECT t FROM Transaction t WHERE t.publishDate > :date")
//    List<User> findByPublishedDateAfter(@Param("date") LocalDate date);

}