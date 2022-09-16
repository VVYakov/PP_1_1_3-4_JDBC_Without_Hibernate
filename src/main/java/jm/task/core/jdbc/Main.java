package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Vladislav", "Yakovenko",  (byte) 10);
        userServiceImpl.saveUser("Stanislav", "Sidorov",  (byte) 22);
        userServiceImpl.saveUser("Vasya", "Pupkin",  (byte) 34);
        userServiceImpl.saveUser("Petya", "Zolotov",  (byte) 51);
        userServiceImpl.getAllUsers();
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();
    }
}
