package nine;
import eight.Note;
/**
 * 将play()的声明从Instrument中移到Playable中
 *
 */
public interface Playable {
	public void play(Note n);
}
