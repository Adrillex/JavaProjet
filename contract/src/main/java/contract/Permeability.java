package contract;

/* The enum Permeability 
 * Used to know a type of element*/

public enum Permeability {
	BLOCKING, //It blocks everyone
	PENETRABLE, //penetrable by the player, blocking the monsters
	KILLING, //things that kill the player
	KILLER, //thing that kill the monsters
	HERO; //thing that is the hero
}
