package me.waternode.server.legion.of.sins.generation;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import java.util.ArrayList;
import java.util.Random;

public class WorldGeneration {

	public static void DirtReplace(Block b, Random r) {
		if ((b.getBiome() == Biome.BIRCH_FOREST) ||
				(b.getBiome() == Biome.BIRCH_FOREST_HILLS) ||
				(b.getBiome() == Biome.BIRCH_FOREST_HILLS_MOUNTAINS) ||
				(b.getBiome() == Biome.BIRCH_FOREST_MOUNTAINS)) {
			int i = r.nextInt(3);

			if (i == 0) {
				b.setType(Material.STONE);
			} else if (i == 1) {
				b.setType(Material.COBBLESTONE);
			} else if (i == 2) {
				b.setType(Material.SMOOTH_STAIRS);
			}

		} else if ((b.getBiome() == Biome.MEGA_SPRUCE_TAIGA) ||
				(b.getBiome() == Biome.MEGA_TAIGA) ||
				(b.getBiome() == Biome.MEGA_SPRUCE_TAIGA_HILLS) ||
				(b.getBiome() == Biome.MEGA_TAIGA_HILLS)) {
			if (r.nextBoolean()) {
                b.setType(Material.MYCEL);
			} else if (r.nextInt(3) == 0) {
                b.setType(Material.GRAVEL);
			} else {
                b.setType(Material.COBBLESTONE);
			}
		} else {
            b.setType(Material.STONE);
		}
	}

	public static void GrassReplace(Block b, Random r) {
		if ((b.getBiome() == Biome.SAVANNA) ||
				(b.getBiome() == Biome.SAVANNA_MOUNTAINS) ||
				(b.getBiome() == Biome.SAVANNA_PLATEAU) ||
				(b.getBiome() == Biome.SAVANNA_PLATEAU_MOUNTAINS) ||
				(b.getBiome() == Biome.JUNGLE) ||
				(b.getBiome() == Biome.JUNGLE_EDGE) ||
				(b.getBiome() == Biome.JUNGLE_EDGE_MOUNTAINS) ||
				(b.getBiome() == Biome.JUNGLE_HILLS) ||
				(b.getBiome() == Biome.JUNGLE_MOUNTAINS) ||
				(b.getBiome() == Biome.TAIGA) ||
				(b.getBiome() == Biome.TAIGA_HILLS) ||
				(b.getBiome() == Biome.TAIGA_MOUNTAINS) ||
				(b.getBiome() == Biome.MEGA_SPRUCE_TAIGA) ||
				(b.getBiome() == Biome.MEGA_TAIGA) ||
				(b.getBiome() == Biome.MEGA_SPRUCE_TAIGA_HILLS) ||
				(b.getBiome() == Biome.MEGA_TAIGA_HILLS) ||
				(b.getBiome() == Biome.MESA) ||
				(b.getBiome() == Biome.MESA_BRYCE) ||
				(b.getBiome() == Biome.MESA_PLATEAU) ||
				(b.getBiome() == Biome.MESA_PLATEAU_FOREST) ||
				(b.getBiome() == Biome.MESA_PLATEAU_FOREST_MOUNTAINS) ||
				(b.getBiome() == Biome.MESA_PLATEAU_MOUNTAINS)) {
            b.setType(Material.MYCEL);
		} else if ((b.getBiome() == Biome.BIRCH_FOREST) ||
				(b.getBiome() == Biome.BIRCH_FOREST_HILLS) ||
				(b.getBiome() == Biome.BIRCH_FOREST_HILLS_MOUNTAINS) ||
				(b.getBiome() == Biome.BIRCH_FOREST_MOUNTAINS)) {
			int i = r.nextInt(3);

			if (i == 0) {
                b.setType(Material.STONE);
			} else if (i == 1) {
                b.setType(Material.COBBLESTONE);
			} else if (i == 2) {
                b.setType(Material.SMOOTH_BRICK);
			}

		} else if ((b.getBiome() == Biome.FOREST) ||
				(b.getBiome() == Biome.FOREST_HILLS) ||
				(b.getBiome() == Biome.FLOWER_FOREST) ||
				(b.getBiome() == Biome.ROOFED_FOREST) ||
				(b.getBiome() == Biome.ROOFED_FOREST_MOUNTAINS)) {
			int i = r.nextInt(6);

			if (i == 0) {
                b.setType(Material.MYCEL);
			} else if (i <= 1) {
                b.setType(Material.SOUL_SAND);
			} else if (i <= 2) {
                b.setType(Material.OBSIDIAN);
			} else if (i <= 5) {
                b.setType(Material.NETHER_BRICK);
			}
		} else if ((b.getBiome() == Biome.PLAINS) ||
				(b.getBiome() == Biome.SUNFLOWER_PLAINS)) {
			int i = r.nextInt(9);

			if (i == 0) {
                b.setType(Material.QUARTZ_ORE);
            } else if (i <= 1) {
                b.setType(Material.SOUL_SAND);
            } else if (i <= 3) {
                b.setType(Material.OBSIDIAN);
			} else if (i <= 8)
                b.setType(Material.NETHER_BRICK);
		} else {
            b.setType(Material.OBSIDIAN);
		}
	}

