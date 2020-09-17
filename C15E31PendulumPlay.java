
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class C15E31PendulumPlay extends Application{
	
	private drawPendulum pen = new drawPendulum();
	private Button btUp = new Button("^");
	private Button btDown = new Button("v");
	

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Initial duration to 1 second

		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		
		
		btUp.setFont(Font.font("Times New Roma",FontWeight.BOLD,20));
		btUp.setOnAction(e->pen.increaseSpeed());

		
		btDown.setFont(Font.font("Times New Roma",FontWeight.BOLD,20));
		btDown.setOnAction(e->pen.decreaseSpeed());
			
		
		Button btStart = new Button("Resume");
		btStart.setFont(Font.font("Times New Roma",FontWeight.BOLD,20));
		btStart.setOnAction(e->pen.play());
		
		Button btPause = new Button("Pause");
		btPause.setFont(Font.font("Times New Roma",FontWeight.BOLD,20));
		btPause.setOnAction(e->pen.pause());
		
		hBox.getChildren().addAll(btUp,btDown,btStart,btPause);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pen);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);	
		
		Scene scene = new Scene(borderPane,300,200);
		primaryStage.setTitle("C15E31_Pendulum");
		primaryStage.setScene(scene);
		primaryStage.show();
	
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
//	class btUpHandlerClass implements EventHandler<ActionEvent> {
//		@Override
//		public void handle(ActionEvent e) {
//			pen.increaseSpeed();
//			
//			if(pen.getDetaT() >0.25 || pen.getDetaT() < -0.25) {
//				btUp.setTextFill(Color.RED);
//			}else {
//				
//				btUp.setTextFill(Color.BLACK);
//			}
//			}
//		}
	



	

}
