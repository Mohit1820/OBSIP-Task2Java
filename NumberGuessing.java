import javax.swing.JOptionPane;

public class NumberGuessing {
public static void main(String[] args) {

        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        
System.out.println("The correct guess would be " + computerNumber);
        int count = 1;
        int score=0;
 
int i=3;
        while (userAnswer != computerNumber&&count<5)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count,score)+"\nAttempts left:"+i);
count++;
            i--;
            }
        if(userAnswer == computerNumber)
        JOptionPane.showMessageDialog(null, "YOU WIN!!");
        JOptionPane.showMessageDialog(null, "Game over!!");
        
    }
public static String determineGuess(int userAnswer, int computerNumber, int count,int score){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid\n Score:"+score;
        }
        else if (userAnswer == computerNumber ){
        score=10;
            return "Correct!\nTotal Guesses: " + count+"\nScore="+score;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nAttempt no: " + count+"\nScore="+score;
        }
else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nAttempt no: " + count+"\nScore="+score;
        }
        else {
            return "Your guess is incorrect\nAttempt no: " + count+"\nScore="+score;
        }
    }

}
