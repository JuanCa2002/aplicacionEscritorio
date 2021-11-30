/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import https.PublisherClient;
import models.Publisher;

/**
 *
 * @author hp
 */
public class CrudPublisherController {

    private PublisherClient client;

    public CrudPublisherController() {
        client = new PublisherClient();
    }

    public void createPublisher(int code, String name) throws Exception {
        Publisher publisher = new Publisher(code, name);

        client.createPublisher(publisher);
    }

}
