// -----------------------------------------------------
// Assignment 2
// Question: 1 part 1
// Written by: Anthony Chraim, 40091014
// ----------------------------------------------------- 

/**
* <h1>RPGGame Class</h1>
*This is the beginning of the RPGGame class. The class is the sub class of the VideoGame class. 
*It does not have any sub-class .It contains a default constructor, a parametrized constructor, 
*a copy construcor, an equals method, a toString methods as well as accessors and mutators.
* <p>
*
* @author  Anthony Chraim
* @version 1.0
* @since   27/07/2019
*/

package Third;
import Second.VideoGame;

public class RPGGame extends VideoGame{

	String gameWorld;
	
	//default constructor
		public RPGGame() {
			this("");
		}
		
		//parametrized constructor calling default super
		public RPGGame(String gameWorld) {
			super();
			this.gameWorld = gameWorld;
		}
		
		//parametrized constructor calling parametrized super()
		public RPGGame(String name, int numPlayers, int gameTime, int gamePrice, String gameStudio, Platform gamingPlatform, String gameWorld) {
			super(name, numPlayers, gameTime, gamePrice, gameStudio, gamingPlatform);
			this.gameWorld = gameWorld;	
		}
		
		//copy constructor?
		public RPGGame(RPGGame rg) {
			super(rg);
			this.gameWorld = rg.gameWorld;
		}
		
		/**
		   * This method is used to determine if a certain RPGGame object has the same 
		   * game name, number of players and game time, price gaming studio, gaming platform
		   * and game world as the one passed in as a parameter
		   * 
		   * @param rg The only parameter it takes is another RPGGame object
		   * @return boolean: The function returns true if a Game object has the
		   * same name, number of players and game time, price, game studio and 
		   * gaming platform and game world as another, and false if it does not.
		   */
				public boolean equals(RPGGame rg) {
			if(this == rg)
				return true;
			if(this == null || this.getClass() != rg.getClass())
				return false;
			return((this.getGamePrice() == rg.getGamePrice() && this.getGameStudio().equals(rg.getGameStudio()) && this.getGamingPlatform().equals(rg.getGamingPlatform())
					&& this.getName().equals(rg.getName()) && this.getNumPlayers() == rg.getNumPlayers() && this.getGameTime() == rg.getGameTime() &&
					this.gameWorld.equals(rg.gameWorld)));
		}
		
		//overriden toString method
		@Override
		public String toString() {
			return(super.getName() + " is an RPGGame. It contains " + super.getNumPlayers() + " players and the game time is " + super.getGameTime() +
					". The price of this game is " + super.getGamePrice() + "$. It is developped by " + super.getGameStudio() + ". The Game is played on " + 
					super.getGamingPlatform() + ". The world in this game is " + this.gameWorld + ". ");
		}

		//setters and getters
		public String getgameWorld() {
			return gameWorld;
		}

		public void setgameWorld(String gameWorld) {
			this.gameWorld = gameWorld;
		}
		
}
