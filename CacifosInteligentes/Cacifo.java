 import java.time.LocalDateTime;

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
    
    public static int codigoAleatorio(){
        CODIGO = 1000 + (int)(Math.random() * 8999);
        return CODIGO;
    }
    
    public void inserirCodigo(int codigoTentativa){
        if(codigoTentativa == CODIGO){
            if(disponibilidade == false){
                System.out.println("O cacifo já está aberto");
            } else {
                System.out.println("O cacifo foi aberto!");
                this.disponibilidade = false;
            }   
        } else {
            System.out.println("Código incorreto.");
        }
    }
    
    public LocalDateTime getDataFimAluguel(){
        return this.dataFimAluguel;
    }

    public int getNum(){
        return this.num;
    }
    
    public boolean consultarCacifo(){
          return this.disponibilidade;
    }
    
    public void setDataFimAluguel(LocalDateTime dataFimAluguel){
        this.dataFimAluguel = dataFimAluguel;
    }
    
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    
    public void desbloquearCacifo(){
        this.disponibilidade = true;
        CODIGO = 0;
        this.dataFimAluguel = null;
    }
    
    public abstract void informacoes();

    public abstract void iniciarCarregamento(int codigo, boolean pagamento);

    public abstract void terminarCarregamento(boolean pagamento);
}
    

    