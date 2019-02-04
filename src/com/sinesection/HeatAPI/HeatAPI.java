package com.sinesection.HeatAPI;

import com.sinesection.HeatAPI.proxy.IProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid=HeatAPI.MODID, name=HeatAPI.MODNAME, version=HeatAPI.VERSION, useMetadata=true)
public class HeatAPI {
	public static final String MODID="heatAPI";
	public static final String MODNAME="Heat API";
	public static final String VERSION="pre-alpha 0.1";		
	
	@SidedProxy(clientSide="com.sinesection.HeatAPI.proxy.ClientProxy", serverSide="com.sinesection.HeatAPI.proxy.ServerProxy")
	public static IProxy proxy;
}
