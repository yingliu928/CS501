

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class C14Listing4 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
	
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.BLUE);		
		Pane pane = new Pane();

		Label label = new Label("JavaFX");
		label.setLayoutX(100);
		label.setLayoutY(100);
		label.setFont(Font.font("Times New Roma",FontWeight.BOLD,FontPosture.ITALIC,20));
		pane.getChildren().addAll(circle,label);
		Scene scene = new Scene(pane,200,200);
		primaryStage.setTitle("FontDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
