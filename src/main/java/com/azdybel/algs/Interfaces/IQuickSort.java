package com.azdybel.algs.Interfaces;

public interface IQuickSort {
    public void swap(int a, int b, int tab[]);
   // public void sort(int tab[]);
    public void partition (int[] tab,int p, int k);
    public int choosePP (int a, int b);
    public void quickSort(int []tab, int p, int k);

}
