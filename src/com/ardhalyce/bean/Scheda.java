package com.ardhalyce.bean;

import com.ardhalyce.bean.customclasses.*;

public class Scheda {

	private String name;
	private String image;
	private String sheet;
	private Origin origin;
	private String race;
	private String myClass;

	private Skill[] skills;
	private short[] stats;

	private String backGrond;

	private int xp;
	private short level;
	private int[] money;
	
	public Scheda() {
		this.xp = 900;
		this.level = 3;
		this.money = new int[] { 0, 300, 0, 0 };
	}

	// get & set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getMyClass() {
		return myClass;
	}

	public void setMainClass(String mainClass) {
		this.myClass = mainClass;
	}

	public Skill[] getSkills() {
		return skills;
	}

	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}

	public short[] getStats() {
		return stats;
	}

	public void setStats(short[] stats) {
		this.stats = stats;
	}

	public String getBackGrond() {
		return backGrond;
	}

	public void setBackGrond(String backGrond) {
		this.backGrond = backGrond;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public short getLevel() {
		return level;
	}

	public void setLevel(short level) {
		this.level = level;
	}

	public int[] getMoney() {
		return money;
	}

	public void setMoney(int[] money) {
		this.money = money;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSheet() {
		return sheet;
	}

	public void setSheet(String sheet) {
		this.sheet = sheet;
	}

}
