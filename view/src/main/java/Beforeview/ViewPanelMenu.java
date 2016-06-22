package Beforeview;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import contract.IController;
import contract.IView;

public class ViewPanelMenu extends JPanel{
	
	ButtonGroup texture;
	JRadioButton texture1;
	JRadioButton texture2;
	JPanel texturePan;
	
	ButtonGroup stage;
	JRadioButton stage1;
	JRadioButton stage2;
	JRadioButton stage3;
	JRadioButton stage4;
	JRadioButton stage5;
	JPanel stagePan;
	
	IView view;
	IController controller;
	
	public ViewPanelMenu(){
		texture = new ButtonGroup();
		texture1 = new JRadioButton("Original texture");
		texture2 = new JRadioButton("Pokemon texture");
		texturePan = new JPanel();
		
		stage = new ButtonGroup();
		stage1 = new JRadioButton("Stage 1");
		stage2 = new JRadioButton("Stage 2");
		stage3 = new JRadioButton("Stage 3");
		stage4 = new JRadioButton("Stage 4");
		stage5 = new JRadioButton("Stage 5");
		stagePan = new JPanel();
		
		createMenu();
	}
	
	public void createMenu(){
		
		texture1.setSelected(true);
		texture.add(texture1);
		texture.add(texture2);
		
		stage1.setSelected(true);
		stage.add(stage1);
		stage.add(stage2);
		stage.add(stage3);
		stage.add(stage4);
		stage.add(stage5);
		
		texturePan.setBorder(BorderFactory.createTitledBorder("Pictures's pack :"));
		stagePan.setBorder(BorderFactory.createTitledBorder("ID's stage :"));
		
		stagePan.setLayout(new BoxLayout(stagePan, BoxLayout.PAGE_AXIS));
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		texturePan.add(texture1);
		texturePan.add(texture2);
		stagePan.add(stage1);
		stagePan.add(stage2);
		stagePan.add(stage3);
		stagePan.add(stage4);
		stagePan.add(stage5);
		
		this.add(texturePan);
		this.add(stagePan);

	}
}
