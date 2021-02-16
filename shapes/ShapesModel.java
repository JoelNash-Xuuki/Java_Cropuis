package shapes;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public abstract class ShapesModel extends Shape
{
	private String shape; 
	private static Color colour;

	public ShapesModel(String shape){
		this.shape = shape;
	}
	public ShapesModel(String shape, Color colour){
		this.shape = shape;
		this.colour = colour;
	}

	public Color getColour(){
		return colour;
	}
	
	public static void setColour(Color colourIn){
		colour = colourIn;
	}
	
	public abstract void setShape();
	public abstract void applyShape();
	public abstract void drawColour();
	public abstract Shape getShape();
}
