package lab02;

public class MainBai4 {
    public static void main(String[] args) {
        GeometricCircle myCircle = new GeometricCircle();
        myCircle.output();
        myCircle.input();
        myCircle.output();
        System.out.println("Dien tich cua hinh tron: " + myCircle.calculateArea());
        System.out.println("Chu vi cua hinh tron: " + myCircle.calculateCircumference());
    }
}