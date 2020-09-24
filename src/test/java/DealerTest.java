import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    private Deck deck;
    private Player player;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player = new Player();
    }

    @Test
    public void dealerHasDeck(){
        assertEquals(deck, dealer.getDeck());
    }

    @Test
    public void dealerDeckIsPopulatedWith52Cards(){
        deck.populateDeck();
        int deckNum = dealer.getDeck().getNumberOfCards();
        assertEquals(52, deckNum);
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        Card cardToRemove = deck.getCards().get(0);
        dealer.dealCard(player);
        assertEquals(cardToRemove, player.getCard());
    }
}
