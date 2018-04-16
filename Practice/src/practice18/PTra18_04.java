/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> list = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				Player player = new Player();
				String[] players = line.split(",", 0);
				player.setPosition(players[0]);
				player.setName(players[1]);
				player.setCountry(players[2]);
				player.setTeam(players[3]);
				list.add(player);
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		//コレクションシャッフルを使用。
		Collections.shuffle(list);
		int GKct = 0;
		int DFct = 0;
		int MFct = 0;
		int FWct = 0;

		for (Player player : list) {

			switch (player.getPosition()) {
			case "GK":
				if (GKct < 1) {
					System.out.println(player);
					GKct++;
				}
				break;

			case "DF":
				if (DFct < 4) {
					System.out.println(player);
					DFct++;
				}
				break;

			case "MF":
				if (MFct < 4) {
					System.out.println(player);
					MFct++;
				}
				break;

			case "FW":
				if (FWct < 2) {
					System.out.println(player);
					FWct++;
				}
				break;
			}
		}
	}
}
