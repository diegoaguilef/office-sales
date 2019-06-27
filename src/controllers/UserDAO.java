/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.User;

/**
 *
 * @author diego
 */
public class UserDAO {

    private static ArrayList<User> users = new ArrayList<>();

    /**
     *
     * @return
     */
    public static ArrayList<User> all() {
        return users;
    }

    /**
     *
     */
    public static void fillUsers() {
        create(new User("diego", "diego123", "Diego", "1-1"));
        create(new User("polo", "polo123", "Polisky", "2-2"));
        create(new User("carls", "ca123", "Carl", "3-3"));
        create(new User("common", "com123", "Comon", "4-4"));
        create(new User("perl", "perl123", "Perla", "5-5"));
    }

    /**
     *
     * @param user
     * @return
     */
    public static boolean create(User user) {
        if (!users.stream().noneMatch((b) -> (b.getUsername().equals(user.getUsername())))) {
            return false;
        }
        users.add(user);
        return true;
    }

    /**
     *
     * @param user
     * @return
     */
    public static boolean update(User user) {
        int i = 0;
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                users.set(i, user);
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     *
     * @param rut
     * @return
     */
    public static User findByRut(String rut) {
        User user = null;
        for (User u : users) {
            if (u.getRut().equals(rut)) {
                user = u;
            }
        }
        return user;
    }

    /**
     *
     * @param username
     * @return
     */
    public static User findUsername(String username) {
        User user = null;
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                user = u;
            }
        }
        return user;
    }

    /**
     *
     * @param password
     * @return
     */
    public static User findPassword(String password) {
        User user = null;
        for (User u : users) {
            if (u.getPassword().equals(password)) {
                user = u;
            }
        }
        return user;
    }

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public static User session(String username, String password) {
        User user = null;

        for (User u : users) {
            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)) {
                user = u;
            }
        }
        return user;
    }

    /**
     *
     * @param username
     * @return
     */
    public static boolean delete(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                users.remove(u);
                return true;
            }
        }
        return false;
    }
}
