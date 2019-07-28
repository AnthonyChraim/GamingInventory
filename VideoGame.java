// -----------------------------------------------------
// Assignment 2
// Question: 1 part 1
// Written by: Anthony Chraim, 40091014
// ----------------------------------------------------- 

//This is the beginning of the VideoGame class. The class is the sub class of the Game class, and the super class of EducationalGames and RPGGames. 
//It contains a default constructor, a parametrized constructor, a copy construcor, an equals method, a toString methods as well as accessors and mutators.

package Second;
import First.Game;

public class VideoGame extends Game {

	private int gamePrice;
	private String gameStudio;
	private String gamingPlatform;
	enum gamingPlatform {XBOXOne, PS4, IOS, ANDROID}
	
	//default constructor
	public VideoGame () {
		this (0, null, null);
	}
	
	//parametrized constructor calling default super()
	public VideoGame(int gamePrice, String gameStudio, String gamingPlatform) {
		super();
		this.gamePrice = gamePrice;
		this.gameStudio = gameStudio;
		this.gamingPlatform = gamingPlatform;
	}
	
	//parametrized constructor calling parametrized super()
	public VideoGame (String name, int numPlayers, int gameTime, int gamePrice, String gameStudio,  String gamingPlatform) {
		super(name, numPlayers, gameTime);
		this.gamePrice = gamePrice;
		this.gameStudio = gameStudio;
		this.gamingPlatform = gamingPlatform;
	}
	
	//copy constructor?
	public VideoGame (VideoGame vg) {
		super(vg);
		this.gamePrice = vg.gamePrice;
		this.gameStudio = vg.gameStudio;
		this.gamingPlatform = vg.gamingPlatform;
	}
	//equals method
	public boolean equals (VideoGame vg) {
		if (this == vg)
			return true;
		if (this == null || this.getClass() != vg.getClass())
			return false;
		return (this.gamePrice == vg.gamePrice && this.gameStudio.equals(vg.gameStudio) && this.gamingPlatform.equals(gamingPlatform));
	}
	
	//overriden toString method
	@Override
	public String toString() {
		return(super.getName() + " is a VideoGame. It contains " + super.getNumPlayers() + " players and the game time is " + super.getGameTime() +
				" minutes. The price of this game is " + this.gamePrice + "$. It is developped by " + this.gameStudio + ". The game is played on " + this.gamingPlatform);
	}

	//setters and getters
	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

	public String getGameStudio() {
		return gameStudio;
	}

	public void setGameStudio(String gameStudio) {
		this.gameStudio = gameStudio;
	}

	public String getGamingPlatform() {
		return gamingPlatform;
	}

	public void setGamingPlatform(String gamingPlatform) {
		this.gamingPlatform = gamingPlatform;
	}
	
	
	
}
