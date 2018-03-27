import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nChoose an action:\n\t1 - First task\n\t2 - Second task\n\t3 - " +
                    "Third task\n\t4 - Fourth task\n\t5 - Exit");
            int ask = Integer.valueOf(scanner.next());
            switch(ask) {
                case 1: firstTask(); break;
                case 2: secondTask(); break;
                case 3: thirdTask(); break;
                case 4: fourthTask();break;
                case 5: flag = false; break;
                default: System.out.println("Try enter again");
            }
        }
    }

    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        int n = Integer.valueOf(scanner.next());
        int sum = n%10 + n/10;
        System.out.println("Cумма цифр двузначного числа: " + sum);
    }

    public static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int n = Integer.valueOf(scanner.next());
        int sum = (n%100)%10 + n/100 + (n%100)/10;
        System.out.println("Сумма тцифр трехзначного числа: " + sum);
    }
    public static void thirdTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        double n = Double.valueOf(scanner.next());
        int ans = (int)Math.round(n);
        System.out.println("Целое число: " + ans);
    }

    public static void fourthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введидте 2 натуральных числа: ");
        int q = Integer.valueOf(scanner.next());
        int w = Integer.valueOf(scanner.next());
        System.out.println(q + " / " + w + " = " + q / w + " и "+ q % w +" в остатке");
    }
}
