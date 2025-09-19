import java.util.Scanner;

public class Circle {
    private double radius;

    // Constructor mặc định
    public Circle() {
        this.radius = 1;
    }

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter & Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Nhập bán kính từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        this.radius = sc.nextDouble();
    }

    // Xuất thông tin hình tròn
    public void output() {
        System.out.println("Ban kinh r: " + radius);
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Thong tin hinh tron mac dinh:");
        c.output();

        System.out.println("\nNhap hinh tron:");
        c.input();

        System.out.println("\nThong tin hinh tron vua nhap:");
        c.output();
        System.out.println("Dien tich hinh tron: " + c.getArea());
        System.out.println("Chu vi hinh tron: " + c.getCircumference());
    }
}