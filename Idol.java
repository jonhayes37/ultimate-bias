class Idol extends Card {
	private Groups group;
	private Nationality nationality;
	private Label label;
	private String effectText;

	public Idol(String name, Groups group, Label label, Nationality nationality, String effect){
		super(name);
		this.group = group;
		this.label = label;
		this.nationality = nationality;
		this.effectText = effect;
	}

	public Groups getGroup(){ return this.group; }
	public Label getLabel(){ return this.label; }
	public Nationality getNationality(){ return this.nationality; }
	public String getEffectText(){ return this.effectText; }
}