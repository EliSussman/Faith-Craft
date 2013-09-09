package client;

import common.CommonProxy;
import common.entity.EntityAngel;
import common.render.RenderAngel;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityAngel.class, new RenderAngel(new ModelAngel(), 0.3F));
    }
    
    
}