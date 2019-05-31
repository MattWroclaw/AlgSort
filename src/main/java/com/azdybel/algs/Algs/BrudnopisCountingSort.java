package com.azdybel.algs.Algs;

import java.util.Random;

public class BrudnopisCountingSort {
    private static int[] tablica = new int[20]; //20-cio elementowa tablica do posortowania
    private static int[] count = new int[20];   //Tablica pomocnicza
    private static int c;

    private static void countingsort() {
        int i,k;
        for (i=0;i<20;i++) {
            count[i] = 0;//zerowanie tablicy pomocniczej
        }
        for (i=0;i<10;i++) {
            count[tablica[i]]++;
            System.out.println(count[tablica[i]]);
        }//pobieranie i-tego wyrazu z tablicy i
//zwiekszanie i-tego wyrazu tablicy pomocniczej
        c=1;
        for (i=0;i<20;i++) {
            if (count[i]>0) {
                for (k = 1; k < count[i] + 1; k++) {//tworzenie tablicy wynikowej
                    tablica[c] = i;
                    c++;

                }
            }
        }
    }

    public static void main(String[] args) {

        int i;
        Random generator = new Random();

        System.out.println("Tablica przed posortowaniem:");
//Generowanie losowej tablicy liczb calkowitych z zakresu 0-20
        for (i=1;i<11;i++) {
            tablica[i] = generator.nextInt(12) + 1;
            System.out.print(tablica[i]+", ");
        }

        countingsort();
        System.out.println("\nTablica po posortowaniu:");
        for (i=1;i<c;i++) {
            if (tablica[i]!=0)
                System.out.print(tablica[i]+", ");
        }
        int t[] = new int[4];
        t[5]=1;
        t[9]=1;
        

    }
}
