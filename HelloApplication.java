package com.example.programassignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      ;

        GridPane gridPane = new GridPane();

        Image image1 = new Image("C:\\Users\\zackd\\Downloads\\ProgramAssignment1\\src\\main\\resources\\flag1.gif");
        Image image2 = new Image("C:\\Users\\zackd\\Downloads\\ProgramAssignment1\\src\\main\\resources\\flag2.gif");
        Image image3 = new Image("C:\\Users\\zackd\\Downloads\\ProgramAssignment1\\src\\main\\resources\\flag6.gif");
        Image image4 = new Image("C:\\Users\\zackd\\Downloads\\ProgramAssignment1\\src\\main\\resources\\flag7.gif");

        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);

        Scene scene = new Scene(gridPane);


        stage.setTitle("Image Shower");
        stage.setScene(scene);


        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}