/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Shapes;

/**
 *
 * @author Benjamin MacLean
 */
public class Shape { //general shape parameters all different shpe types have, all initialized to a value
    public int x=10; //starting coordinates for the shape. for circle: center point. for rectangle: top left corner. for line: starting point.
    public int y=10; // y component of above
    public int border=2; //size of the border for all shapes
    public int cr=0; //rgb red value for the shape itself
    public int cg=60; //rgb green value for the shape itself
    public int cb=120; //rgb blue value for the shape itself
    public Shape(){}
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
