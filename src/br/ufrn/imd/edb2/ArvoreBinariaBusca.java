package br.ufrn.imd.edb2;

public class ArvoreBinariaBusca {
    private Node raiz = null;

    public boolean isEmpty() {
        return raiz == null;
    }
    public Node getRoot(){
        return raiz;
    }

    public void insert(Node node) {
        if (raiz == null) {
            raiz = node;
            return;
        }
        raiz.insert(node);
    }

    public void insert(int value) {
        Node n = new Node(value);
        insert(n);
    }

    public Node search(int key) {
        if (raiz == null) {
            return null;
        }
        return raiz.search(key);
    }

    /*public int alture(int key, int alture){//TODO-> para prox terca feira
        //a alturas das subarvores a esquerda e direita devem ter diferenca <= 1

        Node tmp = null;
        tmp = tmp.search(key);

        //calcular a subarvore a esquerda

        int counter = alture;
        if(tmp != null){
            if(tmp.getLeft() == null && tmp.getRight() == null){
                return counter;
            }
            counter++;
            return this.alture(key, counter);
        }
        return -1;

    }*/



}
