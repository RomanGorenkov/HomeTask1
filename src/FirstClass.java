import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nChoose an action:\n\t1 - First task\n\t2 - Second task\n\t3 - " +
                    "Third task\n\t4 - Fourth task\n\t5 - Exit");
            int ask = Integer.valueOf(scanner.next());
            switch(ask) {
                case 1: firstTask(); break;
                case 2: secondTask(args); break;
                case 3: thirdTask(args); break;
                case 4: fourthTask();break;
                case 5: flag = false; break;
                default: System.out.println("Try enter again");
            }
        }
    }
    public static void firstTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void secondTask(String[] args){
        System.out.print("Аргументы командной строки в обратном порядке: ");
        for(int i=args.length; i>0; i--)
            System.out.print(args[i-1]+' ');
    }

    public static void thirdTask(String[] args) {
        System.out.print("Последний аргумент командной строки: " + args[(int)args.length-1]);
    }

    public static void fourthTask() {
        float a, b = 10, c = 8;
        a = 4*(b+c-1)/2;
        System.out.println(a);
    }
}
