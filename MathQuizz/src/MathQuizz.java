import java.util.Scanner;
public class MathQuizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Maths Quizz
		
		//counter to end quizz
		//if user enters 5 wrong answers then game is over
		final int number = 5;
		
		//counter for correct & incorrect answers
		int correctAnswers = 0;
		int wrongAnswers = 0;
		
		//time tracker
		long startTime = System.currentTimeMillis();
		String string1 = " ";
		Scanner input = new Scanner(System.in);
		
		
		while(wrongAnswers < number)
			{	
				//generating two numbers
				int numberOne = (int)(Math.random() * 10);
				int numberTwo = (int)(Math.random()* 10);
				if(numberOne < numberTwo)
				{
					//code to ensure numberOne is always > numberTwo
					int temp = numberOne;
					numberOne = numberTwo;
					numberTwo = temp;
				}
				//getting user input
				System.out.println("What is " + numberOne + " - " + numberTwo + " ? ");
				int answer = input.nextInt();
				
				//comparing user input to answer
				if(numberOne - numberTwo == answer)
				{
					System.out.println("You are correct");
					correctAnswers ++; //increase count of correct answers
				}
				else
				{
					System.out.println("Your answer is wrong. " + numberOne + " - " + numberTwo + " should be " + (numberOne - numberTwo) );
					wrongAnswers ++; //increase counter of wrong answers
				}
				//print questions + answers including if they're right or wrong
				string1 += "\n" + numberOne + "-" + numberTwo + " = " + answer + ((numberOne - numberTwo == answer)? " correct " : " wrong ");
				
				
			}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct count is " + correctAnswers + "\nTest time is " + testTime/1000 + " seconds\n" + string1);
		

	}

}
