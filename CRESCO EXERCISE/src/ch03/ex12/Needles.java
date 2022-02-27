package ch03.ex12;

class Needles {
	int amount = 5;
	
	public void use() {
		if(amount > 0) {
			amount = amount - 1;
		}
	}
	
	public boolean canUse() {
		boolean can = false;
		if(amount > 0) {
			can = true;
		}
		
		return can;
	}
}