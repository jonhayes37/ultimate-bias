import java.util.ArrayList;

class Game {
	private ArrayList<Player> players;
	private Deck drawPile;
	private Deck discardPile;

	public Game(ArrayList<Player> players, Deck draw, Deck discard){
		this.players = players;
		this.drawPile = draw;
		this.discardPile = discard;
	}

	public ArrayList<String> getWinner(){
		int highestScore = 0;
		ArrayList<String> winners = new ArrayList<String>();
		for (int i = 0; i < this.players.size(); i++){
			int curScore = this.players.get(i).getScore();
			if (curScore > highestScore){
				winners = new ArrayList<String>();
				winners.add(this.players.get(i).getName());
				highestScore = curScore;
			}else if (curScore == highestScore){
				winners.add(this.players.get(i).getName());
			}
		}
		return winners;
	}

	public static void main(String[] args){
		System.out.println("Starting game");
		System.out.println(Idols.values());

		/*
		Step 1: create decks (mission, ultimate bias, draw pile), shuffle cards
		Step 2: determine number of players
		Step 3: deal 7 idol cards, mission, ub to each player
		step 4: start game loop w/ check for deck empty
		*/
	}
}