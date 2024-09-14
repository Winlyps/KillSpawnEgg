package winlyps.killSpawnEgg

import org.bukkit.Material
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDeathEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.Plugin

class EventListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onEntityDeath(event: EntityDeathEvent) {
        val entity = event.entity
        val killer = entity.killer ?: return

        // Check if the entity has a corresponding spawn egg
        val entityType = entity.type
        val spawnEggMaterial = getSpawnEggMaterial(entityType) ?: return

        // Give the killer the spawn egg
        killer.inventory.addItem(ItemStack(spawnEggMaterial))
    }

    private fun getSpawnEggMaterial(entityType: EntityType): Material? {
        return when (entityType) {
            EntityType.COW -> Material.COW_SPAWN_EGG
            EntityType.PIG -> Material.PIG_SPAWN_EGG
            EntityType.SHEEP -> Material.SHEEP_SPAWN_EGG
            EntityType.CHICKEN -> Material.CHICKEN_SPAWN_EGG
            EntityType.ZOMBIE -> Material.ZOMBIE_SPAWN_EGG
            EntityType.SKELETON -> Material.SKELETON_SPAWN_EGG
            EntityType.SPIDER -> Material.SPIDER_SPAWN_EGG
            EntityType.CREEPER -> Material.CREEPER_SPAWN_EGG
            EntityType.ENDERMAN -> Material.ENDERMAN_SPAWN_EGG
            EntityType.WITHER_SKELETON -> Material.WITHER_SKELETON_SPAWN_EGG
            EntityType.BLAZE -> Material.BLAZE_SPAWN_EGG
            EntityType.SLIME -> Material.SLIME_SPAWN_EGG
            EntityType.MAGMA_CUBE -> Material.MAGMA_CUBE_SPAWN_EGG
            EntityType.GHAST -> Material.GHAST_SPAWN_EGG
            EntityType.BAT -> Material.BAT_SPAWN_EGG
            EntityType.WITCH -> Material.WITCH_SPAWN_EGG
            EntityType.ENDERMITE -> Material.ENDERMITE_SPAWN_EGG
            EntityType.GUARDIAN -> Material.GUARDIAN_SPAWN_EGG
            EntityType.SHULKER -> Material.SHULKER_SPAWN_EGG
            EntityType.VEX -> Material.VEX_SPAWN_EGG
            EntityType.VINDICATOR -> Material.VINDICATOR_SPAWN_EGG
            EntityType.EVOKER -> Material.EVOKER_SPAWN_EGG
            EntityType.HUSK -> Material.HUSK_SPAWN_EGG
            EntityType.STRAY -> Material.STRAY_SPAWN_EGG
            EntityType.PHANTOM -> Material.PHANTOM_SPAWN_EGG
            EntityType.DROWNED -> Material.DROWNED_SPAWN_EGG
            EntityType.COD -> Material.COD_SPAWN_EGG
            EntityType.SALMON -> Material.SALMON_SPAWN_EGG
            EntityType.PUFFERFISH -> Material.PUFFERFISH_SPAWN_EGG
            EntityType.TROPICAL_FISH -> Material.TROPICAL_FISH_SPAWN_EGG
            EntityType.TURTLE -> Material.TURTLE_SPAWN_EGG
            EntityType.DOLPHIN -> Material.DOLPHIN_SPAWN_EGG
            EntityType.PANDA -> Material.PANDA_SPAWN_EGG
            EntityType.PILLAGER -> Material.PILLAGER_SPAWN_EGG
            EntityType.RAVAGER -> Material.RAVAGER_SPAWN_EGG
            EntityType.WANDERING_TRADER -> Material.WANDERING_TRADER_SPAWN_EGG
            EntityType.FOX -> Material.FOX_SPAWN_EGG
            EntityType.BEE -> Material.BEE_SPAWN_EGG
            EntityType.CAT -> Material.CAT_SPAWN_EGG
            EntityType.HOGLIN -> Material.HOGLIN_SPAWN_EGG
            EntityType.PIGLIN -> Material.PIGLIN_SPAWN_EGG
            EntityType.STRIDER -> Material.STRIDER_SPAWN_EGG
            EntityType.ZOGLIN -> Material.ZOGLIN_SPAWN_EGG
            EntityType.PIGLIN_BRUTE -> Material.PIGLIN_BRUTE_SPAWN_EGG
            EntityType.AXOLOTL -> Material.AXOLOTL_SPAWN_EGG
            EntityType.GLOW_SQUID -> Material.GLOW_SQUID_SPAWN_EGG
            EntityType.GOAT -> Material.GOAT_SPAWN_EGG
            EntityType.ALLAY -> Material.ALLAY_SPAWN_EGG
            EntityType.FROG -> Material.FROG_SPAWN_EGG
            EntityType.TADPOLE -> Material.TADPOLE_SPAWN_EGG
            EntityType.WARDEN -> Material.WARDEN_SPAWN_EGG
            EntityType.CAMEL -> Material.CAMEL_SPAWN_EGG
            else -> null
        }
    }
}