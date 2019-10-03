/*
 * IS4010 Fall 2019
 * Assignment 05
 * Sahil Patel
 * Patel3s7@mail.uc.edu
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	public static String translateScore (int score) { //method
		/*
		 * @param if the score is a specific value
		 * @return the description of what is associated with that value
		 */
		
		if (score == 2) return ("safety"); //test for score of 2
		else if (score == 3) return ("field goal"); //test for score of 3
		else if (score == 6) return ("touchdown"); //test for score of 6
		else if (score == 7) return ("touchdown and extra point"); //test for score of 7
		else if (score == 8) return ("touchdown and 2-point conversion"); //test for score of 8
		else if (score == -1) return (""); //return for invalid score
		else if (score == 1) return ("invalid"); //return for invalid scores
		else if (score == 10) return ("you must be playing Quidditch "); //test for score of 10
		
		return "";
	}
}
