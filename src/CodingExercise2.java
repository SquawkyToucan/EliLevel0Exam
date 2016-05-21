/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

/* This comment is green. */
/** This one is blue! **/
public class CodingExercise2 {
public static void main(String[] args){
	String parseMoi = JOptionPane.showInputDialog("How old are you?");
	int parsedAge = Integer.parseInt(parseMoi);
	int yearBorn = 2016 - parsedAge;
	int couldBe = yearBorn - 1;
	JOptionPane.showMessageDialog(null, "You may have been born in " + yearBorn + " or you were born in " + couldBe + ".");
	if(parsedAge > 30){
		JOptionPane.showMessageDialog(null, "You are too old to use this program.");
	}
	else{
		JOptionPane.showMessageDialog(null, "You meet the age requirements for this program.");
		JOptionPane.showMessageDialog(null, "If you were over 30, you wouldn't be missing anything.");
	}
}
}
