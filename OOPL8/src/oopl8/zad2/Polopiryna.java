/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopl8.zad2;

import oopl8.zad1.Product;

public class Polopiryna extends Product {
    
    public Polopiryna(double price, String name, String describe){
        super(price, name, describe);
    }
    
    public void buy(){
        System.out.println("I bought pills.");
    }
    
    public void showInfo(){
        System.out.println("Price: "+ getPrice() +" name: "+ getName() +" describe: "+ getDescribe());
    }
}
