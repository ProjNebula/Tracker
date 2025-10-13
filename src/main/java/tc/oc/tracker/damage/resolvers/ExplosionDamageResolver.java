package tc.oc.tracker.damage.resolvers;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import tc.oc.tracker.DamageInfo;
import tc.oc.tracker.DamageResolver;
import tc.oc.tracker.Lifetime;
import tc.oc.tracker.damage.ExplosionDamageInfo;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ExplosionDamageResolver implements DamageResolver {
    @Nullable
    @Override
    public DamageInfo resolve(@Nonnull LivingEntity entity, @Nonnull Lifetime lifetime, @Nonnull EntityDamageEvent damageEvent) {
        if (damageEvent instanceof EntityDamageByEntityEvent event
                && damageEvent.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) {
            if (event.getDamager() instanceof Player player) {
                return new ExplosionDamageInfo(player);
            }
        }

        return null;
    }
}
