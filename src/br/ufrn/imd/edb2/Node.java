package br.ufrn.imd.edb2;

public class Node {
    private Node left = null;
    private Node right = null;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }
        return null;
    }

    public int height(){
        return height(this);
    }

    public boolean isLeaf() {
        return this.getLeft() == null && this.getRight() == null;
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        if (isLeaf()) {
            return 0;
        }
        int Hleft = 0, Hright = 0;

        if (node.getLeft() != null) {
            Hleft = node.getLeft().height() + 1;
        }

        if (node.getRight() != null)
            Hright = node.getRight().height() + 1;

        return Math.max(Hleft, Hright);
    }

    public boolean isBalanced(){
        int result;
        result = Math.abs(this.releaseFactor()); //nao permite resultados negativos

        if(result > 1){
            return false;
       }

        if(this.getLeft() != null && !this.getLeft().isBalanced()){
            return false;
        }
        if(this.getRight() != null && !this.getRight().isBalanced()){
            return false;
        }
        return true;
    }

    private int releaseFactor() {
        int Hleft = 0, Hright = 0;
        if(this.getLeft() != null){
            Hleft = this.getLeft().height() + 1;
        }
        if(this.getRight() != null){
            Hright =  this.getRight().height() + 1;
        }
        return Hleft - Hright;
    }

}

