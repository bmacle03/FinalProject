/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import Classes.Effects.*;
import Classes.Shapes.*;
import Classes.Misc.*;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author b7mac
 */
public class FinalProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        AnimationPlayer player = new AnimationPlayer();
        player.loadAnimationFromFile("animation1.txt");
        
        
        Group root= player.getGroup();
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Animation Player");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
