import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class C14Listing3 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		pane.getChildren().addAll(new Button("OK"));
		//pane.getChildren().add(new Button("CANCEL"));
		
		Scene scene = new Scene(pane, 200,50);
		primaryStage.setTitle("Button in a pane");
		primaryStage.setScene(scene);
		primaryStage.show();
				
	}

}
