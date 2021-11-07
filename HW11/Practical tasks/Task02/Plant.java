package lesson011c;

public class Plant {
	  private Type type;
	  private Color color;
	  private int size;

	  public Type getType() {
			return type;
	  }

	  public void setType(Type type) {
			this.type = type;
	  }

	  public Color getColor() {
			return color;
	  }

	  public void setColor(Color color) {
			this.color = color;
	  }

	  public int getSize() {
			return size;
	  }

	  public void setSize(int size) {
			this.size = size;
	  }

	  public Plant(String type, String color, int size) throws TypeException, ColorException {
		      Color c = colorStrToEnum(color);
		      Type t = typeStrToEnum(type);
		      this.size = size;
		      this.type = t;
		      this.color = c;
		   }

	  private Type typeStrToEnum(String type) throws TypeException {
			switch (type.toLowerCase()) {
			case "rose":
				  return Type.Rose;
			case "orchid":
				  return Type.Orchid;
			case "violet":
				  return Type.Violet;
			case "lotus":
				  return Type.Lotus;
			default:
				  throw new TypeException("Invalid type");
			}
	  }

	  private Color colorStrToEnum(String color) throws ColorException {
			switch (color.toLowerCase()) {
			case "white":
				  return Color.White;
			case "red":
				  return Color.Red;
			case "blue":
				  return Color.Blue;
			case "yellow":
				  return Color.Yellow;
			default:
				  throw new ColorException("Invalid color");
			}
	  }

	  @Override
	  public String toString() {
			return "Plant => Type: " + getType() + ", Color: " + getColor() + ", Size: " + getSize() + ".";
	  }

}
