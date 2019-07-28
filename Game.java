// -----------------------------------------------------
// Assignment 2
// Question: 1 part 1
// Written by: Anthony Chraim, 40091014
// ----------------------------------------------------- 

//This is the beginning of the Game class. The class is the base class of all the others. It contains a default constructor,
//a parametrized constructor, a copy construcor, an equals method, a toString methods as well as accessors and mutators.
package First;
public class Game {

	private String name;
	private int numPlayers, gameTime;
	
	//default constructor
	public Game() {
		this (null, 0, 0);
	}
	
	//parametrized constructor
	public Game(String name, int numPlayers, int gameTime) {
		this.name = name;
		this.numPlayers = numPlayers;
		this.gameTime = gameTime;
	}
	
	//copy constructor
	public Game (Game game) {
		this.name = game.name;
		this.numPlayers = game.numPlayers;
		this.gameTime = game.gameTime;
	}
	
	//equals method
	public boolean equals(Game game) {
		if (this == game)
			return true;
		if (game == null || this.getClass() != game.getClass())
			return false;	
		return (this.name == game.name && this.numPlayers == game.numPlayers && this.name.equals(game.name));
	}

	//toString method
	public String toString() {
		return (name + " is a Game. It contains " + numPlayers + " players and the game time is " + gameTime + " minutes. ") ;
	}

	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public int getGameTime() {
		return gameTime;
	}

	public void setGameTime(int gameTime) {
		this.gameTime = gameTime;
	}
	
	
}
