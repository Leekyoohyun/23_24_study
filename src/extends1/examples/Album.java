package extends1.examples;

public class Album extends Item{
    public String artist;

    public Album(String name, int price, String artist){
        super(name, price);
        this.artist = artist;
    }

    void print(){
        System.out.println("이름:"+super.name+", 가격:"+super.price);
        System.out.println("- 아티스트:"+this.artist);
    }

    int getPrice(){
        return super.price;
    }
}
