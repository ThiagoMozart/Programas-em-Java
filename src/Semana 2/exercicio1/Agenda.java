package exercicio1;

public class Agenda {
        Contato[] Contatos = new Contato[150];
        int tamanho = 0;

        void AddContato(Contato pessoa){
                Contatos[tamanho] = pessoa;
                tamanho++;
        }
}

