/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import helpers.Date;
import java.util.ArrayList;
import models.Article;
import models.Client;
import models.Sale;

/**
 *
 * @author diego
 */
public class SaleDAO {
    private static ArrayList<Sale> sales = new ArrayList<>();
    
    /**
     *
     * @return
     */
    public static ArrayList<Sale> all(){
        return sales;
    }
    
    /**
     *
     */
    public static void fillSales(){
        Article a1 = new Article(1, "Lapiz", 200, 10);
        Article a2 = new Article(4, "Pendrive", 5000, 2);
        Article a3 = new Article(5, "Tijera", 300, 3);
        Client c1 = new Client("Los Pinos 12", 945572692, "Resit",  "Diego", "1-1");
        Client c2 = new Client("Los Raulies 123", 94588777, "BCI",  "Fernando", "2-2");
        Date d1 = new Date(20, 01, 2019);
        Date d2 = new Date(21, 01, 2019);
        Date d3 = new Date(27, 01, 2019);
        Date d4 = new Date(05, 02, 2019);
        Date d5 = new Date(06, 02, 2019);
        
        create(new Sale(1, a1, c1, d1));
        create(new Sale(2, a1, c1, d1));
        create(new Sale(3, a2, c2, d2));
        create(new Sale(4, a3, c2, d2));
        create(new Sale(5, a1, c2, d3));
        create(new Sale(6, a3, c1, d3));
        create(new Sale(7, a1, c2, d4));
        create(new Sale(8, a2, c1, d4));
        create(new Sale(9, a1, c1, d5));
        create(new Sale(10, a1, c2, d5));
        create(new Sale(11, a1, c2, d2));
    }
    
    /**
     *
     * @param sale
     * @return
     */
    public static boolean create(Sale sale){
        if (!sales.stream().noneMatch((s) -> (s.getArticle().getStock() == 0))) {
            return false;
        }
        Article a = ArticleDAO.find(sale.getArticle().getId());
        a.setStock(a.getStock() - 1);
        ArticleDAO.update(a);
        sales.add(sale);
        return true;
    }
    
    /**
     *
     * @param sale
     * @return
     */
    public static boolean update(Sale sale){
        int i = 0;
        for(Sale s : sales){
            if(s.getId() == sale.getId()){
                sales.set(i, sale);
                return true;
            }
            i++;
        }
        return false;
    }
    
    /**
     *
     * @param id
     * @return
     */
    public static Sale find(int id){
        Sale sale = null;
        for(Sale s : sales){
            if(s.getId() == id){
                sale = s;
            }
        }
        return sale;
    }
    
    /**
     *
     * @param id
     * @return
     */
    public static boolean delete(int id){
        for(Sale s : sales){
            if(s.getId() == id){
                sales.remove(s);
                return true;
            }
        }
        return false;
    }
}