	public static void SandLikeReplace(Block b, Random r) {
		if (r.nextInt(3) == 0)
            b.setType(Material.GRAVEL);
		else
            b.setType(Material.COBBLESTONE);
	}

	public static void LogsReplace(Block b) {
		if ((b.getBiome() == Biome.BIRCH_FOREST) ||
				(b.getBiome() == Biome.BIRCH_FOREST_HILLS) ||
				(b.getBiome() == Biome.BIRCH_FOREST_HILLS_MOUNTAINS) ||
				(b.getBiome() == Biome.BIRCH_FOREST_MOUNTAINS)) {
            b.setType(Material.QUARTZ_BLOCK);
		} else if ((b.getBiome() != Biome.SAVANNA) &&
				(b.getBiome() != Biome.SAVANNA_MOUNTAINS) &&
				(b.getBiome() != Biome.SAVANNA_PLATEAU) &&
				(b.getBiome() != Biome.SAVANNA_PLATEAU_MOUNTAINS)) {
            b.setType(Material.COAL_BLOCK);
		}
	}

	public static void LeavesReplace(Block b, Random r) {
		if ((b.getBiome() == Biome.BIRCH_FOREST) ||
				(b.getBiome() == Biome.BIRCH_FOREST_HILLS) ||
				(b.getBiome() == Biome.BIRCH_FOREST_HILLS_MOUNTAINS) ||
				(b.getBiome() == Biome.BIRCH_FOREST_MOUNTAINS)) {
            b.setType(Material.COAL_BLOCK);
		} else if ((b.getBiome() != Biome.SAVANNA) &&
				(b.getBiome() != Biome.SAVANNA_MOUNTAINS) &&
				(b.getBiome() != Biome.SAVANNA_PLATEAU) &&
				(b.getBiome() != Biome.SAVANNA_PLATEAU_MOUNTAINS)) {
			int i = r.nextInt(12);

			if (i == 0) {
                b.setType(Material.EMERALD_ORE);
			} else if (i <= 1) {
                b.setType(Material.SOUL_SAND);
			} else if (i <= 4) {
                b.setType(Material.WEB);
			} else if (i <= 11)
                b.setType(Material.COAL_BLOCK);
		}
	}

	public static void CylinderGeneration(Random r, Chunk c) {
		int a = r.nextInt(10);
		if (a == 9) {
			Block b = c.getBlock(r.nextInt(16), r.nextInt(55), r.nextInt(16));
			if ((b.getBiome() != Biome.RIVER) && (b.getBiome() != Biome.OCEAN) && (b.getBiome() != Biome.DEEP_OCEAN))
				WorldLib.createCyl(b.getLocation(), r.nextInt(10) + 1, r);
		} else if (a <= 4) {
			Block b = c.getBlock(r.nextInt(16), r.nextInt(55), r.nextInt(16));
			if ((b.getBiome() != Biome.RIVER) && (b.getBiome() != Biome.OCEAN) && (b.getBiome() != Biome.DEEP_OCEAN) && (
					(b.getBiome() == Biome.PLAINS) ||
							(b.getBiome() == Biome.SUNFLOWER_PLAINS)))
				WorldLib.createCyl(b.getLocation(), r.nextInt(10) + 1, r);
		}
	}

