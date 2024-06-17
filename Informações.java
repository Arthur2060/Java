import java.util.Scanner;

public class Informações{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual seu nome? ");
        String nome = (String) teclado.nextLine();

        int letras = (Integer) nome.length();

        System.out.print("Qual é sua idade? ");
        int idade = (Integer) teclado.nextInt();

        int nascimento = (Integer) 2024 - idade;

        System.out.printf("Bom-dia, %s! \nSeu nome tem %d letras, \nVocê tem %d anos, logo, nasceu em %d.", nome, letras, idade, nascimento);
        
        teclado.close();
    };
};