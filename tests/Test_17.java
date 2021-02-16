package tests;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;

public class Test_17{

	private static Polygon s;

	public static void main(String[] args){
		Test_17 t = new Test_17();
		t.makeHexagon();
		System.out.println(s);
	}
	public static void  makeHexagon(){
		s = new Polygon();
	}
}
