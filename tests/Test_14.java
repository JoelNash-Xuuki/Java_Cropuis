package tests;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Test_14{

	public static void main(String[] args){
		HexagonTest t = new HexagonTest(
								19., 20.,
								93., 95.,
								92., 90.,
								19., 20.,
								93., 95.,
								92., 90.);
	}
}
class HexagonTest{

	private double xa, ya, xb, yb, xc, yc, xd, yd, xe, ye, xf, yf;
	
	public HexagonTest(double xa, double ya,
					   double xb, double yb,
					   double xc, double yc,
					   double xd, double yd,
					   double xe, double ye,
					   double xf, double yf){
		this.xa = xa;
		this.ya = ya;
		this.xb = xb;
		this.yb = yb;
		this.xc = xc;
		this.yc = yc;
		this.xd = xd;
		this.yd = yd;
		this.xe = xe;
		this.ye = ye;
		this.xf = xf;
		this.yf = yf;

		System.out.println(xa+ya+xb+yb+xc+yc+xd+yd+xe+ye+xf+yf);
	}
}
