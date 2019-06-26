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

    public User() {
    }

    public User(String username, String password, String name, String rut) {
        super(name, rut);
        this.username = username;
        this.password = password;
        this.loginAttempts = 0;
        this.locked = false;
    }

    public User(String username, String password, String name, String rut, boolean locked) {
        super(name, rut);
        this.username = username;
        this.password = password;
        this.loginAttempts = 0;
        this.locked = locked;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void loginAttempt() {
        this.loginAttempts += 1;
        if (loginAttempts >= 3) {
            lockUser();
        }

    }

    public int remainingAttempts() {
        return 3 - loginAttempts;
    }

    public boolean isLocked() {
        return locked;
    }

    public void lockUser() {
        this.locked = true;
    }

    public String displayStatus() {
        return isLocked() ? "Bloqueado" : "Habilitado";
    }

    public void unlockUser() {
        this.loginAttempts = 0;
        this.locked = false;
    }

    @Override
    public String toString() {
        return "Usuario: " + username + " - Nombre: " + getName() + " - Rut: " + getRut() + " - Estado: "+displayStatus();
    }

}
