package com.cookingcalculator.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CookingCalculator extends Application {
	private int unit1;
	private int unit2;
	
	String[] units = {null,"Tsp", "Tbsp", "Cup", "Pint", "qt", "mL"};
	String w = "This conversion is very small and may be inaccurate with common household measuring tools";
	
	MenuItem item1;
	MenuItem item2;
	MenuItem item3;
	MenuItem item4;
	MenuItem item5;
	MenuItem item6;
	MenuItem item7;
	MenuItem item8;
	MenuItem item9;
	MenuItem item10;
	MenuItem item11;
	MenuItem item12;
	
	
	//convert from dropdown A = convert to dropdown B
	//flip measurements button
	//amount num entry
	//convert button
	//if volume and weight mix, provide ingredient type dropdown
	//print answer area
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setTitle("Cooking Calculator");
		stage.setHeight(580);
		stage.setWidth(500);
		//stage.initStyle(StageStyle.DECORATED);
		
		VBox root = new VBox();
		root.getStylesheets().add(getClass().getResource("styles.css").toString());
		
		
		item1 = new MenuItem("Tsp");
	    item2 = new MenuItem("Tbsp");
	    item3 = new MenuItem("Cups");
	    item4 = new MenuItem("Pints");
	    item5 = new MenuItem("Quarts");
	    item6 = new MenuItem("Milliliters");
	    
	    item7 = new MenuItem("Tsp");
	    item8 = new MenuItem("Tbsp");
	    item9 = new MenuItem("Cups");
	    item10 = new MenuItem("Pints");
	    item11 = new MenuItem("Quarts");
	    item12 = new MenuItem("Milliliters");
	    
	    MenuButton menuButton1 = new MenuButton("Convert from: ", null, item1, item2, item3, item4, item5, item6);
	    Label m1 = new Label("");
	    menuButton1.setId("mb1");
	    
	    MenuButton menuButton2 = new MenuButton("to: ", null, item7, item8, item9, item10, item11, item12);
	    Label m2 = new Label("");
	    menuButton2.setId("mb2");
	    
	    root.setSpacing(10);
	    
	    item1.setOnAction(e -> {
            unit1 = 1;
            m1.setText(units[unit1]);
        });
        item2.setOnAction(e -> {
        	unit1 = 2;
        	m1.setText(units[unit1]);
        });
        item3.setOnAction(e -> {
        	unit1 = 3;
        	m1.setText(units[unit1] + "s");
        });
        item4.setOnAction(e -> {
        	unit1 = 4;
        	m1.setText(units[unit1] + "s");
        });
        item5.setOnAction(e -> {
        	unit1 = 5;
        	m1.setText(units[unit1] + "s");
        });
        item6.setOnAction(e -> {
        	unit1 = 6;
        	m1.setText(units[unit1]);
        });
        
        item7.setOnAction(e -> {
        	unit2 = 1;
        	m2.setText(units[unit2]);
        });
        item8.setOnAction(e -> {
        	unit2 = 2;
        	m2.setText(units[unit2]);
        });
        item9.setOnAction(e -> {
        	unit2 = 3;
        	m2.setText(units[unit2] + "s");
        });
        item10.setOnAction(e -> {
        	unit2 = 4;
        	m2.setText(units[unit2] + "s");
        });
        item11.setOnAction(e -> {
        	unit2 = 5;
        	m2.setText(units[unit2] + "s");
        });
        item12.setOnAction(e -> {
        	unit2 = 6;
        	m2.setText(units[unit2]);
        });

	    
	    Label amtLabel = new Label("Value to convert: ");
	    TextField amount = new TextField("amount");
		
		Button convert = new Button ("Convert");
		convert.setId("btn");
		
		Label answer = new Label("");
		answer.setId("answer");
		
		Label warning = new Label("");
		warning.setWrapText(true);
		warning.setId("warning");
		
		
		convert.setOnAction(e -> {
			String s = "s";
			
			if ((unit1 < 1) || (unit2 < 1)) {
				warning.setText("Please choose both units to use in conversion before converting");
			} else {
				int u1 = unit1;
				int u2 = unit2;
			
				try {
		        	double amt = Double.parseDouble( amount.getText());
		        	
		
		        	double conversionFactor = Conversions.getConversionFactor(u1, u2);
		        
		        	double display = conversionFactor * amt;
		        	String ansNum = String.format("%.2f", display);
		        	
		        	if (display <= 0.1) {
		        		warning.setText(w);
		        	} else {
		        		warning.setText("");
		        	}
		        	
		        	if ((display > 1) && (unit2 > 2)) {
		        		answer.setText(ansNum + " " + units[unit2] + s );
		        	} else {
		        		answer.setText(ansNum + " " + units[unit2] );
		        	}
		        	
				} catch (NumberFormatException exception) {
					warning.setText("Please enter a number amount to convert");
					answer.setText("");
				}
			
			}
			
        });
		
		root.getChildren().addAll(menuButton1, m1, menuButton2, m2, amtLabel, amount, convert, answer, warning);
		Scene sceneA = new Scene(root);
		
		stage.setScene(sceneA);
		
		stage.show();
	
	}

}
