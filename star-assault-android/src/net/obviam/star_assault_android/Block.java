package net.obviam.star_assault_android;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Block {
	static final float SIZE = 1f;
	
	Vector2 	position = new Vector2();
	Rectangle 	bounds = new Rectangle();
	
	public Block(Vector2 pos){
		this.position = pos;
		this.bounds.height = SIZE;
		this.bounds.width = SIZE;
	}

	public Vector2 getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}

	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return this.bounds;
	}
}
