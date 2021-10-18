/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcircle;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author amedi
 */
public class ControlCircle extends Application {
    Circle circle;
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane borderpane = new BorderPane();
        Scene scene = new Scene(borderpane, 300, 250);
        
        //Creamos el circulo 
        circle = new Circle(50, Color.web("black", 0.01));
        circle.setStroke(Color.web("black", 1));
        
        //Centramos el ciruclo
        borderpane.setCenter(circle);
        
        // Creamos el hbox en el cual vamos a meter los botones
        HBox hbox = new HBox();
        // Incluimos los botones en el borderpane
        borderpane.setBottom(hbox);
        
        // Centramos los botones
        hbox.setAlignment(Pos.CENTER);
        
  
    
        
        // Boton aumentar
        Button btn_aumentar = new Button();
        btn_aumentar.setText("Aumentar");
        btn_aumentar.setOnAction(new AumentarHandler());
       
        // Boton disminuir
        Button btn_disminuir = new Button();
        btn_disminuir.setText("Disminuir");
        btn_disminuir.setOnAction(new DisminuirHandler());
        
        

        // Incluimos los botones en el hbox
        hbox.getChildren().addAll(btn_aumentar, btn_disminuir);
        
       
        primaryStage.setTitle("InerClass");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    // Inner Class
        class AumentarHandler implements EventHandler<ActionEvent>{
            @Override
            public void handle(ActionEvent e)
            {
                circle.setRadius(circle.getRadius()+4);
            }
        }
        
        // Inner Class
        class DisminuirHandler implements EventHandler<ActionEvent>{
            @Override
            public void handle(ActionEvent e)
            {
                circle.setRadius(circle.getRadius()-4);
            }
        }
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
