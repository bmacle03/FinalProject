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
 * @author b7mac
 */
public class Lin extends Shape{
    int endx=100;
    int endy=100;
    public Lin(){}
    public void SetEndX(int endx){
        this.endx=endx;
    }
    public void SetEndY(int endy){
        this.endy=endy;
    }
    public Line getLine(){
        Line temp=new Line(x,y,endx,endy);//startX, startY, endX, endY
        temp.setStrokeWidth(border); //border width
        temp.setStroke(Color.rgb(cr,cg,cb)); // color
        
        return temp;
    }
}
