package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.UserDaoImpl;
import web.mоdelUser.User;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private final UserDaoImpl userDao;
    @Autowired
    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void createUser(User user) {
        userDao.addUser(user);
    }
    @Override
    public User removeUser(int id) {
        return userDao.removeUser(id);
    }
    @Override
    public User readUserById(int userId) {
        return userDao.findUserById(userId);
    }
    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
    @Override
    public void editUser(int id, String name, String lastname) {
        userDao.editUser(id,name,lastname);
    }
}
