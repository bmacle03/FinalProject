/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Misc;

import javafx.scene.Group;
import Classes.Shapes.*;

import java.io.*;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author b7mac
 */
public class AnimationPlayer {
    Group root=new Group();
    int frames=100;
    int fps=1;
    int objects=0;
    
    public Group getGroup(){
        return root;
    }
    public void loadAnimationFromFile(String fileName){
        ArrayList<String> list = new ArrayList<String>();
        try{
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str;

            
            while((str = in.readLine()) != null){
                list.add(str);
            }
            
            /*for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }*/
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        if(list.get(0).contains("frames:")){
            String[] temp= list.get(0).split(" ");
            this.frames=Integer.parseInt(temp[1]);
        }
        if(list.get(1).contains("speed:")){
            String[] temp= list.get(1).split(" "); //THESE LINES TAKE THE FIRST 3 LINES OF CODE FROM THE TEXT FILE
            String[] dump=temp[1].split("f");
            this.fps=Integer.parseInt(dump[0]);
        }
        if(!list.get(2).equals("")){
            this.objects=Integer.parseInt(list.get(2));
        }
        
        for(int i=4;i<list.size();i++){ //starts on line after blank line,searches all lines in text
            
            if(list.get(i).equals("Circle")){
                Circ temp=new Circ();
                
                for(int a=i+1;a<list.size();a++){
                    if(list.get(a).contains("r:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetR(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("x:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetX(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("y:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetY(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("color:")){
                        System.out.println(list.get(a));
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetCR(Integer.parseInt(dump2[0]));
                        temp.SetCG(Integer.parseInt(dump2[1]));
                        temp.SetCB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).contains("border:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetBorder(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("bordercolor:")){
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetBR(Integer.parseInt(dump2[0]));
                        temp.SetBG(Integer.parseInt(dump2[1]));
                        temp.SetBB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).equals("\n")||list.get(a).equals("")||list.get(a).equals(" ")){
                        root.getChildren().add(temp.getCircle());
                        i=a+1;
                        break;
                    }
                }
                
            }
            
            if(list.get(i).equals("Rect")){
                Rect temp=new Rect();
                
                for(int a=i+1;a<list.size();a++){
                    if(list.get(a).contains("length:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetLength(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("width:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetWidth(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("x:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetX(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("y:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetY(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("color:")){
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetCR(Integer.parseInt(dump2[0]));
                        temp.SetCG(Integer.parseInt(dump2[1]));
                        temp.SetCB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).contains("border:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetBorder(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("bordercolor:")){
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetBR(Integer.parseInt(dump2[0]));
                        temp.SetBG(Integer.parseInt(dump2[1]));
                        temp.SetBB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).equals("\n")||list.get(a).equals("")||list.get(a).equals(" ")){
                        root.getChildren().add(temp.getRectangle());
                        i=a+1;
                        break;
                    }
                }
                
            }
                if(list.get(i).equals("Line")){
                Lin temp=new Lin();
                
                for(int a=i+1;a<list.size();a++){
                    if(list.get(a).contains("x:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetX(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("y:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetY(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("endx:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetEndX(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("endy:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetEndY(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("color:")){
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetCR(Integer.parseInt(dump2[0]));
                        temp.SetCG(Integer.parseInt(dump2[1]));
                        temp.SetCB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).contains("border:")){
                        String[]dump = list.get(a).split(" ");
                        temp.SetBorder(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).equals("\n")||list.get(a).equals("")||list.get(a).equals(" ")){
                        root.getChildren().add(temp.getLine());
                        i=a+1;
                        break;
                    }
                }
                
            }
                        
        }
        
        
    }
}
