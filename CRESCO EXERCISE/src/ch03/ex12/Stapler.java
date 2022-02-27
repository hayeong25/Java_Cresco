package ch03.ex12;

class Stapler {
	Needles needles;
	
	public Stapler(Needles needles) {
		this.needles = needles;
	}
	
	public String execute(String text) {
		if(needles.canUse()) {
			needles.use();
			return "[]" + text;
		}
		else {
			return text;
		}
	}
	
	public boolean insertNeedles(Needles newNeedles) {
		boolean can = false;
		
		if(!needles.canUse()) {
			needles = newNeedles;
			can = true;
		}
		
		return can;
	}
}