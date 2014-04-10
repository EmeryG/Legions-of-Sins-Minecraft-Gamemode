package me.waternode.server.legion.of.sins.mechanics.events;

import me.waternode.server.legion.of.sins.LOSMain;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class MeteorShowers extends CatastrophicEvent {

	public MeteorShowers(Location c, double r, double s, int l, LOSMain m, boolean D3, World w, Vector d) {
		super(c, r, s, l, m, D3, w, d);
	}

	@Override
	public void OnPlayerNear(Player p) {
		// 4 times a second / 4 = ~1 time per second
		if (rand.nextInt(4) != 0) return;
		Location l = new Location(world, range, range, range);

		l.setX(p.getLocation().getX() + (rand.nextInt(7) - 3));
		l.setY(250);
		l.setZ(p.getLocation().getZ() + (rand.nextInt(7) - 3));

		Fireball fb = (Fireball) p.getWorld().spawnEntity(l, EntityType.FIREBALL);
		fb.setDirection(new Vector(0, -2, 0));
	}
}