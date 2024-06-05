//Importa a extenção "scanner", para receber informações do console.
import java.util.Scanner;

//Abre a classe principal.
public class Calculadora{

    //Inicia o código.
    public static void main(String[] args) {
        //Adiciona o comando de ler o conteudo escrito.
        Scanner teclado = new Scanner(System.in);
        
        //Exibe uma mensagem que solicita o primeiro numero da conta.
        System.out.print("Digite aqui o primeiro numero: ");
        float n1 = (float) teclado.nextFloat();
        
        //Exibe uma mensagem para solicitar o segundo numero.
        System.out.print("Agora o segundo: ");
        float n2 = (float) teclado.nextFloat();
        
        //Questiona qual operação será feita.
        System.out.print("Qual operação eu devo realizar? ");
        String op = (String) teclado.next();

        //Fecha o comando de scanner.
        teclado.close();

        //Define qual operação será feita e a realiza.
        switch (op){

            case "+":
                System.out.print(n1 + n2);
            break;

            case "-":
                System.out.print(n1 - n2);
            break;

            case "/":
                System.out.print(n1 / n2);
            break;

            case "*":
                System.out.print(n1 * n2);
            
        }
    }
}