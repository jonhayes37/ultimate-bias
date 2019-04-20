import java.util.*;

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

	public static ArrayList<IdolCard> generateIdolDeck(){
		ArrayList<IdolCard> idols = new ArrayList<IdolCard>();
		for (Group group: Group.values()){
			for (String member: group.getMembers()){
				IdolCard curCard = new IdolCard(member, group, Nationality.KOREA, "");
				idols.add(curCard);
			}
		}
		return idols;
	}

	public static void main(String[] args){
		System.out.println("Starting game");
		
		// Create decks, shuffle each one
		Deck<IdolCard> idolDeck = new Deck<IdolCard>(Game.generateIdolDeck());
		Deck<MissionCard> missionDeck = new Deck<MissionCard>(new ArrayList<MissionCard>(Arrays.asList(MissionCard.values())));
		Deck<UltimateBiasCard> ultimateBiasDeck = new Deck<UltimateBiasCard>(new ArrayList<UltimateBiasCard>(Arrays.asList(UltimateBiasCard.values())));
		idolDeck.shuffle();
		missionDeck.shuffle();
		ultimateBiasDeck.shuffle();

		System.out.println("Lengths: " + idolDeck.length() + "," + missionDeck.length() + "," + ultimateBiasDeck.length());
		Player p1 = new Player("Jonathan", idolDeck, missionDeck, ultimateBiasDeck);
		Player p2 = new Player("Jinsol", idolDeck, missionDeck, ultimateBiasDeck);
		System.out.println("Lengths: " + idolDeck.length() + "," + missionDeck.length() + "," + ultimateBiasDeck.length());
		/*
		Step 1: create decks (mission, ultimate bias, draw pile), shuffle cards
		Step 2: determine number of players
		Step 3: deal 7 idol cards, mission, ub to each player
		step 4: start game loop w/ check for deck empty
		*/
	}
}