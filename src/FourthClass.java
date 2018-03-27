import java.util.Scanner;

public class FourthClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nChoose an action:\n\t1 - First task\n\t2 - Second task\n\t3 - " +
                    "Third task\n\t4 - Fourth task\n\t5 - Exit");
            int ask = Integer.valueOf(scanner.next());
            switch (ask) {
                case 1: firstTask(); break;
                case 2: secondTask(); break;
                //case 3: thirdTask(args); break;
                //case 4: fourthTask();break;
                //case 5: flag = false; break;
                default:
                    System.out.println("Try enter again");
            }
        }
    }

    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int ask = Integer.valueOf(scanner.next());
        int ans = ask;
        for(int i = 0;i<4;i++){


            System.out.println(ask+"^"+(i+1)+"="+ans);
            ans *= ask;
        }
    }

    public static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Введите четырехзначное число: ");
        int ask1 = Integer.valueOf(scanner.next());
        if(ask1/1000 + (ask1%1000)/100 == ask1%10+(ask1%100)/10)
            System.out.println(true);
        else System.out.println(false);

        System.out.print("2. Введите трехзначное число: ");
        int ask2 = Integer.valueOf(scanner.next());
        if ((ask2%10 + (ask2%100)/10 + ask2/100)%2 == 0)
            System.out.println(true);
        else System.out.println(false);

        System.out.println("3. Введите число: ");
        String ask3 =(scanner.next());
        //if (ask3.length())
    }
}