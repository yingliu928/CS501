
import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class C14E1 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane pane = new GridPane();
		
		pane.setAlignment(Pos.CENTER);
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setPadding(new Insets(10,10,10,10));
		File file1 = new File("C:\\Users\\Eva\\eclipse-workspace\\CS501\\src\\UK.jpg");
	    Image image1 = new Image(file1.toURI().toString());
	    File file2 = new File("C:\\Users\\Eva\\eclipse-workspace\\CS501\\src\\canada.jpg");
	    Image image2 = new Image(file2.toURI().toString());
	    File file3 = new File("C:\\Users\\Eva\\eclipse-workspace\\CS501\\src\\China.jpg");
	    Image image3 = new Image(file3.toURI().toString());
	    File file4 = new File("C:\\Users\\Eva\\eclipse-workspace\\CS501\\src\\US.jpg");
	    Image image4 = new Image(file4.toURI().toString());
		
		
		ImageView imageView1 = new ImageView(image1);
		imageView1.autosize();
		
		ImageView imageView2 = new ImageView(image2);
		imageView1.autosize();
		
		ImageView imageView3 = new ImageView(image3);
		imageView1.autosize();
		
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(100);
		imageView4.setFitWidth(200);
		pane.add(imageView1,0,0);
		pane.add(imageView2,1,0);
		pane.add(imageView3,0,1);
		pane.add(imageView4,1,1);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_01");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
