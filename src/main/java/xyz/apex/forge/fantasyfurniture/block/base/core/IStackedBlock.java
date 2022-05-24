package xyz.apex.forge.fantasyfurniture.block.base.core;

import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.extensions.IForgeBlock;

public interface IStackedBlock extends IForgeBlock
{
	IntegerProperty getStackSizeProperty();

	String getStackableTranslationKey();

	default IFormattableTextComponent getStackableTranslation()
	{
		return new TranslationTextComponent(getStackableTranslationKey());
	}

	default boolean isForStack(ItemStack stack)
	{
		return stack.getItem() == getBlock().asItem();
	}

	static int getMinValue(IntegerProperty property)
	{
		return property.getPossibleValues().stream().mapToInt(i -> i).filter(i -> i <= 0).min().orElse(0);
	}

	static int getMaxValue(IntegerProperty property)
	{
		return property.getPossibleValues().stream().mapToInt(i -> i).filter(i -> i >= 0).max().orElse(0);
	}
}
