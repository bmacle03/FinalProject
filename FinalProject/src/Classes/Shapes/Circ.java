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
public class Circ extends Shape{ //specific circle parameters all initialized to a value
    public int r=20; //radius
    public int br=0; //border colour red value
    public int bg=0; //border colour green value
    public int bb=0; //border colour blue value
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
    public Circle getCircle(){ //creates a javafx recognized circle object with the values attributed to this object type, and returns it when called
        Circle circ = new Circle(x,y,r); //x,y,radius
        circ.setFill(Color.rgb(cr,cg,cb)); //sets inside colour
        circ.setStrokeWidth(border); //border width
        circ.setStroke(Color.rgb(br,bg,bb)); //border colour
        
        return circ;
    }
}
