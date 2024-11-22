import java.util.Random;

public class Cacifo {
    private String tipo;
    private int numero;
    private boolean ocupado;
    private Integer codigoSeguranca; 

    public Cacifo(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
        this.ocupado = false;
        this.codigoSeguranca = null;
    }
    
    //se estiver ocupado retorna false
    public boolean alugar() {
        if (ocupado) {
            System.out.println("Cacifo " + numero + " já está ocupado.");
            return false;
        }

        //código de segurança aleatório de 4 dígitos
        Random rand = new Random();
        this.codigoSeguranca = 1000 + rand.nextInt(9000); //número entre 1000 e 9999
        this.ocupado = true;

        System.out.println("Cacifo " + numero + " alugado com sucesso!");
        System.out.println("Seu código de segurança é: " + this.codigoSeguranca);
        return true;
    }

    public boolean livre(int codigoSeguranca) {
        if (!ocupado || !this.codigoSeguranca.equals(codigoSeguranca)) {
            System.out.println("Código de segurança inválido ou cacifo não ocupado.");
            return false;
        }

        this.ocupado = false;
        this.codigoSeguranca = null;
        System.out.println("Cacifo " + numero + " livre com sucesso!");
        return true;
    }

    public boolean isocupado() {
        return ocupado;
    }
}
    