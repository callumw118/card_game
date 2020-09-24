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

    public Player checkWinner(){
        Card player1Card = player1.getCard();
        Card player2Card = player2.getCard();

        if(player1Card.getValueOfEnum() > player2Card.getValueOfEnum()){
            return player1;
        }else {
            return player2;
        }
    }

    public String playGame(){
        this.dealer.getDeck().populateDeck();
        this.dealer.getDeck().shuffleDeck();
        this.dealer.dealCard(player1);
        this.dealer.dealCard(player2);
        Player result = this.checkWinner();
        if (result == player1){
            return "Player 1 WINS!!!";
        }
        else{
            return "Player 2 WINS!!!";
        }
    }
}
