package shapes;
import javafx.animation.FillTransition;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Rec extends ShapesModel{

	private double width, height;
	private Rectangle rec;
	private Color col;
	private FillTransition ft;

	public Rec(){
		super("rectangle");
		makeRectangle();
	}

	public Rec(Color colour){
		super("rectangle", colour);
		makeRectangle();
	}

	private void makeRectangle(){
		rec = new Rectangle(width, height);
		setShape();
		applyShape();
		drawColour();
	}
	
	@Override
	public void drawColour(){
		ft = new FillTransition(Duration.millis(1000), rec, col, super.getColour()); 
		ft.setCycleCount(1);
		ft.setAutoReverse(false);
		ft.play();
		col = super.getColour();
	}	

	@Override
	public void setShape(){
		width = 250.;
		height = 150.;
	}

	@Override
	public void applyShape(){
		drawColour();
		rec = new Rectangle(width, height);
	}

	@Override
	public Shape getShape(){
		drawColour();
		return rec;
	}
}
