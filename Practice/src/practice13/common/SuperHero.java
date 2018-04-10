package practice13.common;

public class SuperHero extends Hero{


	public int attack() {
		return super.attack() + equipment.getAdditionalDamage();
	}

	private Item equipment;

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
	public Item getEquipment() {
		return this.equipment;
	}
}

/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */
