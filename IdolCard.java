class IdolCard extends Card {
	
	private Group group;
	private Nationality nationality;
	private String effectText;

	public IdolCard(String name, Group group, Nationality nationality, String effect){
		super(name);
		this.group = group;
		this.nationality = nationality;
		this.effectText = effect;
	}

	public Group getGroup(){ return this.group; }
	public Nationality getNationality(){ return this.nationality; }
	public String getEffectText(){ return this.effectText; }
}
