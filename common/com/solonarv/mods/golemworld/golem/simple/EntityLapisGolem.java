package com.solonarv.mods.golemworld.golem.simple;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.solonarv.mods.golemworld.golem.GolemStats;
import com.solonarv.mods.golemworld.lib.Reference;

public class EntityLapisGolem extends EntitySimpleGolem {
    public static final GolemStats stats = new GolemStats();
    static {
        stats.maxHealth = 80;
        stats.attackDamageMean = 12f;
        stats.attackDamageStdDev = 2.6f;
        stats.name = "Lapis Golem";
        stats.texture = Reference.mobTexture("lapis_golem");
        stats.droppedItems(new ItemStack(Item.dyePowder, 5, 4));
    }
    
    public EntityLapisGolem(World world) {
        super(world);
    }
}
