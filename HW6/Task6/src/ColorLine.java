//ColorLine with attributes Color  which extends Line class
public class ColorLine extends Line {
	private Line myLine;
	private String color;
	
	public Line getMyLine() {
		return myLine;
	}

	public void setMyLine(Line myLine) {
		this.myLine = myLine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorLine () {}
	
	public ColorLine (Line myLine, String color) {
		this.myLine = myLine;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColorLine [" + myLine + ", color=" + color + "]";
	}

	public void print () {
		System.out.println(this);
	}			
}