package shapes;
import javafx.animation.FillTransition;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Hexagon extends ShapesModel{

	private double xa, ya, xb, yb, xc, yc, xd, yd, xe, ye, xf, yf;
	private Polygon hexagon;
	private Color col;
	private FillTransition ft;

	public Hexagon(){
		super("hexagon");
		makeHexagon();
	}

	public Hexagon(Color colour){
		super("hexagon", colour);
		makeHexagon();
	}

	public Hexagon(double xa, double ya, 
				   double xb, double yb, 
				   double xc, double yc,
				   double xd, double yd,
				   double xe, double ye,
				   double xf, double yf){
		super("hexagon");
		makeHexagon();
	}
	
	private void makeHexagon(){
		hexagon = new Polygon();
		setShape();
		applyShape();
		drawColour();
	}

	@Override
	public void drawColour(){
		ft = new FillTransition(Duration.millis(1500), hexagon, col, super.getColour()); 
		ft.setCycleCount(1);
		ft.setAutoReverse(false);
		ft.play();
		col = super.getColour();
	}

	@Override
	public void setShape(){
		xa = 190.;  
		ya = 200.;
		xb = 240.; 
		yb = 200.;	
		xc = 270.; 
		yc = 250.;
		xd = 250.; 
		yd = 300.;
		xe = 190.; 
		ye = 300.;	
		xf = 160.; 
		yf = 250.;
	}

	@Override
	public void applyShape(){
	    hexagon.getPoints().addAll(new Double[]{
			xa,	ya,		
			xb,	yb,
			xc,	yc,
			xd,	yd,
			xe,	ye,
			xf,	yf,
		});
	}
	
	@Override
	public Shape getShape(){
		drawColour();
		return hexagon;
	}
}
