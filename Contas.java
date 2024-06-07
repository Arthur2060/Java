import java.io.Console;
import java.util.Scanner;

public class Contas{

    public final static void clearConsole() {
            try
            {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows"))
                {
                    Runtime.getRuntime().exec("cls");
                }
                else
                {
                    Runtime.getRuntime().exec("clear");
                }
            }
            catch (final Exception e)
            {
                //  Handle any exceptions.
            }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema de cadastro de professores, oque quer fazer?");
        System.out.println("Cadastrar novo professor[1]");
        System.out.println("Verificar cadastros[2]");

        int res = teclado.nextInt();

        switch(res){

            case 1:
                System.out.print("ok1");
            break;

            case 2:
                clearConsole();
            break;
        }

        teclado.close();
    };
};