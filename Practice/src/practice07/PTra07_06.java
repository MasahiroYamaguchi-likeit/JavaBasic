package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{ 500, 40, 6 },
				{ 70, 8, 90, 1000 }
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください

		double num = 0;
		int count =0;
		for (int[] arrays : array) {
			for (int i : arrays) {
				num += i;
				count++;

			}

		}
		System.out.println("合計値：" + num);
		System.out.println("値数：" + count);
		System.out.println("平均値："+(num/count));
	}
}
