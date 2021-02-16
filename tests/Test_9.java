package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_9{

	public static void main(String[] args){
		ShapesModelTest t = new TriangleTest(Color.RED);
	}
}
abstract class ShapesModelTest{
		public ShapesModelTest(String test_9){
			System.out.println(test_9);
		}

}

class TriangleTest extends ShapesModelTest{

	public TriangleTest(Color colour){
		super("Test_9");	
	}
}
