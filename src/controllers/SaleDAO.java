/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import helpers.Fecha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    public static ArrayList<Sale> all() {
        return sales;
    }

    /**
     *
     */
    public static void fillSales() {
        Article a1 = new Article(1, "Lapiz", 200, 10);
        Article a2 = new Article(4, "Pendrive", 5000, 2);
        Article a3 = new Article(5, "Tijera", 300, 3);
        Client c1 = new Client("Los Pinos 12", 945572692, "Resit", "Diego", "1-1");
        Client c2 = new Client("Los Raulies 123", 94588777, "BCI", "Fernando", "2-2");
        Fecha d1 = new Fecha(20, 01, 2019);
        Fecha d2 = new Fecha(21, 01, 2019);
        Fecha d3 = new Fecha(27, 01, 2019);
        Fecha d4 = new Fecha(05, 02, 2019);
        Fecha d5 = new Fecha(06, 02, 2019);

        create(new Sale(1, d1, a1, c1, 1));
        create(new Sale(2, d1, a1, c1, 1));
        create(new Sale(3, d2, a2, c2, 1));
        create(new Sale(4, d2, a3, c2, 1));
        create(new Sale(5, d3, a1, c2, 1));
        create(new Sale(6, d3, a3, c1, 1));
        create(new Sale(7, d4, a1, c2, 1));
        create(new Sale(8, d4, a2, c1, 1));
        create(new Sale(9, d5, a1, c1, 1));
        create(new Sale(10, d5, a1, c2, 1));
        create(new Sale(11, d2, a1, c2, 1));
    }

    /**
     *
     * @param sale
     * @return
     */
    public static boolean create(Sale sale) {
        int total;
        double net, iva;
        if (!sales.stream().noneMatch((s) -> (s.getArticle().getStock() == 0
                || s.getId() == sale.getId()))) {
            return false;
        }
        Article a = ArticleDAO.find(sale.getArticle().getId());
        a.setStock(a.getStock() - sale.getQuantity());
        total = sale.getQuantity() * sale.getArticle().getPrice();
        iva = total * 0.19;
        net = total - iva;
        sale.setTotal(total);
        sale.setNet(net);
        ArticleDAO.update(a);
        sales.add(sale);
        return true;
    }

    /**
     *
     * @param sale
     * @return
     */
    public static boolean update(Sale sale) {
        int i = 0;
        for (Sale s : sales) {
            if (s.getId() == sale.getId()) {
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
    public static Sale find(int id) {
        Sale sale = null;
        for (Sale s : sales) {
            if (s.getId() == id) {
                sale = s;
            }
        }
        return sale;
    }

    /**
     *
     * @param date
     * @return
     */
    public static ArrayList<Sale> findByDate(Fecha date) {
        ArrayList<Sale> salesArr = new ArrayList<>();
        for (Sale s : sales) {
            if (s.getSaleAt().equals(date)) {
                salesArr.add(s);
            }
        }
        return salesArr;
    }

    /**
     *
     * @param date
     * @param start
     * @param end
     * @return
     */
    protected static boolean betweenDates(String date, String start, String end) {
        Date startDate = null, endDate = null, saleAt = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            startDate = format.parse(start);
            endDate = format.parse(end);
            saleAt = format.parse(date);
            if (startDate.before(saleAt) && endDate.after(saleAt)) {
                return true;
            } else {
                return false;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     *
     * @param start
     * @param end
     * @return
     */
    public static ArrayList<Sale> findBetweenDates(Fecha start, Fecha end) {
        ArrayList<Sale> salesArr = new ArrayList<>();

        for (Sale s : all()) {
            if (betweenDates(s.getSaleAt().toString(), start.toString(), end.toString())) {
                salesArr.add(s);
            }
        }
        return salesArr;
    }

    /**
     *
     * @param id
     * @return
     */
    public static boolean delete(int id) {
        for (Sale s : sales) {
            if (s.getId() == id) {
                sales.remove(s);
                return true;
            }
        }
        return false;
    }
}
