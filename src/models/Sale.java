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

    public Sale() {
    }

    public Sale(int id, Fecha sale_at, Article article, Client client, int quantity) {
        this.id = id;
        this.sale_at = sale_at;
        this.article = article;
        this.client = client;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Fecha getSaleAt() {
        return sale_at;
    }

    public void setSaleAt(Fecha sale_at) {
        this.sale_at = sale_at;
    }
    
    

    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", article=" + article + ", client=" + client + ", sale_at=" + sale_at + '}';
    }
    
}
