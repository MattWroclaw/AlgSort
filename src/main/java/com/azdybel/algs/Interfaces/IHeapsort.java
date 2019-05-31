package com.azdybel.algs.Interfaces;

public interface IHeapsort {
    public void swap(int tab [], int a, int b);
    public void sort();
    public void buildHeap(int []tab);
    public boolean chooseBestSwap(int tab[], int a );
    public void shiftDown();
}
