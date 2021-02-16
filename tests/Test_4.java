package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_4{
	private static Color colour;

	public static void setColour(Color colourIn){
		colour = colourIn;
	}

	public static void main(String[] args){
		setColour(Color.RED);
		System.out.println("Test_4 " + colour );
	}
}


