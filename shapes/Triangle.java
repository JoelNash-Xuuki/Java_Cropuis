package shapes;
import javafx.animation.FillTransition;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Triangle extends ShapesModel{

	private double xa, ya, xb, yb, xc, yc;
	private Polygon triangle;
	private Color col;
	private FillTransition ft;	

	public Triangle(){
		super("triangle");
		makeTriangle();
	}

	public Triangle(Color colour){
		super("triangle", colour);
		makeTriangle();
	}

	public Triangle(Color colour, double xa, double ya, 
					double xb, double yb, 
					double xc, double yc){
		super("triangle", colour);
		col = colour;
		this.xa = xa; 
		this.ya = ya;
		this.xb = xb; 
		this.yb = yb;	
		this.xc = xc; 
		this.yc = yc;
		makeTriangleWOSet();
	}

	private void makeTriangle(){
		triangle = new Polygon();
		setShape();
		applyShape();
		drawColour();
	}

	private void makeTriangleWOSet(){
		triangle = new Polygon();
		applyShape();
		drawColour();
	}

	@Override
	public void setShape(){
		xa = 90.; 
		ya = 80.;
		xb = 93.; 
		yb = 95.;	
		xc = 92.; 
		yc = 90.;
	}

	@Override
	public void applyShape(){
		triangle.getPoints().addAll(new Double[]{
			xa, ya,		
			xb,	yb,
			xc, yc,
		});
	}

	@Override
	public void drawColour(){
		ft = new FillTransition(Duration.millis(2000), triangle, col, super.getColour()); 
		ft.setCycleCount(1);
		ft.setAutoReverse(false);
		ft.play();
		col = super.getColour();
	}

	@Override
	public Shape getShape(){
		drawColour();
		return triangle;
	}
}
