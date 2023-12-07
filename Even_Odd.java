import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            int number = input.nextInt();

            if (number % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        input.close();
    }
}