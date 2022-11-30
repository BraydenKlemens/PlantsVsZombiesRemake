package com.plantsvszombies.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public interface IShootable {

	void advance();

	/**
	 * @param d
	 * @return
	 */
	int damage(int d);

	/**
	 * @param batch
	 */
	void draw(SpriteBatch batch);

	/**
	 * @return
	 */
	Rectangle getBoundingRectangle();

	/**
	 * @return
	 */
	int getHealth();

	/**
	 * @param speed
	 * @return
	 */
	float setSpeed(float speed);

	float getX();
}
