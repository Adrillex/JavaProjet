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
	
	private ArrayList<IElement> elements;
	
	public ViewPanelMap(IModel model){
		elements = model.loadStage(5);
		this.setLayout(new GridLayout(12, 20));
		this.setBackground(Color.black);
	}
	
	public void updateMap(){
		this.removeAll();
		
		elements = orderElement();
		IElement temp = null;
		int k = 0;
		for (int j = 0; j < 12; j++ ) {
			for (int i = 0; i < 20; i++) {
				if (elements.get(k).getPosX() == i && elements.get(k).getPosY() == j){
					if(elements.get(k).getState() == false){
						elements.remove(elements.get(k));
						updateMap();
					}
					else{
					ImageIcon icon = new ImageIcon(elements.get(k).getSprite());
					JLabel img = new JLabel(icon);
					this.add(img);
					k++;
					if(k == elements.size()-1)
						break;	
					}
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
		IElement temp = null;
		int xMin = 0, yMin = 0, i = elements.size();
		while(orderElement.size() != i){
			for (IElement element : elements) {
			/*	if(element.getState() == false)
				{
					temp = element;
				}
				else{*/
					int x = element.getPosX(), y = element.getPosY();
					if(x == xMin && y == yMin){
						orderElement.add(element);
						xMin = x;
						yMin = y;
					}
				//}
			}
			xMin++;
			if(xMin == 20){
				xMin = 0;
				yMin++;
			}
		}
	/*	orderElement.remove(temp);
		elements.remove(temp);*/
		return orderElement;
	}
}
