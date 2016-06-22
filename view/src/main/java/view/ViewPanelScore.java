package view;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IModel;

public class ViewPanelScore extends JPanel{
	
	/**SerialVersionUID of the panel **/
	private static final long serialVersionUID = 1L;
	
	/** 	Actual score of the player**/
	private int score;
	
	/** The model **/
	private IModel model;
	
	/**The JLabel which show the score**/
	private JLabel showScore;
	/**The JLabel which shows the number of monster stil alive **/
	private JLabel monsterAlive;
	/**The JLabel which shows the number of bonus remaining on the level **/
	private JLabel bonusRemaining;
	
	/*
	 * the constructor ViewPanelScore
	 * @param model
	 * 	The model
	 * 	Build the PanelScore
	 */
	public ViewPanelScore(IModel model){	
	this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
	this.setBackground(Color.black);
	this.model = model;
	showScore = new JLabel("Score : " + score);
	monsterAlive = new JLabel("Monster alive : " + this.model.getMonsterNumber());
	bonusRemaining = new JLabel("Bonus remaining : " + this.model.getBonusNumber());
	
	showScore.setForeground(Color.orange);
	monsterAlive.setForeground(Color.orange);
	bonusRemaining.setForeground(Color.orange);
	
	}
	
	/** the method updateScore
	 * 	Update the information of the panel
	 */
	public void updateScore(){
		this.removeAll();
		showScore.setText("Score : " + this.model.getScore());
		monsterAlive.setText("Monster(s) alive: " + this.model.getMonsterNumber());
		bonusRemaining.setText("Bonus remaining : " + this.model.getBonusNumber());
		this.add(showScore);
		this.add(Box.createGlue());
		this.add(monsterAlive);
		this.add(Box.createGlue());
		this.add(bonusRemaining);
	}
	
}
