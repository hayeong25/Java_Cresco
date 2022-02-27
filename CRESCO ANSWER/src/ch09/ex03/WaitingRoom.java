package ch09.ex03;

import java.util.LinkedList;

// LinkedList 版
public class WaitingRoom {
	/*
	 * List型ではなくLinkedList型にしているのは、LinkedListクラスで定義されたAPIを使用しているため。
	 * List型のAPIを使用しても同一の処理を実現することは可能。APIは WaitingRoom2 のクラスを参照。
	 */
	private LinkedList<String> list = new LinkedList<String>();

	public void enter(String name) {
		list.addLast(name);
	}

	public String call() {
		return list.removeFirst();
	}
}
