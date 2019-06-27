/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import helpers.Fecha;

/**
 *
 * @author diego
 */
public class Sale {
    private int id;
    private Fecha sale_at;
    private Article article;
    private Client client;
    private int quantity;
    private double net;
    private int total;

    /**
     *
     */
    public Sale() {
    }

    /**
     *
     * @param id
     * @param sale_at
     * @param article
     * @param client
     * @param quantity
     */
    public Sale(int id, Fecha sale_at, Article article, Client client, int quantity) {
        this.id = id;
        this.sale_at = sale_at;
        this.article = article;
        this.client = client;
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public double getNet() {
        return net;
    }

    /**
     *
     * @param net
     */
    public void setNet(double net) {
        this.net = net;
    }

    /**
     *
     * @return
     */
    public int getTotal() {
        return total;
    }

    /**
     *
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public Article getArticle() {
        return article;
    }

    /**
     *
     * @param article
     */
    public void setArticle(Article article) {
        this.article = article;
    }

    /**
     *
     * @return
     */
    public Client getClient() {
        return client;
    }

    /**
     *
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     *
     * @return
     */
    public Fecha getSaleAt() {
        return sale_at;
    }

    /**
     *
     * @param sale_at
     */
    public void setSaleAt(Fecha sale_at) {
        this.sale_at = sale_at;
    }
    
    

    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", article=" + article + ", client=" + client + ", sale_at=" + sale_at + '}';
    }
    
}
