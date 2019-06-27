/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author diego
 */
public class User extends Person {

    private String username;
    private String password;
    private int loginAttempts;
    private boolean locked;

    /**
     *
     */
    public User() {
    }

    /**
     *
     * @param username
     * @param password
     * @param name
     * @param rut
     */
    public User(String username, String password, String name, String rut) {
        super(name, rut);
        this.username = username;
        this.password = password;
        this.loginAttempts = 0;
        this.locked = false;
    }

    /**
     *
     * @param username
     * @param password
     * @param name
     * @param rut
     * @param locked
     */
    public User(String username, String password, String name, String rut, boolean locked) {
        super(name, rut);
        this.username = username;
        this.password = password;
        this.loginAttempts = 0;
        this.locked = locked;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     */
    public void loginAttempt() {
        this.loginAttempts += 1;
        if (loginAttempts >= 3) {
            lockUser();
        }

    }

    /**
     *
     * @return
     */
    public int remainingAttempts() {
        return 3 - loginAttempts;
    }

    /**
     *
     * @return
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     *
     */
    public void lockUser() {
        this.locked = true;
    }

    /**
     *
     * @return
     */
    public String displayStatus() {
        return isLocked() ? "Bloqueado" : "Habilitado";
    }

    /**
     *
     */
    public void unlockUser() {
        this.loginAttempts = 0;
        this.locked = false;
    }

    @Override
    public String toString() {
        return "Usuario: " + username + " - Nombre: " + getName() + " - Rut: " + getRut() + " - Estado: "+displayStatus();
    }

}
