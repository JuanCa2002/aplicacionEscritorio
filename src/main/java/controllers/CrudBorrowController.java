/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import https.BorrowClient;
import models.Borrow;

/**
 *
 * @author hp
 */
public class CrudBorrowController {
    private BorrowClient client;

    public CrudBorrowController() {
        client = new BorrowClient();
    }

    public void createBorrow(int id,String idBook,String idUser) throws Exception {
        Borrow borrow = new Borrow(id,idBook,idUser);

        client.createBorrow(borrow);
    }
    
    public void deleteBorrow(int idBorrow) throws Exception{
        client.deleteBorrow(idBorrow);
    }
    
}
