package com.ardhalyce.bean.customclasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Origin {

	private String name;
	private String races[];
	private String classes[];

	public Origin(String name) throws IOException {

		this.name = name.replace("[^a-z||A-Z]","");

		// get races
		{
			File file = new File("src\\OriginsRaces\\" + name.toLowerCase());

			BufferedReader br = new BufferedReader(new FileReader(file));

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();

			races = everything.split(System.lineSeparator());
		}

		// get classe
		{
			File file = new File("src\\OriginsClasses\\" + name.toLowerCase());

			BufferedReader br = new BufferedReader(new FileReader(file));

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();

			classes = everything.split(System.lineSeparator());
		}

	}

	// set & get
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getRaces() {
		return races;
	}

	public void setRaces(String[] races) {
		this.races = races;
	}

	public String[] getClasses() {
		return classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}

}
