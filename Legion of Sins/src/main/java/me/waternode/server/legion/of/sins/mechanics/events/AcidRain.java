package me.waternode.server.legion.of.sins.mechanics.events;

import me.waternode.server.legion.of.sins.mechanics.CatastrophicEvent;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.Random;

public class AcidRain extends CatastrophicEvent {

	public AcidRain(Location c, double r, double s, World w, Vector d) {
		super(c, r, s, w, d);
	}

	@Override
	public void OnPlayerNear(Player p, Random random) {
		World w = p.getWorld();
		Location pLoc = p.getLocation();
		Integer pX = pLoc.getBlockX();
		Integer pZ = pLoc.getBlockZ();
		if (w.getHighestBlockYAt(pX, pZ) - 5 <= pLoc.getY())
			p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 120, 1));
		p.getWorld().playSound(p.getLocation(), Sound.AMBIENCE_RAIN, 0.5f, 1f);
	}
}
