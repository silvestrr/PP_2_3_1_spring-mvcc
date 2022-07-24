package web.dao;

import web.mоdelUser.User;

import java.util.List;

public interface UserDao {
    User findUserById(int userId);
    void addUser(User user);
    List<User> getAllUsers();
    User removeUser(int id);
    User getUser(int id);
    void editUser(int id, String name, String lastname);
}