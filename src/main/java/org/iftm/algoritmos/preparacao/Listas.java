package org.iftm.algoritmos.preparacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Listas {
    public static void main(String args[]){
        ArrayList<String> lista1 = new ArrayList<>();
        LinkedList lista2 = new LinkedList();

        lista1.add("Jose");
        lista1.add(0,"10");

        System.out.println(lista1.toString());

        for (String s : lista1) {
            System.out.println(s);
        }

        for (Iterator iterator = lista1.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

    }
}
