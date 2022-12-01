package com.plantsvszombies.game;

import com.badlogic.gdx.graphics.Texture;


public class PeaShooter extends Plants {

	/**
	 * @param tile
	 */
	public PeaShooter(Tile tile) {
		super(tile, new Texture("peaShooter.png"), 200);
	}

	
	public boolean updateTime() {
		//updates time for each singular plant
		long timeA = System.currentTimeMillis() - getTime();
		if (timeA > 2000) {
			startTime();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
