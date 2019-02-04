package com.sinesection.HeatAPI.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public interface IProxy {
	void preInit(FMLPreInitializationEvent e);
	void init(FMLInitializationEvent e);
	void postInit(FMLPostInitializationEvent e);
	void serverStarting(FMLServerStartingEvent e);
	EntityPlayer getPlayerEntityFromContext(MessageContext context);
}
