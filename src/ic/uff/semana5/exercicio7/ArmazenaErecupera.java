package ic.uff.semana5.exercicio7;
import java.io.*;
import java.util.Scanner;

public class ArmazenaErecupera {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        boolean sair = true;

        while(sair) {
            System.out.println("\nDigite (1) para ver sua lista de funcionários");
            System.out.println("Digite (2) para adicionar funcionários na sua lista");
            System.out.println("Digite (0) para sair do menu\n");

            int n = teclado.nextInt();

            if (n == 1) {
                try{
                    InputStream input = new FileInputStream("src/ic/uff/semana5/exercicio7/funcionario.dat");

                    int character;
                    while((character = input.read()) != -1){
                        System.out.print((char)character);
                    }

                    input.close();
                    System.out.println(" ");

                }catch(Exception e){
                    System.out.println("Não foi encontrado um arquivo\n");

                }
            }

            if (n == 2) {
                try{
                    OutputStream input = new FileOutputStream("src/ic/uff/semana5/exercicio7/funcionario.dat",true);
                    BufferedOutputStream arquivo = new BufferedOutputStream(input);

                    Scanner escrever = new Scanner(System.in);
                    System.out.println("Digite as informações do seus funcionários (tudo na mesma linha) :");
                    System.out.println("Números do registro (8 números) / Nome / Número de seu departamento  / Número do departamento gerenciado\n");
                    System.out.println("Exemplo: 24123456 Fransciquinix 00 00");

                    arquivo.write(escrever.nextLine().getBytes());
                    arquivo.write("\n".getBytes());
                    arquivo.flush();
                    arquivo.close();

                }catch(Exception e){
                    System.out.println("Falha ao escrever informações\n");
                }
            }
            if(n == 0){
                sair = false;
            }
        }
    }
}