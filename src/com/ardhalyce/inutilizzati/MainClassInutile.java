package com.ardhalyce.inutilizzati;

public class MainClassInutile {

	private String name;
	private String altArmor;
	private String hitDice;
	private String initBonus;
	private String bonusHp;
	private String proficencies;
	private String firstExlusive;
	private String addMulti;
	private String castingTipe;
	private String castingAbility;
	private String speedBuff;

	public MainClassInutile(String testoFile) {

		String splitted[] = testoFile.split("\n");

		for (int i = 0; i < splitted.length; i++)
			splitted[i] = splitted[i].replaceAll("[^a-z||A-Z||0-9]", "");

		this.name = splitted[0];
		this.altArmor = splitted[2];
		this.hitDice = splitted[3];
		this.initBonus = splitted[4];
		this.bonusHp = splitted[5];
		this.proficencies = splitted[6];
		this.firstExlusive = splitted[7];
		this.addMulti = splitted[8];
		this.castingTipe = splitted[9];
		this.castingAbility = splitted[10];
		this.speedBuff = splitted[11];
	}

	@Override
	public String toString() {
		return "MainClass\n[name=" + name + ", altArmor=" + altArmor + ", hitDice=" + hitDice + ", initBonus="
				+ initBonus + ", bonusHp=" + bonusHp + ", proficencies=" + proficencies + ", firstExlusive="
				+ firstExlusive + ", addMulti=" + addMulti + ", castingTipe=" + castingTipe + ", castingAbility="
				+ castingAbility + ", speedBuff=" + speedBuff + "]";
	}

	// set &get
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAltArmor() {
		return altArmor;
	}

	public void setAltArmor(String altArmor) {
		this.altArmor = altArmor;
	}

	public String getHitDice() {
		return hitDice;
	}

	public void setHitDice(String hitDice) {
		this.hitDice = hitDice;
	}

	public String getInitBonus() {
		return initBonus;
	}

	public void setInitBonus(String initBonus) {
		this.initBonus = initBonus;
	}

	public String getBonusHp() {
		return bonusHp;
	}

	public void setBonusHp(String bonusHp) {
		this.bonusHp = bonusHp;
	}

	public String getProficencies() {
		return proficencies;
	}

	public void setProficencies(String proficencies) {
		this.proficencies = proficencies;
	}

	public String getFirstExlusive() {
		return firstExlusive;
	}

	public void setFirstExlusive(String firstExlusive) {
		this.firstExlusive = firstExlusive;
	}

	public String getAddMulti() {
		return addMulti;
	}

	public void setAddMulti(String addMulti) {
		this.addMulti = addMulti;
	}

	public String getCastingTipe() {
		return castingTipe;
	}

	public void setCastingTipe(String castingTipe) {
		this.castingTipe = castingTipe;
	}

	public String getCastingAbility() {
		return castingAbility;
	}

	public void setCastingAbility(String castingAbility) {
		this.castingAbility = castingAbility;
	}

	public String getSpeedBuff() {
		return speedBuff;
	}

	public void setSpeedBuff(String speedBuff) {
		this.speedBuff = speedBuff;
	}

}
