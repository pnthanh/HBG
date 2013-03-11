package net.obviam.star_assault_android;
import net.obviam.star_assault_android.GameScreen;
import com.badlogic.gdx.Game;
public class StarAssault extends Game {
	
	@Override
	public void create(){
		setScreen(new GameScreen());
	}
	
}
