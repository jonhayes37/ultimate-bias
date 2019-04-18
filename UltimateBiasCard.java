public enum UltimateBiasCard {
	
	FAIRY_CHAEYEON(
		Group.DIA,
		Nationality.KOREA,
		"Blessing",
		"AURA: Your hand size cap is now 11. Draw 2 cards, then CYCLE 3. When the game ends, you must only subtract 5 points from your score for every 2 cards in your hand."
	),
	GOD_SEJEONG(
		Group.GUGUDAN,
		Nationality.KOREA,
		"Perfection",
		"Flip the top card of the draw pile. If the card belongs to an artist in your hand, draw it. Otherwise, discard the card. Continue until you have discarded 3 cards."
	),
	HANI_FANCAM_GODDESS(
		Group.EXID,
		Nationality.KOREA,
		"Virality",
		"Name a group. For each card from that group in your hand, search the discard pile and take a card from that group."
	),
	HYUNA_TROUBLEMAKER(
		Group.FOUR_MINUTE,
		Nationality.KOREA,
		"Act of Hatred",
		"Choose a player. They must discard an incomplete group of your choice from their play area."
	),
	IRENE_THE_EVERLASTING(
		Group.RED_VELVET,
		Nationality.KOREA,
		"Rebirth",
		"Return all cards from the discard pile that are from artists in your play area to the draw pile. Then, shuffle the draw pile and draw until you have 10 cards."
	),
	JINSOL_GOLDEN_MAKNAE(
		Group.APRIL,
		Nationality.KOREA,
		"Disarming Eyesmile",
		"All players must discard to 6 cards. If they have 5 or less cards, they must discard an artist from their play area instead. You may draw 1 card rom each player's discarded cards."
	),
	JISOO_DESERT_FOX(
		Group.LOVELYZ,
		Nationality.KOREA,
		"Forced Will",
		"Name a label. All other players must give you all cards from that label in their hand."
	),
	MINA_BLACK_SWAN(
		Group.TWICE,
		Nationality.JAPAN,
		"International Appeal",
		"Name a group with all of its members in the discard pile. Search the discard pile and draw all members of that group."
	),
	MINHO_ALL_SEEING(
		Group.SHINEE,
		Nationality.KOREA,
		"Clairvoyance",
		"View all of a player's idol, ultimate bias, and mission cards. Take an idol card of your choice from their hand. They must use their ultimate bias on their next turn. If they cannot, it is discarded."
	),
	SEOLHYUN_SEOLHYUNARI(
		Group.AOA,
		Nationality.KOREA,
		"Angelic Beauty",
		"Once AOA cards are in play, you must reveal Seolhyun, Seolhyunari. She is worth 10 points for every AOA member in play."
	),
	SEUNGHEE_JUSTICE_MANIFEST(
		Group.OH_MY_GIRL,
		Nationality.KOREA,
		"Equilibrium",
		"Choose one: All players draw or discard to 6 cards in hand. OR All players discard to 3 artists in play."
	),
	STONE_NAYOUNG(
		Group.PRISTIN,
		Nationality.KOREA,
		"Stunning Gaze",
		"All other players miss their next 3 turns. You may discard up to 3 cards per turn during this time."
	),
	SUZY_MASTER_OF_CHAOS(
		Group.MISS_A,
		Nationality.KOREA,
		"Reversal",
		"Switch an incomplete artist from your play area with an incomplete artist from an opponent's. then, return your hand to the draw pile, shuffle it, and draw 10 cards."
	),
	TAEYANG_ASTRAL_GUARDIAN(
		Group.BIGBANG,
		Nationality.KOREA,
		"Protection",
		"DEBUT. You may store an idol card face down on Taeyang. It is untargetable and does not count towards your hand cap. Cards must be stored for at least 3 turns before being retrieved."
	),
	TAEYEON_KID_LEADER(
		Group.GIRLS_GENERATION,
		Nationality.KOREA,
		"Favoritism",
		"Choose a player. They must discard 5 cards. If you have SM cards in play, they must discard their entire hand instead."
	),
	YUJU_RESILIENCE_INCARNATE(
		Group.GFRIEND,
		Nationality.KOREA,
		"Persevere",
		"Name a group for which you have 3 or more cards in your hand. Search the draw pile for all members of that group, then draw them. Shuffle the deck."
	);

	private final Group group;
	private final Nationality nationality;
	private final boolean abilityUsed;
	private final String abilityName;
	private final String effect;

	UltimateBiasCard(Group group, Nationality nationality, String abilityName, String effect){
		this.group = group;
		this.nationality = nationality;
		this.effect = effect;
		this.abilityName = abilityName;
		this.abilityUsed = false;
	} 

	public Group getGroup(){ return this.group; }
	public Nationality getNationality(){ return this.nationality; }
	public String getEffect(){ return this.effect; }
	public boolean getUsed(){ return this.abilityUsed; }
}
