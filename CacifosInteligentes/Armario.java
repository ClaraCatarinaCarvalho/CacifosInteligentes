import java.util.ArrayList;

public class armario {
    private ArrayList<cacifo> cacifos;

    public armario() {
        cacifos = new ArrayList();

        // Adicionar 40 cacifos de armazenamento
        for (int i = 1; i <= 40; i++) {
            cacifos.add(new cacifoArmazenamento(i));
        }

        // Adicionar 10 cacifos de carregamento
        for (int i = 41; i <= 50; i++) {
            cacifos.add(new cacifoCarregamento(i));
        }
    }

    public void verificarDisponibilidade() {
        int disponiveis = 0;
        for (cacifo c : cacifos) {
            if (c.verificarDisponibilidade()) {
                disponiveis++; //Se estiver disponível, aumenta o contador de cacifos disponíveis
            }
        }
        System.out.println("Cacifos disponíveis: " + disponiveis);
    }

    public void alugarCacifo(int numero, boolean pagamentoConfirmado) {
        if (numero < 1 || numero > cacifos.size()) {  //Verifica se o número do cacifo é válido
            System.out.println("Cacifo inválido.");
            return;
        }
        //Se n chamasse o método alugar() não seria executado no cacifo correto e a operação de alugar não aconteceria
        cacifos.get(numero - 1).alugar(pagamentoConfirmado);//Chama o método alugar() do cacifo específico
    }
    
    public void libertarCacifo(int numero, int codigoSeguranca) {
        if (numero < 1 || numero > cacifos.size()) {
            System.out.println("Cacifo inválido.");
            return;
        }
        cacifos.get(numero - 1).livre(codigoSeguranca); //Chama o método livre() do cacifo específico
    }

    public void exibirInformacoes(int numero) {
        if (numero < 1 || numero > cacifos.size()) {
            System.out.println("Cacifo inválido.");
            return;
        }
        cacifos.get(numero - 1).exibirInformacoes();
    }
}

