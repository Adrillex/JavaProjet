package view;

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
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(IModel model) {
		this.setLayout(new GridLayout(12, 20));
		this.setBackground(Color.black);

		element = model.loadStage(1);
		int k = 0;
		for (int j = 0; j < 12; j++ ) {
			for (int i = 0; i < 20; i++) {
				if (element.get(k).getPosX() == i && element.get(k).getPosY() == j){
						ImageIcon icon = new ImageIcon(element.get(k).getSprite());
						JLabel img = new JLabel(icon);
						this.add(img);
						if (k == 26){
							System.out.println(element.get(k).getPosX() + " - " + element.get(k).getPosY());
						}
						if (k == element.size()-1)
							break;
						k++;

				}
				else {
					JPanel pan = new JPanel();
					pan.setBackground(Color.BLACK);
					this.add(pan);
				}
			}
		}
	}
	public ViewPanel updatePanel(IModel model){
		element = orderElement();

		this.removeAll();

		int k = 0;
		for (int j = 0; j < 12; j++ ) {
			for (int i = 0; i < 20; i++) {
				if (element.get(k).getPosX() == i && element.get(k).getPosY() == j){
					ImageIcon icon = new ImageIcon(element.get(k).getSprite());
					JLabel img = new JLabel(icon);
					this.add(img);
					k++;
					if(k == element.size()-1)
						break;	
				}
				else {
					JPanel pan = new JPanel();
					pan.setBackground(Color.BLACK);
					this.add(pan);
				}			
			}
		}	
		return this;
	}
	
	public ArrayList<IElement> orderElement(){
		ArrayList<IElement> orderElement = new ArrayList<IElement>();
		int xMin = 0, yMin = 0;

		while(orderElement.size() != element.size()){
			for (IElement element : element) {
				int x = element.getPosX(), y = element.getPosY();
				if(x == xMin && y == yMin){
					orderElement.add(element);
					xMin = x;
					yMin = y;
				}
			}
			xMin++;
			if(xMin == 20){
				xMin = 0;
				yMin++;
			}
		}
		return orderElement;
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
