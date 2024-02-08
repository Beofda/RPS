//Rock, Paper, Scissors
import java.util.Scanner;
import java.util.Random;
public class rpsGame
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   Random random = new Random();
   int computerWins = 0;
   int humanWins = 0;
   int ties = 0;
   String userResponse;
   String computerChoice = "";
   while(true)
   {
   System.out.println("Rock, Paper, Scissors, shoot: what is your choice (r, p, s)");
   userResponse = input.next();
   int computerNumber = random.nextInt(3);
   if(computerNumber == 0)
   computerChoice = "r";
   if(computerNumber == 1)
   computerChoice = "p";
   if(computerNumber == 2)
   computerChoice = "s";
   if(computerChoice.equals("r") && userResponse.equals("r"))
   {
   System.out.println("It is a tie");
   ties = ties +1;
   }
   if(computerChoice.equals("r") && userResponse.equals("s"))
   {
   System.out.println("You lost");
   computerWins = computerWins + 1;
   }
   if(computerChoice.equals("r") && userResponse.equals("p"))
   {
   System.out.println("You won");
   humanWins = humanWins + 1;
   }
   if(computerChoice.equals("p") && userResponse.equals("p"))
   {
   System.out.println("It is a tie");
   ties = ties +1;
   }
   if(computerChoice.equals("p") && userResponse.equals("r"))
   {
   System.out.println("You lost");
   computerWins = computerWins + 1;
   }
   if(computerChoice.equals("p") && userResponse.equals("s"))
   {
   System.out.println("You won");
   humanWins = humanWins + 1;
   }
   if(computerChoice.equals("s") && userResponse.equals("s"))
   {
   System.out.println("It is a tie");
   ties = ties +1;
   }
   if(computerChoice.equals("s") && userResponse.equals("p"))
   {
   System.out.println("You lost");
   computerWins = computerWins + 1;
   }
   if(computerChoice.equals("s") && userResponse.equals("r"))
   {
   System.out.println("You won");
   humanWins = humanWins + 1;
   }
   System.out.println("Want to play again?");
   String userValue = input.next();
   if(userValue.equals("n") || userValue.equals("no"))
   break;
   }
   System.out.println("Computer score " + computerWins);
   System.out.println("Your score " + humanWins);
   System.out.println("Total ties " + ties);   
   }   
   }