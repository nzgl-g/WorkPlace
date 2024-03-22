import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String phrase;
        System.out.println("Enter a phrase:? ");
        phrase=scanner.nextLine();
        int length=phrase.length();
        int i=0;
        int j=0;
        while (j<length){
            if (phrase.charAt(j)=='('){
                i++;
            }
            if (phrase.charAt(j)==')'){
                i--;
            }
            j++;
            if (i < 0) {
                break;
            }
        }
        if (i == 0) {
            System.out.println("The string is Arranged.\n");
        }else {
            System.out.println("The string is not Arranged.\n");
        }
    }
}
