package com.membership.service;

import com.membership.domain.Checker;
import com.membership.domain.Member;
import com.membership.repository.CheckerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CheckerServiceImpl implements CheckerService{

    @Autowired
    CheckerRepository checkerRepository;

    @Override
    public Member authenticateChecker(String userName, String password) {
        return checkerRepository.getCheckerByUserNamePassword(userName, password).getMember();
    }
}
