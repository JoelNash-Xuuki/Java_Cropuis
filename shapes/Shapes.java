package shapes;
import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle; 
import javafx.scene.shape.Shape;
import javafx.scene.control.Label; 
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.animation.Timeline; 
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition; 
import javafx.animation.RotateTransition; 
import javafx.animation.ScaleTransition; 
import javafx.animation.TranslateTransition; 
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.geometry.Pos;
import javafx.util.Duration; 
 
public class Shapes extends Application {

 	@Override
	public void start(Stage stage) {
		
		// Construct font and font size for application
		Font font = new Font(20);

		// Construct and set up TextField to handle user input
		TextField input = new TextField();         
		input.setMinHeight(50);
		input.setAlignment(Pos.CENTER);
		input.setBackground(null);
		input.setBorder(new Border(new BorderStroke(Color.rgb(20,20,20), BorderStrokeStyle.DOTTED, new CornerRadii(30), BorderWidths.DEFAULT)));

		// Construct node to contain TextField
		HBox inputBox = new HBox(10);
		inputBox.setAlignment(Pos.TOP_CENTER);
		inputBox.getChildren().addAll(input);

		// Construct root in preparation of adding will include user input and shapes
		VBox root = new VBox(10);
		root.setBackground(Background.EMPTY);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(100);

		// Construct message to welcome user to the program
		Label message = new Label();        
		message.setTextFill(Color.GREY);	
		message.setWrapText(true);
		message.setFont(font);
		message.setAlignment(Pos.BASELINE_CENTER);
		message.setText("Welcome, press enter to continue...\n");
		root.getChildren().addAll(message);

		// Construct Shapes to be used withn application 
		// Add transitions to modulate states of shapes before adding to shapes group
		Group shapes = new Group();
		shapes.minHeight(200);
		shapes.minWidth(200);
		ShapesModel t = new Triangle(Color.GREEN, 100., 90., 190., 280., 380., 39.);
		ShapesModel r = new Rec();
		ShapesModel h = new Hexagon(); 

		RotateTransition rt = new RotateTransition(Duration.millis(4000), shapes);
		rt.setByAngle(30);
		rt.setCycleCount(4);
		rt.setAutoReverse(true);
		rt.play();
		shapes.setEffect(new GaussianBlur(100));
		shapes.getChildren().add(h.getShape());

		/* Listen for user actions to handle ensuring input is either valid or met with appropriate message
 			to instruct correct input from user.
 				*/
    	input.setOnKeyTyped( e -> {                     

						if(e.getCharacter().equals("\r")){
							rt.stop();
							shapes.setEffect(new GaussianBlur(0));
							root.getChildren().remove(message);

							switch(input.getText().toLowerCase()){			
		 						case "triangle":
									shapes.getChildren().clear();
	   								shapes.getChildren().add(t.getShape());
									break;
								case "rectangle":
									shapes.getChildren().clear();
	   								shapes.getChildren().add(r.getShape());
									break;
								case "hexagon":
									shapes.getChildren().clear();
	   								shapes.getChildren().add(h.getShape());
									break;
								case "red":
									ShapesModel.setColour(Color.RED);
									t.drawColour();
									r.drawColour();
									h.drawColour();						
									break;
								case "green":
									ShapesModel.setColour(Color.GREEN);
									t.drawColour();
									r.drawColour();
									h.drawColour();
									break;
								case "grey":
									ShapesModel.setColour(Color.GREY);
									t.drawColour();
									r.drawColour();
									h.drawColour();
									break;
								default:		
								message.setLineSpacing(10);
								message.setTextAlignment(TextAlignment.CENTER);
								message.setMinWidth(400);
								message.setMinWidth(400);
								message.setMaxWidth(400);
								message.setText(" Press Enter after typing a single"+ 
												" word instruction from options:" +
												"\"Triangle\", \"Rectangle\", \"Hexagon\", \"Red\", \"Green\" or \"Grey\".");
								root.getChildren().add(message);
							}
						}
					}
				);
		
		// Gather shapes and user input by adding them to root
		root.getChildren().addAll(inputBox, shapes);
		Scene scene = new Scene(root, 500, 500, Color.TRANSPARENT);

		//Transitional states to modulate GUI inbetween input instructions	
		ScaleTransition st = new ScaleTransition(Duration.millis(4000), shapes);
		
		shapes.setOnMouseEntered(e -> {					
	 									st.setByX(0.25f);
     									st.setByY(0.25f);
     									st.setCycleCount(4);
     									st.setAutoReverse(true);
										shapes.setEffect(new GaussianBlur(0));
     									st.play();
										rt.play();	
								   }
								);
		shapes.setOnMouseExited(e -> {
										shapes.setEffect(new GaussianBlur(4));
										rt.stop();
								   }
								);
    	stage.setTitle("Shapes");
    	stage.setScene(scene);
    	stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
