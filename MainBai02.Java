package lab02;

public class MainBai2 {
    public static void main(String[] args) {
        Novel myNovel = new Novel("B1234", "Mindset", 70000.0, 7000.0);
        System.out.println("Thong tin quyen sach hien tai:");
        System.out.println("- Ma so sach: " + myNovel.getBookId());
        System.out.println("- Ten sach: " + myNovel.getTitle());
        System.out.println("- Gia sach: " + myNovel.getPrice());
        System.out.println("- Giam gia: " + myNovel.getDiscount());
        System.out.println("Gia ban cua sach: " + myNovel.getSellingPrice());

        myNovel.setDiscount(24000.0);
        System.out.println("\nThong tin quyen sach sau khi cap nhat:");
        System.out.println("- Ma so sach: " + myNovel.getBookId());
        System.out.println("- Ten sach: " + myNovel.getTitle());
        System.out.println("- Gia sach: " + myNovel.getPrice());
        System.out.println("- Giam gia: " + myNovel.getDiscount());
        System.out.println("Gia ban cua sach: " + myNovel.getSellingPrice());
    }
}