// -----------------------------------------------------
// Assignment 2
// Question: 1 part 2
// Written by: Anthony Chraim, 40091014
// ----------------------------------------------------- 

/**
* <h1>driverPart2 Class</h1>
*This is the beginning of the driverPart2 class. this class declares an array of 14 Game objects and prints them out.
*each one of the objects are defined using their own class and polymorphism. They all use their own toStrings methods.
*the array of abjects is then copied using the copy constructur into another array of objects.
*all the attributes from the classes are private. Accessors and mutators are used to have reach them.
*the classes are also compared using et equals method
* <p>
*
* @author  Anthony Chraim
* @version 1.0
* @since   27/07/2019
*/

import Fifth.CardGame;
import First.Game;
import Fourth.BoardGame;
import Second.VideoGame;
import Second.VideoGame.Platform;
import Third.EducationalGame;
import Third.RPGGame;

public class driverPart2 {
	
	//declaring static variables
	public static int mostPlayerGameIndex, leastTimeGameIndex, sameStudioGameIndex;
	public static Game[] copyArr;

	/**
	   * This method is used to determine the game that has the most players by
	   * going through the array and storing the game with the most players in a temporary
	   * variable (mostPlayersGame). At the end of the arry, it returns that variable.
	   * 
	   * @param gameArr The only parameter it takes is the array of Games
	   * @return it returns the game with the most players (numPlayers)
	   */
	public static Game mostPlayers(Game[] gameArr) {
		Game mostPlayersGame = gameArr[0];
		int mostPlayers = 0;
		for (int i = 0; i < gameArr.length -1; i++) {
			if(gameArr[i].getNumPlayers() > mostPlayers) {
				mostPlayersGame = gameArr[i];
				mostPlayerGameIndex = i;
				mostPlayers = gameArr[i].getNumPlayers();
			}		
		}
		return mostPlayersGame;
	}
	
	 /**
	   * This method is used to determine the game that has the least play time by
	   * going through the array and storing the game with the most players in a temporary
	   * variable (LeastTimeGame). This array in initially initailiased at 10000000 since no 
	   * game lasts that long. At the end of the arry, it returns that variable.
	   * 
	   * @param gameArr The only parameter it takes is the array of Games
	   * @return it returns the game with the least game time (gameTime) 
	   */
	public static Game leastTime(Game[] gameArr) {
		Game leastTimeGame = gameArr[0];
		int leastTime = 100000000;
		for (int i = 0; i < gameArr.length -1; i++) {
			if(gameArr[i].getGameTime() < leastTime){
				leastTimeGame = gameArr[i];
				leastTimeGameIndex = i;
				leastTime = gameArr[i].getGameTime();
			}
		}
		return leastTimeGame;
	}

	 /**
	   * This method is used to determine the games that have the same studio as the one passed as a parameter
	   * by going through the array and storing the games with the same studio in a temporary Array and printing them out afterwards
	   * 
	   * @param gameArr Array of games
	   * @param studio string containing the name of the gaming studio
	   * @return this method does not return anything, it prints out the results instead 
	   */
	public static void sameStudio(Game[] gameArr, String studio) {
		VideoGame[] sameStudio =new VideoGame [gameArr.length];
		for (int i = 0; i < gameArr.length; i++) {
			if (gameArr[i] instanceof VideoGame) {
				VideoGame temp = (VideoGame)gameArr[i];
				if(temp.getGameStudio() == studio) 
						sameStudio[i] = temp;
			}
		}
		for (int i = 0; i < sameStudio.length; i++) {
			if(sameStudio[i]!= null)
			System.out.println(sameStudio[i]);
		}
	}
		
	 /**
	   *This method is used to copy the array of game objects into another identical array
	   *using the copy constructor of the appopriate class.
	   * 
	   * @param gameArr Array of games
	   * @return copyArr is the identical array of objects
	   */
	public static Game[] gameSimilarTo(Game[] gameArr){
		copyArr = new Game[gameArr.length];
		Class<? extends Game> objectClass;
		for (int i = 0; i < gameArr.length; i++) {
			objectClass = gameArr[i].getClass();
			if(objectClass == Game.class)
				copyArr[i] = new Game(gameArr[i]);
			else if (objectClass == VideoGame.class)
				copyArr[i] = new VideoGame ((VideoGame)gameArr[i]);
			else if (objectClass == EducationalGame.class)
				copyArr[i] = new EducationalGame((EducationalGame)gameArr[i]);
			else if (objectClass == RPGGame.class)
				copyArr[i] = new RPGGame((RPGGame)gameArr[i]);
			else if (objectClass == BoardGame.class)
				copyArr[i] = new BoardGame((BoardGame)gameArr[i]);
			else if (objectClass == CardGame.class)
				copyArr[i] = new CardGame((CardGame)gameArr[i]);
		}
		return copyArr;
	}

