import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class LanguagePokemonGame extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		//Create the stuff to hold the components
		Pane pane = new Pane();
		Pane lblPane = new Pane();
		Pane pbPane = new Pane();
		VBox vBox = new VBox();
		GridPane gPane = new GridPane();
		
		//Create the components
		Button answer = new Button("Answer");
		Button hint = new Button("Hint");
		Button saveLoad = new Button("Save/Load");
		Button close = new Button("Close");
		
		Button opt1 = new Button("Option 1");
		Button opt2 = new Button("Option 2");
		Button opt3 = new Button("Option 3");
		Button opt4 = new Button("Option 4");
		
		Label lblHealth = new Label("Health:");
		Label lblEXP = new Label("EXP:");
		Label lblLevel = new Label("(1)");
		Label lblHint = new Label("Hint: ");
		Label lblEnemy = new Label("Enemy Here");
		
		ProgressBar pbHealth = new ProgressBar();
		ProgressBar pbEXP = new ProgressBar();
		
		//Setting the size of the components
		answer.setPrefHeight(100);
		answer.setPrefWidth(200);
		hint.setPrefHeight(100);
		hint.setPrefWidth(200);
		saveLoad.setPrefHeight(100);
		saveLoad.setPrefWidth(200);
		close.setPrefHeight(100);
		close.setPrefWidth(200);
		
		opt1.setPrefHeight(200);
		opt1.setPrefWidth(400);
		opt2.setPrefHeight(200);
		opt2.setPrefWidth(400);
		opt3.setPrefHeight(200);
		opt3.setPrefWidth(400);
		opt4.setPrefHeight(200);
		opt4.setPrefWidth(400);
		
		pbHealth.setPrefWidth(150);
		pbEXP.setPrefWidth(150);
		
		//Progress bar settings
		pbHealth.setProgress(1.0);
		pbEXP.setProgress(0.0);
		pbHealth.setStyle("-fx-accent: limegreen");
		pbEXP.setStyle("-fx-accent: deepskyblue");
		
		//Changing the text size and/or font
		answer.setFont(new Font("System", 16));
		hint.setFont(new Font("System", 16));
		saveLoad.setFont(new Font("System", 16));
		close.setFont(new Font("System", 16));
		opt1.setFont(new Font("System", 32));
		opt2.setFont(new Font("System", 32));
		opt3.setFont(new Font("System", 32));
		opt4.setFont(new Font("System", 32));
		lblHealth.setFont(new Font("System", 20));
		lblEXP.setFont(new Font("System", 20));
		lblLevel.setFont(new Font("System", 14));
		lblHint.setFont(new Font("System", 40));
		lblEnemy.setFont(new Font("System", 40));
		
		//Adding the component to stuff
		vBox.getChildren().addAll(answer, hint, saveLoad, close);
		gPane.add(opt1, 0, 0);
		gPane.add(opt2, 1, 0);
		gPane.add(opt3, 0, 1);
		gPane.add(opt4, 1, 1);
		lblPane.getChildren().addAll(lblHealth, lblEXP, lblLevel, lblHint, lblEnemy);
		pbPane.getChildren().addAll(pbHealth, pbEXP);
		
		//Translating stuff around
		lblHealth.setTranslateY(20);
		lblEXP.setTranslateX(25);
		lblLevel.setTranslateX(-7);
		lblLevel.setTranslateY(5);
		lblHint.setTranslateX(225);
		lblEnemy.setTranslateX(365);
		lblEnemy.setTranslateY(-150);
		pbHealth.setTranslateY(20);
		vBox.setTranslateX(800);
		vBox.setTranslateY(350);
		gPane.setTranslateY(350);
		lblPane.setTranslateY(300);
		lblPane.setTranslateX(10);
		pbPane.setTranslateX(75);
		pbPane.setTranslateY(309);
		
		pane.getChildren().addAll(vBox, gPane, lblPane, pbPane);
		Scene scene = new Scene(pane, 1000, 750);
		primaryStage.setTitle("Language Learning Pokemon Battle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
