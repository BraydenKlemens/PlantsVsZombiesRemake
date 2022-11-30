package com.plantsvszombies.game;

import com.badlogic.gdx.graphics.Texture;

public class Walnut extends Plants {

	/**
	 * @param tile
	 */
	public Walnut(Tile tile) {
		super(tile, new Texture("walnut.png"), 1000);
	}

	// abstract methods
	@Override
	public boolean updateTime() {
		// not used
		return false;
	}

	@Override
	public int getType() {
		return 3;
	}

}
