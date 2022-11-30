package com.plantsvszombies.game;

import com.badlogic.gdx.graphics.Texture;

public class IcePeaShooter extends Plants {

	/**
	 * @param tile
	 */
	public IcePeaShooter(Tile tile) {
		super(tile, new Texture("icePeaShooter.png"), 300);
	}

	public boolean updateTime() {
		//Abstract method
		long timeA = System.currentTimeMillis() - getTime();
		if (timeA > 1800) {
			startTime();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getType() {
		return 1;
	}
	
}
