package com.arpansbetter.flamel.world;

import java.util.HashMap;

public enum TileType {
	
	GROUND(1, true, "ground"),
	BACKGROUND(2, false, "background");
	
	
	private int id;
	private boolean collidable;
	private String name;
	private float damage;
	
	private TileType(int id, boolean collidable, String name) {
		this(id, collidable, name, 0);
	}
	private TileType(int id, boolean collidable, String name, float damage) {
		this.id = id;
		this.collidable = collidable;
		this.name = name;
		this.damage= damage;
	}
	
	public static final int TILE_SIZE = 32;
	
	public int getId() {
		return id;
	}
	public boolean isCollidable() {
		return collidable;
	}
	public String getName() {
		return name;
	}
	public float getDamage() {
		return damage;
	}
	
	private static HashMap<Integer, TileType> tileMap;
	
	static {
		for (TileType tileType : TileType.values()) {
			tileMap.put(tileType.getId(), tileType);
		}
	}
	
	public static TileType getTileTypeById(int id) {
		return tileMap.get(id);
	}
}
