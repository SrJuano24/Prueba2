/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Deber_03_06_Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author David
 */
public class PanelPaint extends JPanel implements MouseListener {

    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;
    private int numFigura = 0;

    private int dimx = 0;
    private int dimy = 0;
    private Color colorLinea = Color.BLACK;

    public PanelPaint() {
        this.addMouseListener(this);
    }

    public void figura(String e) {

        if (e.equalsIgnoreCase("Estrella")) {
            this.numFigura = 0;
        }
        if (e.equalsIgnoreCase("Circulo")) {
            this.numFigura = 1;
        }
        if (e.equalsIgnoreCase("Cuadrado")) {
            this.numFigura = 2;
        }
        if (e.equalsIgnoreCase("Rectangulo")) {
            this.numFigura = 3;
        }
        if (e.equalsIgnoreCase("Triangulo")) {
            this.numFigura = 4;
        }

    }

    public void dimenciones(String e1, String e2) {
        this.dimx = Integer.valueOf(e1).intValue();
        this.dimy = Integer.valueOf(e2).intValue();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (this.numFigura == 0) {
            g.setColor(this.colorLinea);
            g.drawLine(this.x1, y1 - dimy / 2, this.x1 - dimx / 6, y1 - dimy / 6);
            g.drawLine(this.x1, y1 - dimy / 2, this.x1 + dimx / 6, y1 - dimy / 6);
            g.drawLine(this.x1, y1 + dimy / 2, this.x1 - dimx / 6, y1 + dimy / 6);
            g.drawLine(this.x1, y1 + dimy / 2, this.x1 + dimx / 6, y1 + dimy / 6);

            g.drawLine(this.x1 - dimx / 2, y1, this.x1 - dimx / 6, y1 - dimy / 6);
            g.drawLine(this.x1 - dimx / 2, y1, this.x1 - dimx / 6, y1 + dimy / 6);
            g.drawLine(this.x1 + dimx / 2, y1, this.x1 + dimx / 6, y1 - dimy / 6);
            g.drawLine(this.x1 + dimx / 2, y1, this.x1 + dimx / 6, y1 + dimy / 6);
            g.setColor(this.colorLinea);

        }
        if (this.numFigura == 1) {
            g.setColor(this.colorLinea);
            g.drawOval(this.x1 - this.dimx / 2, this.y1 - dimy / 2, dimx, dimy);
            g.setColor(this.colorLinea);
        }
        if (this.numFigura == 2) {
            g.setColor(this.colorLinea);
            g.drawLine(this.x1 - this.dimx, this.y1 - this.dimy, this.x1 + this.dimx, this.y1 - this.dimy);
            g.drawLine(this.x1 - this.dimx, this.y1 + this.dimy, this.x1 + this.dimx, this.y1 + this.dimy);
            g.drawLine(this.x1 - this.dimx, this.y1 + this.dimy, this.x1 - this.dimx, this.y1 - this.dimy);
            g.drawLine(this.x1 + this.dimx, this.y1 + this.dimy, this.x1 + this.dimx, this.y1 - this.dimy);
            g.setColor(this.colorLinea);

        }
        if (this.numFigura == 3) {
            g.setColor(this.colorLinea);
            g.drawLine(this.x1 - this.dimx, this.y1 - this.dimy, this.x1 + this.dimx, this.y1 - this.dimy);
            g.drawLine(this.x1 - this.dimx, this.y1 + this.dimy, this.x1 + this.dimx, this.y1 + this.dimy);
            g.drawLine(this.x1 - this.dimx, this.y1 + this.dimy, this.x1 - this.dimx, this.y1 - this.dimy);
            g.drawLine(this.x1 + this.dimx, this.y1 + this.dimy, this.x1 + this.dimx, this.y1 - this.dimy);
            g.setColor(this.colorLinea);
        }
        if (this.numFigura == 4) {
            g.setColor(this.colorLinea);

            g.drawLine(this.x1, this.y1 - this.dimx, this.x1 + this.dimx, this.y1 + this.dimy);
            g.drawLine(this.x1 - this.dimx, this.y1 + this.dimy, this.x1, this.y1 - this.dimx);
            g.drawLine(this.x1 - this.dimx, this.y1 + this.dimy, this.x1 + this.dimx, this.y1 + this.dimy);
            g.setColor(this.colorLinea);

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //   JOptionPane.showMessageDialog(this, e.getPoint());

        this.x1 = e.getX();
        this.y1 = e.getY();

        super.repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

}
