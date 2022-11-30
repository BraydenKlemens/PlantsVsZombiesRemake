package com.plantsvszombies.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Pea {
	
	//variables
	private final Sprite sprite;
	private final int type;

	/**
	 * @param type
	 * @param x
	 * @param y
	 */
	public Pea(int type, float x, float y) {
		this.type = type;
		switch (type) {
		case 0:
			sprite = new Sprite(new Texture("greenBullet.png"));
			break;
		case 1:
			sprite = new Sprite(new Texture("blueBullet.png"));
			break;
		default:
			sprite = new Sprite(new Texture("greenBullet.png"));
			break;
		}

		sprite.setX(x);
		sprite.setY(y);
	}
	
	/**
	 * @return
	 */
	public int getType(){
		return type;
	}

	/**
	 * @param f
	 */
	public void translateX(float f) {
		sprite.translateX(f);
	}

	/**
	 * @return
	 */
	public Rectangle getBoundingRectangle() {
		return sprite.getBoundingRectangle();
	}

	/**
	 * @return
	 */
	public float getX() {
		return sprite.getX();
	}

	/**
	 * @return
	 */
	public float getY() {
		return sprite.getY();
	}

	/**
	 * @param batch
	 */
	public void draw(SpriteBatch batch) {
		sprite.draw(batch);

	}

}
