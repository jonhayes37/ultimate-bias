import java.util.*;

class Group {
	private String name;
	private int size;
	private String label;
	private Map<Integer,Integer> pointValues;

	public Group(String name, int size, String label, int[] tiers, int[] points){
		this.name = name;
		this.size = size;
		this.label = label;
		try {
			if (tiers.length == points.length && tiers.length > 0){
				this.pointValues = new HashMap<Integer,Integer>();
				for (int i = 0; i < tiers.length; i++){
					this.pointValues.put(tiers[i], points[i]);
				}
			}else{
				throw new IndexOutOfBoundsException();
			}
		}catch (IndexOutOfBoundsException e){
			System.out.println("Error: Tiers and Points do not have equal lengths!");
		}
	}

	public String getName(){ return this.name; }
	public int getSize(){ return this.size; }
	public String getLabel(){ return this.label; }
	public Map<Integer,Integer> getPointValues(){ return this.pointValues; }
}