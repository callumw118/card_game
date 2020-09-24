import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void hasPlayer1(){
        assertEquals(player1, game.getPlayer1());
    }

    @Test
    public void hasPlayer2(){
        assertEquals(player2, game.getPlayer2());
    }

    @Test
    public void hasDealer(){
        assertEquals(dealer, game.getDealer());
    }
}
