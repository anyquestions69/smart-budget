package com.cyberslavs.smartbudget.repository;

import com.cyberslavs.smartbudget.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

//        @Query("SELECT t FROM Transaction t WHERE t.publishDate > :date")
//       List<Transaction> findByPublishedDateAfter(@Param("date") LocalDate date);
    //@Query("Select * from transaction where ")
    List<Transaction> findByWalletId(long id);
    List<Transaction> findByCategoryId(long id);
}