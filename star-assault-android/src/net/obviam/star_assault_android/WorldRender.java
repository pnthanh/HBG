package net.obviam.star_assault_android;

import net.obviam.star_assault_android.Block;
import net.obviam.star_assault_android.Bob;
import net.obviam.star_assault_android.World;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;

public class WorldRender {
	
	private World world;
	private OrthographicCamera cam;
	
	ShapeRenderer debugRenderer = new ShapeRenderer();
	
	public WorldRender(World world){
		this.world = world;
		this.cam = new OrthographicCamera(10, 7);
		this.cam.position.set(5, 3.5f, 0);
		this.cam.update();
	}
	
	public void render(){
		// render blocks
		debugRenderer.setProjectionMatrix(cam.combined);
		debugRenderer.begin(ShapeType.Rectangle);
		for (Block block : world.getBlocks()){
			Rectangle rect = block.getBounds();
			float x1= block.getPosition().x + rect.x;
		}
	}
}
