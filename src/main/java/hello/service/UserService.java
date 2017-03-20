package hello.service;

import hello.models.User;
import hello.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hjing on 3/16/17.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getOne(Long id) {
        return userDao.findOne(id);
    }

    public void createItem() {
        User user = new User();
        user.setName("Niu Wanlu");
        userDao.save(user);
    }

    public void deleteItem(Long id) {
        userDao.delete(id);
    }
}
