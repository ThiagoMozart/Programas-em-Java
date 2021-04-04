package ic.uff.semana5.exercicio4;

public class CalculoDaFolha {
    public static void main(String[] args){
        Assalariado pam = new Assalariado();
        PorHora michael = new PorHora(60);
        Comissionado dwight = new Comissionado(500);
        Comissionado jim = new Comissionado(200);
        ComissioEfixo stanley = new ComissioEfixo(350);

        pam.salario();
        michael.salario();
        dwight.salario();
        jim.salario();
        stanley.salario();

        System.out.println("Bem vindo a Dunder-Mifflin Paper Company");
        System.out.println("Aqui cada funcionário recebe o seu pagamento de forma diferenciada");
        System.out.println("---------------------------------------------------------------");
        System.out.println("A folha de pagamento de seus funcionários é: ");
        System.out.println("Pam tem o salário fixo (é assalariada) de: " + pam.getSalario());
        System.out.println("Michael ,o gerente , recebe por horas de trabalho e tem o salário de: " + michael.getSalario());
        System.out.println("Dwight e Jim ,que são responsáveis pelas vendas recebem: " + dwight.getSalario() + " e "+ jim.getSalario() + " cada um respectivamente");
        System.out.println("E finalmente Stanley ,por ter tido um excelente desempenho recebeu uma recompensa,\n " +
                "antes seu salário era de: "+ stanley.getSalario() +" mas como ele recebeu um bônus de 10% ,\n" +
                "seu salário agora é: " + stanley.getSalario() * 1.1 );
    }
}
