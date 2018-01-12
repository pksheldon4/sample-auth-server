package com.example.pksiv.authserver.service;

import com.example.pksiv.authserver.web.model.User;
import com.example.pksiv.authserver.validation.EmailExistsException;

public interface IUserService {

    User registerNewUser(User user) throws EmailExistsException;

}
