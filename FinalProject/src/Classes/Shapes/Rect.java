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
 * @author Benjamin MacLean
 */
public class Rect extends Shape{ //specific rectangle parameters all initialized to a value
    public int length=20; //rectangle length
    public int width=10; //rectnagle width
    public int br=0; //border rgb red value
    public int bg=0; //border rgb green value
    public int bb=0; //border rgb blue value
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
    public Rectangle getRectangle(){ //creates a javafx recognized rectangle object with the values attributed to this object type, and returns it when called
        Rectangle temp = new Rectangle(x,y,length,width);//x, y, length, width
        temp.setFill(Color.rgb(cr,cg,cb)); //sets inside color
        temp.setStrokeWidth(border); //border width
        temp.setStroke(Color.rgb(br,bg,bb)); //border color
        
        return temp;
    }
}
