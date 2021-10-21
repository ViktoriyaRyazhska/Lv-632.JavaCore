package lesson11;



public class Plant {

	int quantity;
	private Color color;
	private Type  type;
	
	public Plant(int quantity, String color, String type) throws ColorException, TypeException {
//		Type t = TypeToEnum(type);
//		Color c = ColorToEnum(color);
		this.color = ColorToEnum(color);
		this.type = TypeToEnum(type);
		this.quantity = quantity;
	}

	public Color ColorToEnum(String color) throws ColorException {
		switch (color) {
		case "Red":
			return Color.Red;
		case "Yellow":
			return Color.Yellow;
		case "Blue":
			return Color.Blue;
		case "Pink":
			return Color.Pink;
		default:
			throw new ColorException("Wrong color.");
		}
	}

	public Type TypeToEnum(String type) throws TypeException {
		switch (type) {
		case "Rose":
			return Type.Rose;
		case "Lily":
			return Type.Lily;
		case "Orchid":
			return Type.Orchid;
		case "Peony":
			return Type.Peony;
		default:
			throw new TypeException("Wrong type.");
		}
	}

	class ColorException extends Exception {
		public ColorException(String text) {
			super(text);
		}
	}

	class TypeException extends Exception {
		public TypeException(String mess) {
			super(mess);
		}
	}

	@Override
	public String toString() {
		return "Plant [quantity=" + quantity + ", color=" + color + ", type=" + type + "]";
	}

	enum Color {
		Red, Blue, Yellow, Pink
	}

	enum Type {
		Rose, Lily, Orchid, Peony
	}
}
