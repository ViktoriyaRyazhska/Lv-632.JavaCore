package task11;

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

	public Plant(String type, String color, int size) throws ColorException, TypeException{
	      Type t = typeStrToEnum(type);
	      Color c = colorStrToEnum(color);
	      this.size = size;
	      this.type = t;
	      this.color = c;
	   }

	   private Color colorStrToEnum(String color) throws ColorException{
	      switch(color.toLowerCase()){
	         case "blue" : return Color.blue; 
	         case "red" : return Color.red; 
	         case "white" : return Color.white; 
	         default : throw new ColorException("Input only color blue, red or white");
	      }
	   }
	   private Type typeStrToEnum(String type) throws TypeException{
		      switch(type.toLowerCase()){
		         case "forests" : return Type.forests; 
		         case "steppes" : return Type.steppes; 
		         case "swamps" : return Type.swamps; 
		         default : throw new TypeException("Input only type forests, steppes, swamps");
		      }
		   }

	@Override
	public String toString() {
		return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	 
}