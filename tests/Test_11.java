package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_11{

	public static void main(String[] args){
		TriangleTest t = new TriangleTest(Color.RED, 
								90., 80,
								93., 95.,
								92., 90);
	}
}

class TriangleTest{

	private double xa, ya, xb, yb, xc, yc;
	
	public TriangleTest(Color color, double xa, double ya,
							double xb, double yb,
							double xc, double yc){
		this.xa = xa;
		this.ya = ya;
		this.xb = xb;
		this.yb = yb;
		this.xc = xc;
		this.yc = yc;
		System.out.println(xa + ya + xb + yb + xc + yc);
	}
}
