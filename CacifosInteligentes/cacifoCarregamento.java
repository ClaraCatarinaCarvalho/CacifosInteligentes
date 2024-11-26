import java.time.LocalDateTime;

public class CacifoCarregamento extends Cacifo {
    private LocalDateTime inicioCarregamento;
    private double custoMinutos;

    public CacifoCarregamento(int num, double custoMinutos) {
        super(num);
        this.inicioCarregamento = null;
        this.custoMinutos = custoMinutos;
    }

    @Override
    public void iniciarPagamento(int codigo, boolean autorizacaoPagamento) {
        if (!verificarCacifo()) {
            System.out.println("Lamento, o Cacifo já está ocupado.");
        } else if (this.CODIGO == codigo) {
            System.out.println("Custo por minuto: " + this.custoMinutos);
            if (!autorizacaoPagamento) {
                System.out.println("Não foi possível efetuar o seu pagamento.");
            } else {
                this.inicioCarregamento = LocalDateTime.now();
                System.out.println("O carregamento foi iniciado no cacifo: " + this.getNum());
                this.setDisponibilidade(false);
                this.cacifoAberto = false;  
            }
        } else {
            System.out.println("O código que inseriu não é válido.");
        }
    }

    @Override
    public void informacoes() {
        System.out.println("Cacifo de Carregamento\nDisponibilidade: " + (verificarCacifo() ? "Disponível" : "Ocupado") + "\nNúmero do Cacifo: " + this.getNum());
    }
}