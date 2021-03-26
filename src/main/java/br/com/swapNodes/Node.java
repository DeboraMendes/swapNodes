package br.com.swapNodes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

}
