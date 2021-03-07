package ic.uff.semana3.exercicio3.exercicio1;

public class Agenda {
        Contato[] Contatos = new Contato[150];
        int tamanho = 0;

        void AddContato(Contato pessoa){
                Contatos[tamanho] = pessoa;
                tamanho++;
        }
}

