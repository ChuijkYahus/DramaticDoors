package com.fizzware.dramaticdoors.forge.datagen;

import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootDataId;
import net.minecraft.world.level.storage.loot.LootDataType;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;

public class DDLootTableProvider extends LootTableProvider
{
	private final List<LootTableProvider.SubProviderEntry> subProviders;

	/*public static DDLootTableProvider create(PackOutput gen) {
		return new DDLootTableProvider(gen, BuiltInLootTables.all(), List.of(new LootTableProvider.SubProviderEntry(DDBlockLoot::new, LootContextParamSets.BLOCK)));
	}*/
	
	public DDLootTableProvider(PackOutput gen, Set<ResourceLocation> set, List<LootTableProvider.SubProviderEntry> list) {
		super(gen, set, list);
		this.subProviders = list;
	}
	
	@Override
	public List<LootTableProvider.SubProviderEntry> getTables() {
		return subProviders;
	}

	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationContext) {
		map.forEach((resourceLocation, lootTable) -> lootTable.validate(validationContext.setParams(lootTable.getParamSet()).enterElement("{" + resourceLocation + "}", new LootDataId<>(LootDataType.TABLE, resourceLocation))));
	}
}
