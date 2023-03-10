package xyz.apex.minecraft.fantasyfurniture.common.init;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.phys.shapes.VoxelShape;

import xyz.apex.minecraft.apexcore.common.multiblock.SimpleMultiBlock;
import xyz.apex.minecraft.apexcore.common.util.VoxelShapeHelper;
import xyz.apex.minecraft.fantasyfurniture.common.block.*;
import xyz.apex.minecraft.fantasyfurniture.common.block.properties.CounterType;
import xyz.apex.minecraft.fantasyfurniture.common.block.properties.ModBlockStateProperties;
import xyz.apex.minecraft.fantasyfurniture.common.block.properties.ShelfType;
import xyz.apex.minecraft.fantasyfurniture.common.block.properties.SofaType;

import java.util.function.Function;

public interface AllVoxelShapes
{
    interface Bone
    {
        interface Wither
        {
            private static void bootstrap() {}
        }

        interface Skeleton
        {
            private static void bootstrap() {}
        }

        private static void bootstrap()
        {
            Wither.bootstrap();
            Skeleton.bootstrap();
        }
    }

    interface Dunmer
    {
        private static void bootstrap() {}
    }

    interface Necrolord
    {
        private static void bootstrap() {}
    }

    interface Nordic
    {
        VoxelShape WALL_LIGHT = shape(
                box(6D, 5D, 15D, 10D, 11D, 16D),
                box(6D, 2D, 8D, 10D, 15D, 15D)
        );

        VoxelShape FLOOR_LIGHT = shape(
                box(6D, 0D, 6D, 10D, 2D, 10D),
                box(7D, 2D, 7D, 9D, 20D, 9D),
                box(6.5D, 20.75D, 2.5D, 9.5D, 22.75D, 5.5D),
                box(2.5D, 20.75D, 6.5D, 5.5D, 22.75D, 9.5D),
                box(7.25D, 22.75D, 3.25D, 8.75D, 26.75D, 4.75D),
                box(3.25D, 22.75D, 7.25D, 4.75D, 26.75D, 8.75D),
                box(7.25D, 22.75D, 11.25D, 8.75D, 26.75D, 12.75D),
                box(11.25D, 22.75D, 7.25D, 12.75D, 26.75D, 8.75D),
                box(10.5D, 20.75D, 6.5D, 13.5D, 22.75D, 9.5D),
                box(6.5D, 20.75D, 10.5D, 9.5D, 22.75D, 13.5D),
                box(3D, 16.75D, 7D, 7D, 20.75, 9D),
                box(9D, 16.75D, 7D, 13D, 20.75, 9D),
                box(7D, 16.75D, 3D, 9D, 20.75, 7D),
                box(7D, 16.75D, 9D, 9D, 20.75, 13D)
        );

        VoxelShape TABLE_LARGE = shape(
                box(12D, 0D, 2D, 14D, 13D, 4D),
                box(-14D, 0D, 2D, -12D, 13D, 4D),
                box(-14D, 0D, 28D, -12D, 13D, 30D),
                box(12D, 0D, 28D, 14D, 13D, 30D),
                box(-16D, 13D, 0D, 16D, 16D, 32D)
        );

        VoxelShape TABLE_SMALL = shape(
                box(1D, 0D, 1D, 3D, 13D, 3D),
                box(1D, 0D, 13D, 3D, 13D, 15D),
                box(13D, 0D, 13D, 15D, 13D, 15D),
                box(13D, 0D, 1D, 15D, 13D, 3D),
                box(0D, 13D, 0D, 16D, 16D, 16D)
        );

        VoxelShape TABLE_WIDE = shape(
                box(13D, 0D, 0D, 15D, 9D, 2D),
                box(13D, 7D, 1D, 15D, 13D, 3D),
                box(13D, 7D, 13D, 15D, 13D, 15D),
                box(-15D, 7D, 13D, -13D, 13D, 15D),
                box(-15D, 0D, 0D, -13D, 9D, 2D),
                box(-15D, 0D, 14D, -13D, 9D, 16D),
                box(13D, 0D, 14D, 15D, 9D, 16D),
                box(-16D, 13D, 0D, 16D, 16D, 16D),
                box(-15D, 7D, 1D, -13D, 13D, 3D)
        );

        VoxelShape BENCH = shape(
                box(12D, 0D, 2D, 14D, 3D, 4D),
                box(-14D, 0D, 2D, -12D, 3D, 4D),
                box(-14D, 0D, 12D, -12D, 3D, 14D),
                box(12D, 0D, 12D, 14D, 3D, 14D),
                box(12D, 3D, 11.5D, 14D, 5D, 13.5D),
                box(12D, 3D, 2.5D, 14D, 5D, 4.5D),
                box(-14D, 3D, 2.5D, -12D, 5D, 4.5D),
                box(-14D, 3D, 11.5D, -12D, 5D, 13.5D),
                box(-13.5D, 3.5D, 4.5D, -12.5D, 4.5D, 11.5D),
                box(12.5D, 3.5D, 4.5D, 13.5D, 4.5D, 11.5D),
                box(-15D, 5D, 2D, 15D, 7D, 14D)
        );

        VoxelShape CHAIR = shape(
                box(2D, 0D, 2D, 4D, 4D, 4D),
                box(2.5D, 4.5D, 4.5D, 3.5D, 5.5D, 11.5D),
                box(12.5D, 4.5D, 4.5D, 13.5D, 5.5D, 11.5D),
                box(12D, 0D, 2D, 14D, 4D, 4D),
                box(2D, 0D, 12D, 4D, 4D, 14D),
                box(2D, 7D, 2D, 14D, 9D, 14D),
                box(2D, 9D, 13D, 14D, 25D, 14D),
                box(12D, 0D, 12D, 14D, 4D, 14D),
                box(2D, 4D, 11.5D, 4D, 7D, 13.5D),
                box(12D, 4D, 11.5D, 14D, 7D, 13.5D),
                box(2D, 4D, 2.5D, 4D, 7D, 4.5D),
                box(12D, 4D, 2.5D, 14D, 7D, 4.5D)
        );

