package ch03.ex12;

public class Needles {
	private int amount = 5;
	
	public void use(){
		if(amount > 0){
			amount--;
		}
	}
	
	public boolean canUse(){
		boolean result = true;
		if(amount == 0){
			result = false;
		}
		return result;
	}
}
