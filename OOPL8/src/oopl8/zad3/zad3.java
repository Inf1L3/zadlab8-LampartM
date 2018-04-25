/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopl8.zad3;

import oopl8.zad1.*;
import oopl8.zad2.*;

public class zad3 {

    public static void main(String[] args) {
        
        Product[] n = new Product[10];
        n[0] = new Ksiazka(50, "ksiazka", "opis");
        n[1] = new Czekolada(3, "czekolada", "opis2");
        n[2] = new Ksiazka(35, "ksiazka2", "opis3");
        n[3] = new Dlugopis(2, "dlugopis", "opis4");
        n[4] = new Dzem(8, "dzem", "opis5");
        n[5] = new Polopiryna(20, "polopiryna", "opis6");
        n[6] = new Dzem(6, "dzem2", "opis7");
        n[7] = new Czekolada(4, "czekolada2", "opis8");
        n[8] = new Dlugopis(1, "dlugopis2", "opis9");
        n[9] = new Tractor(20000, "traktor", "opis10");
        
        for(int i=0; i < n.length; i++){
            System.out.println();
            n[i].buy();
            n[i].showInfo();
        }
        System.out.println();
    }
    
}