        VoxelShape CHANDELIER = box(1D, 0D, 1D, 15, 16D, 15D);

        VoxelShape CUSHION = shape(
                box(2D, 0D, 2D, 4D, 2D, 4D),
                box(2D, 0D, 12D, 4D, 2D, 14D),
                box(12D, 0D, 12D, 14D, 2D, 14D),
                box(12D, 0D, 2D, 14D, 2D, 4D),
                box(2D, 5D, 2.25D, 14D, 7D, 13.75D),
                box(1.75D, 4D, 2D, 14.25D, 5D, 14D),
                box(2D, 2D, 2.5D, 4D, 4D, 4.5D),
                box(12D, 2D, 2.5D, 14D, 4D, 4.5D),
                box(12D, 2D, 11.5D, 14D, 4D, 13.5D),
                box(2D, 2D, 11.5D, 4D, 4D, 13.5D),
                box(2.5D, 2.5D, 4.5D, 3.5D, 3.5D, 11.5D),
                box(12.5D, 2.5D, 4.5D, 13.5D, 3.5D, 11.5D)
        );

        VoxelShape STOOL = shape(
                box(2D, 0D, 2D, 4D, 3D, 4D),
                box(12D, 0D, 12D, 14D, 3D, 14D),
                box(12D, 0D, 2D, 14D, 3D, 4D),
                box(2D, 0D, 12D, 4D, 3D, 14D),
                box(2D, 3D, 11.5D, 4D, 5D, 13.5D),
                box(12D, 3D, 11.5D, 14D, 5, 13.5D),
                box(12D, 3D, 2.5D, 14D, 5D, 4.5D),
                box(1.5D, 5D, 1.75D, 14.5D, 7D, 14.25D),
                box(2D, 3D, 2.5D, 4D, 5D, 4.5D),
                box(2.5D, 3.5D, 4.5D, 3.5D, 4.5D, 11.5D),
                box(12.5D, 3.5D, 4.5D, 13.5D, 4.5D, 11.5D)
        );

        VoxelShape CHEST = box(-15D, 0D, 2D, 15D, 14D, 16D);

        VoxelShape BOOKSHELF = shape(
                box(-15D, 0D, 1D, 15D, 30D, 15D),
                box(-16D, 30D, 0D, 16D, 32D, 16D)
        );

        VoxelShape DESK_LEFT = shape(
                box(13D, 0D, 0D, 15D, 9D, 2D),
                box(13D, 7D, 1D, 15D, 13D, 3D),
                box(13D, 7D, 13D, 15D, 13D, 15D),
                box(-15D, 7D, 13D, -13D, 13D, 15D),
                box(-15D, 0D, 0D, -13D, 9D, 2D),
                box(-15D, 0D, 14D, -13D, 9D, 16D),
                box(13D, 0D, 14D, 15D, 9D, 16D),
                box(-16D, 13D, 0D, 16D, 16D, 16D),
                box(-15D, 7D, 1D, -13D, 13D, 3D),
                box(5D, 9D, 2D, 12D, 13D, 11D)
        );

        VoxelShape DESK_RIGHT = shape(
                box(13D, 0D, 0D, 15D, 9D, 2D),
                box(13D, 7D, 1D, 15D, 13D, 3D),
                box(13D, 7D, 13D, 15D, 13D, 15D),
                box(-15D, 7D, 13D, -13D, 13D, 15D),
                box(-15D, 0D, 0D, -13D, 9D, 2D),
                box(-15D, 0D, 14D, -13D, 9D, 16D),
                box(13D, 0D, 14D, 15D, 9D, 16D),
                box(-16D, 13D, 0D, 16D, 16D, 16D),
                box(-15D, 7D, 1D, -13D, 13D, 3D),
                box(-12D, 9D, 2D, -5D, 13D, 11D)
        );

        VoxelShape DRAWER = shape(
                box(1D, 0D, 1D, 15D, 13D, 15D),
                box(0D, 13D, 0D, 16D, 16D, 16D)
        );

        VoxelShape DRESSER = shape(
                box(-15D, 0D, 1D, 15D, 16D, 15D),
                box(-16D, 13D, 14D, 16D, 16D, 16D),
                box(-16D, 13D, 0D, 16D, 16D, 2D)
        );

        VoxelShape LOCKBOX = shape(
                box(2, 0, 3, 14, 9, 13),
                box(2, 9, 5, 14, 10, 11)
        );

        VoxelShape WARDROBE_TOP = shape(
                box(-15D, 3D, 0D, 15D, 14D, 16D),
                box(-16D, 0D, 0D, 16D, 3D, 16D)
        );

        VoxelShape WARDROBE_BOTTOM = shape(
                box(-14.75D, 0D, .25D, -12.25D, 31D, 2.75D),
                box(-14.75D, 0D, 13.25D, -12.25D, 31D, 15.75D),
                box(12.25D, 0D, 13.25D, 14.75D, 31D, 15.75D),
                box(12.25D, 0D, .25D, 14.75D, 31D, 2.75D),
                box(-14D, 2D, 1D, 14D, 31D, 15D),
                box(-15D, 31D, 0D, 15D, 32D, 16D)
        );

        VoxelShape PAINTING_WIDE = box(-16D, 0D, 14D, 16D, 16D, 16D);

        VoxelShape PAINTING_SMALL = box(0D, 0D, 14D, 16D, 16D, 16D);

        VoxelShape OVEN = shape(
                Block.box(0D, 0D, 0D, 16D, 1D, 16D),
                Block.box(0D, 1D, 1D, 16D, 9D, 16D),
                Block.box(0D, 9D, 0D, 16D, 10D, 16D),
                Block.box(1D, 10D, 3D, 15D, 14D, 16D),
                Block.box(2D, 14D, 3D, 14D, 16D, 16D)
        );

