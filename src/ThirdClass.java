import java.util.Scanner;

public class ThirdClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nChoose an action:\n\t1 - First task\n\t2 - Second task\n\t3 - " +
                    "Third task\n\t4 - Exit");
            int ask = Integer.valueOf(scanner.next());
            switch(ask) {
                case 1: firstTask(); break;
                case 2: secondTask(); break;
                case 3: thirdTask(); break;
                case 4: flag = false; break;
                default: System.out.println("Try enter again");
            }
        }
    }

    public static void firstTask() {
        int i = 1;
        final int NUM = 10;
        while (i <= NUM){
            if (i%2 == 0)
                System.out.println(i + " - четное");
            else
                System.out.println(i + " - нечетное");
            i++;
        }
    }

    public static void secondTask() {
        int i = 1, sum = 0, mul = 1;
        while(sum < 200 && mul < 300){
            System.out.println(i);
            i += 3;
            sum += i ;
            mul *= i;
            }
        System.out.println("next: sum = " + sum +"\tmulty = " + mul);
    }

    public static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int ask = Integer.valueOf(scanner.next());
        ask++;
        int fact = 1, i = 1;
        while (true){
            if (i==ask)
                break;
            fact *= i;
            i++;
        }
        System.out.println(ask-1+"! = "+fact);
    }
}
