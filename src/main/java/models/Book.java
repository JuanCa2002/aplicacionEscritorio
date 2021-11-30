/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author hp
 */
public class Book {
    
    private String codigo;
    private String nombre;
    private String isbn;
    private int stock;
    private Publisher publisher;

    public Book() {
    }

    public Book(String codigo, String nombre, String isbn, int stock, Publisher publisher) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.isbn = isbn;
        this.stock = stock;
        this.publisher = publisher;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int Stock) {
        this.stock = Stock;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher codePublisher) {
        this.publisher = codePublisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                " codigo='" + codigo +'\'' +
                ",nombre='" + nombre +'\'' +
                ",isbn='" + isbn +'\'' +
                ",cantidad=" + stock +
                '}';
    }
    
    
    
    
}
