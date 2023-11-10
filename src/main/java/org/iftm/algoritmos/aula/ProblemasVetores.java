package org.iftm.algoritmos.aula;

import java.util.*;

public class ProblemasVetores {
    public static void main(String[] args) {
        int v[] = new int[10];
        v[9] = 10;
        v[1] = 5;

        //System.out.println(Arrays.toString(v));

        try {
            ArrayList<Cliente> lista = new ArrayList<>();
            lista.add(new Cliente("bruno"));
            lista.add(0, new Cliente("ana"));
            lista.add(new Cliente("Maria"));
            lista.add(new Cliente("Lucas"));

            System.out.println(lista.toString());
            System.out.println(lista.size());

            for(int i=0; i<lista.size(); i++){
                Cliente aux = lista.get(i);
                System.out.println(aux.getNome());
            }

            for(Iterator<Cliente> iterator = lista.iterator(); iterator.hasNext();){
                Cliente aux = iterator.next();
                System.out.println(aux.getNome());
            }

            lista.reversed();
            for (Cliente aux: lista.reversed()){
                System.out.println(aux.getNome());
            }

            for (Integer aux : v) {
                System.out.println(aux);
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("Posição informada é inválida!!!");
        }catch (Exception e){
            System.out.println("Problema não identificado!!!");
        }
        //LinkedList lista2 = new LinkedList();

        //Vector lista3 = new Vector();
    }
}