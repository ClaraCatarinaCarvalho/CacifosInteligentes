import java.util.ArrayList;

public class Armario {
    private ArrayList<cacifo> cacifos;

    public void gestao() {
        cacifos = new ArrayList<>();

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
                disponiveis++;
            }
        }
        System.out.println("Cacifos disponíveis: " + disponiveis);
    }

    public void alugarCacifo(int numero, boolean pagamentoConfirmado) {
        if (numero < 1 || numero > cacifos.size()) {
            System.out.println("Cacifo inválido.");
            return;
        }
        cacifos.get(numero - 1).alugar(pagamentoConfirmado);
    }

    public void liberarCacifo(int numero, int codigoSeguranca) {
        if (numero < 1 || numero > cacifos.size()) {
            System.out.println("Cacifo inválido.");
            return;
        }
        cacifos.get(numero - 1).livre(codigoSeguranca);
    }

    public void exibirInformacoes(int numero) {
        if (numero < 1 || numero > cacifos.size()) {
            System.out.println("Cacifo inválido.");
            return;
        }
        cacifos.get(numero - 1).exibirInformacoes();
    }
}

