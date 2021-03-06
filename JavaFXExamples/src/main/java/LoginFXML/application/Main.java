package LoginFXML.application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main (String [] args)
	{
		launch(args);
	}	
	
	
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
	}
	
	
	
	@Override
	public void stop() throws Exception {
		System.out.println("Program stopped");
		super.stop();
	}
	
	
	

	@Override
	public void start(Stage primaryStage) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
			Scene scene = new Scene(root, 300, 275);
			primaryStage.setTitle("FXML Welcome");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}