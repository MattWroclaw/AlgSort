package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IHeapsort;

public class Heapsort implements IHeapsort {
    int tab[];
    int i;
    int curidx;


    @Override
    public void swap(int[] tab, int a, int b) {
        int Temp = tab[a];
        tab[a] = tab[b];
        tab[b] = Temp;
    }

    @Override
    public void sort() {

    }

    @Override
    public void buildHeap(int[] tab) {
        for (int i = 0; 2 * i + 1 < tab.length; i++) {
            if (tab[2 * i + 1] > tab[i] || tab[2 * i + 2] > tab[i]) {
                chooseBestSwap(tab, i);
                int j = i;
                while ((j + 1) / 2 - 1 >= 0 && tab[j] > tab[(j + 1) / 2 - 1]) {
                    swap(tab, j, ((j + 1) / 2 - 1));
                    j = (i + 1) / 2 - 1;
                }
            }
        }
    }

    @Override
    public boolean chooseBestSwap(int[] tab, int i) {
       // curidx

        if (2 * i + 2 >= tab.length) {
            if (tab[2 * i + 1] > tab[i]) {
                swap(tab, i, 2 * i + 1);
                curidx =2 * i + 1;
                return true;

            } else {
                if (tab[2 * i + 1] > tab[i]) {
                    if (tab[2 * i + 2] > tab[2 * i + 1]) {
                        swap(tab, i, (2 * i + 2));
                        curidx = 2 * i + 2;
                        return true;
                    } else swap(tab, i, (2 * i + 1));
                    curidx=2 * i + 1;
                    return true;
                } else {
                    if (tab[2 * i + 2] > tab[i]) {
                        swap(tab, i, (2 * i + 2));
                        curidx =2 * i + 2;
                        return true;
                    }

                }
            }
        }
        return false;
    }

    @Override
    public void shiftDown() {
    }


    public static void main(String[] args) {
        int tabTest[] = {1,8,5,4,3,7};

        Heapsort heapsort = new Heapsort();
        heapsort.buildHeap(tabTest);
        for (int element : tabTest ){
            System.out.print(element+" ");
        }
    }
}
