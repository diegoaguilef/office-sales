/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.Article;

/**
 *
 * @author diego
 */
public class ArticleDAO {

    private static ArrayList<Article> articles = new ArrayList<>();

    /**
     *
     * @return
     */
    public static ArrayList<Article> all() {
        return articles;
    }

    /**
     *
     */
    public static void fillArticles() {
        create(new Article(1, "Lapiz", 200, 10));
        create(new Article(2, "Cuaderno", 500, 20));
        create(new Article(3, "Engrapadora", 990, 15));
        create(new Article(4, "Pendrive", 5000, 2));
        create(new Article(5, "Tijera", 300, 3));
    }

    /**
     *
     * @param article
     * @return
     */
    public static boolean create(Article article) {
        if (!articles.stream().noneMatch((a) -> (a.getId() == article.getId()))) {
            return false;
        }
        articles.add(article);
        return true;
    }

    /**
     *
     * @param article
     * @return
     */
    public static boolean update(Article article) {
        int i = 0;
        for (Article a : articles) {
            if (a.getId() == article.getId()) {
                articles.set(i, article);
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
    public static Article find(int id) {
        Article article = null;
        for (Article a : articles) {
            if (a.getId() == id) {
                article = a;
            }
        }
        return article;
    }

    /**
     *
     * @param name
     * @return
     */
    public static Article findByName(String name) {
        Article article = null;
        for (Article c : articles) {
            if (c.getName().equals(name)) {
                article = c;
            }
        }
        return article;
    }

    /**
     *
     * @param id
     * @return
     */
    public static boolean delete(int id) {
        for (Article a : articles) {
            if (a.getId() == id) {
                articles.remove(a);
                return true;
            }
        }
        return false;
    }
}
