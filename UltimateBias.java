class UltimateBias extends Idol {
	private boolean abilityUsed;
	private int unusedPointValue;

	public UltimateBias(name, group, nationality, label, effect, points){
		super(name, group, label, nationality, effect);
		this.abilityUsed = false;
		this.unusedPointValue = points;
	} 
}