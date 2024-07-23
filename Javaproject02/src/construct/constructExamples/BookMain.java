package construct.constructExamples;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Hello Java","seo");
        Book book3 = new Book("JPA 프로그래밍", "kim", 700);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

    }
}
