import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("Masukan sebuah string: ");
        String input=scanner.nextLine();

        printString(input);
        scanner.close();

    }

    public static void printString(String input){
        if(input.length()>3){
            String reversed=new StringBuilder(input).reverse().toString();
            System.out.println("Output : "+reversed);
        }else{
            System.out.println("Output : "+input);
        }
    }
}