	public static void RuinsGeneration(Random r, Chunk c) {
		int a = r.nextInt(200);
		if (a == 0) {
			Block b = c.getBlock(r.nextInt(16), 1, r.nextInt(16));
			b = c.getWorld().getHighestBlockAt(b.getLocation());
			Location l = b.getLocation();
			l.add(0.0D, -1 * r.nextInt(3), 0.0D).getBlock();
			b = l.getBlock();
			a = r.nextInt(30);
			ArrayList<Material> walls = new ArrayList<Material>();
			ArrayList<Material> floors = new ArrayList<Material>();
			ArrayList<Material> afterfloors = new ArrayList<Material>();
			if ((b.getBiome() == Biome.DESERT) ||
					(b.getBiome() == Biome.DESERT_HILLS) ||
					(b.getBiome() == Biome.DESERT_MOUNTAINS) ||
					(b.getBiome() == Biome.MESA) ||
					(b.getBiome() == Biome.MESA_BRYCE) ||
					(b.getBiome() == Biome.MESA_PLATEAU) ||
					(b.getBiome() == Biome.MESA_PLATEAU_MOUNTAINS)) {
				if (a < 15) {
					for (int i = 0; i < 3; i++) {
						walls.add(Material.COBBLESTONE);
					}
					for (int i = 0; i < 3; i++) {
						walls.add(Material.STONE);
					}
					for (int i = 0; i < 3; i++) {
						walls.add(Material.SMOOTH_BRICK);
					}
					walls.add(Material.AIR);
					walls.add(Material.COAL_BLOCK);
					walls.add(Material.QUARTZ_BLOCK);

					for (int i = 0; i < 7; i++) {
						floors.add(Material.NETHER_BRICK);
					}
					floors.add(Material.AIR);

					for (int i = 0; i < 9; i++) {
						afterfloors.add(Material.AIR);
					}
					afterfloors.add(Material.WEB);
				} else {
					for (int i = 0; i < 5; i++) {
						walls.add(Material.QUARTZ_BLOCK);
					}
					walls.add(Material.GLOWSTONE);
					walls.add(Material.COBBLESTONE);

					floors.add(Material.STAINED_GLASS);

					for (int i = 0; i < 9; i++) {
						afterfloors.add(Material.AIR);
					}
					afterfloors.add(Material.WEB);
				}

			} else if (a < 10) {
				for (int i = 0; i < 3; i++) {
					walls.add(Material.COBBLESTONE);
				}
				for (int i = 0; i < 3; i++) {
					walls.add(Material.STONE);
				}
				for (int i = 0; i < 3; i++) {
					walls.add(Material.SMOOTH_BRICK);
				}
				walls.add(Material.AIR);
				walls.add(Material.COAL_BLOCK);
				walls.add(Material.QUARTZ_BLOCK);

				for (int i = 0; i < 7; i++) {
					floors.add(Material.NETHER_BRICK);
				}
				floors.add(Material.AIR);

				for (int i = 0; i < 9; i++) {
					afterfloors.add(Material.AIR);
				}
				afterfloors.add(Material.WEB);
			} else if (a < 20) {
				for (int i = 0; i < 5; i++) {
					walls.add(Material.QUARTZ_BLOCK);
				}
				walls.add(Material.GLOWSTONE);
				walls.add(Material.COBBLESTONE);

				floors.add(Material.STAINED_GLASS);

				for (int i = 0; i < 9; i++) {
					afterfloors.add(Material.AIR);
				}
				afterfloors.add(Material.WEB);
			} else {
				for (int i = 0; i < 4; i++) {
					walls.add(Material.LEAVES);
				}
				for (int i = 0; i < 2; i++) {
					walls.add(Material.LOG);
				}
				walls.add(Material.WEB);

				for (int i = 0; i < 4; i++) {
					floors.add(Material.LEAVES);
				}
				for (int i = 0; i < 2; i++) {
					floors.add(Material.LOG);
				}
				floors.add(Material.WEB);

				for (int i = 0; i < 4; i++) {
					afterfloors.add(Material.LEAVES);
				}
				for (int i = 0; i < 2; i++) {
					afterfloors.add(Material.LOG);
				}
				afterfloors.add(Material.WEB);
			}

			int h = r.nextInt(4) * 10 + 10;
			ArrayList<Integer> levels = new ArrayList<Integer>();
			levels.add(0);
			for (int i = 1; i <= h / 5; i++) {
				levels.add(i * 5);
			}
			h += 1 + r.nextInt(3);
			WorldLib.createTower(b.getLocation(), r.nextInt(11) + 5, h, r, walls, floors, afterfloors, levels);
		}
	}
}
