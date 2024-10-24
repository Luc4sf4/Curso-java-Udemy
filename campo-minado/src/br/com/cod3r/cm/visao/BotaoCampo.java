package br.com.cod3r.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener {

	private final Color BG_PADRAO = new Color(182, 184, 184);
	private final Color BG_MARCADO = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);

	private Campo campo;

	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));

		// adendo, this se refere a própria classe
		addMouseListener(this);
		campo.registrarObservador(this);
	}

	@Override
	public void eventoOcorreu(Campo c, CampoEvento evento) {
		switch (evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloMarcar();
			break;
		default:
			aplicarEstiloPadrao();
		}

	}

	private void aplicarEstiloPadrao() {
		// TODO Auto-generated method stub

	}

	private void aplicarEstiloMarcar() {
		// TODO Auto-generated method stub

	}

	private void aplicarEstiloAbrir() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createLineBorder(Color.GRAY));

		switch (campo.minasNaVizinhanca()) {
		case 1: {
			setForeground(TEXTO_VERDE);
			break;
		}
		case 2: {
			setForeground(Color.blue);
			break;
		}
		case 3: {
			setForeground(Color.YELLOW);
			break;
		}
		case 4:
		case 5:
		case 6: {
			setForeground(Color.RED);
			break;
		}

		default:
			setForeground(Color.PINK);

		}
		String valor = !campo.vizinhacaSegura() ? campo.minasNaVizinhanca() + "" : "";
		setText(valor);
		
	}

	// Interface dos eventos do Mouse

	public void mousePressed(MouseEvent e) {
		// usuario clicou com o botao esquerdo
		if (e.getButton() == 1) {
			campo.abrir();
		} else {
			campo.alternarMarcacao();
		}
	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
