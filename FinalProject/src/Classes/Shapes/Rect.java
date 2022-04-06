/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Shapes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author b7mac
 */
public class Rect extends Shape{
    public int length=20;
    public int width=10;
    public int br=0;
    public int bg=0; //border rgb values
    public int bb=0;
    public Rect(){}
    public void SetLength(int length){
        this.length=length;
    }
    public void SetWidth(int width){
        this.width=width;
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
    public int GetLength(){
        return length;
    }
    public Rectangle getRectangle(){
        Rectangle temp = new Rectangle(x,y,length,width);//x, y, length, width
        temp.setFill(Color.rgb(cr,cg,cb)); //sets inside color
        temp.setStrokeWidth(border); //border width
        temp.setStroke(Color.rgb(br,bg,bb)); //border color
        
        return temp;
    }
}
