class Idol extends Card {
	private String group;
	private String nationality;
	private String label;
	private String effectText;

	public Idol(name, group, label, nationality, effect){
		super(name);
		this.group = group;
		this.label = label;
		this.nationality = nationality;
		this.effectText = effect;
	}

	public String getGroup(){ return this.group; }
	public String getLabel(){ return this.label; }
	public String getNationality(){ return this.nationality; }
	public String getEffectText(){ return this.effectText; }
}