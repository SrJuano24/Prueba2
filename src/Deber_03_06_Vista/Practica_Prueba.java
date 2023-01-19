/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_06_Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Juano
 */
public class Practica_Prueba extends JPanel implements MouseListener {

    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;
    private int x3 = 0;
    private int y3 = 0;
    private int x4 = 0;
    private int y4 = 0;
    private int numclick = 0;

    public Practica_Prueba() {
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x3, y3, x2, y2);
        g.drawLine(x4, y4, x3, y3);
        g.drawLine(x4, y4, x1, y1);
        g.setColor(Color.red);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        if (this.numclick == 0) {
            this.x1 = e.getX();
            this.y1 = e.getY();
            this.numclick = 1;

        } else {
            if (this.numclick == 1) {
                this.x2 = e.getX();
                this.y2 = e.getY();
                this.numclick = 2;

            } else {

                if (this.numclick == 2) {
                    this.x3 = e.getX();
                    this.y3 = e.getY();
                    this.numclick = 3;
                   // super.repaint();
                } else {

                    if (this.numclick == 3) {
                        this.x4 = e.getX();
                        this.y4 = e.getY();
                        this.numclick = 0;
                        super.repaint();
                    }
                }
            }

        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
