package com.ljm.service;

import com.ljm.model.Account;

import java.util.List;

/**
 * Created by liujm on 2017/12/30.
 */
public interface IAccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
