package ch05.sp05;

import java.lang.reflect.Field;

public interface PrintFieldValue {
	default void printFieldValue(String name) {
		Class c = this.getClass();
		try {
			// 指定した名前のフィールドを取得
			Field f = c.getDeclaredField(name);
			// privateの可視性に対してアクセスできるようにする
			f.setAccessible(true);
			// フィールドの値を取得して出力
			System.out.println(name + ":" + f.get(this));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
