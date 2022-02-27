package ch03.sp08;

public class Sample08 {
	public static void main(String[] args){
		Box box = new Box();
		box.put(120).put(86).put(40).put(30);
		
		Rule rule = new Rule(40);
		box.judge(rule);
	}
}
