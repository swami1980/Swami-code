package swami_First_Package;

public class strikeGame {
	int strike;
	int hits =0 ;
	int counter;
	private int playerguess;
    private boolean loopStatus;
    private boolean empty;
	

	public boolean isLoopStatus() {
		return loopStatus;
	}
	public void setLoopStatus(boolean loopStatus) {
		this.loopStatus = loopStatus;
	}

	String gamestart;
	String[] canvas = new String[10];
	
	
	
	public int getPlayerguess() {
		return playerguess;
	}
	public void setPlayerguess(int playerguess) {
		this.playerguess = playerguess;
	}
		public int getStrike() {
		return strike;
	}
	public void setStrike(int strike) {
		this.strike = strike;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getGamestart() {
		return gamestart;
	}
	public void setGamestart(String gamestart) {
		this.gamestart = gamestart;
	}
	public String[] getCanvas() {
		return canvas;
	}
	public void setCanvas(String[] canvas) {
		this.canvas = canvas;
	}
		public void strikeset(){
			counter = (int) (Math.random()*10);
			canvas[counter] = "Test";
			counter++;
			canvas[counter] = "dot";
			counter++;
			canvas[counter] = "com";
			
			
		}
		 
		public void playstrike(){
			 
			 
			if (canvas[this.playerguess]  !=null){
				System.out.println("Hit");
				 
			    strike++;
			    canvas[this.playerguess]  =null;
			    
			}
			    else {
			    	System.out.println("Miss");
				    strike++;
			    }
			 
			empty = true;
			for (int i=0; i<canvas.length; i++) {
				
				  if (canvas[i] != null) {
				    empty = false;
				    break;
				  }
				  
			}
				  if (empty == true){
				System.out.println("Game over");
				System.out.println("You totally took " + strike + "attempt");
				loopStatus=true;
				  
			
			}
				 
			}
		
		}

				
			
			
			
		
	
	
	


