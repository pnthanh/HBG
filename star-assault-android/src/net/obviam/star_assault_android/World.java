package net.obviam.star_assault_android;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class World {
	
	/** The block making up the world **/
	Array	blocks = new Array();
	Bob	bob;
	
	//Getters ------------
	public Array getBlocks(){
		return blocks;
	}
	public Bob getBob(){
		return bob;
	}
	//----------------------
	
	public World(){
		createDemonWorld();
	}
	
	private void createDemonWorld(){
		bob = new Bob(new Vector2(7,2 ));
		for (int i = 0;i <10; i++){
			blocks.add(new Block(new Vector2(i, 0)));  
			blocks.add(new Block(new Vector2(i,1 )));
		}
		blocks.add(new Block(new Vector2(9, 2)));
		blocks.add(new Block(new Vector2(9, 3)));
		blocks.add(new Block(new Vector2(9, 4)));
		blocks.add(new Block(new Vector2(9, 5)));
		
		blocks.add(new Block(new Vector2(6, 3)));
		blocks.add(new Block(new Vector2(6, 4)));
		blocks.add(new Block(new Vector2(6, 5)));
	}
}
