public class cacifoCarregamento extends cacifo
{
    private static final double CUSTO_POR_MINUTO = 0.10;

    public cacifoCarregamento(int numero) {
        super("Carregamento", numero);
    }

    public double calcularCusto(int minutos) {
        return minutos * CUSTO_POR_MINUTO;
    }
}
