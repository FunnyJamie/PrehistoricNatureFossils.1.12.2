package net.prehistoricnaturefossils.blocks.deco;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSkullBase;
import net.prehistoricnaturefossils.items.ItemInit;
import net.prehistoricnaturefossils.tile.TileEntitySkullAcrocanthosaurus;

import javax.annotation.Nullable;

public class BlockFossilSkullAcrocanthosaurus extends BlockSkullBase {

    public BlockFossilSkullAcrocanthosaurus() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skull_acrocanthosaurus");
        setTranslationKey("pf_skull_acrocanthosaurus");
        GameRegistry.registerTileEntity(TileEntitySkullAcrocanthosaurus.class, PrehistoricNatureFossils.MODID + ":tileentityskull_acrocanthosaurus");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_acrocanthosaurus";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntitySkullAcrocanthosaurus();
    }


}
