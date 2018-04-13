/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		MessageSlowly(str, 500);
	}
	/*
	 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
	 * ※ Thread.sleep を使用すること
	 */


	private static void MessageSlowly(String language, int slow) {
		char[] array = language.toCharArray();
		for(int i = 0; i <language.length(); i++) {
			System.out.println(array[i]);
			try {
				Thread.sleep(slow);
			}catch(InterruptedException e){

			}
		// TODO 自動生成されたメソッド・スタブ
		}
	}
}
