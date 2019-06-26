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
public class Client extends Person {
    private String address;
    private int phone;
    private String firm;
    
    public Client(){}

    public Client(String address, int phone, String firm, String name, String rut) {
        super(name, rut);
        this.address = address;
        this.phone = phone;
        this.firm = firm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public String toString() {
        return "Client{" + "address=" + address + ", phone=" + phone + ", firm=" + firm + '}';
    }
    
}
