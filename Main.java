package classandobject;
class numbercalc{
    int num4;
    int num5;
    int result4;
    int result5;
    int result6;

    public void performance()
    {
    result4=num4+num5;
    result5=num5-num4;
    result6=num4*num5;
    }
}
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
            {
                numbercalc obj1 = new numbercalc();
                obj1.num4=10;
                obj1.num5=15;
                obj1.performance();
                System.out.println(obj1.result4);
                System.out.println(obj1.result5);
                System.out.println(obj1.result6);
                System.out.println(obj1.result4 + obj1.result5 + obj1.result6);
            }
        }
        }
}