        VoxelShape DOOR_DOUBLE = shape(
                box(0D, 0D, 0D, 13D, 2D, 3D),
                box(0D, 10D, 0D, 13D, 12D, 3D),
                box(0D, 20D, 0D, 13D, 22D, 3D),
                box(13D, 0D, 0D, 16D, 32D, 3D),
                box(12D, 28D, 0D, 13D, 32D, 3D),
                box(10D, 29D, 0D, 12D, 32D, 3D),
                box(8D, 30D, 0D, 10D, 32D, 3D),
                box(3D, 31D, 0D, 8D, 32D, 3D),
                box(0D, 2D, .5D, 13D, 32D, 2.5D)
        );

        VoxelShape DOOR_SINGLE = shape(
                box(0D, 0D, 0D, 13D, 2D, 3D),
                box(0D, 10D, 0D, 13D, 12D, 3D),
                box(0D, 20D, 0D, 13D, 22D, 3D),
                box(0D, 30D, 0D, 13D, 32D, 3D),
                box(13D, 0D, 0D, 16D, 32D, 3D),
                box(0D, 2D, .5D, 13D, 30D, 2.5D)
        );

        VoxelShape BED_SINGLE = shape(
                box(0D, 0D, 0D, 16D, 14D, 2D),
                box(0D, 0D, 30D, 16D, 14D, 32D),
                box(0D, 3D, 2D, 16D, 5D, 30D),
                box(1D, 5D, 2D, 15D, 8D, 30D)
        );

        VoxelShape BED_DOUBLE = shape(
                box(-16D, 3D, 2D, 16D, 5D, 30D),
                box(-14D, 5D, 2D, 14D, 8D, 30D),
                box(-16D, 3D, 0D, 16D, 5D, 2D),
                box(-16D, 0D, 0D, -14D, 8D, 2D),
                box(14D, 0D, 0D, 16D, 8D, 2D),
                box(-16D, 12D, 0D, -8D, 14D, 2D),
                box(8D, 12D, 0D, 16D, 14D, 2D),
                box(-10D, 12D, 0D, 10D, 16D, 2D),
                box(-15D, 5D, 0D, 15D, 12D, 2D),
                box(-15D, 5D, 30D, 15D, 12D, 32D),
                box(-16D, 3D, 30D, 16D, 5D, 32D),
                box(-16D, 0D, 30D, -14D, 8D, 32D),
                box(14D, 0D, 30D, 16D, 8D, 32D),
                box(-16D, 12D, 30D, -8D, 14D, 32D),
                box(8D, 12D, 30D, 16D, 14D, 32D),
                box(-10D, 12D, 30D, 10D, 16D, 32D)
        );

        VoxelShape SHELF_SINGLE = shape(
                box(.5D, 9D, 2D, 2.5D, 14D, 13D),
                box(13.5D, 9D, 2D, 15.5D, 14D, 13D),
                box(0D, 14D, 0D, 16D, 16D, 16D),
                box(13D, 6D, 13D, 16D, 14D, 16D),
                box(0D, 6D, 13D, 3D, 14D, 16D)
        );

        VoxelShape SHELF_CENTER = box(0D, 14D, 0D, 16D, 16D, 16D);

        VoxelShape SHELF_LEFT = shape(
                box(13.5D, 9D, 2D, 15.5D, 14D, 13D),
                box(0D, 14D, 0D, 16D, 16D, 16D),
                box(13D, 6D, 13D, 16D, 14D, 16D)
        );

        VoxelShape SHELF_RIGHT = shape(
                box(.5D, 9D, 2D, 2.5D, 14D, 13D),
                box(0D, 14D, 0D, 16D, 16D, 16D),
                box(0D, 6D, 13D, 3D, 14D, 16D)
        );

        VoxelShape SOFA_SINGLE = shape(
                box(1D, 0D, 1D, 3D, 3D, 3D),
                box(1D, 0D, 13D, 3D, 3D, 15D),
                box(13D, 0D, 13D, 15D, 3D, 15D),
                box(13D, 0D, 1D, 15D, 3D, 3D),
                box(0D, 3D, 0D, 16D, 6D, 16D),
                box(0D, 6D, 13D, 16D, 16D, 16D),
                box(14D, 10D, 0D, 16D, 12D, 14D),
                box(0D, 10D, 0D, 2D, 12D, 14D),
                box(0D, 6D, 0D, 2D, 10D, 2D),
                box(14D, 6D, 0D, 16D, 10D, 2D)
        );

        VoxelShape SOFA_CENTER = shape(
                box(0D, 3D, 0D, 16D, 6D, 16D),
                box(0D, 6D, 13D, 16D, 16D, 16D)
        );

        VoxelShape SOFA_LEFT = shape(
                box(0D, 3D, 0D, 16D, 6D, 16D),
                box(0D, 6D, 13D, 16D, 16D, 16D),
                box(14D, 10D, 0D, 16D, 12D, 13D),
                box(14D, 6D, 0D, 16D, 10D, 2D),
                box(13D, 0D, 1D, 15D, 3D, 3D),
                box(13D, 0D, 13D, 15D, 3D, 15D)
        );

        VoxelShape SOFA_RIGHT = shape(
                box(0D, 3D, 0D, 16D, 6D, 16D),
                box(0D, 6D, 13D, 16D, 16D, 16D),
                box(0D, 10D, 0D, 2D, 12D, 13D),
                box(0D, 6D, 0D, 2D, 10D, 2D),
                box(1D, 0D, 1D, 3D, 3D, 3D),
                box(1D, 0D, 13D, 3D, 3D, 15D)
        );

        VoxelShape SOFA_CORNER = shape(
                box(1D, 0D, 1D, 3D, 3D, 3D),
                box(1D, 0D, 13D, 3D, 3D, 15D),
                box(13D, 0D, 13D, 15D, 3D, 15D),
                box(13D, 0D, 1D, 15D, 3D, 3D),
                box(0D, 3D, 0D, 16D, 6D, 16D),
                box(0D, 6D, 13D, 16D, 16D, 16D),
                box(13D, 6D, 0D, 16D, 16D, 13D)
        );

        VoxelShape COUNTER_SINGLE = shape(
                box(0D, 0D, 3D, 16D, 13D, 16D),
                box(0D, 13D, 0D, 16D, 16D, 16D),
                box(1D, 1D, 2D, 15D, 12D, 3D)
        );

