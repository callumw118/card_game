import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Dealer dealer;
    private Deck deck;

    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();
        deck = new Deck();
        deck.populateDeck();
        dealer = new Dealer(deck);
    }

    @Test
    public void handStartsEmpty(){
        assertNull(player1.getCard());
    }
}
