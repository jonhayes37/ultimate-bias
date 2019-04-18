class UltimateBias extends Idol {
	private boolean abilityUsed;
	private int unusedPointValue;

	public UltimateBias(String name, Groups group, Nationality nationality, Label label, String effect, int points){
		super(name, group, label, nationality, effect);
		this.abilityUsed = false;
		this.unusedPointValue = points;
	} 
}