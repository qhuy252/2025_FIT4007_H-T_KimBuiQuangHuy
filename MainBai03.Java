package lab02;

public class MainBai3 {
    public static void main(String[] args) {
        Undergraduate student = new Undergraduate("151234", "Nguyen Van A", 1997, "123 Nguyen Trai, Thanh Xuan, Ha Noi");
        System.out.println("Thong tin sinh vien:");
        System.out.println("- Ma sinh vien: " + student.getStudentId());
        System.out.println("- Ho ten: " + student.getName());
        System.out.println("- Nam sinh: " + student.getBirthYear());
        System.out.println("- Dia chi: " + student.getAddress());
        System.out.println("Tuoi cua sinh vien: " + student.calculateAge() + " tuoi");
    }
}