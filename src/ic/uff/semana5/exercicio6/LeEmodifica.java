package ic.uff.semana5.exercicio6;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeEmodifica {

  private static final List<RepresentaInfo> listaInfo = new ArrayList<>();
  public static void main(String[] args) throws IOException {

    Scanner teclado = new Scanner(System.in);
    boolean sair = true;

    InputStream input = new FileInputStream("src/ic/uff/semana5/exercicio6/numeros");

    while(sair) {
      System.out.println("\nDigite (1) para ver sua lista");
      System.out.println("Digite (2) para adicionar na sua lista");
      System.out.println("Digite (0) para sair do menu\n");

      int n = teclado.nextInt();

      if (n == 1) {
        Scanner in = new Scanner(input);

        while (in.hasNextLine()) {
          RepresentaInfo recebe = new RepresentaInfo(in.nextInt(), in.nextDouble(), in.nextDouble(), in.nextInt());
          listaInfo.add(recebe);
        }

        for (RepresentaInfo percorre : listaInfo) {
          System.out.println("\nO dia do mês é : " + ((RepresentaInfo) percorre).getDia());
          System.out.println("A temperatura mínima é : " + ((RepresentaInfo) percorre).getTempMin());
          System.out.println("A temperatura máxima é : " + ((RepresentaInfo) percorre).getTempMax());
          System.out.println("O nível pluviométrico é : " + ((RepresentaInfo) percorre).getNivelPluvi());
        }
      }

      if (n == 2) {
        System.out.println("\nDigite as seguintes informações na mesma linha");
        System.out.println("Dia do mês / Temperatura mínima / Temperatura máxima / Nível de pluviosidade");

        Scanner in = new Scanner(System.in);
        FileWriter add = new FileWriter("src/ic/uff/semana5/exercicio6/numeros", true);

        add.write("\n");
        add.write(in.nextLine());
        add.close();
      }

      if(n == 0){
        sair = false;

      }
    }
  }
}
