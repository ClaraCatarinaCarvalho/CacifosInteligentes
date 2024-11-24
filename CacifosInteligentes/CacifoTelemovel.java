import java.time.LocalDateTime;
import java.time.Duration;

public class CacifoTelemovel extends Cacifo
{
    private boolean disponibilidade;
    private LocalDateTime inicioCarregamento;
    private double custoPorMinuto;

    public CacifoTelemovel(int num, double custoPorMinuto){
        super(num);
        this.inicioCarregamento = null;
        this.custoPorMinuto = custoPorMinuto;
    }
    
    @Override
    public void iniciarCarregamento(int codigo, boolean autorizacaoPagamento){
        //se o cacifo já estiver alugado
        if (!consultarCacifo()) {
            System.out.println("Cacifo já estava alugado. Carregamento não permitido.");
            //se o codigo do cacifo for == ao do codigo inserido
        } else if (this.CODIGO == codigo) {
            System.out.println("Custo por minuto de carregamento: " + this.custoPorMinuto + "€");
            //se o pagamento não ser autorizado
            if (!autorizacaoPagamento) {
                System.out.println("Pagamento não autorizado. Carregamento cancelado.");
            }
            this.inicioCarregamento = LocalDateTime.now();
            System.out.println("Carregamento iniciado no cacifo: " + this.getNum());
            this.disponibilidade = false;
        } else {
            System.out.println("Código inválido.");
        }
    }

    @Override
    public void terminarCarregamento(boolean concluirTransacao){
        //se não iniciou o carregamento
        if(inicioCarregamento == null){
            System.out.println("Carregamento não iniciado....erro");
        }
        LocalDateTime fimCarregamento = LocalDateTime.now();
        long minutosCarregados = Duration.between(inicioCarregamento, fimCarregamento).toMinutes();
        double custoTotal = minutosCarregados * custoPorMinuto;
            
        System.out.println("Carregamento terminado." + "\nResumo do custo:" +"\nDuração: " + minutosCarregados + " minutos");
        System.out.println("Custo Total: " + custoTotal + "€");
        
        //se cancelar a transação
        if (!concluirTransacao) {
            System.out.println("Pagamento não confirmado. Transação cancelada.");
        } else {
            System.out.println("Pagamento confirmado via Multibanco. Obrigado!");
            inicioCarregamento = null;
            desbloquearCacifo();
        }
    }
    
    @Override
    public void informacoes(){
        System.out.println("Cacifo Telemovel\n" + "Disponibilidade: " + disponibilidade + "\nNúmero do cacifo: " + this.num);
    }    
}
