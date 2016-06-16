package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IElement;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements IElement{

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	
	
	public ArrayList<IElement> element;
	private GridBagConstraints gbc;
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel() {
		this.setLayout(new GridLayout(20, 12));
		this.setBackground(Color.black);
		
		gbc = new GridBagConstraints();
		for (IElement element : element) {
			ImageIcon icon = new ImageIcon(element.getSprite());
			JLabel img = new JLabel(icon);
			gbc.gridx = element.getPosX();
			gbc.gridy = element.getPosY();
			this.add(img, gbc);
		}
	}
	
	/*public void buildViewPanel(){
		
		//this.setLayout(new GridLayout());
		this.setBackground(Color.black);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 5;
		gbc.gridy = 5;
		ImageIcon icon = new ImageIcon("/arbre.png");
		JLabel img = new JLabel(icon);
		viewFrame.add(img);
		System.out.println("viewpanel");
		/*for (IElement element : element) {
		
		gbc.gridx = element.getPosX();
		gbc.gridy = element.getPosY();
		
		
		this.add(new JLabel(new ImageIcon(element.getSprite())), gbc);
		
		
		
	}*/
	

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
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
	@Override
	protected void paintComponent(final Graphics g) {
		
		/*for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				g.setColor(Color.black);
				g.fillRect(i, j, 5, 5);
			}
		}
		for (IElement element : element) {
			
			gbc.gridx = element.getPosX();
			gbc.gridy = element.getPosY();
			
			g.drawImage(element.getSprite(), element.getPosX(), element.getPosY(), null);
			
		}*/
		
		
	}

	public int getPosX() {
		return 0;
	}

	public int getPosY() {
		return 0;
	}

	public BufferedImage getSprite() {
		return null;
	}
}
