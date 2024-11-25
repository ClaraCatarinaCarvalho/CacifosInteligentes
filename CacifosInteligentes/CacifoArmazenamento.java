public class CacifoArmazenamento extends Cacifo
{
    private boolean disponibilidade;
    double custoDiario;
    
    public CacifoArmazenamento(int num, double custoPorDia){
        super(num);
        this.custoDiario = custoDiario;
    }
    
    @Override
    public void informacoes(){
        System.out.println("Cacifo Armazenamento\n" + "Disponibilidade: " + disponibilidade+ "\nNúmero do cacifo: " + this.num);
    }
    
    
   
}