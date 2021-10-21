package Task2;

public class Plant {

    private int size;
    Color color;
    Type type;

    public Plant (int size, String color, String type) {
        this.size=size;
        try{
            Color c = colorStrToEnum(color);
        } catch (ColorException e){
            System.out.println(e.getMessage());
        }

        try {
            Type t = typeStrToEnum(type);
        } catch (TypeException e){
            System.out.println(e.getMessage());
        }
    }

    private Color colorStrToEnum (String color) throws ColorException{
        switch (color){
            case "White" : return Color.White;
            case "Red" : return Color.Red;
            case "Blue" : return Color.Blue;
            default: throw new ColorException("Invalid color");
        }
    }

    private Type typeStrToEnum (String type) throws TypeException{
        switch (type){
            case "Rose" : return Type.Rose;
            case "Tulip" : return Type.Tulip;
            case "Marigold" : return Type.Marigold;
            default: throw new TypeException("Invalid type");
        }
    }


}

