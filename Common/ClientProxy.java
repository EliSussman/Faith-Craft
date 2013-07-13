import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderInformation()
    {
        MinecraftForgeClient.preloadTexture("/FaithCraft.png");
    }

    @Override
    public void registerTileEntitySpecialRenderer(/*PLACEHOLDER*/)
    {

    }

    @Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }
}