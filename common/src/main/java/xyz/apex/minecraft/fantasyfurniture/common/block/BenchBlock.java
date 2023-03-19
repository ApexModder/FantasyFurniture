package xyz.apex.minecraft.fantasyfurniture.common.block;

import xyz.apex.minecraft.apexcore.common.component.ComponentTypes;
import xyz.apex.minecraft.apexcore.common.component.SimpleComponentBlock;
import xyz.apex.minecraft.fantasyfurniture.common.block.components.SeatComponent;
import xyz.apex.minecraft.fantasyfurniture.common.init.AllMultiBlockTypes;

public final class BenchBlock extends SimpleComponentBlock
{
    public BenchBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public void registerComponents()
    {
        registerComponent(ComponentTypes.HORIZONTAL_FACING);
        registerComponent(ComponentTypes.MULTI_BLOCK, AllMultiBlockTypes.MB_1x1x2_FACING);
        registerComponent(SeatComponent.COMPONENT_TYPE);
    }
}
