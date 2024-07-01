package com.fizzware.dramaticdoors.blocks;

import java.util.Optional;
import java.util.function.Supplier;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ShortWeatheringDoorBlock extends ShortDoorBlock implements WeatheringCopper
{
    public static final Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> buildWeatheringList().build());
    public static final Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> NEXT_BY_BLOCK.get().inverse());

    public static final Supplier<BiMap<Block, Block>> WAXABLES = Suppliers.memoize(() -> buildWaxingList().build());
    public static final Supplier<BiMap<Block, Block>> WAX_OFF_BY_BLOCK = Suppliers.memoize(() -> WAXABLES.get().inverse());
    
    public static final MapCodec<ShortWeatheringDoorBlock> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(BlockSetType.CODEC.fieldOf("block_set_type").forGetter(ShortDoorBlock::type), WeatheringCopper.WeatherState.CODEC.fieldOf("weathering_state").forGetter(ShortWeatheringDoorBlock::getAge), propertiesCodec()).apply(inst, ShortWeatheringDoorBlock::new));
    
    private final WeatheringCopper.WeatherState weatherState;

	private static ImmutableBiMap.Builder<Block, Block> buildWeatheringList() {
		ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.<Block, Block>builder();
		builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)));
		builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)));
		builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OXIDIZED_COPPER)));
		if (Compats.modChecker.isModLoaded("immersive_weathering")) {
			builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_IRON)));
			builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_IRON)));
			builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTED_IRON)));
		}
		return builder;
	}
	private static ImmutableBiMap.Builder<Block, Block> buildWaxingList() {
		ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.<Block, Block>builder();
		builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_COPPER)));
		builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_EXPOSED_COPPER)));
		builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_WEATHERED_COPPER)));
		builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OXIDIZED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_OXIDIZED_COPPER)));
		if (Compats.modChecker.isModLoaded("immersive_weathering")) {
			builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_IRON)));
			builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_EXPOSED_IRON)));
			builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_WEATHERED_IRON)));
			builder.put(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_RUSTED_IRON)));
		}
    	return builder;
	}
    
    @Override
    public MapCodec<ShortWeatheringDoorBlock> codec() {
        return CODEC;
    }
	
	public ShortWeatheringDoorBlock(BlockSetType blockset, WeatheringCopper.WeatherState state, Properties properties) {
		super(blockset, properties);
		this.weatherState = state;
	}
	
	// Code for getting waxed and unwaxed.
    public static Optional<BlockState> getWaxed(BlockState state) {
        return Optional.ofNullable(WAXABLES.get().get(state.getBlock())).map(block -> block.withPropertiesOf(state));
    }
    public static Optional<BlockState> getUnwaxed(BlockState state) {
        return Optional.ofNullable(WAX_OFF_BY_BLOCK.get().get(state.getBlock())).map(block -> block.withPropertiesOf(state));
    }
	
	// Code for oxidization.
    public static Optional<Block> getPrevious(Block p_154891_) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(p_154891_));
    }

    public static Block getFirst(Block p_154898_) {
        Block block = p_154898_;

        for(Block block1 = PREVIOUS_BY_BLOCK.get().get(p_154898_); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
            block = block1;
        }

        return block;
    }
	
    public static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map(p_154903_ -> p_154903_.withPropertiesOf(state));
    }

    public static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    public static BlockState getFirst(BlockState state) {
        return getFirst(state.getBlock()).withPropertiesOf(state);
    }

    @Override
	public Optional<BlockState> getNext(BlockState blockstate) {
        return getNext(blockstate.getBlock()).map(p_154896_ -> p_154896_.withPropertiesOf(blockstate));
    }
	
    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource randomsource) {
        this.changeOverTime(state, level, pos, randomsource);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return getNext(state.getBlock()).isPresent();
    }

	public WeatheringCopper.WeatherState getAge() {
		return this.weatherState;
	}
}
