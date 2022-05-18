package com.membership.service;

import com.membership.domain.Member;

public interface CheckerService {
    public Member authenticateChecker(String userName, String password);

}
