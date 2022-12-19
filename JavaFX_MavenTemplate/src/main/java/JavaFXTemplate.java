import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.awt.*;

public class JavaFXTemplate extends Application {
	Button GamingComputer,OfficeComputer, Back;
	Scene scene;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to Random Computer Generator");
		GamingComputer = new Button("Gaming Computer");
		OfficeComputer = new Button("Office Computer");
		Back = new Button("Back");
		VBox root = new VBox(20,GamingComputer,OfficeComputer);
		
		GamingComputer.setOnAction(e->{
			primaryStage.setTitle("Gaming Computer");
			primaryStage.setScene(createGamingComputer());
		});

		OfficeComputer.setOnAction(e->{
			primaryStage.setTitle("Office Computer");
			primaryStage.setScene(createOfficeComputer());
		});

		Back.setOnAction(e->{
			primaryStage.setTitle("Welcome to Random Computer Generator");
			primaryStage.setScene(scene);

		});
		scene = new Scene(root, 700,700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public Scene createGamingComputer() {
		Text text = new Text("Creating A Gaming Computer");
		Text text1 = new Text("Choosing Random Components");
		GamingComputer Computer = new GamingComputer();
		ListView<String> listView = Computer.makeComputer();
		VBox root = new VBox(text,text1,Back,listView);
		Scene GamingComputerScene = new Scene(root,700,700);
		return GamingComputerScene;
	}

	public Scene createOfficeComputer() {
		Text text = new Text("Creating A Office Computer");
		Text text1 = new Text("Choosing Random Components");
		OfficeComputer Computer = new OfficeComputer();
		ListView<String> listView = Computer.makeComputer();
		VBox root = new VBox(text,text1,Back,listView);
		Scene GamingComputerScene = new Scene(root,700,700);
		return GamingComputerScene;
	}

}
