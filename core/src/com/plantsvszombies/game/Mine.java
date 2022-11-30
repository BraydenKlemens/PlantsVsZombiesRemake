package com.plantsvszombies.game;

import com.badlogic.gdx.graphics.Texture;

public class Mine extends Plants {

	/**
	 * @param tile
	 */
	public Mine(Tile tile) {
		super(tile, new Texture("minePlant.png"),30);
	}
	//abstract methods updateTime not needed
	@Override
	public boolean updateTime() {
		//not used
		return false;
	}

	@Override
	public int getType() {
		return 4;
	}

}
