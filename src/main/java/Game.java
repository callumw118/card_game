public class Game {

    private Player player1;
    private Player player2;
    private Dealer dealer;

    public Game(Player player1, Player player2, Dealer dealer){
        this.player1 = player1;
        this.player2 = player2;
        this.dealer = dealer;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Dealer getDealer() {
        return dealer;
    }
}
