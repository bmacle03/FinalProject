/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Misc;

import Classes.Shapes.*;
import javafx.scene.Group;

import java.io.*;
import java.util.ArrayList;

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
            String[] temp= list.get(1).split(" ");
            String[] dump=temp[1].split("f");
            this.fps=Integer.parseInt(dump[0]);
        }
        if(!list.get(2).equals("")){
            this.objects=Integer.parseInt(list.get(2));
        }
        
        
        
    }
}
