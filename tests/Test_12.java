package tests;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;

public class Test_12{

	private static Polygon s;

	public static void main(String[] args){
		Test_12 t = new Test_12();
		t.makeTriangle();
		System.out.println(s);
	}
	public static void  makeTriangle(){
		s = new Polygon();
	}
}
