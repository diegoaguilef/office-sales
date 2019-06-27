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
    
    /**
     *
     */
    public Client(){}

    /**
     *
     * @param address
     * @param phone
     * @param firm
     * @param name
     * @param rut
     */
    public Client(String address, int phone, String firm, String name, String rut) {
        super(name, rut);
        this.address = address;
        this.phone = phone;
        this.firm = firm;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public int getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getFirm() {
        return firm;
    }

    /**
     *
     * @param firm
     */
    public void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public String toString() {
        return "Rut: "+getRut()+", Nombre: "+getName()+ ", Dirección: "+address + ", Teléfono:" + phone + ", Empresa: " + firm + ' ';
    }
    
}
