import java.util.Scanner;

public class twoVerifString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        int count = countLetraA(input);
        if (count > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + count + " vez(es) na string digitada.");
        } else {
            System.out.println("A letra 'a' ou 'A' não aparece na string digitada.");
        }
        scanner.close();
    }
    //--------------------------------------------------------------//
    // Função para contar quantas vezes 'a' ou 'A' aparece na string.
    //--------------------------------------------------------------//
    public static int countLetraA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}