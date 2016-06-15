package model;

public enum Permeability {
	BLOCKING, //It blocks everyone
	PENETRABLE, //penetrable by the player, blocking the monsters
	KILLING, //things that kill the player
	KILLER; //thing that kill the monsters
}
