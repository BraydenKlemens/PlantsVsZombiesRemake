package com.plantsvszombies.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class TileSelect {

	// variables
	private final Sprite sprite;

	/**
	 * @param tile
	 * @param text
	 */
	public TileSelect(Tile tile, Texture text) {
		sprite = new Sprite(text);
		sprite.setSize(tile.getRectangle().getWidth(), tile.getRectangle().getHeight());
		sprite.setPosition(tile.getRectangle().getX(), tile.getRectangle().getY());
	}

	/**
	 * @param batch
	 */
	public void draw(Batch batch) {
		sprite.draw(batch);
	}

}
