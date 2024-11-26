import java.time.LocalDateTime;
import java.util.Random;
<<<<<<< HEAD

public abstract class Cacifo {
    public int num = 0;
    private boolean disponibilidade;
    public static LocalDateTime dataInicioAluguel;  
    public static int CODIGO;
    public boolean cacifoAberto;  

    public Cacifo(int num) {
=======
public abstract class Cacifo //para nao instanciar para poder criar subclasses
{
    public int num = 0;
    private boolean disponibilidade;
    public static LocalDateTime dataFimAluguel;
    public static int codigo;
    
    public Cacifo(int num){
>>>>>>> 52f6a28ebc8554e5b33b36d84fe822f5085d1dc4
        this.num = num;
        this.disponibilidade = true;
        this.cacifoAberto = true; // Inicialmente o cacifo está aberto
    }
<<<<<<< HEAD

=======
    
>>>>>>> 52f6a28ebc8554e5b33b36d84fe822f5085d1dc4
    public static int codigo() {
        Random random = new Random();
        return 1000 + random.nextInt(9000); // Gera um número entre 1000 e 9999
    }

<<<<<<< HEAD
    public void inserirCodigo(int codigoTentativa) {
        if (codigoTentativa == CODIGO) {
            // Se o cacifo não tiver sido alugado
            if (disponibilidade == false) {
                System.out.println("O cacifo está disponível.");
=======
    
    public void inserirCodigo(int codigoTentativa){
        if(codigoTentativa == codigo){
            //Se o cacifo não tiver sido alugado 
            if(disponibilidade == false){
                System.out.println("O cacifo está disponivel");
>>>>>>> 52f6a28ebc8554e5b33b36d84fe822f5085d1dc4
            } else {
                // Se o cacifo estiver ocupado, fica disponível
                System.out.println("O cacifo ficou disponível.");
                this.disponibilidade = false;
            }
        } else {
            System.out.println("Código incorreto");
        }
    }

    public LocalDateTime getDataInicioAluguel() {
        return this.dataInicioAluguel;
    }

    public int getNum() {
        return this.num;
    }

    public boolean verificarCacifo() {
        return this.disponibilidade;
    }

    public void setDataInicioAluguel(LocalDateTime dataInicioAluguel) {
        this.dataInicioAluguel = dataInicioAluguel;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void abrirCacifo() {
        this.disponibilidade = true;
        this.dataInicioAluguel = null;
        this.cacifoAberto = true;
    }

    public abstract void informacoes();
<<<<<<< HEAD
    public abstract void iniciarPagamento(int codigo, boolean pagamento);
=======
    
    
    
>>>>>>> 52f6a28ebc8554e5b33b36d84fe822f5085d1dc4

   
    public void alugar(int codigo, boolean pagamento) {
        if (this.verificarCacifo()) {
            this.setDataInicioAluguel(LocalDateTime.now());
            System.out.println("Cacifo alugado com sucesso.\nCódigo: " + codigo + "\nNúmero do Cacifo: " + this.getNum());
            this.setDisponibilidade(false);
            this.cacifoAberto = false;
        } else {
            System.out.println("Cacifo já está ocupado.");
        }
    }
}
