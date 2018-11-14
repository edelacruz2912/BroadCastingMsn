package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;


public class Main extends Application {
	
	Text txt;				//	Text to put in top of the textField
	TextField inputName;	//	userInput to start The BroadCast
	Button strBroadCast;	//	button to start BroadCast	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
	
		
		Scene scene = new Scene(broadCastWindow(),300,100);
		primaryStage.setScene(scene);
		primaryStage.show();		
		
	}
	
	
	/**
	 * 
	 * @return VBox (The BroadCastingWindow)
	 */
	public VBox broadCastWindow()
	{
		VBox broadContainer = new VBox();
		broadContainer.setAlignment(Pos.CENTER);
		broadContainer.setPadding(new Insets(5,5,5,5));
		broadContainer.setSpacing(8);
		
		txt = new Text("Enter Name Please");
		txt.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		///txt.setTextAlignment(TextAlignment.CENTER);
		
		
		inputName = new TextField();
		
		strBroadCast = new Button("Start BroadCast");
		strBroadCast.setAlignment(Pos.BOTTOM_CENTER);
		strBroadCast.setOnAction((e)-> { 
			System.out.println("BroadCastButton works");
		});
		
		
		
		broadContainer.getChildren().addAll(txt,inputName,strBroadCast);
		
		
		return broadContainer;
	}
	
	
	
	
	
	
	
	
	
	
	
}
