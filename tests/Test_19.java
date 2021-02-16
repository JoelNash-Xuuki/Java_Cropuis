package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_19{

	public static void main(String[] args){
		ShapesModelTest t = new RecTest();
	}
}
abstract class ShapesModelTest{
		public ShapesModelTest(String test_19){
			System.out.println(test_19);
		}
}

class RecTest extends ShapesModelTest{

	public RecTest(){
		super("Test_19");	
	}
}
