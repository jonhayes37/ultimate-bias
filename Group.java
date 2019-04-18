import java.security.KeyException;
import java.util.*;

public enum Group {

	APRIL(
		Label.DSP, 
		new ArrayList<String>(Arrays.asList("Chaekyung", "Chaewon", "Jinsol", "Naeun", "Rachel", "Yena")), 
		Map.of(3, 20, 5, 50, 6, 70)
	),
	AOA(
		Label.FNC, 
		new ArrayList<String>(Arrays.asList("Chanmi", "Choa", "Hyejeong", "Jimin", "Mina", "Seolhyun", "Yuna")), 
		Map.of(3, 20, 5, 50, 7, 90)
	),
	GIRLS_GENERATION(
		Label.SM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	LOVELYZ(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	RED_VELVET(
		Label.SM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	FOUR_MINUTE(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	OH_MY_GIRL(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	BIGBANG(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	PRISTIN(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	MISS_A(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	TWICE(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	GFRIEND(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	GUGUDAN(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	DIA(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	SHINEE(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	EXID(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	);

	private final Label label;
	private final ArrayList<String> members;
	private final Map<Integer,Integer> pointValues;

    Group(Label label, ArrayList<String> members, Map<Integer,Integer> pointValues) {
        this.label = label;
        this.members = members;
        this.pointValues = pointValues;
    }
    
   	public Label getLabel() { return this.label; }
   	public ArrayList<String> getMembers() { return this.members; }
   	public Map<Integer,Integer> getPointValues() { return this.pointValues; }

   	public int getTierPoints(int numMembers){
   		try {
   			if (this.pointValues.keySet().contains(numMembers)){
   				return this.pointValues.get(numMembers);
   			}else{
   				throw new KeyException(this.toString() + " does not have a point tier for " + numMembers + " members!");
   			}
   		} catch (KeyException e) {
   			System.out.println(e);
   			return -1;
   		}
   	}
}
