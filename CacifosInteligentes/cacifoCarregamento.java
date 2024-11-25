import java.time.LocalDateTime;
import java.time.Duration;
public class CacifoCarregamento extends Cacifo
{
    private boolean disponibilidade;
    private LocalDateTime inicioCarregamento;
    private double custoMinutos;

    public CacifoCarregamento(int num, double custoMinutos){
        super(num);
        this.inicioCarregamento = null;
        this.custoMinutos = custoMinutos;
    }
    
    
    public void iniciarPagamento(int codigo, boolean autorizacaoPagamento){
        if (!verificarCacifo()) {
            System.out.println("Lamento, o Cacifo já está ocupado");
        } else if (this.codigo == codigo) {
            System.out.println("Custo por minuto: " + this.custoMinutos);
            if (!autorizacaoPagamento) {
                System.out.println("Não foi possivel efetuar o seu pagamento");
            }
            this.inicioCarregamento = LocalDateTime.now();
            System.out.println("O carregamento foi iniciado no cacifo: " + this.getNum());
            this.disponibilidade = false;
        } else {
            System.out.println("O código que inseriu não é válido");
        }
    }

    
    @Override
    public void informacoes(){
        System.out.println("Cacifo de carregamento\n Disponibilidade" + disponibilidade + "\nNúmero do cacifo: " + this.num);
    }    
}
