public class Account {
    // Thuộc tính
    private String accountNumber;
    private double balance;

    // Constructor khởi tạo
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter và Setter cho accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter và Setter cho balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Phương thức hiển thị thông tin tài khoản
    public void displayInfo() {
        System.out.println("Thong tin tai khoan: ");
        System.out.println("- Ma so tai khoan: " + accountNumber);
        System.out.println("- So tien: " + (long)balance);
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        // Tạo đối tượng tài khoản
        Account acc = new Account("123456", 1000000);

        // Xuất thông tin ban đầu
        System.out.println("Thong tin tai khoan hien tai:");
        acc.displayInfo();

        // Thay đổi số tiền trong tài khoản
        acc.setBalance(800000);

        // Xuất lại thông tin sau khi cập nhật
        System.out.println("\nThong tin tai khoan sau khi cap nhat:");
        acc.displayInfo();
    }
}