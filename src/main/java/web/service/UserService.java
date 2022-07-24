package web.service;

import web.mоdelUser.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {


    List<User> getAllUsers();

    User removeUser(int id);
    void createUser(User user);


    User readUserById(int userId);

    User getUser(int id);

    void editUser(int id, String name, String lastname);
}