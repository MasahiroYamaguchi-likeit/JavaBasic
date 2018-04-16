package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Scanner scanner = new Scanner(System.in);
		Car[] cars = new Car[3];
		for (int i = 0; i < cars.length; i++) {
			System.out.println("------------------------------------");
			System.out.println((i + 1) + "台目");
			cars[i] = new Car();

			System.out.println("シリアル№、車体カラー、ガソリン量をカンマ区切りで入力してください");
			String line = scanner.nextLine();

			String[] inputInfo = line.split(",");

			cars[i].serialNo = Integer.parseInt(inputInfo[0]);
			cars[i].color = inputInfo[1];
			cars[i].gasoline = Integer.parseInt(inputInfo[2]);
		}

		final int distance = 300;

		for(int i = 0; i<cars.length; i++) {


		int count = 0;
		int total = 0;
		while(true) {
			int result = cars[i].run() ;
			count++ ;

			if(result==-1) {
				System.out.println(cars[i].color + "は目的地に到達できませんでした");
				break;
			}
			total += result;
			if(distance <= total) {
				System.out.println(cars[i].color + "は目的地にまで"+ count +"時間かかりました。残りのガソリンは、"+ cars[i].gasoline +"リットルです");
				break;
				}
			}
		}
	}
}
