/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import Classes.Shapes.*;
import Classes.Misc.*;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Benjamin MacLean
 */
public class FinalProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        AnimationPlayer player = new AnimationPlayer(); //creates the animation object
        player.loadAnimationFromFile("animation1.txt"); //tells animation what text file to load
        
        
        Group root= player.getGroup(); //gets the objects of the data file put into a group object
        Scene scene = new Scene(root, 400, 300); //adds the group object to the scene, and sets the window size to 400x300 pixels
        primaryStage.setTitle("Animation Player"); //sets title of the window to be created
        primaryStage.setScene(scene); //adds the created scene to the stage
        primaryStage.show(); //shows the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
