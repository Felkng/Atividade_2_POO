/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.edu.ifnmg.atividade_2;

/**
 *
 * @author Felkng <&it;felkng374 at @gmail.com&gt;>
 */
public class Dupla<T,U>{
    private T x;
    private U y;

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public U getY() {
        return y;
    }

    public void setY(U y) {
        this.y = y;
    }
    
    //</editor-fold>

    public Dupla() {
    }

    public Dupla(T x, U y) {
        this.x = x;
        this.y = y;
    }
}
