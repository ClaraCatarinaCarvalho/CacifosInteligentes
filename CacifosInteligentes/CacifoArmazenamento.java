public class CacifoArmazenamento extends Cacifo
{
    private boolean disponibilidade;
    double custoPorDia;
    
    public CacifoArmazenamento(int num, double custoPorDia){
        super(num);
        this.custoPorDia = custoPorDia;
    }
    
    @Override
    public void informacoes(){
        System.out.println("Cacifo Armazenamento\n" + "Disponibilidade: " + disponibilidade+ "\nNúmero do cacifo: " + this.num);
    }
    
     @Override
    public void iniciarCarregamento(int codigo, boolean pagamento) {
    }

    @Override
    public void terminarCarregamento(boolean pagamento) {
    }
}