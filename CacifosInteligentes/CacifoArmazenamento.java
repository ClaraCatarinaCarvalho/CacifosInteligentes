public class cacifoArmazenamento extends cacifo
{
    private boolean disponibilidade;
    double custoDiario;
    
    public cacifoArmazenamento(int num, double custoPorDia){
        super(num);
        this.custoDiario = custoPorDia;
    }
    
    @Override
    public void informacoes(){
        System.out.println("Cacifo Armazenamento\n" + "Disponibilidade: " + disponibilidade+ "\nNúmero do cacifo: " + this.num);
    }
    
     @Override
    public void iniciarCarregamento(int codigo, boolean pagamento) {
    }

   
}