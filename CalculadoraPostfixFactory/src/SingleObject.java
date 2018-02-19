
public class SingleObject {
	private static Calc instance;
	
	private SingleObject(String type) {
		instance = new Calc (type);
	}
	
	public static Calc getInstance(String type) {
		return instance;
	}
	

}
