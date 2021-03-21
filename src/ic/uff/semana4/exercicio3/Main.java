package ic.uff.semana4.exercicio3;

public class Main {
    public static void main(String[] args){
        Pai pai = new Pai("Bruno", 46, "jorge", "Monica");
        Filho filho = new Filho("Caio", 16, "Bruno", "Claudia");
        Mae mae = new Mae("Claudia",42,"Beto","Maria");

        System.out.println("A árvore genialógica do "+ filho.getNome() +" é :" );
        System.out.println("---------------------------------------------------------------");
        System.out.println("Os avós parte de pai são: " + pai.getMae() +" e " + pai.getPai());
        System.out.println("Os avós parte de mãe são: " + mae.getMae() +" e " + mae.getPai());
        System.out.println("---------------------------------------------------------------");
        System.out.println("O pai se chama " + pai.getNome() +" e tem " + pai.getIdade() + " anos.");
        System.out.println("A mãe se chama " + mae.getNome() +" e tem " + mae.getIdade() + " anos.");
        System.out.println("---------------------------------------------------------------");
        System.out.println("E o filho de " + filho.getMae() +" e " + filho.getPai() +" que é o "+ filho.getNome()
                + " tem "+ filho.getIdade() + " anos.");

    }
}
