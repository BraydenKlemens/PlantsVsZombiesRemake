package com.plantsvszombies.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;

public class Tile {

	// variables
	private Plants plant;
	private TileSelect select;
	private final int y;
	private final Rectangle rect;

	/**
	 * @param x
	 * @param y
	 */
	public Tile(int x, int y) {
		this.y = y;
		this.rect = new Rectangle(x, y, 50, 60);
	}

	/**
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * @return
	 */
	public Rectangle getRectangle() {
		return rect;
	}

	/**
	 * @return
	 */
	public Plants getPlant() {
		return plant;
	}

	/**
	 * @param plant
	 */
	public void setPlant(Plants plant) {
		this.plant = plant;
	}

	/**
	 * @return
	 */
	public TileSelect getTile() {
		return select;
	}

	/**
	 * @param select
	 */
	public void setTile(TileSelect select) {
		this.select = select;
	}

	/**
	 * @return
	 */
	public boolean hasPlant() {
		return plant != null;
	}

	/**
	 * @param batch
	 */
	public void draw(Batch batch) {
		if (plant != null) {
			plant.draw(batch);
		}
		if (select != null) {
			select.draw(batch);
		}
	}
}
