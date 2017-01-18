package midi_Swing;
import javax.sound.midi.*;
public class music_player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		music_player mp = new music_player();
		mp.play();
		

	}
	public void play(){
		try {
			Sequencer player =   Midisystem.getseq
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
