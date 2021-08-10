package main.java.lessons.park;

import java.util.Scanner;
public class Park {
    public static Scanner ob = new Scanner(System.in);
    public String city;
    public info attraction;
    public Park() {
        System.out.println("Введите название парка");
        setCity (ob.next());
        attraction = new info();
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city=city;
    }
    public class info {
        String name,data;
        int price;
        public info() {
            System.out.println("Аттракцион называется:");
            setName(ob.nextLine());
            setName(ob.nextLine());
            System.out.println("входной билет стоит:");
            setPrice(ob.nextInt());
            System.out.println("время работы аттракциона:");
            setData(ob.nextLine());
            setData(ob.nextLine());
        }
        private String getName() {
            return name;
        }
        private void setName(String name) {
            this.name=name;
        }
        private int getPrice() {
            return price;
        }
        private void setPrice(int price) {
            this.price=price;
        }
        private String getData() {
            return data;
        }
        private void setData(String data) {
            this.data=data;
        }
        private void print() {
            System.out.print("В парке "+getCity()+" атракцион "+getName()+" имеет время работы "+getData()+" и стоимость входного билета "+getPrice());
        }
    }
    public static void main(String[] args) {
        Park ct = new Park();
        ct.attraction.print();
    }
}