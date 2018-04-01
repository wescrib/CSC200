/**
*Author: William Scribner
*Purpose: to create an array and print in in alpha-numeric order
*
*/


import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class newArray extends Application {
	
	Stage window;
	Scene scene;
	Button submitButton;
	
	
	public void start(Stage primaryStage) throws Exception {
		//set up stage
		window = primaryStage;
		window.setTitle("Arrayzzzz");
		Label prompt = new Label("Christmas Wishlist");
		
		submitButton = new Button("Submit");

		//establish the array
		ArrayList<String> wishList = new ArrayList<String>();

		//setup textfields for the array to absorb
		TextField[] text1 = new TextField[10];
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));
		
		submitButton = new Button("Add");
		
		//puts up number of population fields for the window
		for(int i=0; i<text1.length; i++){
			Tooltip tooltip = new Tooltip();
			tooltip.setText("Put Christmas items in here");
			text1[i] = new TextField("Present " + (i + 1));
			text1[i].setTooltip(tooltip);
			layout.getChildren().addAll(text1[i]);
			
			
		}

		//adds the submit button to the window
		layout.getChildren().addAll(submitButton,prompt);
		
		submitButton.setOnAction(e -> {
			window.close();
			for(int i=0; i<text1.length; i++){

			//turns whatever is entered in the population fields into a String called "presents"
			String presents = text1[i].getText();

			//adds the String "presents" to the wishList
			wishList.add(presents);
						

			}
			//this part sorts the array
			Collections.sort(wishList);
			
			System.out.println(wishList);
			
			});
		
		Scene scene = new Scene(layout,500,425);
		window.setScene(scene);
		window.show();
		
		
	}
	
	

}
