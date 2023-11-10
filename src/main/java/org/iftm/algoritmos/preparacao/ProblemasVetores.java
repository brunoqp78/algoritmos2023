package org.iftm.algoritmos.preparacao;

import java.util.Arrays;

public class ProblemasVetores {
    public static void main(String[] args) {

        //não podemos redimensionar um array em Java;
        int v[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(v[9]);
        //v[10] = 11
        //System.out.println(v[10]);

        //não temos mecanismos para buscar um elemento.
        for (int i=0; i<v.length; i++){
            if (v[i] == 7){
                System.out.println(i);
            }
        }

        //não conseguimos saber quantas posições do array já foram populadas sem criar, para isso, métodos auxiliares.
        int v1[] = new int[10];
        v1[4] = 10;
        v1[5] = 11;
        System.out.println(Arrays.toString(v1));

    }
}