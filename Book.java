public class Book {
    // ===== Thuộc tính =====
    private String bookId;//mã sách
    private String bookName;//tên scahs
    private double price;//số tiền
    private double discount;//giảm giá

    // ===== Constructor 1: Chỉ có mã sách & tên sách =====
    public Book(String bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = 0;
        this.discount = 0;
    }

    // ===== Constructor 2: Đủ cả 4 thông tin =====
    public Book(String bookId, String bookName, double price, double discount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.discount = discount;
    }

    // ===== Getter & Setter =====
    public String getBookId() { return bookId; }
    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    // ===== Tính giá bán =====
    public double getSalePrice() {
        return price - discount;
    }

    // ===== Hiển thị thông tin =====
    public void displayInfo() {
        System.out.println("- Ma so sach: " + bookId);
        System.out.println("- Ten sach: " + bookName);
        System.out.println("- Gia sach: " + (long)price);
        System.out.println("- Giam gia: " + (long)discount);
    }

    // ===== Hàm main để chạy kiểm tra =====
    public static void main(String[] args) {
        // Tạo sách bằng constructor đầy đủ
        Book book = new Book("B1234", "Mindset", 70000, 7000);

        System.out.println("Thong tin quyen sach hien tai:");
        book.displayInfo();
        System.out.println("Gia ban cua sach: " + (long)book.getSalePrice());

        // Thay đổi giảm giá
        book.setDiscount(10000);

        System.out.println("\nThong tin quyen sach sau khi cap nhat:");
        book.displayInfo();
        System.out.println("Gia ban moi cua sach: " + (long)book.getSalePrice());
    }
}