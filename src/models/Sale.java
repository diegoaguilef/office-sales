/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import helpers.Date;

/**
 *
 * @author diego
 */
public class Sale {
    private int id;
    private Article article;
    private Client client;
    private Date sale_at;

    public Sale() {
    }

    public Sale(int id, Article article, Client client, Date sale_at) {
        this.id = id;
        this.article = article;
        this.client = client;
        this.sale_at = sale_at;
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

    public Date getSale_at() {
        return sale_at;
    }

    public void setSale_at(Date sale_at) {
        this.sale_at = sale_at;
    }
    
    

    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", article=" + article + ", client=" + client + ", sale_at=" + sale_at + '}';
    }
    
}
