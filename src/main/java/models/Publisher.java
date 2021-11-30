/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

/**
 *
 * @author hp
 */
public class Publisher {

    private String name;
    private int code;

    public Publisher() {
    }

    public Publisher(int code, String nombre) {
        this.code = code;
        this.name=nombre;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        return "Publisher{"+
                " code=" + code +
                " ,name ='" + name +'\'' + 
                '}';
    }

}
