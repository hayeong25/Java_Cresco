package ch03.ex12;

public class Ex12 {
	public static void main(String[] args) {
		Needles needles1 = new Needles();
		Stapler stapler = new Stapler(needles1);

		for(int i=0;i<3;i++){
			String text = stapler.execute("Javaテキスト");
			System.out.println(text);
		}
		
		Needles needles2 = new Needles();

		boolean canInsert = stapler.insertNeedles(needles2);
		if(canInsert){
			System.out.println("エラー：新しい針を追加できました");
		}else{
			System.out.println("正常：新しい針を追加できませんでした");
		}
		
		for(int i=0;i<3;i++){
			String text = stapler.execute("Javaテキスト");
			System.out.println(text);
		}

		canInsert = stapler.insertNeedles(needles2);
		if(canInsert){
			System.out.println("正常：新しい針を追加できました");
		}else{
			System.out.println("エラー：新しい針を追加できませんでした");
		}

		for(int i=0;i<5;i++){
			String text = stapler.execute("Java演習");
			System.out.println(text);
		}
	}

}
