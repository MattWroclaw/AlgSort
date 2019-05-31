package com.azdybel.algs.Struc;

import com.azdybel.algs.Interfaces.ITree;

public class Tree implements ITree {
    Node Root;
    Node current = Root;

    @Override
    public void add(Node node) {
        Node temp=Root;

        if (Root == null) {
            Root = node;
        } else {
            while (current != null) {
                if (node.value > current.value) {
                    if (current.right == null) {
                        temp = current;
                    }
                    current = current.right;

                } else {
                    if (current.left == null) {
                        temp = current;
                    }
                    current = current.left;
                }
            }
            if (temp.value > node.value) {
                temp.left = current;
            } else {
                temp.right.value = node.value;
            }

        }
    }
    
}