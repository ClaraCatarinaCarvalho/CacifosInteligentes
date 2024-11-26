public class CacifoArmazenamento extends Cacifo {
    private double custoDiario;

    public CacifoArmazenamento(int num, double custoPorDia) {
        super(num);
<<<<<<< HEAD
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
=======
        this.custoDiario = custoDiario;
    }
    
    @Override
    public void informacoes(){
        System.out.println("Cacifo Armazenamento\n" + "Disponibilidade: " + disponibilidade+ "\nNúmero do cacifo: " + this.num);
    }
    
    
   
}
>>>>>>> 52f6a28ebc8554e5b33b36d84fe822f5085d1dc4
