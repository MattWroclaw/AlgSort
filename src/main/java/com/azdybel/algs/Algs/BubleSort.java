package com.azdybel.algs.Algs;

import com.azdybel.algs.Helpers.TimeMeasurementHelper;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBubbleSort;

public class BubleSort implements IBubbleSort, IAlgorithmRunner {
    int mojaTAblica[] = {4, 53, 542, 32, 547, 11, 33};

    @Override
    public int[] sort(int a, int b, int[] tab) {
        int i, j = 0;
        int n = tab.length;
        for (j = 0; j < n; j++) {
            for (i = 0; i < n - 1; i++) {
                if (j < tab.length - 1) {
                    if (compare(i, i + 1, tab)) {

                        swap(i, i + 1, tab);
                    }
                }
            }
        }
        for (i = 0; i < tab.length; i++) {
            System.out.println(i + "  ,  " + tab[i]);
        }
        return tab;
    }

    @Override
    public void swap(int a, int b, int[] tab) {
        int temp;
        temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

    @Override
    public boolean compare(int a, int b, int[] tab) {
        if (tab[a] > tab[b]) {
            swap(a, b, tab);
        }
        return false;
    }

    public static void main(String[] args) {


        int mojaTAblica[] = {4, 53, 542, 32, 547, 11, 33};

        BubleSort buble = new BubleSort();

        buble.sort(0, 5, mojaTAblica);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        TimeMeasurementHelper.ExecutionTimeMeasure(buble, true);
    }

    @Override
    public void setup() {
    }

    @Override
    public void run() {
        //    BubleSort buble=new BubleSort();

        sort(0, 5, mojaTAblica);

    }
}
