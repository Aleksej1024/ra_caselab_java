import java.util.Scanner;
import java.lang.StringBuilder;
public class Main {

    public static boolean isPalindrom(String word){
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Введите слово ");
        String word=scan.nextLine();
        System.out.println(isPalindrom(word));
    }
}