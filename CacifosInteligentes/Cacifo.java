import java.util.Random;

public class Cacifo {
    protected String tipo;
    protected int numero;
    protected boolean ocupado;
    protected Integer codigoSeguranca;
    protected long tempoExpiracao;

    public Cacifo(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
        this.ocupado = false;
        this.codigoSeguranca = null;
        this.tempoExpiracao = 0;
    }

    public boolean alugar(boolean pagamento) {
        
        //Pagar e disponibilidade
        if (!pagamento) {
            System.out.println("O pagamento falhou");
            return false;
        }

        if (ocupado) {
            System.out.println("Cacifo " + numero + " já está ocupado.");
            return false;
        }

        Random rand = new Random();
        this.codigoSeguranca = 1000 + rand.nextInt(9000);
        this.ocupado = true;
        this.tempoExpiracao = System.currentTimeMillis() + 86400000;

        System.out.println("Cacifo " + numero + " alugado com sucesso!");
        System.out.println("Número do cacifo: " + numero);
        System.out.println("Código de segurança: " + this.codigoSeguranca);
        return true;
    }

    public boolean livre(int codigoSeguranca) {
        if (!ocupado || !this.codigoSeguranca.equals(codigoSeguranca)) {
            System.out.println("Código inválido ou cacifo não ocupado.");
            return false;
        }

        this.ocupado = false;
        this.codigoSeguranca = null;
        this.tempoExpiracao = 0;
        //O cacifo foi livre com sucesso
        System.out.println("Cacifo " + numero + " livre com sucesso!");
        return true;
    }
    
    //Se o tempo acabar
    public boolean verificarDisponibilidade() {
        if (ocupado && System.currentTimeMillis() > tempoExpiracao) {
            //Retorna o tempo atual em milissegundos 
            this.ocupado = false;
            this.codigoSeguranca = null;
            this.tempoExpiracao = 0;
        }
        return !ocupado;
    }

    public void exibirInformacoes() {
        if (ocupado) {
            System.out.println("Cacifo " + numero + " está ocupado. Código: " + codigoSeguranca);
        } else {
            System.out.println("Cacifo " + numero + " está livre.");
        }
    }
}

    