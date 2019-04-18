import java.util.*;

class Player {
	private static final int CARD_DEDUCTION_PENALTY = 5;

	private String name;
	private int score;
	private ArrayList<IdolCard> hand;
	private MissionCard mission;
	private UltimateBiasCard ultimateBias;
	private Map<Group,ArrayList<IdolCard>> playArea;

	public Player(String name, ArrayList<MissionCard> missionDeck, ArrayList<UltimateBiasCard> ubDeck){
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<IdolCard>();
		this.mission = missionDeck.remove(0);
		this.ultimateBias = ubDeck.remove(0);
		this.playArea = new HashMap<Group,ArrayList<IdolCard>>();
	}

	public int updateScore(ArrayList<Group> groups){
		int totalScore = 0;

		for (Group groupName: playArea.keySet()){
	        ArrayList<IdolCard> members = playArea.get(groupName);

	        for (int i = 0; i < groups.size(); i++){
	        	if (groups.get(i).toString().equals(groupName)){
	        		Map<Integer,Integer> tiers = groups.get(i).getPointValues();
	        		int highestTier = 0;
	        		for (Integer key: tiers.keySet()){
	        			if (members.size() >= key && tiers.get(key) > highestTier){
	        				highestTier = tiers.get(key);
	        			}
	        		}
	        		totalScore += highestTier;
	        		break;
	        	}
	        }
	    }
	    this.score = totalScore;
		return this.score;
	}

	public void PlayCards(ArrayList<Integer> indices){
		ArrayList<Integer> reversedIndices = indices;
		Collections.sort(reversedIndices, Collections.reverseOrder());
		for (int index: indices){
			IdolCard curCard = this.hand.remove(index);
			if (playArea.keySet().contains(curCard.getGroup())){
				this.playArea.get(curCard.getGroup()).add(curCard);
			}else{
				ArrayList<IdolCard> newCards = new ArrayList<IdolCard>();
				newCards.add(curCard);
				this.playArea.put(curCard.getGroup(), newCards);
			}
		}
	}

	public void deductHandPoints(){
		this.score -= CARD_DEDUCTION_PENALTY * this.hand.size();
	}

	public int getScore(){ return this.score; }
	public String getName(){ return this.name; }
}