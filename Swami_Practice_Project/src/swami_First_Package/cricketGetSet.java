package swami_First_Package;

public class cricketGetSet {
	
	int balls;
	private int overs;
	private String matchtype;
	String teams;
	 
	
	public void balls(){
		while( balls <6) {
			balls = balls +1 ;
		}
	}
	
	public void overs(){
		switch (matchtype)  {
		case "T20" : 
			if (overs >=20){
				System.out.println("Side change");
			}
		case "oneday" : 		
			if (overs >=50){
				System.out.println("Side change");	
			}
				case "":
				System.out.println("Learn cricket rules");	
				
				default :
					System.out.println("oodi poo");	
					
			
	}
	}

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		if (overs != 0){
		this.overs = overs;
		 
		}
		else{
			System.out.println("Setter does the trick");
				
		}
	}

	public String getMatchtype() {
		return matchtype;
	}

	public void setMatchtype(String matchtype) {
		this.matchtype = matchtype;
	}

	public String getTeams() {
		return teams;
	}

	public void setTeams(String teams) {
		this.teams = teams;
	}
}


