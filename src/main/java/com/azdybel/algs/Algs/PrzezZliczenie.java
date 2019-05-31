package com.azdybel.algs.Algs;

public class PrzezZliczenie {

    int tab[];
    int max; //najwiekszy element tablicy
    int n ; //elementy do posortowania

    public void sortZlicz(int []tab){

        int max = 0;
        for (int i = 0; i <tab.length;i++){
            if (tab[i]>max){
                max=tab[i];
            }
        }

        int TPom[] = new int[max+1];

        for (int i =0;i<max+1;i++){
            TPom[tab[i]]++;
        }
        for (int i = 0; i < TPom.length; i++){
            while (TPom[i]>0){
                System.out.print(i+", ");
                TPom[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int tabTEst []={1,2,4,4,2,5,3,2,1,2,3,2,1,13};

        PrzezZliczenie zliczenie = new PrzezZliczenie();
        zliczenie.sortZlicz(tabTEst);
    }

}
