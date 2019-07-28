// -----------------------------------------------------
// Assignment 2
// Question: 1 part 1
// Written by: Anthony Chraim, 40091014
// ----------------------------------------------------- 

/**
* <h1>EducationalGame Class</h1>
*This is the beginning of the EducationalGame class. The class is the sub class of the VideoGame 
*class. It does not have any sub-class It contains a default constructor, a parametrized constructor, 
*a copy construcor, an equals method, a toString methods as well as accessors and mutators.
* <p>
*
* @author  Anthony Chraim
* @version 1.0
* @since   27/07/2019
*/

package Third;
import Second.VideoGame;

public class EducationalGame extends VideoGame{

	private String subjectLearnt;
	
	//default constructor
	public EducationalGame() {
		this("");
	}
	
	//parametrized constructor calling default super
	public EducationalGame(String subjectLearnt) {
		super();
		this.subjectLearnt = subjectLearnt;
	}
	
	//parametrized constructor calling parametrized super()
	public EducationalGame(String name, int numPlayers, int gameTime, int gamePrice, String gameStudio, Platform gamingPlatform, String subjectLearnt) {
		super(name, numPlayers, gameTime, gamePrice, gameStudio, gamingPlatform);
		this.subjectLearnt = subjectLearnt;	
	}
	
	//copy constructor
	public EducationalGame(EducationalGame eg) {
		super(eg);
		this.subjectLearnt = eg.subjectLearnt;
	}
	
	/**
	   * This method is used to determine if a certain EducationalGame object has the same 
	   * game name, number of players and game time, price gaming studio, gaming platform
	   * and subject learnt as the one passed in as a parameter
	   * 
	   * @param eg The only parameter it takes is another EducationalGame object
	   * @return boolean: The function returns true if a Game object has the
	   * same name, number of players and game time, price, game studio and 
	   * gaming platform and subject learnt as another, and false if it does not.
	   */
	
	public boolean equals(EducationalGame eg) {
		if(this == eg)
			return true;
		if(this == null || this.getClass() != eg.getClass())
			return false;
		return(this.getGamePrice() == eg.getGamePrice() && this.getGameStudio().equals(eg.getGameStudio()) && this.getGamingPlatform().equals(eg.getGamingPlatform())
				&& this.getName().equals(eg.getName()) && this.getNumPlayers() == eg.getNumPlayers() && this.getGameTime() == eg.getGameTime() 
				&& this.subjectLearnt.equals(eg.subjectLearnt));
	}
	
	//overriden toString method
	@Override
	public String toString() {
		return(super.getName() + " is an EdicationalGame. It contains " + super.getNumPlayers() + " players and the game time is " + super.getGameTime() +
				" minutes. The price of this game is " + super.getGamePrice() + "$. It is developped by " + super.getGameStudio() + ". The game is played on " + 
				super.getGamingPlatform() + ". The subject learnt in this game is " + this.subjectLearnt + ". ");
	}

	//setters and getters
	public String getSubjectLearnt() {
		return subjectLearnt;
	}

	public void setSubjectLearnt(String subjectLearnt) {
		this.subjectLearnt = subjectLearnt;
	}
	
	
	
	
}
