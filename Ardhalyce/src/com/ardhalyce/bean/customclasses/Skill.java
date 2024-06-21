package com.ardhalyce.bean.customclasses;

public class Skill {

	private String name;
	private boolean proeficent;
	private boolean expert;

	public Skill(String name) {

		this.name = name;
		this.proeficent = false;
		this.expert = false;
	}

	@Override
	public String toString() {
		String dent = (name.length() <= 7) ? "\t\t" : "\t";
		return name + dent + proeficent + " " + expert;
	}

	// get &set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isProeficent() {
		return proeficent;
	}

	public void setProeficent(boolean proeficent) {
		this.proeficent = proeficent;
	}

	public boolean isExpert() {
		return expert;
	}

	public void setExpert(boolean expert) {
		this.expert = expert;
	}

}
