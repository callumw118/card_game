import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.populateDeck();
        dealer = new Dealer(deck);
    }

    @Test
    public void dealerHasDeck(){
        assertEquals(deck, dealer.getDeck());
    }

    @Test
    public void dealerDeckIsPopulatedWith52Cards(){
        int deckNum = dealer.getDeck().getNumberOfCards();
        assertEquals(52, deckNum);
    }
}
