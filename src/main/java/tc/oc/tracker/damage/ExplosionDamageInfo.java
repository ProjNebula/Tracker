package tc.oc.tracker.damage;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import tc.oc.tracker.base.AbstractDamageInfo;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ExplosionDamageInfo extends AbstractDamageInfo {
    public ExplosionDamageInfo(@Nullable LivingEntity resolvedDamager) {
        super(resolvedDamager);
    }

    @Override
    public
    @Nonnull
    String toString() {
        return "ExplosionDamageInfo{damager=" + this.resolvedDamager + "}";
    }

    @Nonnull
    @Override
    public EntityDamageEvent.DamageCause getDamageCause() {
        return EntityDamageEvent.DamageCause.ENTITY_EXPLOSION;
    }
}
