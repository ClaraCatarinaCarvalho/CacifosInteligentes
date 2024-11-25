import java.time.LocalDateTime;
import java.util.Random;
public abstract class Cacifo
{
    public int num = 0;
    private boolean disponibilidade;
    public static LocalDateTime dataFimAluguel;
    public static int CODIGO;
    
    public Cacifo(int num){
        this.num = num;
        this.disponibilidade = true;
    }
    
     public static int codigo() {
        Random random = new Random();
        return 1000 + random.nextInt(9000); // Gera um número entre 1000 e 9999
    }

    
    public void inserirCodigo(int codigoTentativa){
        if(codigoTentativa == CODIGO){
            //Se o cacifo não tiver sido alugado 
            if(disponibilidade == false){
                System.out.println("O cacifo está disponivel");
            } else {
            //se o cacifo estiver ocupado, fica disponivel
                System.out.println("O cacifo ficou disponivel");
                this.disponibilidade = false;
            }   
        } else {
            System.out.println("Código incorreto");
        }
    }
    
    public LocalDateTime getDataFimAluguel(){
        return this.dataFimAluguel;
    }

    public int getNum(){
        return this.num;
    }
    
    public boolean verificarCacifo(){
          return this.disponibilidade;
    }
    
    public void setDataFimAluguel(LocalDateTime dataFimAluguel){
        this.dataFimAluguel = dataFimAluguel;
    }
    
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    
    public void abirCacifo(){
        this.disponibilidade = true;
        this.dataFimAluguel = null;
    }
    
    public abstract void informacoes();
    public abstract void iniciarPagamento(int codigo, boolean pagamento);
    

   
}