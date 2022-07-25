package web.service;

import org.springframework.stereotype.Service;
import web.mоdelUser.User;

import javax.transaction.Transactional;
import java.util.List;
@Service
public interface UserService {


    public List<User> getAllUsers();

    public void removeUser(int id);
    public void createUser(User user);


    public User readUserById(int userId);

    public User getUser(int id);

    public void editUser(int id, String name, String lastname);
}