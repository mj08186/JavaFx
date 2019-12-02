import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyFirstFX extends Application{

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		//Create a Button
		Button btnExit = new Button("Click to exit");
		


		// create Background 
		//BackgroundFill background_fill = new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY); 
		//Background background = new Background(background_fill); 
		//btnExit.setBackground(background);
		
		//Change the color without a background
		btnExit.setStyle("-fx-background-color: #ff0000");
		Font font = new Font(40);
		btnExit.setFont(font);
		
		int[] clickStatus = {1};
		
		//Do something with the button
		btnExit.setOnAction(value -> {
			if(clickStatus[0] == 1) {
			btnExit.setText("Clicked");
			btnExit.setStyle("-fx-background-color: #000000");
			clickStatus[0] *= -1;;
			}
			else {
				btnExit.setText("Click to exit");
				btnExit.setStyle("-fx-background-color: #FF0000");
				clickStatus[0] *= -1;;
				}
		});
		
		Pane simplePane = new Pane();
		simplePane.getChildren().add(btnExit);
		
		Circle c = new Circle(100);
		c.setCenterX(300);
		c.setCenterY(300);
		c.setStroke(Color.ANTIQUEWHITE);
		c.setFill(Color.AQUA);
		
		simplePane.getChildren().add(c);
		
		//Create a Scene 
		Scene scene = new Scene(simplePane, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("My First FX Program");
		primaryStage.show();
	}
}
