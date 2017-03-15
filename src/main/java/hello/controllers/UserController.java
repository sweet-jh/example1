package hello.controllers;

/**
 * Created by hjing on 3/10/17.
 */

import hello.models.User;
import hello.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserDao _userDao;

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(long id) {
        try {
            User user = new User(id);
            _userDao.delete(user);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "User successfully deleted!";
    }
} // class UserController
