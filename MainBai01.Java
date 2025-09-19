package lab02;

public class MainBai1 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456", 1000000.0);
        System.out.println("Thong tin tai khoan hien tai:");
        System.out.println("- Ma so tai khoan: " + myAccount.getAccountNumber());
        System.out.println("- So tien: " + myAccount.getBalance());

        myAccount.setBalance(800000.0);
        System.out.println("\nThong tin tai khoan sau khi cap nhat:");
        System.out.println("- Ma so tai khoan: " + myAccount.getAccountNumber());
        System.out.println("- So tien: " + myAccount.getBalance());
    }
}