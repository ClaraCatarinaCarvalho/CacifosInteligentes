public class CacifoArmazenamento extends Cacifo {
    private double custoDiario;

    public CacifoArmazenamento(int num, double custoPorDia) {
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
