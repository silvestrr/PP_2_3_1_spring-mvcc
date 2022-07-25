package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.mоdelUser.User;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;



@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }
    @Override
    public User findUserById(int userId) {
        Query query = em.createQuery("select u from User u where u.id = :userId", User.class);
        query.setParameter("userId", userId);
        return (User) query.getSingleResult();
    }

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }
    @Override
    public void removeUser(int id) {
        em.remove(getUser(id));

    }
    @Override
    public User getUser(int id) {
        return em.find(User.class, id);
    }
    @Override
    public void editUser(int id, String name, String lastname) {
        User user = getUser(id);
        user.setName(name);
        user.setLastname(lastname);
        em.merge(user);
    }
}
