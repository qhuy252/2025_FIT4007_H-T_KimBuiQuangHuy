import java.time.Year;

public class Student {
    // ===== Thuộc tính =====
    private String studentId;
    private String fullName;
    private int birthYear;
    private String address;

    // ===== Constructor 1: Chỉ mã SV và tên =====
    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = 0;  // giá trị mặc định
        this.address = "";
    }

    // ===== Constructor 2: Đủ 4 thông tin =====
    public Student(String studentId, String fullName, int birthYear, String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.address = address;
    }

    // ===== Getter & Setter =====
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // ===== Tính tuổi =====
    public int getAge() {
        int currentYear = Year.now().getValue(); // lấy năm hiện tại
        return (birthYear > 0) ? currentYear - birthYear : 0;
    }

    // ===== Hiển thị thông tin =====
    public void displayInfo() {
        System.out.println("- Ma sinh vien: " + studentId);
        System.out.println("- Ho ten: " + fullName);
        System.out.println("- Nam sinh: " + birthYear);
        System.out.println("- Dia chi: " + address);
    }

    // ===== Main =====
    public static void main(String[] args) {
        // Tạo 1 sinh viên bằng constructor đầy đủ
        Student sv = new Student("151234", "Nguyen Van A", 1997,
                "123 Nguyen Trai, Thanh Xuan, Ha Noi");

        System.out.println("Thong tin sinh vien:");
        sv.displayInfo();

        System.out.println("Tuoi cua sinh vien: " + sv.getAge() + " tuoi");
    }
}