package br.ufrn.imd.edb2;

import javax.swing.*;
import java.util.Random;

/**
 * @author Igor Silva
 * @since 2019.2
 * @version 2.0.1
 */
public class Main {

    public static void main(String[] args) {
        //esta errado, o certo eh arvorebuscabinaria
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        Random random = new Random();
//        for(int i=0; i<30; i++){
//            arvore.insert(new Node(random.nextInt() % 100));
//        }
        arvore.insert(10);
        Node n = new Node(15);
        arvore.insert(n);
        arvore.insert(20);
        arvore.insert(30);
        arvore.insert(5);
        arvore.insert(0);
        JFrame frame = new JFrame("Visualizador de ABB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JLabel label = new JLabel ("Hello World");
        JLabel labe2 = new JLabel ("Hello World 2");
//        frame.add(label);
//        frame.add(labe2);

        ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(arvore);
        frame.add(view);
        frame.setVisible(true); //exibe o metodo na tela, deve ser sempre a ultima

        boolean resultado = arvore.getRoot().isBalanced();

        int result = arvore.getRoot().height();
        System.out.println("Altura da Arvore: " + result);

        int result2 = arvore.getRoot().getLeft().height();
        System.out.println("Altura Left: " + result2);

        int result3 = arvore.getRoot().getRight().height();
        System.out.println("Altura Right: " + result3);

        if(resultado){
            System.out.println("Arvore balanceada");
        }else{
            System.out.println("Arvore nao balanceada");
        }

    }

}

