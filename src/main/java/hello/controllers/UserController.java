package hello.controllers;

/**
 * Created by hjing on 3/10/17.
 */

import hello.models.User;
import hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get")
    public User getOneItem(long id) {
        return userService.getOne(id);
    }
} // class UserController
