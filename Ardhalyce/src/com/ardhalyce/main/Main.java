package com.ardhalyce.main;

import javax.swing.SwingUtilities;

import com.ardhalyce.bean.Scheda;
import com.ardhalyce.bean.customclasses.*;
import com.ardhalyce.window.Window;

public class Main {

	public static Skill skills[];

	public static void main(String[] args) {

		skills = setSkills();

		SwingUtilities.invokeLater(new Runnable() {

			Scheda personaggio = new Scheda();

			@Override
			public void run() {
				new Window(personaggio);

			}
		});

	}

	private static Skill[] setSkills() {

		String names[] = new String[] { "Acrobatics", "Animal Handling", "Arcana", "Athletics", "Deception", "History",
				"Insight", "Intimidation", "Investigation", "Medicine", "Nature", "Perception", "Performance",
				"Persuasion", "Religion", "Sleight of Hand", "Stealth", "Survival" };

		Skill skills[] = new Skill[names.length];

		for (int i = 0; i < names.length; i++)
			skills[i] = new Skill(names[i]);

		return skills;
	}

	public static void setProficent(String proficencies, Skill[] skills) {

		for (int i = 0; i < skills.length; i++)
			skills[i].setProeficent(proficencies.contains(skills[i].getName()));
	}

	// non utilizzato

//	private static void setClasses() throws IOException {
//		List<MainClassInutile> obsoleto = new ArrayList<MainClassInutile>();
//
//		File dir = new File("src\\classesList");
//
//		File[] directoryListing = dir.listFiles();
//		if (directoryListing != null) {
//			for (File child : directoryListing) {
//				BufferedReader br = new BufferedReader(new FileReader(child));
//				try {
//					StringBuilder sb = new StringBuilder();
//					String line = br.readLine();
//
//					while (line != null) {
//						sb.append(line);
//						sb.append(System.lineSeparator());
//						line = br.readLine();
//					}
//					String everything = sb.toString();
//					obsoleto.add(new MainClassInutile(everything));
//				} finally {
//					br.close();
//				}
//			}
//		} else {
//			System.out.println("errore file non trovato");
//		}
//	};

}
