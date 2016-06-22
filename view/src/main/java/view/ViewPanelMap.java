package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IElement;
import contract.IModel;
import contract.Permeability;

public class ViewPanelMap extends JPanel{
	
	/** attribute serialVersionUID **/
	private static final long serialVersionUID = 1L;
	private ArrayList<IElement> elements;
	IModel model = null;
	boolean t = false;
	IElement temp = null;
	
	/** 
	 * the constructor ViewPanelMap
	 * @param model
	 * 	the model
	 * 	show the actual map
	 * @param stage 
	 */
	public ViewPanelMap(IModel model, int stage){
		this.model = model;
		elements = model.loadStage(stage);
		this.setLayout(new GridLayout(12, 20));
		this.setBackground(Color.black);
	}
	
	/**
	 * the method updateMap
	 * Update all information about the map
	 */
	public void updateMap(){
		this.removeAll();
		elements = orderElement();
		int k = 0;
		for (int j = 0; j < 12; j++ ) {
			for (int i = 0; i < 20; i++) {
				if (elements.get(k).getPermeability() != Permeability.HERO && elements.get(k).getPermeability() != Permeability.KILLING && elements.get(k).getPosX() == elements.get(k+1).getPosX() && elements.get(k).getPosY() == elements.get(k+1).getPosY()) {
					k++;
				}
				else if (k>10) {
					if (elements.get(k).getPermeability() != Permeability.HERO && elements.get(k).getPermeability() != Permeability.KILLING && elements.get(k).getPosX() == elements.get(k-1).getPosX() && elements.get(k).getPosY() == elements.get(k-1).getPosY()) {
						k++;
					}
				}
				if(elements.get(k).getState() == false){
					k++;
				}
				if (elements.get(k).getPosX() == i && elements.get(k).getPosY() == j){
					ImageIcon icon = new ImageIcon(elements.get(k).getSprite());
					JLabel img = new JLabel(icon);
					this.add(img);
					k++;
					if(k == elements.size()-1)
						break;	
				}
				else {
					JPanel pan = new JPanel();
					pan.setBackground(Color.BLACK);
					this.add(pan);
				}
			}
		}
	}

	/**
	 * the method orderElement
	 * @return
	 * 	Arrange the arrayList elements
	 */
	public ArrayList<IElement> orderElement(){
		ArrayList<IElement> orderElement = new ArrayList<IElement>();
		int xMin = 0, yMin = 0, i = elements.size();
		while(orderElement.size() != i){
			for (IElement element : elements) {
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
}
