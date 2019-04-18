public enum MissionCard {

	FAN_MEET_GIFT(
		"Token of Gratitude",
		"React to an opponent's standard attack.",
		"REACT. The attack is now yours, and is undefendable."
	),
	FANDOM_MEMBER(
		"Extreme Loyalty",
		"DEBUT: Before viewing your opening hand, name an artist with 7 or less members.",
		"You receive double points from that artist this game."
	),
	GLOBAL_AUDITION(
		"International Talent",
		"Play idols of 3 different nationalities in your play area.",
		"All groups in your play area with multiple nationalities receive +10 points."
	),
	INTERNATIONAL_CONCERT(
		"Global Influence",
		"Have artists from 5 or more labels in your play area.",
		"You receive 10 points for each unique label in your play area."
	),
	LABEL_HEADQUARTERS(
		"Artist Synergy",
		"DEBUT: Choose a label before viewing your opening hand. You receive bonuses for that label.",
		"1 artist in play: Each time you play the label's artists, draw 1 card. 2 artists in play: If you draw an idol from the label, draw again."
	),
	MUSIC_SHOW_WIN(
		"Rite of Passage",
		"DEBUT: If you are not the first player to have 5 or more cards from an artist in play, discard this card.",
		"Add 50 points to your score."
	),
	REALITY_APPEARANCE(
		"Group Publicity",
		"Have 4 or fewer cards in your hand.",
		"Your hand size cap is now 12."
	),
	SAWORI(
		"Infamous Mascot",
		"Play April cards in your play area.",
		"Add 5 points to your score for each DSP idol in play."
	),
	IU_AND_JANG_KI_HA(
		"Scandalous Couple",
		"Use 2 standard attacks against a single opponent.",
		"All of your action effects are increased by 1."
	),
	TOKYO_DOME(
		"Legendary Venue",
		"Complete an artist with 8 or more members.",
		"Add 40 points to your score for each completed artist in your play area."
	),
	VIRAL_MUSIC_VIDEO(
		"Guaranteed Success",
		"Have the least amount of points in your play area (cannot be tied).",
		"While in last place, draw 2 cards at the start of your turn. Discard this card when you are no longer in last."
	);

	private final String subtitle;
	private final String missionText;
	private final String rewardText;

	MissionCard(String subtitle, String mission, String reward){
		this.subtitle = subtitle;
		this.missionText = mission;
		this.rewardText = reward;
	}

	public String getSubtitle(){ return this.subtitle; }
	public String getMissionText(){ return this.missionText; }
	public String getRewardText(){ return this.rewardText; }
}
