package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void save(User user);

    User getUser(int id);

    void delete(int id);
}