        VoxelShape COUNTER_CORNER = shape(
                box(0D, 0D, 0D, 13D, 13D, 4D),
                box(0D, 0D, 3D, 16D, 13D, 16D),
                box(0D, 13D, 0D, 16D, 16D, 16D)
        );

        static VoxelShape getShelfShape(ShelfBlock block, BlockState blockState)
        {
            return AllVoxelShapes.getShelfShape(shelfType -> switch(shelfType) {
                case LEFT -> Nordic.SHELF_LEFT;
                case RIGHT -> Nordic.SHELF_RIGHT;
                case SINGLE -> Nordic.SHELF_SINGLE;
                case CENTER -> Nordic.SHELF_CENTER;
            }, block, blockState);
        }

        static VoxelShape getSofaShape(SofaBlock block, BlockState blockState)
        {
            return AllVoxelShapes.getSofaShape(sofaShape -> switch(sofaShape) {
                case LEFT -> Nordic.SOFA_LEFT;
                case RIGHT -> Nordic.SOFA_RIGHT;
                case SINGLE -> Nordic.SOFA_SINGLE;
                case CENTER -> Nordic.SOFA_CENTER;
                case CORNER -> Nordic.SOFA_CORNER;
            }, block, blockState);
        }

        static VoxelShape getCounterShape(CounterBlock block, BlockState blockState)
        {
            return AllVoxelShapes.getCounterShape(counterType -> switch(counterType) {
                case SINGLE -> Nordic.COUNTER_SINGLE;
                case CORNER -> Nordic.COUNTER_CORNER;
            }, block, blockState);
        }

        private static void bootstrap() {}
    }

    interface Royal
    {
        private static void bootstrap() {}
    }

    interface Venthyr
    {
        VoxelShape WALL_LIGHT = shape(
                box(6D, 1D, 15D, 10D, 3D, 16D),
                box(5D, 3D, 15D, 11D, 12D, 16D),
                box(6D, 12D, 15D, 10D, 14D, 16D),
                box(7D, 3.5D, 14D, 9D, 5.5D, 15D),
                box(4.25D, 2.5D, 10.5D, 11.75D, 11.5D, 14D)
        );

        VoxelShape FLOOR_LIGHT = shape(
                box(6D, 0D, 6D, 10D, 2D, 10D),
                box(7D, 2D, 7D, 9D, 20D, 9D),
                box(4D, 17.75D, 7D, 7D, 21.75D, 9D),
                box(9D, 17.75D, 7D, 12D, 21.75D, 9D),
                box(7D, 17.75D, 4D, 9D, 21.75D, 7D),
                box(7D, 17.75D, 9D, 9D, 21.75D, 12D),
                box(2.5D, 20.75D, 2.5D, 13.5D, 24D, 13.5D),
                box(10.25D, 24D, 10.25D, 12.5D, 28.75D, 12.5D),
                box(3.5D, 24D, 10.25D, 5.75D, 28.75D, 12.5D),
                box(3.5D, 24D, 3.5D, 5.75D, 28.75D, 5.75D),
                box(10.25D, 24D, 3.5D, 12.5D, 28.75D, 5.75D)
        );

        VoxelShape TABLE_LARGE = shape(
                box(-15D, 0D, 1D, -12D, 2D, 4D),
                box(12D, 0D, 1D, 15D, 2D, 4D),
                box(12D, 0D, 28D, 15D, 2D, 31D),
                box(-15D, 0D, 28D, -12D, 2D, 31D),
                box(-14.5D, 2D, 1.5D, -12.5D, 13D, 3.5D),
                box(-14.5D, 2D, 28.5D, -12.5D, 13D, 30.5D),
                box(12.5D, 2D, 28.5D, 14.5D, 13D, 30.5D),
                box(12.5D, 2D, 1.5D, 14.5D, 13D, 3.5D),
                box(-16D, 13D, 0D, 16D, 16D, 32D)
        );

        VoxelShape TABLE_SMALL = shape(
                box(1D, 0D, 1D, 4D, 2D, 4D),
                box(1D, 0D, 12D, 4D, 2D, 15D),
                box(12D, 0D, 12D, 15D, 2D, 15D),
                box(12D, 0D, 1D, 15D, 2D, 4D),
                box(12.5D, 2D, 1.5D, 14.5D, 13D, 3.5D),
                box(1.5D, 2D, 1.5D, 3.5D, 13D, 3.5D),
                box(1.5D, 2D, 12.5D, 3.5D, 13, 14.5D),
                box(12.5D, 2D, 12.5D, 14.5D, 13D, 14.5D),
                box(0D, 13D, 0D, 16D, 16D, 16D)
        );

        VoxelShape TABLE_WIDE = shape(
                box(12D, 0D, 1D, 15D, 2D, 4D),
                box(-15D, 0D, 1D, -12D, 2D, 4D),
                box(-15D, 0D, 12D, -12D, 2D, 15D),
                box(12D, 0D, 12D, 15D, 2D, 15D),
                box(12.5D, 2D, 12.5D, 14.5D, 13D, 14.5D),
                box(12.5D, 2D, 1.5D, 14.5D, 13D, 3.5D),
                box(-14.5D, 2D, 1.5D, -12.5D, 13D, 3.5D),
                box(-14.5D, 2D, 12.5D, -12.5D, 13D, 14.5D),
                box(-16D, 13D, 0D, 16D, 16D, 16D)
        );

        VoxelShape BENCH = shape(
                box(-14D, 0D, 2D, -11D, 4D, 5D),
                box(-14D, 0D, 11D, -11D, 4D, 14D),
                box(11D, 0D, 11D, 14D, 4D, 14D),
                box(11D, 0D, 2D, 14D, 4D, 5D),
                box(-15D, 4D, 1D, 15D, 7D, 15D)
        );

        VoxelShape CHAIR = shape(
                box(1D, 0D, 1D, 4D, 5D, 4D),
                box(12D, 0D, 1D, 15D, 5D, 4D),
                box(12D, 0D, 12D, 15D, 5D, 15D),
                box(1D, 0D, 12D, 4D, 5D, 15D),
                box(.5D, 5D, .5D, 15.5D, 9D, 15.5D),
                box(1D, 9D, 12D, 15D, 31D, 15D)
        );

