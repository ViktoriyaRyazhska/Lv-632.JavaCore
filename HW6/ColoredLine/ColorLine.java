
public class ColorLine extends Line{
	private Colors color;

	public void print() {
		System.out.println("Now its a line with "+this.color+" color");
	}	
	
	public ColorLine() {
		super();
	}

	public ColorLine(Line line,Colors color) {
		super();
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "ColorLine [color=" + color + "]";
	}
	
	
}
