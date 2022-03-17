package com.solid.lsp;


public class Main  {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Item reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Item reg2 = new Square();
        reg2.setSide(5);
        System.out.println("====   Square  ====");
        System.out.println("Side = " + reg2.getSide());
        System.out.println("Area = " + reg2.getArea());
    }
}