        VoxelShape CHANDELIER = box(1D, 0D, 1D, 15, 16D, 15D);

        VoxelShape CUSHION = shape(
                box(2D, 0D, 2D, 5D, 3D, 5D),
                box(2D, 0D, 11D, 5D, 3D, 14D),
                box(11D, 0D, 11D, 14D, 3D, 14D),
                box(11D, 0D, 2D, 14D, 3D, 5D),
                box(1D, 3D, 1D, 15D, 4D, 15D),
                box(2D, 4D, 2D, 14D, 7D, 14D)
        );

        VoxelShape STOOL = shape(
                box(2D, 0D, 2D, 5D, 4D, 5D),
                box(2D, 0D, 11D, 5D, 4D, 14D),
                box(11D, 0D, 11D, 14D, 4D, 14D),
                box(11D, 0D, 2D, 14D, 4D, 5D),
                box(1D, 4D, 1D, 15D, 7D, 15D)
        );

        VoxelShape CHEST = box(-13D, 0D, 1D, 13D, 14.25D, 15D);

        VoxelShape BOOKSHELF = shape(
                box(-16D, 0D, 2D, 16D, 3D, 16D),
                box(-15D, 3D, 3D, 15D, 29D, 16D),
                box(-16D, 29D, 2D, 16D, 32D, 16D)
        );

        VoxelShape DESK_LEFT = shape(
                box(-15D, 0D, 1D, -12D, 2D, 4D),
                box(-15D, 0D, 12D, -12D, 2D, 15D),
                box(12D, 0D, 12D, 15, 2D, 15D),
                box(12D, 0D, 1D, 15, 2D, 4D),
                box(12.5D, 2D, 1.5D, 14.5D, 13D, 3.5D),
                box(-14.5D, 2D, 1.5D, -12.5D, 13D, 3.5D),
                box(-14.5D, 2D, 12.5D, -12.5D, 13D, 14.5D),
                box(12.5D, 2D, 12.5D, 14.5D, 13, 14.5D),
                box(-16D, 13D, 0D, 16D, 16D, 16D),
                box(5D, 9D, 2, 12D, 13D, 11D),
                box(12.5D, 9D, 3.5D, 14.5D, 13D, 12.5D),
                box(-14.5D, 9D, 3.5D, -12.5D, 13D, 12.5D)
        );

        VoxelShape DESK_RIGHT = shape(
                box(-15D, 0D, 1D, -12D, 2D, 4D),
                box(-15D, 0D, 12D, -12D, 2D, 15D),
                box(12D, 0D, 12D, 15D, 2D, 15D),
                box(12D, 0D, 1D, 15D, 2D, 4D),
                box(12.5D, 2D, 1.5D, 14.5D, 13D, 3.5D),
                box(-14.5D, 2D, 1.5D, -12.5D, 13D, 3.5D),
                box(-14.5D, 2D, 12.5D, -12.5D, 13D, 14.5D),
                box(12.5D, 2D, 12.5D, 14.5D, 13D, 14.5D),
                box(-16D, 13D, 0D, 16D, 16D, 16D),
                box(-12D, 9D, 2D, -5D, 13D, 11D),
                box(12.5D, 9D, 3.5D, 14.5D, 13D, 12.5D),
                box(-14.5D, 9D, 3.5D, -12.5D, 13D, 12.5D)
        );

        VoxelShape DRAWER = shape(
                box(.5D, 0D, .5D, 3.5D, 2D, 3.5D),
                box(.5D, 0D, 12.5D, 3.5D, 2D, 15.5D),
                box(12.5D, 0D, 12.5D, 15.5D, 2D, 15.5D),
                box(12.5D, 0D, .5D, 15.5D, 2D, 3.5D),
                box(13D, 2D, 1D, 15D, 13D, 3D),
                box(1D, 2D, 1D, 3D, 13D, 3D),
                box(1D, 2D, 13D, 3D, 13D, 15D),
                box(13D, 2D, 13D, 15D, 13D, 15D),
                box(1D, 5D, 1D, 15D, 13D, 15D),
                box(0D, 13D, 0D, 16D, 16D, 16D)
        );

        VoxelShape DRESSER = shape(
                box(-15.5D, 0D, .5D, -12.5D, 2D, 3.5D),
                box(-15.5D, 0D, 12.5D, -12.5D, 2D, 15.5D),
                box(12.5D, 0D, 12.5D, 15.5D, 2D, 15.5D),
                box(12.5D, 0D, .5D, 15.5D, 2D, 3.5D),
                box(13D, 2D, 1D, 15D, 13D, 3D),
                box(-15D, 2D, 1D, -13D, 13D, 3D),
                box(-15D, 2D, 13D, -13D, 13D, 15D),
                box(13D, 2D, 13D, 15D, 13D, 15D),
                box(-15D, 5D, 1D, 15D, 13D, 15D),
                box(-16D, 13D, 0D, 16D, 16D, 16D)
        );

        VoxelShape LOCKBOX = shape(
                box(2, 1, 4, 14, 10, 12),
                box(1.5, 6, 3.5, 14.5, 7, 12.5),
                box(1.5, 1, 3.5, 14.5, 2, 12.5),
                box(7, 4, 3.5, 9, 6, 4.25),
                box(12, 0, 4, 14, 1, 6),
                box(2, 0, 4, 4, 1, 6),
                box(2, 0, 10, 4, 1, 12),
                box(12, 0, 10, 14, 1, 12)
        );

        VoxelShape WARDROBE_TOP = shape(
                box(-15D, 0D, 1D, 15D, 9D, 15D),
                box(-16D, 9D, 0D, 16D, 11D, 16D)
        );

        VoxelShape WARDROBE_BOTTOM = shape(
                box(-16D, 0D, 0D, -12D, 3D, 4D),
                box(-16D, 0D, 12D, -12D, 3D, 16D),
                box(12D, 0D, 12D, 16D, 3D, 16D),
                box(12D, 0D, 0D, 16D, 3D, 4D),
                box(-15D, 1D, 1D, 15D, 29D, 15D),
                box(-16D, 29D, 0D, 16D, 32D, 16D)
        );

