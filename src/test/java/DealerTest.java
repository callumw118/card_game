import org.junit.Before;

public class DealerTest {

    private Dealer dealer;
    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.populateDeck();
        dealer = new Dealer(deck);
    }
}
