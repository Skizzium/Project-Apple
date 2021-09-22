package com.skizzium.projectapple.entity.boss.skizzik.stages;

import com.skizzium.projectapple.ProjectApple;
import com.skizzium.projectapple.entity.boss.skizzik.Skizzik;
import com.skizzium.projectapple.entity.boss.skizzik.skizzie.CorruptedSkizzie;
import com.skizzium.projectapple.entity.boss.skizzik.skizzie.KaboomSkizzie;
import com.skizzium.projectapple.entity.boss.skizzik.skizzie.Skizzie;
import com.skizzium.projectapple.entity.boss.skizzik.skizzie.WitchSkizzie;
import com.skizzium.projectapple.init.entity.PA_Entities;
import com.skizzium.projectapple.util.PA_BossEvent;
import net.minecraft.world.entity.EntityDimensions;

public class SkizzikStage5 extends AbstractSkizzikStage {
    public SkizzikStage5(Skizzik skizzik) {
        super(skizzik);
    }

    @Override
    public PA_BossEvent.PA_BossBarColor barColor() {
        return ProjectApple.holiday == 1 ? PA_BossEvent.PA_BossBarColor.GOLD : PA_BossEvent.PA_BossBarColor.AQUA;
    }

    @Override
    public int armorValue() {
        return 12;
    }

    @Override
    public int skullLevel() {
        return 3;
    }

    @Override
    public int skizzieSpawnTicks() {
        return 30;
    }
    
    @Override
    public int destroyBlocksTick() {
        return 10;
    }

    @Override
    public float eyeHeight() {
        return 2.75F;
    }

    @Override
    public EntityDimensions hitbox() {
        return new EntityDimensions(2.5F, 3.4F, true);
    }
    
    @Override
    public void skizzieSpawning() {
        if (Math.random() < 0.5) {
            spawnSkizzie(new Skizzie(PA_Entities.SKIZZIE.get(), this.skizzik.level), skizzik.getX(), skizzik.getY(), skizzik.getZ(), skizzik.level);
            spawnSkizzie(new Skizzie(PA_Entities.SKIZZIE.get(), this.skizzik.level), skizzik.getX(), skizzik.getY(), skizzik.getZ(), skizzik.level);
            spawnSkizzie(new Skizzie(PA_Entities.SKIZZIE.get(), this.skizzik.level), skizzik.getX(), skizzik.getY(), skizzik.getZ(), skizzik.level);
        } else {
            if (Math.random() < 0.5) {
                spawnSkizzie(new KaboomSkizzie(PA_Entities.KABOOM_SKIZZIE.get(), this.skizzik.level), skizzik.getX(), skizzik.getY(), skizzik.getZ(), skizzik.level);
                spawnSkizzie(new KaboomSkizzie(PA_Entities.KABOOM_SKIZZIE.get(), this.skizzik.level), skizzik.getX(), skizzik.getY(), skizzik.getZ(), skizzik.level);
            } else {
                if (Math.random() < 0.5) {
                    spawnSkizzie(new WitchSkizzie(PA_Entities.WITCH_SKIZZIE.get(), this.skizzik.level), skizzik.getX(), skizzik.getY(), skizzik.getZ(), skizzik.level);
                } else {
                    /*if (Math.random() < 0.5) {
                        spawnSkizzie(new MinigunSkizzie(PA_Entities.MINIGUN_SKIZZIE, this.skizzik.level), skizzik.getX(), skizzik.getY(), skizzik.getZ(), skizzik.level);
                    }
                    else {*/
                        spawnSkizzie(new CorruptedSkizzie(PA_Entities.CORRUPTED_SKIZZIE.get(), this.skizzik.level), skizzik.getX(), skizzik.getY(), skizzik.getZ(), skizzik.level);
                    //}
                }
            }
        }
    }

    @Override
    public SkizzikStage<? extends SkizzikStageInterface> getStage() {
        return SkizzikStage.STAGE_5;
    }
}
