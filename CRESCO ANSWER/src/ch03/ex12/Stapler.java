package ch03.ex12;

public class Stapler {
	private Needles needles;
	
	public Stapler(Needles needles){
		this.needles = needles;
	}
	
	public String execute(String text){
		if(needles.canUse()){
			needles.use();
			text = "[]" + text;
		}
		return text;
	}
	
	public boolean insertNeedles(Needles newNeedles){
		boolean doneInsert = false;
		if( needles.canUse() == false ){
			needles = newNeedles;
			doneInsert = true;
		}
		return doneInsert;
	}
}
