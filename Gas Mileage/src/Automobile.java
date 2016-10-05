
public class Automobile {

	private int mpg;
	private int inTank;
	private int afterTrip;
	
	public Automobile(int m){
		mpg = m;
		inTank = 0;
		afterTrip = 0;
	}
	
	public void fillUp(int fU){
		inTank += fU;
	}
	
	public void takeTrip(int dr){
		afterTrip += dr;
		inTank -= afterTrip/mpg;
	}
	
	public int reportFuel(){
		return inTank;
	
	}
}
