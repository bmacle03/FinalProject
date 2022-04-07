/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Shapes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Benjamin MacLean
 */
public class Circ extends Shape{
    public int r=20;
    public int br=0;
    public int bg=0;
    public int bb=0;
    public Circ(){}
    public void SetR(int r){
        this.r=r;
    }
    public void SetBR(int br){
        this.br=br;
    }
    public void SetBG(int bg){
        this.bg=bg;
    }
    public void SetBB(int bb){
        this.bb=bb;
    }
    public Circle getCircle(){
        Circle circ = new Circle(x,y,r); //x,y,radius
        circ.setFill(Color.rgb(cr,cg,cb)); //sets inside color
        circ.setStrokeWidth(border); //border width
        circ.setStroke(Color.rgb(br,bg,bb)); //border color
        
        return circ;
    }
}
