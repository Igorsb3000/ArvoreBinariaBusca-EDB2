package br.ufrn.imd.edb2;

import javax.swing.*;
import java.awt.*;

public class ArvoreBinariaBuscaView extends JComponent {
    private ArvoreBinariaBusca arvore = null;
    private int nodeSize = 30;
    private int offset = 60;

    public ArvoreBinariaBuscaView(ArvoreBinariaBusca arvore) {
        this.arvore = arvore;
    }

    @Override
    protected void paintComponent(Graphics graphics){
        if(this.arvore == null){
            return;
        }
        drawNode(graphics, this.arvore.getRoot(), getWidth()/2,0, 0);

        //drawNode(graphics, "10", getWidth()/2, getHeight()/2);
        //drawNode(graphics, "20", getWidth()/4, getHeight()/4);
    }
    private void drawNode(Graphics graphics, Node node, int x, int y, int level){
        graphics.drawOval(x, y, nodeSize, nodeSize);
        graphics.drawString(String.valueOf(node.getValue()),x+8, y + 20);

        if(node.getLeft() != null){
            int ChildX = x - offset;
            int ChildY = y + offset;

            graphics.drawLine(x+nodeSize/2, y + nodeSize, ChildX + nodeSize/2, ChildY);
            drawNode(graphics, node.getLeft(), ChildX , ChildY, level+1);
        }
        if(node.getRight() != null){
            int ChildX = x + offset;
            int ChildY = y + offset;

            graphics.drawLine(x+nodeSize/2, y + nodeSize, ChildX + nodeSize/2, ChildY);
            drawNode(graphics, node.getRight(), ChildX , ChildY, level+1);
        }
    }


}

