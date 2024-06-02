package net.midget807.elementals;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementalsMain implements ModInitializer {
    public static final String MOD_ID = "elementals";
    public static final Logger LOGGER = LoggerFactory.getLogger("elementals");


    @Override
    public void onInitialize() {

        LOGGER.info("Hello Fabric world!");
    }
}
