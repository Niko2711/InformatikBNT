/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SchÃ¼ler
 */
public class Vertex {

    public double x;
    public double y;

    public Vertex(double xx, double yy) {
        x = xx;
        y = yy;
    }

    public static void main(String[] args) {
        Vertex v1 = new Vertex(17, 4);
        Vertex v2 = new Vertex(42, 0);
        Vertex vv = new Vertex(0, 0);

        System.out.println("v1.x = " + v1.x);
        System.out.println("v2.y = " + v2.y);
        System.out.println("v1.y = " + v1.y);
        v1.y = 2 * v1.y;
        System.out.println("v1.y = " + v1.y);
        System.out.println(v1);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public void skalarMultMod(double s) {
        x = s * x;
        y = y * s;
    }

    public Vertex add(Vertex v2) {return new Vertex (x+v2.x, y+v2.y); }
    public void addMod (Vertex v2) {
        x=x+v2.x;
        y=y+v2.y;
    }
    public void setzeX (double xx) {x=xx; }
    public void setX (double x) {this.x = x;}
    public void setY (double y) {this.y = y;}
    public double getX() {return x;}
    public double getY() {return y;}
    
    }    




