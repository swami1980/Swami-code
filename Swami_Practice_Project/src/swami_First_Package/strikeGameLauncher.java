package swami_First_Package;

public class strikeGameLauncher {

	
	public static void main(String[] args) {
		int playerguess;
		// TODO Auto-generated method stub
 strikeGame sg = new strikeGame();
 sg.strikeset();
 sg.setLoopStatus(false);
 while (sg.isLoopStatus()  == false){
 playerguess =(int) (Math.random()*9);
 sg.setPlayerguess(playerguess);
 System.out.println("My guess is " + playerguess);
 sg.playstrike();
 
	}
	}
}