        VoxelShape PAINTING_WIDE = box(-16D, 0D, 14D, 16D, 16D, 16D);

        VoxelShape PAINTING_SMALL = box(0D, 0D, 14D, 16D, 16D, 16D);

        VoxelShape OVEN = shape(
                Block.box(1, 0, 1, 4, 2, 4),
                Block.box(1, 0, 12, 4, 2, 15),
                Block.box(12, 0, 12, 15, 2, 15),
                Block.box(12, 0, 1, 15, 2, 4),
                Block.box(0, 2, 0, 16, 4, 16),
                Block.box(0, 14, 0, 16, 16, 16),
                Block.box(1, 4, 1, 15, 14, 15),
                Block.box(3, 5, 0, 13, 13, 1)
        );

        VoxelShape DOOR_DOUBLE = shape(
                box(0, 0, 0, 16, 1, 3),
                box(14, 1, 0, 16, 32, 3),
                box(0, 31, 0, 14, 32, 3),
                box(0, 0, 0, 1, 31, 3),
                box(6, 30, 0, 14, 31, 3),
                box(8, 29, 0, 14, 30, 3),
                box(10, 27, 0, 14, 29, 3),
                box(11, 25, 0, 14, 27, 3),
                box(12, 22, 0, 14, 25, 3),
                box(13, 17, 0, 14, 22, 3),
                box(1, 1, 0.5, 14, 31, 2.5)
        );

        VoxelShape DOOR_SINGLE = shape(
                box(0, 0, 0, 16, 1, 3),
                box(14, 1, 0, 16, 32, 3),
                box(0, 30, 0, 14, 32, 3),
                box(0, 1, 0, 1, 30, 3),
                box(1, 1, 0.5, 14, 30, 2.5)
        );

        VoxelShape BED_SINGLE = shape(
                box(0D, 0D, 29D, 3D, 2D, 32D),
                box(13D, 0D, 29D, 16D, 2D, 32D),
                box(13D, 0D, 0D, 16D, 2D, 3D),
                box(0D, 0D, 0D, 3D, 2D, 3D),
                box(.5D, 2D, .5D, 2.5D, 12D, 2.5D),
                box(.5D, 2D, 29.5D, 2.5D, 12D, 31.5D),
                box(13.5D, 2D, 29.5D, 15.5D, 12D, 31.5D),
                box(13.5D, 2D, .5D, 15.5D, 12D, 2.5D),
                box(13D, 12D, 0D, 16D, 14D, 3D),
                box(0D, 12D, 0D, 3D, 14D, 3D),
                box(0D, 12D, 29D, 3D, 14D, 32D),
                box(13D, 12D, 29D, 16D, 14D, 32D),
                box(.5D, 0D, 2D, 15.5D, 5D, 30D),
                box(2.5D, 0D, 29.5D, 13.5D, 11D, 31.5D),
                box(2.5D, 0D, .5D, 13.5D, 13D, 2.5D),
                box(1.5D, 5D, 2.5D, 14.5D, 8D, 29.5D)
        );

        VoxelShape BED_DOUBLE = shape(
                box(-16D, 0D, 0D, -13D, 2D, 3D),
                box(-15.5D, 2D, .5D, -13.5D, 12D, 2.5D),
                box(-15.5D, 2D, 29.5D, -13.5D, 12D, 31.5D),
                box(13.5D, 2D, 29.5D, 15.5D, 12D, 31.5D),
                box(13.5D, 2D, .5D, 15.5D, 12D, 2.5D),
                box(-16D, 12D, 0D, -13D, 14D, 3D),
                box(-16D, 12D, 29D, -13D, 14D, 32D),
                box(13D, 12D, 29D, 16D, 14D, 32D),
                box(13D, 12D, 0D, 16D, 14D, 3D),
                box(13D, 0D, 0D, 16D, 2D, 3D),
                box(13D, 0D, 29D, 16D, 2D, 32D),
                box(-16D, 0D, 29D, -13D, 2D, 32D),
                box(-15.5D, 0D, 2.5D, 15.5D, 5D, 29.5D),
                box(-13.5D, 0D, 29.5D, 13.5D, 12D, 31.5D),
                box(-13.5D, 0D, .5D, 13.5D, 14D, 2.5D),
                box(-14.5D, 0D, 2.5D, 14.5D, 8D, 29.5D)
        );

        VoxelShape SHELF_SINGLE = shape(
                box(0D, 13D, 0D, 16D, 16D, 16D),
                box(13D, 9D, 10D, 16D, 13D, 16D),
                box(13D, 11D, 3D, 16D, 13D, 10D),
                box(13D, 10D, 0D, 16D, 13D, 3D),
                box(13D, 6D, 13D, 16D, 9D, 16D),
                box(13D, 3D, 12D, 16D, 6D, 16D),
                box(0D, 3D, 12D, 3D, 6D, 16D),
                box(0D, 9D, 10D, 3D, 13D, 16D),
                box(0D, 11D, 3D, 3D, 13D, 10D),
                box(0D, 10D, 0D, 3D, 13D, 3D),
                box(0D, 6D, 13D, 3D, 9D, 16D)
        );

        VoxelShape SHELF_CENTER = box(0D, 13D, 0D, 16D, 16D, 16D);

        VoxelShape SHELF_LEFT = shape(
                box(0D, 13D, 0D, 16D, 16D, 16D),
                box(13D, 3D, 12D, 16D, 6D, 16D),
                box(13D, 9D, 10D, 16D, 13D, 16D),
                box(13D, 11D, 3D, 16D, 13D, 10D),
                box(13D, 10D, 0D, 16D, 13D, 3D),
                box(13D, 6D, 13D, 16D, 9D, 16D)
        );

