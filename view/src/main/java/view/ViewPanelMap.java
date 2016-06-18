package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IElement;
import contract.IModel;

public class ViewPanelMap extends JPanel{
	
	private ArrayList<IElement> element;
	
	public ViewPanelMap(IModel model){
		element = model.loadStage(2);
		this.setLayout(new GridLayout(12, 20));
		this.setBackground(Color.black);
	}
	
	public void updateMap(){
		this.removeAll();
		
		element = orderElement();

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
}
