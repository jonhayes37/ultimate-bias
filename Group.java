import java.security.KeyException;
import java.util.*;

public enum Group {

	2NE1(
		Label.YG, 
		new ArrayList<String>(Arrays.asList("Bom", "CL", "Dara", "Minzy")), 
		Map.of(3, 25, 4, 40)
	),
	4MINUTE(
		Label.CUBE, 
		new ArrayList<String>(Arrays.asList("Gayoon", "Hyuna", "Jihyun", "Jiyoon", "Sohyun")), 
		Map.of(3, 25, 5, 55)
	),
	AFTER_SCHOOL(
		Label.PLEDIS, 
		new ArrayList<String>(Arrays.asList("Eyoung", "Jooyeon", "Jung-Ah", "Kaeun", "Lizzy", "Nana", "Raina", "Uee")), 
		Map.of(3, 20, 6, 60, 8, 110)
	),
	AOA(
		Label.FNC, 
		new ArrayList<String>(Arrays.asList("Chanmi", "Choa", "Hyejeong", "Jimin", "Mina", "Seolhyun", "Yuna")), 
		Map.of(3, 20, 5, 50, 7, 90)
	),
	APINK(
		Label.CUBE, 
		new ArrayList<String>(Arrays.asList("Bomi", "Chorong", "Eunji", "Hayoung", "Naeun", "Namjoo")), 
		Map.of(3, 20, 5, 50, 6, 70)
	),
	APRIL(
		Label.DSP, 
		new ArrayList<String>(Arrays.asList("Chaekyung", "Chaewon", "Jinsol", "Naeun", "Rachel", "Yena")), 
		Map.of(3, 20, 5, 50, 6, 70)
	),
	BERRY_GOOD(
		Label.JTG, 
		new ArrayList<String>(Arrays.asList("Daye", "Gowoon", "Johyun", "Sehyung", "Seoyul", "Taeha")), 
		Map.of(3, 20, 5, 60, 6, 70)
	),
	BIGBANG(
		Label.YG, 
		new ArrayList<String>(Arrays.asList("Daesung", "G-Dragon", "Seungri", "Taeyang", "T.O.P")), 
		Map.of(3, 25, 5, 55)
	),
	BLACKPINK(
		Label.YG, 
		new ArrayList<String>(Arrays.asList("Jennie", "Jisoo", "Lisa", "Rose")), 
		Map.of(3, 25, 4, 40)
	),
	CLC(
		Label.CUBE, 
		new ArrayList<String>(Arrays.asList("Elkie", "Eunbin", "Seunghee", "Seungyeon", "Sorn", "Yeeun", "Yujin")), 
		Map.of(3, 20, 5, 50, 7, 90)
	),
	DAY6(
		Label.JYP, 
		new ArrayList<String>(Arrays.asList("Dowoon", "Jae", "Sungjin", "Wonpil", "Young K")), 
		Map.of(3, 25, 5, 55)
	),
	DIA(
		Label.MBK, 
		new ArrayList<String>(Arrays.asList("Chaeyeon", "Eunchae", "Eunice", "Huihyeon", "Jenny", "Jooeun", "Somyi", "Yebin")), 
		Map.of(3, 20, 6, 60, 8, 110)
	),
	EXID(
		Label.BANANA_REPUBLIC, 
		new ArrayList<String>(Arrays.asList("Hani", "Hyelim", "Jeonghwa", "LE", "Solji")), 
		Map.of(3, 25, 5, 55)
	),
	EXO(
		Label.SM, 
		new ArrayList<String>(Arrays.asList("Baekhyun", "Chanyeol", "Chen", "D.O", "Kai", "Kris", "Lay", "Luhan", "Sehun", "Suho", "Tao", "Xiumin")), 
		Map.of(4, 25, 8, 80, 12, 200)
	),
	F_X(
		Label.SM, 
		new ArrayList<String>(Arrays.asList("Amber", "Krystal", "Luna", "Sulli", "Victoria")), 
		Map.of(3, 25, 5, 55)
	),
	GFRIEND(
		Label.SOURCE, 
		new ArrayList<String>(Arrays.asList("Eunha", "SinB", "Sowon", "Umji", "Yerin", "Yuju")), 
		Map.of(3, 20, 5, 50, 6, 70)
	),
	GIRLS_DAY(
		Label.DREAM_T, 
		new ArrayList<String>(Arrays.asList("Hyeri", "Minah", "Sojin", "Yura")), 
		Map.of(3, 25, 4, 40)
	),
	GIRLS_GENERATION(
		Label.SM, 
		new ArrayList<String>(Arrays.asList("Hyoyeon", "Jessica", "Seohyun", "Sooyoung", "Sunny", "Taeyeon", "Tiffany", "Yoona", "Yuri")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	GUGUDAN(
		Label.JELLYFISH, 
		new ArrayList<String>(Arrays.asList("Haebin", "Hana", "Hyeyeon", "Mimi", "Mina", "Nayoung", "Sally", "Sejeong", "Soyee")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	KARA(
		Label.DSP, 
		new ArrayList<String>(Arrays.asList("Hara", "Gyuri", "Jiyoung", "Nicole", "Seungyeon")), 
		Map.of(3, 25, 5, 55)
	),
	KARD(
		Label.DSP, 
		new ArrayList<String>(Arrays.asList("BM", "Jiwoo", "J.Seph", "Somin")), 
		Map.of(3, 25, 4, 40)
	),
	LABOUM(
		Label.NH, 
		new ArrayList<String>(Arrays.asList("Haein", "Solbin", "Soyeon", "Yujeong", "Yulhee", "ZN")), 
		Map.of(3, 20, 5, 50, 6, 70)
	),
	LOVELYZ(
		Label.WOOLLIM, 
		new ArrayList<String>(Arrays.asList("Babysoul", "Jiae", "Jin", "Jisoo", "Kei", "Mijoo", "Sujeong", "Yein")), 
		Map.of(3, 20, 6, 60, 8, 110)
	),
	MAMAMOO(
		Label.RAINBOW_BRIDGE_WORLD, 
		new ArrayList<String>(Arrays.asList("Hwasa", "Moonbyul", "Solar", "Wheein")), 
		Map.of(3, 50, 4, 80)
	),
	MISS_A(
		Label.JYP, 
		new ArrayList<String>(Arrays.asList("Fei", "Jia", "Min", "Suzy")), 
		Map.of(3, 25, 4, 40)
	),
	OH_MY_GIRL(
		Label.WM, 
		new ArrayList<String>(Arrays.asList("Arin", "Binnie", "Hyojung", "Jiho", "JinE", "Mimi", "Seunghee", "YooA")), 
		Map.of(3, 20, 6, 60, 8, 110)
	),
	PRISTIN(
		Label.PLEDIS, 
		new ArrayList<String>(Arrays.asList("Eunwoo", "Kyla", "Kyulkyung", "Nayoung", "Rena", "Roa", "Sungyeon", "Xiyeon", "Yehana", "Yuha")), 
		Map.of(4, 20, 7, 70, 10, 165)
	),
	RAINBOW(
		Label.DSP, 
		new ArrayList<String>(Arrays.asList("Hyunyoung", "Jaekyung", "Jisook", "Noeul", "Seungah", "Woori", "Yoonhye")), 
		Map.of(3, 20, 5, 50, 7, 90)
	),
	RED_VELVET(
		Label.SM, 
		new ArrayList<String>(Arrays.asList("Irene", "Joy", "Seulgi", "Wendy", "Yeri")), 
		Map.of(3, 25, 5, 55)
	),
	SEVENTEEN(
		Label.PLEDIS, 
		new ArrayList<String>(Arrays.asList("Dino", "DK", "Hoshi", "Jeonghan", "Joshua", "Jun", "Mingyu", "S.Coups", "Seungkwan", "The8", "Vernon", "Wonwoo", "Woozi")), 
		Map.of(5, 40, 9, 95, 13, 230)
	),
	SHINEE(
		Label.SM, 
		new ArrayList<String>(Arrays.asList("Jonghyun", "Key", "Minho", "Onew", "Taemin")), 
		Map.of(3, 25, 5, 55)
	),
	SISTAR(
		Label.STARSHIP, 
		new ArrayList<String>(Arrays.asList("Bora", "Dasom", "Hyolyn", "Soyou")), 
		Map.of(3, 25, 4, 40)
	),
	STELLAR(
		Label.PASCAL, 
		new ArrayList<String>(Arrays.asList("Hyoeun", "Jeonyul", "Minhee", "Soyoung")), 
		Map.of(3, 25, 4, 40)
	),
	TARA(
		Label.MBK, 
		new ArrayList<String>(Arrays.asList("Boram", "Eunjung", "Hyomin", "Jiyeon", "Qri", "Soyeon")), 
		Map.of(3, 20, 5, 50, 6, 70)
	),
	TWICE(
		Label.JYP, 
		new ArrayList<String>(Arrays.asList("Chaeyoung", "Dahyun", "Jeongyeon", "Jihyo", "Mina", "Momo", "Nayeon", "Sana", "Tzuyu")), 
		Map.of(3, 15, 6, 60, 9, 140)
	),
	WJSN(
		Label.STARSHIP, 
		new ArrayList<String>(Arrays.asList("Bona", "Cheng Xiao", "Dawon", "Dayoung", "Eunseo", "Exy", "Luda", "Mei Qi", "Seola", "Soobin", "Xuan Yi", "Yeonjung", "Yeoreum")), 
		Map.of(5, 40, 9, 95, 13, 230)
	),
	WONDER_GIRLS(
		Label.JYP, 
		new ArrayList<String>(Arrays.asList("Hyelim", "Sunmi", "Yeeun", "Yebin")), 
		Map.of(3, 25, 4, 40)
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
