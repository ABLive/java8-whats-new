package com.ablive.javafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SecondApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ihm.fxml"));
			
			Parent root = loader.load();
			
			primaryStage.setScene(new Scene(root));
			
			primaryStage.show();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static void main(String[] args) {
		launch();
	}
	
}