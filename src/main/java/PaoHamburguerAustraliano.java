public class PaoHamburguerAustraliano extends PersonalizacaoDecorator{
    public PaoHamburguerAustraliano(HamburguerPersonalizado hamburguerPersonalizado) {
        super(hamburguerPersonalizado);
    }

    @Override
    public String descricao() {
        return hamburguerPersonalizado.descricao() + ", Pão Australiano";
    }

    @Override
    public double preco() {
        return hamburguerPersonalizado.preco() + 1.5;
    }
}
