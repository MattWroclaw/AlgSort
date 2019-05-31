package com.azdybel.algs.Algs;

import com.azdybel.algs.Helpers.TimeMeasurementHelper;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;

public class SzybkieSortowanie implements IAlgorithmRunner {
//    int tablica[];
//    int dlugosc;

//    public void sortowanie(int[] tab) {
//
//        if (tab == null || tab.length == 0) {
//            return;
//        }
//        this.tablica = tab;
//        dlugosc = tab.length;
//        szybkieSort(0, dlugosc - 1);
//
//    }


    public void szybkieSort(int tablica[], int minIndex, int maxIndex) {


        int pivot = (minIndex + maxIndex)/2 ;

        int i = minIndex;
        int j = maxIndex;
        //int pivot = choosePivot(tab);

        while (i <= j) {

            while (tablica[i] < tablica[pivot]) {
                i++;
            }
            while (tablica[j] > tablica[pivot]) {
                j--;
            }
            if (i <= j) {
                swap(tablica,i, j);
                i++;
                j--;
            }
        }
        if (minIndex < j) {
            szybkieSort(tablica,minIndex, j);
        }
        if (i < maxIndex) {
            szybkieSort(tablica, i, maxIndex);
        }
    }

    public void swap(int tablica[], int i, int j) {
        int temp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temp;
    }

    public void display(int[] tab) {
        for (int element : tab) {
            System.out.print(element+", ");
        }
    }

static     int[] mojaTa = {3, 7, 8, 4, 2, 10, 22, 72,72,72,2,2,2};

    public static void main(String[] args) {

        SzybkieSortowanie szybkieSortowanie = new SzybkieSortowanie();

        int[] tb = {3, 4, 2, 6, 1};

        szybkieSortowanie.szybkieSort(mojaTa, 0,mojaTa.length-1);
        szybkieSortowanie.display(mojaTa);
        TimeMeasurementHelper.ExecutionTimeMeasure(szybkieSortowanie, true);
    }

    @Override
    public void setup() {

    }

    @Override
    public void run() {
    szybkieSort(mojaTa, 0, mojaTa.length-1);
    }
}
