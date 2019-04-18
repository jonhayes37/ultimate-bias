class Mission extends Card {
	private String missionText;
	private String rewardText;

	public Mission(String name, String mission, String reward){
		super(name);
		this.missionText = mission;
		this.rewardText = reward;
	}

	public String getMissionText(){ return this.missionText; }
	public String getRewardText(){ return this.rewardText; }
}
