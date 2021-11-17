//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;

import java.util.Scanner;

public class mainInterface //extends Application
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		patientClass patient = new patientClass("Jaden", "Swensen", "June 2nd, 2001", "480-468-7416",
				"Jswensen@asu.edu", "ASU", "ASU pharmacy", "ASU Insurance", 5656);
		
		patient.addPatientPrescription("Drugs", 10, 500, false, 0);
		
		doctorClass[] listOfDocs = new doctorClass[10];
		doctorClass[] listOfNurses = new doctorClass[10];
		
		String doctorName = "Doctor Placement";
		String nurseName = "Nurse Placement";
		int doctorPinCode = 1000;
		int nursePinCode = 2000;
		String doctorTitle = "Doctor";
		String nurseTitle = "Nurse";
		
		for(int i = 0; i < 10; i++)
		{
			listOfDocs[i] = new doctorClass(doctorName, doctorName, doctorPinCode, doctorTitle);
			listOfNurses[i] = new doctorClass(nurseName, nurseName, nursePinCode, nurseTitle);
		}
		System.out.println("Please enter your pin code to enter the system");
		int input = scan.nextInt();
		System.out.println("Did you input: " + input);
		
		
		
		//launch(args);
	}
	
	/*
	@Override
    public void start(Stage primaryStage) 
	{
        primaryStage.setTitle("Healthcare System");
        
        Label title = new Label();
        title.setText("Welcome! Please select one of the options below.");
        title.setStyle("-fx-font: 16 arial;");
        
        Button staffButton = new Button();
        staffButton.setText("I Am A Member Of Staff");
        staffButton.setOnAction(new EventHandler<ActionEvent>() 
        {
 
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("Staff Button Clicked");
            }
        });
        
        Button patientButton = new Button();
        patientButton.setText("I Am A Patient/Vistor");
        patientButton.setOnAction(new EventHandler<ActionEvent>() 
        {
 
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("Patient Button Clicked");
            }
        });
        
        BorderPane border = new BorderPane();
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        
        GridPane grid2 = new GridPane();
        grid2.setAlignment(Pos.CENTER);
        grid2.setHgap(1);
        grid2.setVgap(1);
       
        border.setTop(grid);
        grid.add(title, 0, 1);
        
        border.setBottom(grid2);
        grid2.add(staffButton, 0, 0);
        grid2.add(patientButton, 1, 0);
        
        primaryStage.setScene(new Scene(border, 400, 250));
        primaryStage.show();
	}
	*/
}
