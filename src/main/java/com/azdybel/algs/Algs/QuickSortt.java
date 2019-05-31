package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IQuickSort;

public class QuickSortt implements IQuickSort {
    @Override
    public void swap(int a, int b, int[] tab) {
        int temp;
        temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;

    }

    @Override
    public void partition(int[] tab, int p, int k) {
        int pp = choosePP(p, k);
        // int temp = tab[pp];
        int i = p;
        int j = k;
        if (p != k) {
            while (i != j) {
                while (i < pp && tab[pp] > tab[i]) {
                    i++;
                }
                while (j > pp & tab[pp] < tab[j]) {
                    j--;
                }

                if (i != pp && j != pp) {
                    swap(i, j, tab);
                } else {
                    if ((i != j)) {
                        if (i == pp) {
                            pp = j;
                            swap(i, j, tab);
                        } else  {
                            pp = i;
                            swap(i, j, tab);
                        }
                    }
                }
            }
        }
    }

    public int choosePP(int a, int b) {
        int pp = (a + b) / 2;
        return pp;
    }

    @Override
    public void quickSort(int[] tab, int p, int k) {
        int pp = choosePP(p, k);
        partition(tab, p, k);
        if (p < pp - 1) {
            quickSort(tab, p, pp - 1);
            quickSort(tab, pp + 1, k);
        }
        // drukowanie
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + "  ,  " + tab[i]);
        }
    }

    public void print(int[]tab){
        for (int i : tab){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        int mojaTablica[] = {1, 13, 9, 54, 84, 11, 4, 6};

        QuickSortt quickSortt = new QuickSortt();
        quickSortt.quickSort(mojaTablica, 0, 7);
        quickSortt.print(mojaTablica);

    }
}
