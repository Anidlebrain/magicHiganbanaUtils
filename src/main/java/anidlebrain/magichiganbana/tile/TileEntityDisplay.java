package anidlebrain.magichiganbana.tile;

import anidlebrain.magichiganbana.MagicHiganbana;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityInventoryBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityDisplay extends TileEntityInventoryBase {
    public TileEntityDisplay(String name) {
        super(1, name);
    }
    @Override
    public void updateEntity() {
        super.updateEntity();
    }

    @Override
    public int getMaxStackSize(int slot) {
        return 1;
    }

    @Override
    public boolean shouldSyncSlots() {
        return true;
    }

    public static void  register() {
        try {
            ResourceLocation name = new ResourceLocation(MagicHiganbana.MODID, "display");
            GameRegistry.registerTileEntity(TileEntityDisplay.class, name);
        } catch (Exception exception) {
            MagicHiganbana.LOGGER.fatal("Registering a TileEntity failed!", exception);
        }

    }

}
