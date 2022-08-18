package classandobject;
class calc {
    int num1;
    int num2;
    int result1;
    int result2;
    int result3;

    public void perform() {
        result1 = num1 + num2;
        result2 = num1 * num2;
        result3 = num1 - num2;
    }

    public class Main {
        public static void main(String[] args) {
            calc obj = new calc();
            obj.num1 = 5;
            obj.num2 = 8;
            obj.perform();
            System.out.println(obj.result1);
            System.out.println(obj.result2);
            System.out.println(obj.result3);
            System.out.println(obj.result1 + obj.result2 + obj.result3);
        }
        }
}