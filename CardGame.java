// -----------------------------------------------------
// Assignment 2
// Question: 1 part 1
// Written by: Anthony Chraim, 40091014
// ----------------------------------------------------- 

//This is the beginning of the CardGame class. The class is the sub class of the Game class. 
//It contains a default constructor, a parametrized constructor, a copy construcor, an equals method, a toString methods as well as accessors and mutators.

package Fifth;
import First.Game;

public class CardGame extends Game{

	int numberOfCards, numCardTypes;
	
	public CardGame () {
		this (0, 0);
	}
	
	//parametrized constructor calling default super()
	public CardGame(int numberOfCards, int numCardTypes) {
		this.numCardTypes = numCardTypes;
		this.numberOfCards = numberOfCards;
	}
	
	//parametrized constructor calling parametrized super()
	public CardGame (String name, int numPlayers, int gameTime, int numberOfCards, int numCardTypes) {
		super(name, numPlayers, gameTime);
		this.numberOfCards = numberOfCards;
		this.numCardTypes = numCardTypes;
	}
	
	//copy constructor?
	public CardGame (CardGame cg) {
		super(cg);
		this.numberOfCards = cg.numberOfCards;
		this.numCardTypes = cg.numCardTypes;
	}
	//equals method
	public boolean equals (CardGame cg) {
		if (this == cg)
			return true;
		if (this == null || this.getClass() != cg.getClass())
			return false;
		return (this.numberOfCards == cg.numberOfCards && this.numCardTypes == cg.numCardTypes);
	}
	
	//overriden toString method
	@Override
	public String toString() {
		return(super.getName() + " is a CardGame. It contains " + super.getNumPlayers() + " players, and the game time is " + super.getGameTime() +
				" minutes. The number of cards is " + this.numberOfCards + ", and the number of card types are " + this.numCardTypes + ".");
	}

	//setters and getters
	public int getNumberOfCards() {
		return numberOfCards;
	}

	public void setNumberOfCards(int numberOfCards) {
		this.numberOfCards = numberOfCards;
	}

	public int getNumCardTypes() {
		return numCardTypes;
	}

	public void setNumCardTypes(int numCardTypes) {
		this.numCardTypes = numCardTypes;
	}


}
