package com.azdybel.algs.Algs;

public class Kopiec {

   public void  sortowanie(int [] tab){
       int n =tab.length;
       for (int i = n/2-1;i>=0; i--){
           chooseBest(tab, n,i);
       }

       // sortowanie
       // zamieniam ostatnie dziecko z korzeniem
       for (int i = n-1 ; i>0; i--){
           swap(tab, 0, i);
           n--;
           chooseBest( tab, n,0);
       }
   }

   private void chooseBest(int [] tab, int rozmiarKopca, int parentIndx){
       int maxIndx = parentIndx;
       int left = parentIndx*2+1;
       int right = parentIndx*2+2;

       if (left<rozmiarKopca && tab[left]>tab[maxIndx]){
           maxIndx=left;
       }
       if (right<rozmiarKopca && tab[right]>tab[maxIndx]){
           maxIndx=right;
       }
       if (maxIndx != parentIndx){
           swap(tab, maxIndx, parentIndx);
           chooseBest(tab, rozmiarKopca, maxIndx);
       }

   }

   public void swap (int tab [], int a, int b){
       int temp = tab[a];
       tab[a]=tab[b];
       tab[b]=temp;
   }
   public void prnt(int [] tab){
       for (int element :tab){
           System.out.print(element+", ");
       }
   }


    public static void main(String[] args) {
        Kopiec kopiec = new Kopiec();
        int tb[] = {3,5,4,77,6,34,2,23,41};
        kopiec.sortowanie(tb);
        kopiec.prnt(tb);
    }

}