        VoxelShape SHELF_RIGHT = shape(
                box(0D, 3D, 12D, 3D, 6D, 16D),
                box(0D, 6D, 13D, 3D, 9D, 16D),
                box(0D, 9D, 10D, 3D, 13D, 16D),
                box(0D, 11D, 3D, 3D, 13D, 10D),
                box(0D, 10D, 0D, 3D, 13D, 3D),
                box(0D, 13D, 0D, 16D, 16D, 16D)
        );

        VoxelShape SOFA_SINGLE = shape(
                box(1D, 0D, 1D, 4D, 2D, 4D),
                box(1D, 0D, 12D, 4D, 2D, 15D),
                box(12D, 0D, 12D, 15D, 2D, 15D),
                box(12D, 0D, 1D, 15D, 2D, 4D),
                box(0D, 2D, 0D, 16D, 6D, 16D),
                box(13D, 6D, 0D, 16D, 10D, 13D),
                box(0D, 6D, 0D, 3D, 10D, 13D),
                box(0D, 6D, 13D, 16D, 16D, 16D)
        );

        VoxelShape SOFA_CENTER = shape(
                Block.box(0, 2, 0, 16, 6, 16),
                Block.box(0, 6, 13, 16, 16, 16)
        );

        VoxelShape SOFA_LEFT = shape(
                Block.box(12, 0, 1, 15, 2, 4),
                Block.box(12, 0, 12, 15, 2, 15),
                Block.box(0, 2, 0, 16, 6, 16),
                Block.box(13, 6, 0, 16, 10, 13),
                Block.box(0, 6, 13, 16, 16, 16)
        );

        VoxelShape SOFA_RIGHT = shape(
                Block.box(1, 0, 1, 4, 2, 4),
                Block.box(1, 0, 12, 4, 2, 15),
                Block.box(0, 2, 13, 16, 16, 16),
                Block.box(0, 2, 0, 3, 10, 13),
                Block.box(3, 2, 0, 16, 6, 13)
        );

        VoxelShape SOFA_CORNER = shape(
                box(1D, 0D, 1D, 4D, 2D, 4D),
                box(1D, 0D, 12D, 4D, 2D, 15D),
                box(12D, 0D, 12D, 15D, 2D, 15D),
                box(12D, 0D, 1D, 15D, 2D, 4D),
                box(13D, 6D, 0D, 16D, 16D, 16D),
                box(0D, 6D, 13D, 13D, 16D, 16D),
                box(0D, 2D, 0D, 16D, 6D, 16D)
        );

        VoxelShape COUNTER_SINGLE = shape(
                box(0, 0, 3, 16, 13, 16),
                box(0, 13, 0, 16, 16, 16),
                box(1, 1, 2, 15, 12, 3)
        );

        VoxelShape COUNTER_CORNER = shape(
                box(0, 0, 3, 16, 13, 16),
                box(0, 13, 0, 16, 16, 16),
                box(1, 1, 2, 15, 12, 3)
        );

        static VoxelShape getShelfShape(ShelfBlock block, BlockState blockState)
        {
            return AllVoxelShapes.getShelfShape(shelfType -> switch(shelfType) {
                case LEFT -> SHELF_LEFT;
                case RIGHT -> SHELF_RIGHT;
                case SINGLE -> SHELF_SINGLE;
                case CENTER -> SHELF_CENTER;
            }, block, blockState);
        }

        static VoxelShape getSofaShape(SofaBlock block, BlockState blockState)
        {
            return AllVoxelShapes.getSofaShape(sofaShape -> switch(sofaShape) {
                case LEFT -> SOFA_LEFT;
                case RIGHT -> SOFA_RIGHT;
                case SINGLE -> SOFA_SINGLE;
                case CENTER -> SOFA_CENTER;
                case CORNER -> SOFA_CORNER;
            }, block, blockState);
        }

        static VoxelShape getCounterShape(CounterBlock block, BlockState blockState)
        {
            return AllVoxelShapes.getCounterShape(counterType -> switch(counterType) {
                case SINGLE -> COUNTER_SINGLE;
                case CORNER -> COUNTER_CORNER;
            }, block, blockState);
        }

        private static void bootstrap() {}
    }

    static void bootstrap()
    {
        Bone.bootstrap();
        Dunmer.bootstrap();
        Necrolord.bootstrap();
        Nordic.bootstrap();
        Royal.bootstrap();
        Venthyr.bootstrap();
    }

    static VoxelShape getWallLightShape(VoxelShape current, WallLightBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(WallLightBlock.FACING);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    static VoxelShape getFloorLightShape(VoxelShape current, FloorLightBlock block, BlockState blockState)
    {
        if(block.getMultiBlockType().isOrigin(blockState)) return current;
        return current.move(0D, -1D, 0D);
    }

    static VoxelShape getTableWideShape(VoxelShape current, SimpleMultiBlock.WithHorizontalFacing block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);

        if(!block.getMultiBlockType().isOrigin(blockState))
        {
            var offset = facing.getClockWise();
            shape = shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        return shape;
    }

    static VoxelShape getTableLargeShape(VoxelShape current, SimpleMultiBlock.WithHorizontalFacing block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);
        var index = block.getMultiBlockType().getIndex(blockState);

        if(index == 1 || index == 3)
        {
            var offset = facing.getClockWise();
            shape = shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        if(index == 2 || index == 3) shape = shape.move(facing.getStepX(), 0D, facing.getStepZ());

        return shape;
    }

    static VoxelShape getBenchShape(VoxelShape current, SimpleSeatBlock.WithMultiBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleSeatBlock.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);

        if(!block.getMultiBlockType().isOrigin(blockState))
        {
            var other = facing.getClockWise();
            shape = shape.move(other.getStepX(), 0D, other.getStepZ());
        }

        return shape;
    }

