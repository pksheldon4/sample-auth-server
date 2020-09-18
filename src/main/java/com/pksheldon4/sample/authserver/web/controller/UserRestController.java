package com.pksheldon4.sample.authserver.web.controller;

import com.pksheldon4.sample.authserver.persistence.UserRepository;
import com.pksheldon4.sample.authserver.service.IUserService;
import com.pksheldon4.sample.authserver.validation.EmailExistsException;
import com.pksheldon4.sample.authserver.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IUserService userService;

    //

    @RequestMapping
    public List<User> list() {
        return userRepository.findAll();
    }

    @RequestMapping("{id}")
    public User view(@PathVariable("id") User user) {
        return user;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@Valid final User user) throws EmailExistsException {
        return userService.registerNewUser(user);
    }

    @RequestMapping(value = "delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") final Long id) {
        userRepository.deleteById(id);
    }

}
