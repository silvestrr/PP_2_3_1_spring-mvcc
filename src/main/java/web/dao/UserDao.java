package web.dao;

import web.mоdelUser.User;

import java.util.List;

public interface UserDao {
    public User findUserById(int userId);
    public void addUser(User user);
    public List<User> getAllUsers();
    public void removeUser(int id);
    public User getUser(int id);
    void editUser(int id, String name, String lastname);
}