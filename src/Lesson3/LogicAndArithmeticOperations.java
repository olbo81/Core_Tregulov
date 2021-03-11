package Lesson3;

public class LogicAndArithmeticOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int x = 1, y = 2, z = 3;

        System.out.println("Первое значение С = " + b);
        int c = b-- - a;
        System.out.println(c);
        System.out.println("Второе значение С = " + b);

        System.out.println(++a - --a - a-- +a++);


    }
}
