package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IElement;
import contract.IModel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel {
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	
	
	public ArrayList<IElement> element;
	private ViewPanelMap mapPan;
	private ViewPanelScore scorePan;
	

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(IModel model) {
		this.setLayout(new BorderLayout());
		mapPan = new ViewPanelMap(model);
		scorePan = new ViewPanelScore();
		this.add(mapPan, BorderLayout.CENTER);
		this.add(scorePan, BorderLayout.EAST);
	}
	
	public ViewPanel update(){
		mapPan.updateMap();
		scorePan.updateScore();
		return this;
	}
	
	

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	
}
