package view;

import java.awt.BorderLayout;

import java.util.ArrayList;
import java.util.Observable;

import javax.swing.JPanel;

import contract.IElement;
import contract.IModel;

/**
 * The Class ViewPanel.
 *
 * @author group 10
 */
class ViewPanel extends JPanel {
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	
	/** The ArrayList of elements **/
	public ArrayList<IElement> element;
	
	/**The map Panel **/
	private ViewPanelMap mapPan;
	
	/**The score panel **/
	private ViewPanelScore scorePan;
	

	/**
	 * Instantiates a new view panel.
	 *
	 * @param model
	 *          the model
	 * @param stage 
	 */
	public ViewPanel(IModel model, int stage) {
		this.setLayout(new BorderLayout());
		mapPan = new ViewPanelMap(model, stage);
		scorePan = new ViewPanelScore(model);
		this.add(mapPan, BorderLayout.CENTER);
		this.add(scorePan, BorderLayout.SOUTH);
	}
	
	/**
	 * Update all panels
	 * @return
	 * 	return the panel
	 */
	public ViewPanel update(){
		mapPan.updateMap();
		scorePan.updateScore();
		return this;
	}
}
