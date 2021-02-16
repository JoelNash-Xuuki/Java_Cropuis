package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_10{

	public static void main(String[] args){
		ShapesModelTest t = new TriangleTest(Color.RED);
	}
}
abstract class ShapesModelTest{
		public ShapesModelTest(String test_10, Color color){
			System.out.println(test_10 + color);
		}
}

class TriangleTest extends ShapesModelTest{

	public TriangleTest(Color color){
		super("Test_9", color);	
	}
}
