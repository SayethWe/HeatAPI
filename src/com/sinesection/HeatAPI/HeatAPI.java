package com.sinesection.HeatAPI;

import org.apache.logging.log4j.Logger;

import com.sinesection.HeatAPI.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=HeatAPI.MODID, name=HeatAPI.MODNAME, version=HeatAPI.VERSION, useMetadata=true)
public class HeatAPI {
	public static final String MODID="heatAPI";
	public static final String MODNAME="Heat API";
	public static final String VERSION="pre-alpha 0.1";		
	
	@SidedProxy(clientSide="com.sinesection.HeatAPI.proxy.ClientProxy", serverSide="com.sinesection.HeatAPI.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static HeatAPI instance;
	
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
