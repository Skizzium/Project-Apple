package com.skizzium.projectapple.effect;

import com.skizzium.projectapple.entity.boss.skizzik.FriendlySkizzik;
import com.skizzium.projectapple.entity.boss.skizzik.Skizzik;
import com.skizzium.projectapple.entity.boss.skizzik.skizzie.friendly.FriendlyWitchSkizzie;
import com.skizzium.projectapple.entity.boss.skizzik.stages.stages.base.SkizzikFinishHim;
import com.skizzium.projectapple.init.entity.PA_Entities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.phys.Vec3;

public class ConversionEffect extends MobEffect {
    public ConversionEffect(MobEffectCategory harmful, int amplifier) {
        super(harmful, amplifier);
    }

    @Override
    public boolean isBeneficial() {
        return true;
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributes, int amplifier) {
        super.addAttributeModifiers(entity, attributes, amplifier);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        super.applyEffectTick(entity, amplifier);
        if (entity instanceof Skizzik) {
            if (((Skizzik) entity).isConverting() && ((Skizzik) entity).stageManager.getCurrentStage() instanceof SkizzikFinishHim) {
                if (entity.getHealth() < entity.getMaxHealth()) {
                    entity.heal(0.085F);
                }
            }
        }
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributes, int amplifier) {
        super.removeAttributeModifiers(entity, attributes, amplifier);
        if (entity instanceof Skizzik) {
            if (((Skizzik) entity).isConverting() && ((Skizzik) entity).stageManager.getCurrentStage() instanceof SkizzikFinishHim && entity.level instanceof ServerLevel) {
                FriendlySkizzik friendlySkizzik = new FriendlySkizzik(PA_Entities.FRIENDLY_SKIZZIK.get(), entity.level);

                friendlySkizzik.moveTo(entity.getX(), entity.getY(), entity.getZ(), entity.xRotO, entity.yRotO);
                friendlySkizzik.setYBodyRot(entity.yBodyRot);
                friendlySkizzik.setYHeadRot(entity.yHeadRot);

                ((Mob) friendlySkizzik).finalizeSpawn((ServerLevel) entity.level, entity.level.getCurrentDifficultyAt(friendlySkizzik.blockPosition()), MobSpawnType.CONVERSION, null, null);
                entity.level.addFreshEntity(friendlySkizzik);

                LightningBolt lightning = EntityType.LIGHTNING_BOLT.create(entity.level);
                lightning.moveTo(Vec3.atCenterOf(friendlySkizzik.blockPosition()));
                friendlySkizzik.level.addFreshEntity(lightning);

                entity.discard();
            }
        }
    }
}
