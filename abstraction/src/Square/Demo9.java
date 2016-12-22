package Square;

public class Demo9 {
	public static void main(String[] args) {
		String actuals="Mera Bharath Mahaan";
		String expected="Mera Bharath mahaa";
		boolean status=actuals.equalsIgnoreCase(expected);
		System.out.println(status);
		
	}
}
