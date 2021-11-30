/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import https.UserClient;
import models.User;

/**
 *
 * @author hp
 */
public class CrudUserController {
    private UserClient client;

    public CrudUserController() {
        client = new UserClient();
    }

    public void createUser(String identification, String lastName,String name) throws Exception {
        User user = new User(name, lastName,identification);

        client.createUser(user);
    }
    
}
