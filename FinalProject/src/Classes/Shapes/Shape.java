/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Shapes;

/**
 *
 * @author b7mac
 */
public class Shape {
    public int x=10; //starting coordinates for the shape. for circle: center point. for rectangle: top left corner. for line: starting point.
    public int y=10;
    public int border=2; //size of the border for all shapes
    public int cr=0;
    public int cg=60; //rgb values for the shape itself
    public int cb=120;//all variables have default values associated
    public static int id=0;
    public Shape(){this.id+=1;}
    public void SetX(int x){
        this.x=x;
    }
    public void SetY(int y){
        this.y=y;
    }
    public void SetBorder(int border){
        this.border=border;
    }
    public void SetCR(int cr){
        this.cr=cr;
    }
    public void SetCG(int cg){
        this.cg=cg;
    }
    public void SetCB(int cb){
        this.cb=cb;
    }
    
}
