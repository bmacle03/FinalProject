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
}
