package extends1.examples;

public class Book extends Item{
    public String author;
    public String isbn;

    public Book(String name,int price,String author, String isbn){
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    int getPrice(){
        return super.price;
    }

    void print(){
        System.out.println("이름:"+super.name+", 가격:"+super.price);
        System.out.println("- 저자:"+this.author+", isbn:"+this.isbn);
    }
}