    static VoxelShape getChairShape(VoxelShape current, SimpleSeatBlock.WithMultiBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleSeatBlock.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);
        if(!block.getMultiBlockType().isOrigin(blockState)) shape = shape.move(0D, -1D, 0D);
        return shape;
    }

    static VoxelShape getCushionShape(VoxelShape current, SimpleSeatBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleSeatBlock.FACING);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    static VoxelShape getStoolShape(VoxelShape current, SimpleSeatBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleSeatBlock.FACING);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    static VoxelShape getChestShape(VoxelShape current, ChestBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);

        if(!block.getMultiBlockType().isOrigin(blockState))
        {
            var offset = facing.getClockWise();
            return shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        return shape;
    }

    static VoxelShape getBookshelfShape(VoxelShape current, BookshelfBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);
        var index = block.getMultiBlockType().getIndex(blockState);

        if(index == 2 || index == 3)
        {
            var offset = facing.getClockWise();
            shape = shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        if(index == 1 || index == 3) shape = shape.move(0D, -1D, 0D);

        return shape;
    }

    static VoxelShape getDeskShape(VoxelShape current, DeskBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);

        if(!block.getMultiBlockType().isOrigin(blockState))
        {
            var offset = facing.getClockWise();
            return shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        return shape;
    }

    static VoxelShape getDrawerShape(VoxelShape current, DrawerBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    static VoxelShape getDresserShape(VoxelShape current, DresserBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);

        if(!block.getMultiBlockType().isOrigin(blockState))
        {
            var offset = facing.getClockWise();
            return shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        return shape;
    }

    static VoxelShape getLockboxShape(VoxelShape current, LockboxBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    static VoxelShape getWardrobeTopShape(VoxelShape current, SimpleMultiBlock.WithHorizontalFacing block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);

        if(!block.getMultiBlockType().isOrigin(blockState))
        {
            var offset = facing.getClockWise();
            return shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        return shape;
    }

    static VoxelShape getWardrobeBottomShape(VoxelShape current, WardrobeBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);
        var index = block.getMultiBlockType().getIndex(blockState);

        if(index == 2 || index == 3)
        {
            var offset = facing.getClockWise();
            shape = shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        if(index == 1 || index == 3) shape = shape.move(0D, -1D, 0D);

        return shape;
    }

    static VoxelShape getPaintingSmallShape(VoxelShape current, SimpleHorizontalFacingBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    static VoxelShape getPaintingWideShape(VoxelShape current, SimpleMultiBlock.WithHorizontalFacing block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);

        if(!block.getMultiBlockType().isOrigin(blockState))
        {
            var offset = facing.getClockWise();
            return shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        return shape;
    }

    static VoxelShape getOvenShape(VoxelShape current, OvenBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    static VoxelShape getDoorShape(VoxelShape current, DoorMultiBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(SimpleMultiBlock.WithHorizontalFacing.FACING).getOpposite();
        var open = blockState.getValue(DoorMultiBlock.OPEN);
        var hinge = blockState.getValue(DoorMultiBlock.HINGE);

        /*if(hinge == DoorHingeSide.RIGHT) facing = facing.getOpposite();
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);

        if(open)
        {
            facing = hinge == DoorHingeSide.RIGHT ? facing.getClockWise() : facing.getCounterClockWise();
            shape = VoxelShapeHelper.rotateHorizontal(current, facing);
            //facing = hinge == DoorHingeSide.RIGHT ? facing.getCounterClockWise() : facing.getClockWise();
            shape = shape.move(-facing.getStepX(), 0D, -facing.getStepZ());
        }

        shape = block.getMultiBlockType().isOrigin(blockState) ? shape : shape.move(0D, -1D, 0D);*/

        Direction shapeFacing;

        if(hinge == DoorHingeSide.LEFT) shapeFacing = open ? facing.getCounterClockWise() : facing;
        else shapeFacing = open ? facing.getOpposite().getClockWise() : facing.getOpposite();

        var shape = VoxelShapeHelper.rotateHorizontal(current, shapeFacing);

        var x = 0D;
        var y = 0D;
        var z = 0D;

        if(!block.getMultiBlockType().isOrigin(blockState)) y -= 1D;

        x -= shapeFacing.getStepX() * .8125D;
        z -= shapeFacing.getStepZ() * .8125D;

        if((hinge == DoorHingeSide.LEFT && !open) || (hinge == DoorHingeSide.RIGHT && open))
        {
            x += shapeFacing.getStepX() * .8125D;
            z += shapeFacing.getStepZ() * .8125D;
        }

        return shape.move(x, y, z);
    }

    static VoxelShape getBedSingleShape(VoxelShape current, BedMultiBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(BedMultiBlock.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);
        if(!block.getMultiBlockType().isOrigin(blockState)) shape = shape.move(facing.getStepX(), 0D, facing.getStepZ());
        return shape;
    }

    static VoxelShape getBedDoubleShape(VoxelShape current, BedMultiBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(BedMultiBlock.FACING);
        var shape = VoxelShapeHelper.rotateHorizontal(current, facing);
        var index = block.getMultiBlockType().getIndex(blockState);

        if(index == 2 || index == 3) shape = shape.move(facing.getStepX(), 0D, facing.getStepZ());

        if(index == 1 || index == 3)
        {
            var offset = facing.getClockWise();
            shape = shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        return shape;
    }

    private static VoxelShape getShelfShape(Function<ShelfType, VoxelShape> shapeGetter, ShelfBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(ShelfBlock.FACING);
        var shelfType = blockState.getValue(ModBlockStateProperties.SHELF_TYPE);
        var current = shapeGetter.apply(shelfType);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    private static VoxelShape getSofaShape(Function<SofaType, VoxelShape> shapeGetter, SofaBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(ShelfBlock.FACING);
        var sofaType = blockState.getValue(ModBlockStateProperties.SOFA_TYPE);
        var current = shapeGetter.apply(sofaType);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    private static VoxelShape getCounterShape(Function<CounterType, VoxelShape> shapeGetter, CounterBlock block, BlockState blockState)
    {
        var facing = blockState.getValue(ShelfBlock.FACING);
        var counterType = blockState.getValue(ModBlockStateProperties.COUNTER_TYPE);
        var current = shapeGetter.apply(counterType);
        return VoxelShapeHelper.rotateHorizontal(current, facing);
    }

    private static VoxelShape shape(VoxelShape... shapes)
    {
        return VoxelShapeHelper.combine(shapes);
    }

    private static VoxelShape box(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
    {
        return Block.box(minX, minY, minZ, maxX, maxY, maxZ);
    }
}
