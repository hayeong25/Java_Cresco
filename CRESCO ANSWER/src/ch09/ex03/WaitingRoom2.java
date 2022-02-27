package ch09.ex03;

import java.util.List;
import java.util.ArrayList;


// ArrayList 版
public class WaitingRoom2 {
	private List<String> list = new ArrayList<String>();

	public void enter(String name) {
		list.add(name);
	}

	public String call() {
		return list.remove(0); 
	}
}
