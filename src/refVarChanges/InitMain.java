package refVarChanges;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println(data.value1); //int의 null --> 0
        System.out.println(data.value2);
        System.out.println(data.strValue);
    }
}
