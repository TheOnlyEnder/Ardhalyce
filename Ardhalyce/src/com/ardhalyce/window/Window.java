package com.ardhalyce.window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.ardhalyce.bean.Scheda;
import com.ardhalyce.bean.customclasses.Origin;
import com.ardhalyce.main.Main;

public class Window extends JFrame {

	private JPanel c;
	private Scheda personaggio;
	private JButton bNext;

	public Window(Scheda personaggio) {

		this.personaggio = personaggio;
		bNext = new JButton("Next");

		this.setTitle("/creaPg");
		this.setVisible(true);
		this.setSize(500, 400);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel buttonBar = new JPanel();
		buttonBar.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		this.add(buttonBar, BorderLayout.NORTH);
		buttonBar.add(bNext);

		c = new JPanel();
		c.setSize(500, 350);
		this.add(c);
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

		page1();

	}

	private void page1() {
		c.removeAll();
		c.revalidate();
		c.repaint();

		JTextPane nameTitle = new JTextPane();
		nameTitle.setEditable(false);
		nameTitle.setText(("Nome:"));
		c.add(nameTitle);

		JTextField name = new JTextField(30);
		name.setText((personaggio.getName() != null) ? personaggio.getName() : "");
		c.add(name);

		JTextPane imageTitle = new JTextPane();
		imageTitle.setEditable(false);
		imageTitle.setText("Link Immagine:");
		c.add(imageTitle);

		JTextField image = new JTextField(30);
		image.setText((personaggio.getImage() != null) ? personaggio.getImage() : "");
		c.add(image);

		JTextPane sheetTitle = new JTextPane();
		sheetTitle.setEditable(false);
		sheetTitle.setText("Link scheda:");
		c.add(sheetTitle);

		JTextField sheet = new JTextField(30);
		sheet.setText((personaggio.getSheet() != null) ? personaggio.getSheet() : "");
		c.add(sheet);

		bNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!name.getText().isBlank() && !image.getText().isEmpty() && !sheet.getText().isBlank()) {
					personaggio.setName(name.getText());
					personaggio.setImage(image.getText());
					personaggio.setSheet(sheet.getText());
					bNext.removeActionListener(this);
					page2();
				}
			}
		});

	}

	private void page2() {

		this.getContentPane();
		c.removeAll();
		c.revalidate();
		c.repaint();

		String origini[] = { "", "Avalon", "Eredin" };
		JComboBox<String> origins = new JComboBox<String>(origini);
		origins.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					try {
						Origin t = new Origin(e.getItem().toString());
						personaggio.setOrigin(t);

						JComboBox<String> race = new JComboBox<String>(t.getRaces());
						c.add(race);

						c.add(separator());

						JComboBox<String> clas = new JComboBox<String>(t.getClasses());
						c.add(clas);

						c.add(separator());


						bNext.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {

								if (!race.getSelectedItem().toString().isBlank()
										&& !clas.getSelectedItem().toString().isBlank()) {

									personaggio.setRace(race.getSelectedItem().toString());
									personaggio.setMainClass(clas.getSelectedItem().toString());
									bNext.removeActionListener(this);

									page3();
								}
							}
						});

						c.revalidate();
						c.repaint();
					} catch (IOException e1) {
						e1.printStackTrace();
					}

			}
		});
		c.add(origins);
		c.add(separator());
	}

	private void page3() {
		c.removeAll();
		c.revalidate();
		c.repaint();
		
		JLabel lista = new JLabel();
		
		JList<String> skills = new JList<String>();
		for (sk iterable_element : iterable) {
			
		}
		

	}

	private JTextField separator() {
		JTextField x = new JTextField(200);
		x.setBackground(new Color(0, 0, 0, 0));
		x.setBorder(null);

		return x;
	}

}
