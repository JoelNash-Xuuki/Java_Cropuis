package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_20{

	public static void main(String[] args){
		ShapesModelTest t = new RecTest(Color.GREY);
	}
}
abstract class ShapesModelTest{
		public ShapesModelTest(String test_20, Color color){
			System.out.println(test_20 + color);
		}
}

class RecTest extends ShapesModelTest{

	public RecTest(Color color){
		super("Test_20", color);	
	}
}
