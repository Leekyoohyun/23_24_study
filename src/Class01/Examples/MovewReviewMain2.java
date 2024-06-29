package Class01.Examples;

public class MovewReviewMain2 { // 배열 도입
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        movieReviews[0]=inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        movieReviews[1]= aboutTime;

        for(MovieReview m: movieReviews ){
            System.out.println("영화 제목: "+ m.title+", 리뷰: "+m.review);
        }

    }
}