	public static void main(String[] args) {
		
		//welcome messaage
		System.out.println("Welcome to my (Anthony Chraim) gaming demographic program.\n" + 
							"---------------------------------------------------------\n");	
		
		//initializing the games that will be stored in the array
		Game uno = new CardGame("Uno", 4, 30, 52, 4);
		Game monopoly = new BoardGame("Monopoly", 4, 120, false);
		Game gta = new VideoGame("GTA", 1, 90, 80, "Rockstar", Platform.XBOXOne);
		Game jeopardy = new EducationalGame("Jeopardy", 4, 150, 0, "Television", Platform.IOS, "History");
		Game skyrim = new RPGGame("Elder Scrolls", 1, 240, 60, "Bethesda", Platform.PS4, "Imaginary");
		Game jenga = new BoardGame("Jenga", 6, 30, true);
		Game witcher = new RPGGame("The Witcher 3",1, 75, 50, "CD Projekt RED", Platform.XBOXOne, "Imaginary");
		Game soccer = new Game("Soccer", 11, 90);
		Game strikingVipers = new VideoGame("Striking Vipers", 2, 45, 120, "Black Mirror", Platform.XBOXOne);
		Game math = new EducationalGame("Mathematica", 30, 60, 5, "matlab", Platform.ANDROID, "math");
		Game wow = new RPGGame("Wolrd of Warcraft", 100, 200, 30, "Blizzard", Platform.PS4, "Warcraft");
		Game cod = new VideoGame("Call of Duty", 1, 80, 70, "Activision", Platform.XBOXOne);
		Game fallout = new RPGGame("Fallout: New Vagas", 2, 25, 50, "Bethesda", Platform.PS4, "New Vega");
		Game witcher2 = new RPGGame("The Witcher 3",1, 75, 50, "CD Projekt RED", Platform.XBOXOne, "Imaginary");
		
		//initializing the array with the games
		Game[] gameArr = {uno, monopoly,gta, jeopardy, skyrim, jenga, witcher, soccer, strikingVipers, math, wow, cod, fallout, witcher2};
	
		//printing ou the original array
		System.out.println("This is the first array of Game");
		System.out.println("-------------------------------\n");
		for (int i = 0; i < gameArr.length; i++) {
			System.out.println(gameArr[i]);
		}
		
		//printing out the copy
		System.out.println("\nThis is the second array of Game");
		System.out.println("--------------------------------\n");
		for (int i = 0; i < gameSimilarTo(gameArr).length; i++) {
			System.out.println(gameSimilarTo(gameArr)[i]);
		}
		
		//explaination
		System.out.println("\nThe copying of the arrays was successful since they both output the same results. Since I downcasted every element of the " +
							"Game array to the proper class, the priciples of polymorphism apply and every object uses its own toString method.");
		
		//comparing games with the equals method
		System.out.println("\nAre monopoly and jenga the same game?");
		System.out.println(monopoly.equals(jenga)? "Yes":"No");
		System.out.println("\nAre witcher and witcher2 the same game?");
		System.out.println(witcher.equals(witcher2)? "Yes":"No");
		
		//printing out the games with the most amount of players, lest amount of gametime, and that are made by Bethesda Studio 
		System.out.println("\nThe game with the most players is " +mostPlayers(gameArr).getName() +" and is at index " + mostPlayerGameIndex +".\n" + mostPlayers(gameArr));
		System.out.println("\nThe game with the least number of game time is " + leastTime(gameArr).getName() +" and is at index " + leastTimeGameIndex +".\n" + leastTime(gameArr));
		System.out.println("\nThe games from Bethesda studio assosiation are :\n");
		sameStudio(gameArr, "Bethesda");
		
		System.out.println("\nThis is the end of the program");
			
		//end of the program
	}
		
}
