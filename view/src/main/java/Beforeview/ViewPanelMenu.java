package Beforeview;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import contract.IController;
import contract.IView;

public class ViewPanelMenu extends JPanel{
	
	/**
	 * Default Serial VersionUID
	 */
	private static final long serialVersionUID = 1L;
	/** The texture choice**/
	ButtonGroup texture;
	/**The first texture button**/
	JRadioButton texture1;
	/**The second texture button **/
	JRadioButton texture2;
	/**The panel **/
	JPanel texturePan;
	
	/**The stages buttons**/
	ButtonGroup stage;
	/**Stage 1 button**/
	JRadioButton stage1;
	/**Stage 2 button**/
	JRadioButton stage2;
	/**Stage 3 button**/
	JRadioButton stage3;
	/**Stage 4 button**/
	JRadioButton stage4;
	/**Stage 5 button**/
	JRadioButton stage5;
	/**The panel **/
	JPanel stagePan;
	
	/**The view**/
	IView view;
	/**The controller**/
	IController controller;
	
	/**The constructor**/
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
	
	/** The game selection menu**/
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
