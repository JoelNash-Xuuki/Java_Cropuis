package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_16{

	public static void main(String[] args){
		ShapesModelTest t = new HexagonTest();
	}
}
abstract class ShapesModelTest{
		public ShapesModelTest(String test_16){
			System.out.println(test_16);
		}
}

class HexagonTest extends ShapesModelTest{

	public HexagonTest(){
		super("Test_16");	
	}
}
