package Class01.Examples;

public class MoviewReviewMain {
    public static void main(String[] args) {
        MovieReview m1 = new MovieReview();
        m1.title = "인셉션";
        m1.review = "인생은 무한 루프";

        MovieReview m2 = new MovieReview();
        m2.title = "어바웃 타임";
        m2.review = "인생은 시간 영화!";

        System.out.println("영화 제목: "+m1.title+ ", 리뷰:"+m1.review);
        System.out.println("영화 제목: "+m2.title+ ", 리뷰:"+m2.review);



    }
}
