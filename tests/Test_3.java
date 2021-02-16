package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_4{
	private static Color colour = Color.RED;

	public static setColour(Color colourIn){
		colour = colourIn;
	}

	public static void main(String[] args){
		System.out.println("Test_4 " + setColour(Color.RED));
	}
}


