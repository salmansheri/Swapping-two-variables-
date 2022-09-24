import java.util.Scanner;
public class swappingtwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A = ");
        int a = sc.nextInt();
        System.out.println("Enter B = ");
        int b = sc.nextInt();
        System.out.println("The numbers before swapping: ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The Numbers after swapping: ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }

}
