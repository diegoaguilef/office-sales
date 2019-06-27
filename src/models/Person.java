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
public class Person {
    private String name;
    private String rut;

    /**
     *
     */
    public Person() {
    }
    
    /**
     *
     * @param name
     * @param rut
     */
    public Person(String name, String rut) {
        this.name = name;
        this.rut = rut;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getRut() {
        return rut;
    }

    /**
     *
     * @param rut
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", rut=" + rut + '}';
    }
    
    
}
