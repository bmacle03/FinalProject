/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Shapes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

/**
 *
 * @author Benjamin MacLean
 */
public class Lin extends Shape{ //specific line parameters all initialized to a value
    int endx=100; //line end x coordinate
    int endy=100; //line end y coordinate
    public Lin(){}
    public void SetEndX(int endx){
        this.endx=endx;
    }
    public void SetEndY(int endy){
        this.endy=endy;
    }
    public Line getLine(){ //creates a javafx recognized line object with the values attributed to this object type, and returns it when called
        Line temp=new Line(x,y,endx,endy);//startX, startY, endX, endY
        temp.setStrokeWidth(border); //border width
        temp.setStroke(Color.rgb(cr,cg,cb)); // color
        
        return temp;
    }
}
