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
 * @author Benjamin MacLean
 */
public class AnimationPlayer {
    Group root=new Group(); //group of objects to give to the program to print in the start method of the main class
    int frames=100;
    int fps=1; //stores values, with initialied values attributed
    int objects=0;
    
    public Group getGroup(){ //returns the root gathered from the method below, when the method below is called first, otherwise returns an empty group
        return root;
    }
    public void loadAnimationFromFile(String fileName){
        ArrayList<String> list = new ArrayList<String>(); //arraylist to store text file info
        try{
            BufferedReader in = new BufferedReader(new FileReader(fileName)); //initialize filereader
            String str; //stores each line of code

            
            while((str = in.readLine()) != null){ //searches for new line command
                list.add(str); //adds string to arraylist
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("File not found"); //in case the file isn't found
        }
        catch(IOException e){
            System.out.println("IO Exception"); //in case there is an exception with the IO component of this class
        }
        if(list.get(0).contains("frames:")){
            String[] temp= list.get(0).split(" "); //retrieves the first line of code which contains the amount of frames
            this.frames=Integer.parseInt(temp[1]);
        }
        if(list.get(1).contains("speed:")){
            String[] temp= list.get(1).split(" "); //retrieves the second line of code which contains the fps of the animation
            String[] dump=temp[1].split("f");
            this.fps=Integer.parseInt(dump[0]);
        }
        if(!list.get(2).equals("")){
            this.objects=Integer.parseInt(list.get(2)); //retrieves the amount of objects
        }
        
        for(int i=4;i<list.size();i++){ //starts on line after blank line,searches all lines in text
            
            if(list.get(i).equals("Circle")){ //detects if anyline of code is declaring a circle
                Circ temp=new Circ(); //new circle object
                
                for(int a=i+1;a<list.size();a++){ //searches for attributes belonging to a circle and adds them to the object
                    if(list.get(a).contains("r:")&&!list.get(a).contains("color:")){
                        String[]dump = list.get(a).split(" "); //seracehs for radius parameter and sets value to object if found
                        temp.SetR(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("x:")){
                        String[]dump = list.get(a).split(" "); //searches for x value perameter and sets value to object if found
                        temp.SetX(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("y:")){
                        String[]dump = list.get(a).split(" "); //searches for y value perameter and sets value to object if found
                        temp.SetY(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("color:")&&!list.get(a).contains("bordercolor:")){ //searches for color string,splits the string into 3 rgb values and sets values to object if found
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetCR(Integer.parseInt(dump2[0]));
                        temp.SetCG(Integer.parseInt(dump2[1]));
                        temp.SetCB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).contains("border:")){
                        String[]dump = list.get(a).split(" "); //searches for border thickness parameter and sets value to object if found
                        temp.SetBorder(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("bordercolor:")){
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetBR(Integer.parseInt(dump2[0])); //searches for bordercolor string,splits the string into 3 rgb values and sets values to object if found
                        temp.SetBG(Integer.parseInt(dump2[1]));
                        temp.SetBB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).equals("\n")||list.get(a).equals("")||list.get(a).equals(" ")||list.get(a).equals("effect")){ //searches for when the object declaration is done and ends the loop.
                        root.getChildren().add(temp.getCircle()); //adds the completed shape to a group to be printed later
                        i=a; //lets the external loop know that the lines have arleady been searched and can now look for the next objects to be declared
                        break;
                    }
                }
                
            }
            
            if(list.get(i).equals("Rect")){//detects if text file is creating a rectangle object
                Rect temp=new Rect();//creates a rectangle object
                
                for(int a=i+1;a<list.size();a++){
                    if(list.get(a).contains("length:")){
                        String[]dump = list.get(a).split(" ");//searches for length parameter and sets value to object if found
                        temp.SetLength(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("width:")){
                        String[]dump = list.get(a).split(" ");//searches for width parameter and sets value to object if found
                        temp.SetWidth(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("x:")){
                        String[]dump = list.get(a).split(" "); //searches for x coordinate parameter and sets value to object if found
                        temp.SetX(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("y:")){
                        String[]dump = list.get(a).split(" "); //searches for y coordinate parameter and sets value to object if found
                        temp.SetY(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("color:")&&!list.get(a).contains("bordercolor:")){
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetCR(Integer.parseInt(dump2[0])); //searches for color string,splits the string into 3 rgb values and sets values to object if found
                        temp.SetCG(Integer.parseInt(dump2[1]));
                        temp.SetCB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).contains("border:")){
                        String[]dump = list.get(a).split(" "); //searches for border thickness coordinate parameter and sets value to object if found
                        temp.SetBorder(Integer.parseInt(dump[1])); 
                    }
                    else if(list.get(a).contains("bordercolor:")){
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetBR(Integer.parseInt(dump2[0])); //searches for bordercolor string,splits the string into 3 rgb values and sets values to object if found
                        temp.SetBG(Integer.parseInt(dump2[1]));
                        temp.SetBB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).equals("\n")||list.get(a).equals("")||list.get(a).equals(" ")||list.get(a).equals("effect")){ //searches for when the object declaration is done and ends the loop.
                        root.getChildren().add(temp.getRectangle()); //adds the completed shape to a group to be printed later
                        i=a; //lets the external loop know that the lines have arleady been searched and can now look for the next objects to be declared
                        break;
                    }
                }
                
            }
                if(list.get(i).equals("Line")){
                Lin temp=new Lin();
                
                for(int a=i+1;a<list.size();a++){
                    if(list.get(a).contains("x:")&&!list.get(a).contains("endx:")){ //searches for starting x coordinate parameter and sets value to object if found
                        String[]dump = list.get(a).split(" ");
                        temp.SetX(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("y:")&&!list.get(a).contains("endy:")){ //searches for starting y coordinate parameter and sets value to object if found
                        String[]dump = list.get(a).split(" ");
                        temp.SetY(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("endx:")){
                        String[]dump = list.get(a).split(" "); //searches for ending x coordinate parameter and sets value to object if found
                        temp.SetEndX(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("endy:")){
                        String[]dump = list.get(a).split(" "); //searches for ending y coordinate parameter and sets value to object if found
                        temp.SetEndY(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).contains("color:")){
                        String[]dump = list.get(a).split(" ");
                        String[]dump2= dump[1].split(",");
                        temp.SetCR(Integer.parseInt(dump2[0]));
                        temp.SetCG(Integer.parseInt(dump2[1])); //searches for color string,splits the string into 3 rgb values and sets values to object if found
                        temp.SetCB(Integer.parseInt(dump2[2]));
                    }
                    else if(list.get(a).contains("border:")){
                        String[]dump = list.get(a).split(" "); //searches for border thickness coordinate parameter and sets value to object if found
                        temp.SetBorder(Integer.parseInt(dump[1]));
                    }
                    else if(list.get(a).equals("\n")||list.get(a).equals("")||list.get(a).equals(" ")||list.get(a).equals("effect")){ //searches for when the object declaration is done and ends the loop.
                        root.getChildren().add(temp.getLine()); //adds the completed shape to a group to be printed later
                        i=a; //lets the external loop know that the lines have arleady been searched and can now look for the next objects to be declared
                        break;
                    }
                }
                
            }
                        
        }
        
        
    }
}
