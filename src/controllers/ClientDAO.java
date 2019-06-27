/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.Client;

/**
 *
 * @author diego
 */
public class ClientDAO {

    private static ArrayList<Client> clients = new ArrayList<>();

    /**
     *
     * @return
     */
    public static ArrayList<Client> all() {
        return clients;
    }

    /**
     *
     */
    public static void fillClients() {
        create(new Client("Los Pinos 12", 945572692, "Resit", "Diego", "1-1"));
        create(new Client("Los Raulies 123", 94588777, "BCI", "Fernando", "2-2"));
        create(new Client("El Calce 1", 225455163, "Kibernum", "Esteban", "3-3"));
        create(new Client("Avenida Providencia 1650", 988772221, "Resit", "Andrés", "4-4"));
        create(new Client("Avenida Providencia 1650", 977229876, "Resit", "José", "5-5"));
    }

    /**
     *
     * @param client
     * @return
     */
    public static boolean create(Client client) {
        if (!clients.stream().noneMatch((b) -> (b.getRut().equals(client.getRut())))) {
            return false;
        }
        clients.add(client);
        return true;
    }

    /**
     *
     * @param client
     * @return
     */
    public static boolean update(Client client) {
        int i = 0;
        for (Client c : clients) {
            if (c.getRut().equals(client.getRut())) {
                clients.set(i, client);
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     *
     * @param rut
     * @return
     */
    public static Client find(String rut) {
        Client client = null;
        for (Client c : clients) {
            if (c.getRut().equals(rut)) {
                client = c;
            }
        }
        return client;
    }

    /**
     *
     * @param name
     * @return
     */
    public static Client findByName(String name) {
        Client client = null;
        for (Client c : clients) {
            if (c.getName().equals(name)) {
                client = c;
            }
        }
        return client;
    }

    /**
     *
     * @param rut
     * @return
     */
    public static boolean delete(String rut) {
        for (Client c : clients) {
            if (c.getRut().equals(rut)) {
                clients.remove(c);
                return true;
            }
        }
        return false;
    }
}
