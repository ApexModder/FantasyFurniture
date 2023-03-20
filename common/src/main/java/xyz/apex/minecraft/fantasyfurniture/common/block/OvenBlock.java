package xyz.apex.minecraft.fantasyfurniture.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import xyz.apex.minecraft.apexcore.common.component.ComponentTypes;
import xyz.apex.minecraft.apexcore.common.component.SimpleComponentBlock;
import xyz.apex.minecraft.apexcore.common.component.types.HorizontalFacingComponent;
import xyz.apex.minecraft.apexcore.common.util.VoxelShapeHelper;
import xyz.apex.minecraft.fantasyfurniture.common.block.entity.OvenBlockEntity;
import xyz.apex.minecraft.fantasyfurniture.common.init.*;

import java.util.Optional;

public class OvenBlock extends SimpleComponentBlock implements EntityBlock
{
    public static final BooleanProperty LIT = AbstractFurnaceBlock.LIT;

    public OvenBlock(Properties properties)
    {
        super(properties);

        registerDefaultState(defaultBlockState().setValue(LIT, false));
    }

    private Optional<OvenBlockEntity> getBlockEntity(BlockGetter level, BlockPos pos, BlockState blockState)
    {
        var multiBlockComponent = getComponent(ComponentTypes.MULTI_BLOCK);

        if(multiBlockComponent != null)
        {
            var multiBlockType = multiBlockComponent.getMultiBlockType();

            if(!multiBlockType.isOrigin(blockState))
            {
                var originPos = multiBlockType.getOriginPos(blockState, pos);
                var originBlockState = level.getBlockState(originPos);
                return getBlockEntity(level, originPos, originBlockState);
            }
        }

        return level.getBlockEntity(pos, AllBlockEntityTypes.OVEN.get());
    }

    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos pos, RandomSource random)
    {
        if(!blockState.getValue(LIT)) return;

        var multiBlockComponent = getComponent(ComponentTypes.MULTI_BLOCK);
        if(multiBlockComponent != null && !multiBlockComponent.getMultiBlockType().isOrigin(blockState)) return;

        if(NordicSet.OVEN.hasBlockState(blockState))
        {
            var x = pos.getX() + .5D;
            var y = pos.getY();
            var z = pos.getZ() + .5D;

            if(random.nextDouble() < .1D) level.playLocalSound(x, y, z, SoundEvents.SMOKER_SMOKE, SoundSource.BLOCKS, 1F, 1F, false);

            var facing = blockState.getValue(HorizontalFacingComponent.FACING);
            var axis = facing.getAxis();
            var h = random.nextDouble() * .6D - .3D;
            var xOff = axis == Direction.Axis.X ? facing.getStepX() * .52D : h;
            var yOff = random.nextDouble() * 9D / 16D;
            var zOff = axis == Direction.Axis.Z ? facing.getStepZ() * .52D : h;

            level.addParticle(ParticleTypes.SMOKE, x + xOff, y + yOff, z + zOff, 0D, 0D, 0D);
        }
        else if(VenthyrSet.OVEN.hasBlockState(blockState))
        {
            var x = (double) pos.getX() + .5D;
            var y = (double) pos.getY() + .4D;
            var z = (double) pos.getZ() + .5D;

            if(random.nextDouble() < .1D) level.playLocalSound(x, y, z, SoundEvents.SMOKER_SMOKE, SoundSource.BLOCKS, 1F, 1F, false);

            if(random.nextInt(3) == 0)
            {
                for(var i = 0; i < random.nextInt(1) + 1; i++)
                {
                    level.addParticle(ParticleTypes.LAVA, x, y, z, random.nextFloat() / 16F, 5F, random.nextFloat() / 16F);
                }
            }
        }
        else if(DunmerSet.OVEN.hasBlockState(blockState))
        {
            var facing = blockState.getValue(HorizontalFacingComponent.FACING);

            var x = (double) pos.getX();
            var y = (double) pos.getY() + 1D;
            var z = (double) pos.getZ();

            if(facing == Direction.EAST)
            {
                x += .5D;
            }
            else if(facing == Direction.SOUTH)
            {
                x += 1D;
                z += .5D;
            }
            else if(facing == Direction.NORTH)
            {
                z += .5D;
            }
            else
            {
                x += .5D;
                z += 1D;
            }

            if(random.nextDouble() < .1D) level.playLocalSound(x, y, z, SoundEvents.SMOKER_SMOKE, SoundSource.BLOCKS, 1F, 1F, false);

            level.addParticle(ParticleTypes.SMOKE, x, y, z, 0D, 0D, 0D);
        }
        else if(BoneSet.Wither.OVEN.hasBlockState(blockState) || BoneSet.Skeleton.OVEN.hasBlockState(blockState))
        {
            var x = (double) pos.getX() + .5D;
            var y = (double) pos.getY() + .25D;
            var z = (double) pos.getZ() + .5D;

            if(random.nextDouble() < .1D) level.playLocalSound(x, y, z, SoundEvents.SMOKER_SMOKE, SoundSource.BLOCKS, 1F, 1F, false);

            if(random.nextInt(5) == 0)
            {
                var xOff = random.triangle(.2D, .45D);
                var yOff = random.triangle(.2D, .45D);
                var zOff = random.triangle(.2D, .45D);

                if(random.nextBoolean()) level.addParticle(ParticleTypes.SCULK_SOUL, x + xOff, y + yOff, z + zOff, 0D, 0D, 0D);
                else level.addParticle(ParticleTypes.SCULK_SOUL, x - xOff, y + yOff, z - zOff, 0D, 0D, 0D);
            }

            for(var i = 0; i < random.nextInt(4) + 1; i++)
            {
                var xOff = random.triangle(.2D, .45D);
                var yOff = random.triangle(.2D, .45D);
                var zOff = random.triangle(.2D, .45D);

                if(random.nextBoolean()) level.addParticle(ParticleTypes.MYCELIUM, x - xOff, y + yOff, z - zOff, 0D, 0D, 0D);
                else level.addParticle(ParticleTypes.MYCELIUM, x + xOff, y + yOff, z + zOff, 0D, 0D, 0D);
            }
        }
        else if(NecrolordSet.OVEN.hasBlockState(blockState))
        {
            var x = (double) pos.getX() + .5D;
            var y = (double) pos.getY() + .4D;
            var z = (double) pos.getZ() + .5D;

            if(random.nextDouble() < .1D) level.playLocalSound(x, y, z, SoundEvents.SMOKER_SMOKE, SoundSource.BLOCKS, 1F, 1F, false);

            if(random.nextInt(3) == 0)
            {
                for(var i = 0; i < random.nextInt(1) + 1; i++)
                {
                    level.addParticle(ParticleTypes.LAVA, x, y, z, random.nextFloat() / 16F, 5F, random.nextFloat() / 16F);
                }
            }
        }
    }

    @Override
    public void registerComponents()
    {
        registerComponent(ComponentTypes.HORIZONTAL_FACING);
    }

    @Override
    public boolean triggerEvent(BlockState blockState, Level level, BlockPos pos, int id, int param)
    {
        return getBlockEntity(level, pos, blockState).map(blockEntity -> blockEntity.triggerEvent(id, param)).orElse(false);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState blockState)
    {
        var multiBlockComponent = getComponent(ComponentTypes.MULTI_BLOCK);
        if(multiBlockComponent != null && !multiBlockComponent.getMultiBlockType().isOrigin(blockState)) return null;
        return AllBlockEntityTypes.OVEN.create(pos, blockState);
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder.add(LIT));
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState blockState, @Nullable LivingEntity placer, ItemStack stack)
    {
        super.setPlacedBy(level, pos, blockState, placer, stack);
        if(!stack.hasCustomHoverName()) return;
        getBlockEntity(level, pos, blockState).ifPresent(blockEntity -> blockEntity.setCustomName(stack.getDisplayName()));
    }

    @Override
    public void onRemove(BlockState blockState, Level level, BlockPos pos, BlockState newBlockState, boolean isMoving)
    {
        if(!blockState.is(newBlockState.getBlock()))
        {
            getBlockEntity(level, pos, blockState).ifPresent(blockEntity -> {
                if(level instanceof ServerLevel serverLevel)
                {
                    Containers.dropContents(serverLevel, pos, blockEntity);
                    blockEntity.getRecipesToAwardAndPopExperience(serverLevel, Vec3.atCenterOf(pos));
                }

                level.updateNeighbourForOutputSignal(pos, blockState.getBlock());
            });
        }

        super.onRemove(blockState, level, pos, newBlockState, isMoving);
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState blockState)
    {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos pos)
    {
        return getBlockEntity(level, pos, blockState).map(AbstractContainerMenu::getRedstoneSignalFromContainer).orElse(0);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState, BlockEntityType<T> blockEntityType)
    {
        return AbstractFurnaceBlock.createFurnaceTicker(level, blockEntityType, AllBlockEntityTypes.OVEN.get());
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        VoxelShape shape;

        if(NordicSet.OVEN.hasBlockState(blockState)) shape = AllVoxelShapes.Nordic.OVEN;
        else if(VenthyrSet.OVEN.hasBlockState(blockState)) shape = AllVoxelShapes.Venthyr.OVEN;
        else if(DunmerSet.OVEN.hasBlockState(blockState)) shape = AllVoxelShapes.Dunmer.OVEN;
        else if(BoneSet.Wither.OVEN.hasBlockState(blockState) || BoneSet.Skeleton.OVEN.hasBlockState(blockState)) shape = AllVoxelShapes.Bone.OVEN;
        else if(NecrolordSet.OVEN.hasBlockState(blockState)) shape = AllVoxelShapes.Necrolord.OVEN;
        else if(RoyalSet.OVEN.hasBlockState(blockState)) shape = AllVoxelShapes.Royal.OVEN;
        else return super.getShape(blockState, level, pos, context);

        var facing = blockState.getValue(HorizontalFacingComponent.FACING);
        shape = VoxelShapeHelper.rotateHorizontal(shape, facing);

        var multiBlockComponent = getComponent(ComponentTypes.MULTI_BLOCK);

        if(multiBlockComponent != null && !multiBlockComponent.getMultiBlockType().isOrigin(blockState))
        {
            var offset = facing.getClockWise();
            return shape.move(offset.getStepX(), 0D, offset.getStepZ());
        }

        return shape;
    }

    public static final class WithMultiBlock extends OvenBlock
    {
        public WithMultiBlock(Properties properties)
        {
            super(properties);
        }

        @Override
        public void registerComponents()
        {
            super.registerComponents();
            registerComponent(ComponentTypes.MULTI_BLOCK, AllMultiBlockTypes.MB_1x1x2_FACING);
        }
    }
}
