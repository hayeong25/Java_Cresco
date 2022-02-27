package ch02.ex27;

public class Ex27 {

	public static void main(String[] args) {
		String[] message1 = { "I", "like", "you" };
		String[] message2 = { "He", "likes", "her" };
		
		System.out.print("Message1:");
		for(int i=0; i<message1.length; i++){
			System.out.print(" " + message1[i]);
		}
		System.out.println("");
		
		message2 = message1;
		message2[1] = "hate";

		System.out.print("Message1:");
		for(int i=0; i<message1.length; i++){
			System.out.print(" " + message1[i]);
		}
		System.out.println("");
	}

}
