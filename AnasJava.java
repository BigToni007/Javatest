import java.util.Scanner;
public class AnasJava {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        if (a>b) {
            System.out.println("a>b");
        }
        else if (a<b) {
            System.out.println("a<b");
        }
        else {
            System.out.println("a=b");
        }
        System.out.println("Проверка результата");
        System.out.println("a+b " + (a+b));
        System.out.println("a-b " +(a-b));
        System.out.println("a*b " +(a*b));

        if (b!=0) {
            System.out.println("a/b " + (a / b));
        }else {
            System.out.println("на ноль делить нельзя");
        }
        scanner.close();
    }

}


