import java.util.ArrayList;
import java.util.Collections;

class Deck {
	// Index 0 is "top" of deck
	private ArrayList<Card> cards;

	public Deck(){
		this.cards = new ArrayList<Card>();
	}

	public Deck(Card c){
		this.cards = new ArrayList<Card>();
		this.cards.add(c);
	}

	public Deck(ArrayList<Card> c){
		this.cards = c;
	}

	public int length(){ return this.cards.size(); }

	public Card DrawCard(){
		Card drawn = this.cards.remove(0);
		return drawn;
	}

	public ArrayList<Card> DrawCards(int numToDraw){
		ArrayList<Card> cardsDrawn = new ArrayList<Card>();
		for (int i = 0; i < numToDraw; i++){
			cardsDrawn.add(this.DrawCard());
		}
		return cardsDrawn;
	}

	public void addToTop(Card c){
		this.cards.add(0, c);
	}

	public void addToBottom(Card c){
		this.cards.add(c);
	}

	public void shuffle(){
		Collections.shuffle(this.cards);
	}
}