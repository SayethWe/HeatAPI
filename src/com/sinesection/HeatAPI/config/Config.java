package com.sinesection.HeatAPI.config;

import org.apache.logging.log4j.Level;

import com.sinesection.HeatAPI.HeatAPI;
import com.sinesection.HeatAPI.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

public class Config {

	private static final String CATEGORY_GENERAL = "general";
	private static final String GENERAL_COMMENT = "General Configuration";
	private static final String ERROR_TEXT = "Error loading config file";
	
	//config values
	//public static int 
	
	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e1) {
			HeatAPI.logger.log(Level.ERROR, ERROR_TEXT, e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}
	
	private static void initGeneralConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, GENERAL_COMMENT);
	}
	
}
