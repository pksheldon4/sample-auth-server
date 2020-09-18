package com.pksheldon4.sample.authserver.service;

import com.pksheldon4.sample.authserver.web.model.User;
import com.pksheldon4.sample.authserver.validation.EmailExistsException;

public interface IUserService {

    User registerNewUser(User user) throws EmailExistsException;

}
