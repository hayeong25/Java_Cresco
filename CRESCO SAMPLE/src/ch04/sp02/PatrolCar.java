package ch04.sp02;

public class PatrolCar extends Car {
	private boolean siren;

	public PatrolCar() {
		siren = false;
	}

	public PatrolCar(boolean s) {
		siren = s;
	}

	public PatrolCar(String num, int g) {
		super(num, g);
	}

	public void onSiren() { // サイレンを鳴らす
		siren = true;
	}

	public void offSiren() { // サイレンを消す
		siren = false;
	}

	public boolean getSiren() { // サイレンの状態を取得する
		return siren;
	}
}
