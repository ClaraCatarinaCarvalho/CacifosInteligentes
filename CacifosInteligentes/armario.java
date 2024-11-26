import java.time.LocalDateTime;
public class Armario
{
    private static final int ARMARIO = 50;
    public int codigo;
    private static Cacifo[] cacifos;
    private LocalDateTime inicioAluguel;
    
    public Armario(){
        this.cacifos = new Cacifo[ARMARIO];
        this.contruirCacifos();
    }

    private void contruirCacifos(){
        for (int i = 0; i < 10; i++) {
            cacifos[i] = new CacifoCarregamento(i + 7,50);
        }
        for (int i = 10; i < ARMARIO; i++) {
            cacifos[i] = new CacifoArmazenamento(i + 5,20);
        }
    }
        
    public Cacifo alugarCacifoArmazenamento(boolean pagamento) {
        //Se houver erro no pagamento
        if (!pagamento) {
            System.out.println("Ocorreu um erro");
        } else {
            for (int i = 10; i < 40; i++) { 
                if (cacifos[i].verificarCacifo()) {
                    int codigoArmazenamento = Cacifo.codigo();
                    this.inicioAluguel = LocalDateTime.now();//LocalDateTime.now() usa o horário do sistema
                    System.out.println("O cacifo foi alugado com sucesso.\n " + "Código: " + codigoArmazenamento + "\nNúmero do cacifo: " + cacifos[i].getNum());
                }
            }
        
            System.out.println("Nenhum cacifo disponivel");
        }
        return null;
    }
    

    public Cacifo alugarCacifoCarregamento(boolean pagamento) {
        if (!pagamento) {
            System.out.println("Houve um erro no pagamento");
        } else {
            for (int i = 40; i < ARMARIO; i++) { 
                if (cacifos[i].verificarCacifo()) { // Verificar disponibilidade
                    int codigoCarregamento = Cacifo.codigo();
                    this.inicioAluguel = LocalDateTime.now();
                    cacifos[i].setDisponibilidade(false);
                    System.out.println("O cacifo foi alugado com sucesso.\n" +" Código: " + codigoCarregamento + "\nNúmero do cacifo: " + cacifos[i].getNum());
                }
            }
            System.out.println("Nenhum cacifo disponivel");
        }
        return null;
    }

}