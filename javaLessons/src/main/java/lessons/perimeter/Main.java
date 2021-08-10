package main.java.lessons.perimeter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<FigureInterface> figures = new ArrayList<FigureInterface>();
        figures.add(new Rectangle(4, 5,"Black" , "Pink"));
        figures.add(new Rectangle(5, 8, "Red", "Orange"));
        figures.add(new Triangle(5, 8, 11, "Yellow", "Green"));
        figures.add(new Triangle(3, 4, 5,"Green", "Yellow"));
        figures.add(new Circle(2, "Orange", "Red"));
        figures.add(new Circle(3, "Pink", "Pink"));
        Collections.sort(figures, new FigureComparator());
        for (FigureInterface f : figures) {
            System.out.println(f.toString());
        }
    }

    interface FigureInterface {
        public float area();

        public float perimetr();
        public String boarderColor();
        public String backgroundColor();
    }

    static class Rectangle implements FigureInterface {

        @Override
        public float area() {
            return a * b;
        }

        @Override
        public float perimetr() {
            return (a*2)+(b*2);
        }
        @Override
        public String boarderColor() {
            return (bc);
        }
        @Override
        public String backgroundColor() {
            return (bgc);
        }
        @Override
        public String toString() {

            String info = name;
            info += " perimetr:" + perimetr();
            info += " area:" + area();
            info += " boarder color:" + boarderColor();
            info += " background color:"+ backgroundColor();
            info += "\n";
            return info;
        }

        public Rectangle(float a, float b, String bc, String bgc) {
            this.a = a; this.b=b; this.bc=bc; this.bgc=bgc;
        }

        private float a;
        private float b;
        private String bc;
        private String bgc;
        private final String name = "Rectangle";

    }

    static class Triangle implements FigureInterface {

        @Override
        public float area() {
            float p = perimetr() / 2;
            return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        @Override
        public float perimetr() {
            return a + b + c;
        }
        @Override

        public String boarderColor() {
            return (bc);
        }
        @Override

        public String backgroundColor() {
            return (bgc);
        }
        @Override
        public String toString() {

            String info = name;
            info += " perimetr:" + perimetr();
            info += " area:" + area();
            info += " boarder color:" + boarderColor();
            info += " background color:"+ backgroundColor();
            info += "\n";
            return info;
        }

        public Triangle(float a, float b, float c,String bc, String bgc) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.bc=bc; this.bgc=bgc;
        }

        private float a, b, c;
        private String bc, bgc;
        private final String name = "Triangle";

    }

    static class Circle implements FigureInterface {

        @Override
        public float area() {
            return (float) (Math.PI * r * r);
        }

        @Override
        public float perimetr() {
            return (float) (2 * Math.PI * r);
        }

        public String boarderColor() {
            return (bc);
        }
        public String backgroundColor() {
            return (bgc);
        }
        @Override
        public String toString() {

            String info = name;
            info += " perimetr:" + perimetr();
            info += " area:" + area();
            info += " boarder color:" + boarderColor();
            info += " background color:"+ backgroundColor();
            info += "\n";
            return info;
        }

        public Circle(float r,String bc, String bgc) {
            this.r = r; this.bc=bc; this.bgc=bgc;
        }

        private float r;
        private final String name = "Circle";
        private String bc, bgc;
    }

    static class FigureComparator implements Comparator<FigureInterface> {

        @Override
        public int compare(FigureInterface o1, FigureInterface o2) {
            return (int) (o1.area() - o2.area());
        }

    }

}