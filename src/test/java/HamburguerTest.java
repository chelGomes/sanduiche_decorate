import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HamburguerTest {
    @Test
    public void testHamburguerSimples() {
        HamburguerSimples hamburguerSimples = new HamburguerSimples();
        assertEquals(hamburguerSimples.descricao(), "Hamburguer Simples");
        assertEquals(hamburguerSimples.preco(), 5.0);
    }

    @Test
    public void testHamburguerComQueijo() {
        QueijoHamburguer hamburguerSimples = new QueijoHamburguer(new HamburguerSimples());
        assertEquals(hamburguerSimples.descricao(), "Hamburguer Simples, Queijo");
        assertEquals(hamburguerSimples.preco(), 6.0);
    }

    @Test
    public void testHamburguerComBacon() {
        BaconHamburguer hamburguerSimples = new BaconHamburguer(new HamburguerSimples());
        assertEquals(hamburguerSimples.descricao(), "Hamburguer Simples, Bacon");
        assertEquals(hamburguerSimples.preco(), 7.0);
    }

}
