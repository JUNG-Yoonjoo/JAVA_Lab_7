
public class Check {
	private String name;
	private static int checkNum = 1001;
	private int checkNumber;
	private int amt;
	
	public Check (String name, int amt) {
		this.name = name;
		this.amt = amt;
		checkNumber = checkNum++;
	}
	
	public int getAmt() {
		return amt;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return checkNumber;
	}
}
