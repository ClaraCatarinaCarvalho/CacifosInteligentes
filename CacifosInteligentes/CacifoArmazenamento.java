<<<<<<< HEAD
public class CacifoArmazenamento extends Cacifo
{
    private boolean disponibilidade;
    double custoDiario;
    
    public CacifoArmazenamento(int num, double custoDiario){
=======
public class CacifoArmazenamento extends Cacifo {
    private double custoDiario;

    public CacifoArmazenamento(int num, double custoPorDia) {
>>>>>>> 53a0914e5801a502c2f43b100f4b4d5e67565e48
        super(num);
        this.custoDiario = custoPorDia;
    }

    @Override
    public void informacoes() {
        System.out.println("Cacifo Armazenamento\nDisponibilidade: " + (verificarCacifo() ? "Disponível" : "Ocupado") +
                "\nNúmero do Cacifo: " + this.getNum());
    }

    @Override
    public void iniciarPagamento(int codigo, boolean pagamento) {
        if (!pagamento) {
            System.out.println("Erro no pagamento.");
        } else {
            alugar(codigo, pagamento); 
        }
    }
}