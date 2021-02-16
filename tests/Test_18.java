package tests;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Test_18{

	private static Rectangle t;

	public static void main(String[] args){
		Test_18 t = new Test_18();
		t.makeRectangle();
		System.out.println(t);
	}
	public static void  makeRectangle(){
		t = new Rectangle();
	}
}
