package com.azdybel.algs.Algs;

import com.azdybel.algs.Helpers.TimeMeasurementHelper;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.ICountingSort;

public class CountingSort implements ICountingSort, IAlgorithmRunner {

    int[] tablica;
    int k; //największa wartość tablicy wejściowej tab

    @Override
    public void sort(int[] tab) {

        int max = tab[0];
        int min=tab[0];
        for (int i =0; i<tab.length;i++){
            if (tab[i]<min){
                min=tab [i];
            }
            if (tab [i]>max) {
                max = tab[i];
            }
        }

        int[] out = new int[max+1]; //po to żeby zrobić miejsce dla 0;

        for (int elementZtab : tab) {
            out[elementZtab]++;
        }


//        for (int i =0; i<tab.length;i++){
//            out[tab[i]]=+1;
//        }
        //int ndx = 0;
        for (int i = 0; i < out.length; i++) {
            while (0 < out[i]) {
                System.out.print(i + " , ");
                out[i]--;
            }
        }
    }

    public void test(int[] tabelka) {

        for (int element : tabelka) {
            System.out.print(element + " , ");
        }
    }

    int[] tablicaDoBadan={3,3,3,4,5,6,1,7,8,4,5,9,8,7};

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();

        int powtElem[] = {2,2,1,1,0,1,5};
        // countingSort.sort(powtElem,100);
        countingSort.sort(powtElem);
        TimeMeasurementHelper.ExecutionTimeMeasure(countingSort, true);
    }


    @Override
    public void setup() {

    }

    @Override
    public void run() {
        sort(tablicaDoBadan);
    }
}
