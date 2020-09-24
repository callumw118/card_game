import org.junit.Before;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;
    private Deck deck;
    private Dealer dealer;
    private Card highCard;
    private Card lowCard;

    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();
        deck = new Deck();
        dealer = new Dealer(deck);
        game = new Game(player1, player2, dealer);
        highCard = new Card(CardSuit.SPADES, CardValue.ACE);
        lowCard = new Card(CardSuit.DIAMONDS, CardValue.EIGHT);
    }
}
