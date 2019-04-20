import java.util.*;

class Deck<T> {
	// Index 0 is "top" of deck
	private ArrayList<T> cards;

	public Deck(){
		this.cards = new ArrayList<T>();
	}

	public Deck(T c){
		this.cards = new ArrayList<T>();
		this.cards.add(c);
	}

	public Deck(ArrayList<T> c){
		this.cards = c;
	}

	public int length(){ return this.cards.size(); }
	public ArrayList<T> getCards(){ return this.cards; }

	public T drawCard(){
		T drawn = this.cards.remove(0);
		return drawn;
	}

	public ArrayList<T> drawCards(int numToDraw){
		ArrayList<T> cardsDrawn = new ArrayList<T>();
		for (int i = 0; i < numToDraw; i++){
			cardsDrawn.add(this.drawCard());
		}
		return cardsDrawn;
	}

	public void addToTop(T c){
		this.cards.add(0, c);
	}

	public void addToBottom(T c){
		this.cards.add(c);
	}

	public void shuffle(){
		Collections.shuffle(this.cards);
	}
}