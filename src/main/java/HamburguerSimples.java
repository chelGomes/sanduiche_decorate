public class HamburguerSimples implements HamburguerPersonalizado {
    private String descricao;
    private double precoBase;

    public HamburguerSimples() {
        this.descricao = "Hamburguer Simples";
        this.precoBase = 5.0;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public double preco() {
        return precoBase;
    }
}
