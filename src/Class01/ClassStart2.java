package Class01;

public class ClassStart2 {
    public static void main(String[] args) {
        //ClassStart1을 배열이용해서 쓰기
        String[] studentName = {"학생1","학생2","학생3"};
        int[] studentAge = {15,17,13};
        int[] studentGrade = {90,80,65};

        for(int i=0; i<studentName.length ;i++){
            System.out.println("이름: "+studentName[i]+", 나이: "+studentAge[i]+", 성적: "+studentGrade[i]);
        }

    }
}
