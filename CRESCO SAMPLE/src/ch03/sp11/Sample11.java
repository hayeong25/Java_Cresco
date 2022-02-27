package ch03.sp11;

public class Sample11 {
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.setName("数学");
		System.out.println(subject.getName() + "の最高得点:" + Subject.MAX_SCORE);
		System.out.println(subject.getName() + "の最低得点:" + Subject.MIN_SCORE);
	}
}
