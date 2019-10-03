package br.ufrn.imd.edb2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NodeTest {

    /**
     * Arvores Balanceadas
     */
    @Test
    public void ArvoreBalanceadaAltura1(){
        //Arrange
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);

        //Act
        boolean resultado = tree.getRoot().isBalanced();

        //Assert
        assertTrue(resultado);

    }

    @Test
    public void ArvoreBalanceadaAltura2(){
        //Arrange
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();
        tree.insert(20);
        tree.insert(10);
        tree.insert(15);
        tree.insert(0);
        tree.insert(30);
        tree.insert(25);
        tree.insert(40);

        //Act
        boolean resultado = tree.getRoot().isBalanced();

        //Assert
        assertTrue(resultado);
    }
    @Test
    public void ArvoreBalanceadaAltura3(){
        //Arrange
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();
        tree.insert(20);
        tree.insert(10);
        tree.insert(15);
        tree.insert(0);
        tree.insert(30);
        tree.insert(25);
        tree.insert(40);
        tree.insert(50);

        //Act
        boolean resultado = tree.getRoot().isBalanced();

        //Assert
        assertTrue(resultado);

    }

    /**
     * Arvores Nao Balanceadas
     */
    @Test
    public void ArvoreNaoBalanceadaAltura3(){
        //Arrange
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();
        tree.insert(10);
        Node n = new Node(15);
        tree.insert(n);
        tree.insert(20);
        tree.insert(30);
        tree.insert(5);
        tree.insert(0);

        //Act
        boolean resultado = tree.getRoot().isBalanced();

        //Assert
        assertFalse(resultado);
    }

    @Test
    public void ArvoreNaoBalanceadaAltura4(){
        //Arrange
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();
        tree.insert(10);
        tree.insert(15);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(5);
        tree.insert(0);

        //Act
        boolean resultado = tree.getRoot().isBalanced();

        //Assert
        assertFalse(resultado);
    }

    @Test
    public void ArvoreNaoBalanceadaAltura5(){
        //Arrange
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();
        tree.insert(10);
        tree.insert(11);
        tree.insert(9);
        tree.insert(5);
        tree.insert(8);
        tree.insert(20);
        tree.insert(16);
        tree.insert(15);
        tree.insert(14);

        //Act
        boolean resultado = tree.getRoot().isBalanced();

        //Assert
        assertFalse(resultado);
    }





}