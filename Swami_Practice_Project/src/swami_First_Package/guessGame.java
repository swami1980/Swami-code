package swami_First_Package;

public class guessGame {
	int p1n1 , p2n1 , p3n1;
	 
	boolean gameContinue;
	
	public void guessStart(){
		gameContinue = true;
		playerGame p1 = new playerGame();
		playerGame p2 = new playerGame();
		playerGame p3 = new playerGame();
		
		while (gameContinue == true){
		p1n1 =(int) (Math.random() *10);
		p2n1 =(int) (Math.random() *10);
		p3n1 =(int) (Math.random() *10);
		
		System.out.println( "Value guessed for Player 1 is " + p1n1);
		System.out.println( "Value guessed for Player 2 is " + p2n1);
		System.out.println( "Value guessed for Player 3 is " + p3n1);
		
		int player1 = p1.numReturn();
		int player2 = p2.numReturn();
		int player3 = p3.numReturn();
		
		if (p1n1 == player1){
			gameContinue= false;
			System.out.println( "Winner is choosen " );
			System.out.println( "Winner of the Guessing game is player 1");
		}
		if (p2n1 == player2){
			gameContinue= false;
			System.out.println( "Winner is choosen " );
			System.out.println( "Winner of the Guessing game is player 2");
		}
		
		if (p3n1 == player3){
			gameContinue= false;
			System.out.println( "Winner is choosen " );
			System.out.println( "Winner of the Guessing game is player 3");
		}
		
		}
		
	}
	
	

}
