package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel {

	private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
	private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);

	public Teclado() {

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);

		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		// LINHA 1
		c.gridwidth = 3;
		adicionartBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		adicionartBotao("/", COR_LARANJA, c, 3, 0);

		// LINHA 2
		adicionartBotao("7", COR_CINZA_CLARO, c, 0, 1);
		adicionartBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adicionartBotao("9", COR_CINZA_CLARO, c, 2, 1);
		adicionartBotao("*", COR_LARANJA, c, 3, 1);

		// LINHA 3
		adicionartBotao("4", COR_CINZA_CLARO, c, 0, 2);
		adicionartBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adicionartBotao("6", COR_CINZA_CLARO, c, 2, 2);
		adicionartBotao("-", COR_LARANJA, c, 3, 2);

		// LINHA 4
		adicionartBotao("1", COR_CINZA_CLARO, c, 0, 3);
		adicionartBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adicionartBotao("3", COR_CINZA_CLARO, c, 2, 3);
		adicionartBotao("+", COR_LARANJA, c, 3, 3);
		// LINHA 5
		c.gridwidth =2;
		adicionartBotao("0", COR_CINZA_CLARO, c, 0, 4);
		c.gridwidth = 1;
		adicionartBotao(",", COR_CINZA_CLARO, c, 2, 4);
		adicionartBotao("=", COR_LARANJA, c, 3, 4);


	}

	private void adicionartBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {

		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		add(botao, c);

	}
}
