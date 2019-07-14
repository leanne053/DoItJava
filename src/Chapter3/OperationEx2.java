package Chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		gameScore = 150;
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		gameScore = 150;
		int lastScore3 = gameScore++;
		System.out.println(lastScore3);
		
		gameScore = 150;
		int lastScore4 = gameScore--;
		System.out.println(lastScore4);
		
	}

}
