package lesson11.CW11.task2.model;

import lesson11.CW11.task2.exception.ColorException;
import lesson11.CW11.task2.exception.TypeException;

public class Plant {
    private Color color;
    private Type type;
    private int size;

    public Plant(Color color, Type type, int size) {
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Type typeStrToEnum(String type) throws TypeException{
        switch (type.toLowerCase()) {
            case "seaweed":
                return Type.seaweed;
            case " mosses":
                return Type.mosses;
            case "ferns":
                return Type.ferns;
            case "conifers":
                return Type.conifers;
            case "flowers":
                return Type.flowers;

            default:
                throw new TypeException("Input only 'seaweed', 'mosses', 'ferns', 'conifers', 'flowers'");
        }
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.blue;
            case "red":
                return Color.red;
            case "white":
                return Color.white;
            case "green":
                return Color.green;

            default:
                throw new ColorException("Input only 'white', 'blue', 'red', 'green'");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "color=" + color +
                ", type=" + type +
                ", size=" + size +
                '}';
    }
}