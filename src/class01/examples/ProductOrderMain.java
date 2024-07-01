package class01.examples;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3]; // 배열 생성

        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;
        productOrders[0]= dubu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        productOrders[1]= kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        productOrders[2]= coke;

        int sum =0;
        for(ProductOrder p: productOrders){
            System.out.println("상품명: "+p.productName+", 가격: "+p.price+", 수량: "+p.quantity);
            sum += p.price*p.quantity; // 다시 보기
        }

        System.out.println("총 결제 금액: "+ sum);


    }
}
