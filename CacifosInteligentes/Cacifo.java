import java.time.LocalDateTime;
import java.util.Random;

public abstract class Cacifo {
    public int num = 0;
    private boolean disponibilidade;
    public static LocalDateTime dataInicioAluguer;  
    public static int CODIGO;
    public boolean cacifoAberto;  

    public Cacifo(int num) {
        this.num = num;
        this.disponibilidade = true;
        this.cacifoAberto = true; // Inicialmente o cacifo está aberto
    }

    public static int codigo() {
        Random random = new Random();
        return 1000 + random.nextInt(9000); // Gera um número entre 1000 e 9999
    }

    public void inserirCodigo(int codigoTentativa) {
        if (codigoTentativa == CODIGO) {
            // Se o cacifo não tiver sido alugado
            if (disponibilidade == false) {
                System.out.println("O cacifo está disponível.");
            } else {
                // Se o cacifo estiver ocupado, fica disponível
                System.out.println("O cacifo ficou disponível.");
                this.disponibilidade = false;
            }
        } else {
            System.out.println("Código incorreto");
        }
    }

    public LocalDateTime getDataInicioAluguer() {
        return this.dataInicioAluguer;
    }

    public int getNum() {
        return this.num;
    }

    public boolean verificarCacifo() {
        return this.disponibilidade;
    }

    public void setDataInicioAluguer(LocalDateTime dataInicioAluguer) {
        this.dataInicioAluguer = dataInicioAluguer;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void abrirCacifo() {
        this.disponibilidade = true;
        this.dataInicioAluguer = null;
        this.cacifoAberto = true;
    }

    public abstract void informacoes();
    public abstract void iniciarPagamento(int codigo, boolean pagamento);

   
    public void alugar(int codigo, boolean pagamento) {
        if (this.verificarCacifo()) {
            this.setDataInicioAluguer(LocalDateTime.now());
            System.out.println("Cacifo alugado com sucesso.\nCódigo: " + codigo + "\nNúmero do Cacifo: " + this.getNum());
            this.setDisponibilidade(false);
            this.cacifoAberto = false;
        } else {
            System.out.println("Cacifo já está ocupado.");
        }
    }
}
