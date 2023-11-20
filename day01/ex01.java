public class EX01 {
    public static void main(String[] args) {
        Integer num1;
        num1 = 10;

        Integer num2;
        num2 = 20;

        Integer num3;
        num3 = num1;

        num1 = num2;
        num2 = num3;

        System.out.println(num1);
        System.out.println(num2);
    }
}