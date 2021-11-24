package ru.malyshev.springmvc.dao;


import ru.malyshev.springmvc.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();


}
