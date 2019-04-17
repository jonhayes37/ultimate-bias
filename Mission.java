class Mission extends Card {
	private String missionText;
	private String rewardText;

	public Mission(name, mission, reward){
		super(name);
		this.missionText = mission;
		this.rewardText = reward;
	}

	public getMissionText(){ return this.missionText; }
	public getMissionText(){ return this.rewardText; }
}