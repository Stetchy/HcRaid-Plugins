package com.hamgooof.bedrockbase.objects;

import java.io.File;
import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

import com.sk89q.worldedit.CuboidClipboard;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.data.DataException;

public class BedrockSchematic {
	private int width, height, depth;
	private String permission, name;

	public BedrockSchematic(String permission, String base) {
		this.permission = permission;
		name = base;
		System.out.println("Loaded schematic " + name + " with permission "
				+ permission);
		File bBase = new File(JavaPlugin.getPlugin(WorldEditPlugin.class)
				.getDataFolder() + File.separator + "schematics", base
				+ ".schematic");
		try {
			loadData(bBase);
		} catch (DataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loadData(File bBase) throws DataException {
		try {
			CuboidClipboard cc;
			try {
				cc = CuboidClipboard.loadSchematic(bBase);
				width = cc.getWidth();
				height = cc.getHeight();
				depth = cc.getLength();
			} catch (com.sk89q.worldedit.world.DataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getDepth() {
		return depth;
	}

	public int getHeight() {
		return height;
	}

	public String getPermission() {
		return permission;
	}

	public int getWidth() {
		return width;
	}

	public String getName() {
		return name;
	}

	public File getSchematic() {
		return new File(JavaPlugin.getPlugin(WorldEditPlugin.class)
				.getDataFolder() + File.separator + "schematics", name
				+ ".schematic");
	}
}
