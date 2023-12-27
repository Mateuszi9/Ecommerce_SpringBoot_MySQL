package com.mateuszi9.service;

import com.mateuszi9.exception.UserException;
import com.mateuszi9.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;


}
