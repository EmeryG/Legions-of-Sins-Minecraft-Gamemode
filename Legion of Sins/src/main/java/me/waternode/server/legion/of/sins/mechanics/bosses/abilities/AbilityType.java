package me.waternode.server.legion.of.sins.mechanics.bosses.abilities;

import me.waternode.server.legion.of.sins.LOSMain;
import org.bukkit.entity.Player;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Emery
 * Date: 4/12/14
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */
public enum AbilityType {
    CLONE,
    CULTOFTHEFEATHER,
    SEWERSWARM,
    SMITE,
    WITHER,
    ZOMBIESIEGE;

    public Abilities getValue(ArrayList<Player> ps) {
        switch(this) {
            case CLONE:
                return null;
            case CULTOFTHEFEATHER:
                return new CultOfTheFeather(ps);
            case SEWERSWARM:
                return new SewerSwarm(ps, 10);
            case SMITE:
                return new Smite(ps);
            case WITHER:
                ArrayList<Player> p1 = new ArrayList<Player>();
                p1.add(ps.get(LOSMain.getRandom().nextInt(ps.size())));
                return new Wither(p1);
            case ZOMBIESIEGE:
                ArrayList<Player> p2 = new ArrayList<Player>();
                p2.add(ps.get(LOSMain.getRandom().nextInt(ps.size())));
                return new ZombieSiege(p2);
            default:
                return null;
        }
    }
}
