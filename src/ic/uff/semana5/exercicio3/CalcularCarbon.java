package ic.uff.semana5.exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcularCarbon {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        ArrayList<carbonFootPrint> calculo = new ArrayList<>();

        System.out.println("Bem vindo a sua calculadora de emissão de carbono\n");

        House house= new House();
        Escola escola = new Escola();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Bicicleta bicicleta1 = new Bicicleta();
        Bicicleta bicicleta2 = new Bicicleta();

        System.out.println("\nIremos analisar uma casa e uma escola");
        System.out.println("Quantas pessoas moram na casa: ");

        int moradores = teclado.nextInt();
        house.setMoradores(moradores);

        System.out.println("Quantos aparelhos domésticos tem nessa casa: ");
        int aparelhos = teclado.nextInt();
        house.setNumAparelhoDomestico(aparelhos);

        System.out.println("Quantas pessoas trabalham e estudam na escola: ");
        int funcionarios = teclado.nextInt();
        int estudantes = teclado.nextInt();

        escola.setNumFuncionarios(funcionarios);
        escola.setNumEstudantes(estudantes);

        System.out.println("Quantas salas de aula tem nessa escola: ");
        int salas = teclado.nextInt();
        escola.setNumSalas(salas);

        System.out.println("\nA casa e a escola estão com a ar condicionado ligado? (1) Sim / (2) Não");
        int simNao1 = teclado.nextInt();
        int simNao2 = teclado.nextInt();

        if(simNao1 == 1 && simNao2 == 1) {
            house.setUsoArCond(true);
            escola.setUsoArCond(true);
        }
        else if(simNao1 == 1 && simNao2 == 2){
            house.setUsoArCond(true);
            escola.setUsoArCond(false);
        }
        else if(simNao1 == 2 && simNao2 == 1){
            house.setUsoArCond(false);
            escola.setUsoArCond(true);
        }
        else{
            house.setUsoArCond(false);
            escola.setUsoArCond(false);
        }

        System.out.println("\nA casa e a escola usam energia renovável? (1) Sim / (2) Não");
        int simNao12 = teclado.nextInt();
        int simNao22 = teclado.nextInt();

        if(simNao12 == 1 && simNao22 == 1) {
            house.setEnergiaRenovavel(true);
            escola.setEnergiaRenovavel(true);
        }
        else if(simNao12 == 1 && simNao22 == 2){
            house.setEnergiaRenovavel(true);
            escola.setEnergiaRenovavel(false);
        }
        else if(simNao12 == 2 && simNao22 == 1){
            house.setEnergiaRenovavel(false);
            escola.setEnergiaRenovavel(true);
        }
        else{
            house.setEnergiaRenovavel(false);
            escola.setEnergiaRenovavel(false);
        }

        System.out.println("\nQuantas lampadas elas tem nos estabelecimentos:");
        int lampadas1 = teclado.nextInt();
        int lampadas2 = teclado.nextInt();
        house.setNumLampadas(lampadas1);
        escola.setNumLampadas(lampadas2);

        calculo.add(house);
        calculo.add(escola);

        System.out.println("\nIremos analisar dois carros");
        System.out.println("Primeiro diga os tipos de combustível dos dois carros");
        System.out.println("(1) Etanol /(2) Gasolina /(3) Diesel");
        int escolha1 = teclado.nextInt();
        int escolha2 = teclado.nextInt();

        if (escolha1 == 1){
            carro1.setCombustivel("Etanol");
        }
        else if (escolha1 == 2){
            carro1.setCombustivel("Gasolina");
        }
        else if ( escolha1 == 3){
            carro1.setCombustivel("Diesel");
        }

        if (escolha2 == 1){
            carro2.setCombustivel("Etanol");
        }
        else if (escolha2 == 2){
            carro2.setCombustivel("Gasolina");
        }
        else if ( escolha2 == 3){
            carro2.setCombustivel("Diesel");
        }

        System.out.println("\nAgora forneça a potência dos motores: (1.0 /1.5 / 2.0 /...)");
        float potencia1 = teclado.nextFloat();
        float potencia2 = teclado.nextFloat();
        carro1.setMotor(potencia1);
        carro2.setMotor(potencia2);

        System.out.println("\nE finalmente diga a quilometragem de ambos os carros :");

        float quilometro1 = teclado.nextFloat();
        float quilometro2 = teclado.nextFloat();
        carro1.setQuilometragem(quilometro1);
        carro2.setQuilometragem(quilometro2);

        calculo.add(carro1);
        calculo.add(carro2);

        System.out.println("\nIremos analisar duas bicicletas");
        System.out.println("Digite quantos km em média são andados na bicicleta:");
        float km1 = teclado.nextFloat();
        float km2 = teclado.nextFloat();
        bicicleta1.setMediaDeKm(km1);
        bicicleta2.setMediaDeKm(km2);

        calculo.add(bicicleta1);
        calculo.add(bicicleta2);

        double soma = 0;

        for(carbonFootPrint percorre : calculo){
            soma += percorre.getCarbonFootPrint();
            if(percorre instanceof Bicicleta){
                System.out.println("Foi percorrida nessa bicicleta : " + ((Bicicleta)percorre).getMediaDeKm()+ " km");

            }else if(percorre instanceof Carro){
                System.out.println("Nesse carro tem combústivel: " + ((Carro)percorre).getCombustivel());
                System.out.println("Nesse carro tem motor: " + ((Carro)percorre).getMotor());
                System.out.println("Nesse carro foi percorrido: " + ((Carro)percorre).getQuilometragem()+ " km");

            }else if (percorre instanceof House){
                System.out.println("Nessa casa tem: " + ((House)percorre).getMoradores() + " moradores");
                System.out.println("Nessa casa tem: " + ((House)percorre).getNumLampadas() + " lâmpadas");
                System.out.println("Nessa casa tem : "+ ((House)percorre).getNumAparelhoDomestico() + " aparelhos domésticos");
            }
            else if (percorre instanceof Escola){
                System.out.println("Nessa escola tem: " + ((Escola)percorre).getNumFuncionarios() + " funcionários");
                System.out.println("Nessa escola tem: " + ((Escola)percorre).getNumEstudantes() + " estudantes");
                System.out.println("Nessa escola tem: " + ((Escola)percorre).getNumLampadas() + " lâmpadas");
                System.out.println("Nessa escola tem : "+ ((Escola)percorre).getNumSalas() + " salas de aula");
            }
            System.out.println("A pegada de carbono é:  "+ percorre.getCarbonFootPrint() +"\n");
        }
        System.out.println("\nA soma das pegadas de carbono é : "+ soma);
    }
}

/*a) Não funciona o código sem criar novas instâncias ,por que ,não se instância um objeto sendo classe abstrata(No caso o Edifício).Por isso é necessário
* criar tanto o objeto casa ,quanto o objeto escola! */