package com.solonarv.mods.golemworld.golem.simple;

import net.minecraft.world.World;

import com.solonarv.mods.golemworld.golem.EntityCustomGolem;

/**
 * ABC for simple (non-smart) golems. Only difference from
 * {@link EntityCustomGolem} is that isSmart() is final and returns false
 * 
 * @author Solonarv
 * 
 */
public abstract class EntitySimpleGolem extends EntityCustomGolem {
    
    public EntitySimpleGolem(World world) {
        super(world);
    }
    
    public static final boolean isSmart() {
        return false;
    }
}
