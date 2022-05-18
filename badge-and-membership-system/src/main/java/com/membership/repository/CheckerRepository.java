package com.membership.repository;

import com.membership.domain.Checker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckerRepository extends JpaRepository<Checker, Long> {
    @Query("select c from Checker c where c.userName=:userName and c.password=:password")
    public Checker getCheckerByUserNamePassword(String userName, String password);
}
