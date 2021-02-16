package tests;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;

public class Test_13{

	private static Polygon s;

	public static void main(String[] args){
		Test_13 t = new Test_13();
		t.makeTriangleWOSet();
		System.out.println(s);
	}
	public static void  makeTriangleWOSet(){
		s = new Polygon();
	}
}
