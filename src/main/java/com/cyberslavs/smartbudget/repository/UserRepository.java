package com.cyberslavs.smartbudget.repository;

import com.cyberslavs.smartbudget.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    // Custom query
//    @Query("SELECT t FROM Transaction t WHERE t.publishDate > :date")
//    List<User> findByPublishedDateAfter(@Param("date") LocalDate date);

}