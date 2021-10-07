package com.skizzium.projectapple.entity.boss.skizzik.stages.stages;

import com.skizzium.projectapple.entity.boss.skizzik.Skizzik;
import com.skizzium.projectapple.entity.boss.skizzik.stages.SkizzikStageManager;
import com.skizzium.projectapple.entity.boss.skizzik.stages.stages.base.SkizzikSleeping;
import com.skizzium.projectapple.gui.PA_BossEvent;
import com.skizzium.projectapple.init.network.PA_PacketRegistry;
import com.skizzium.projectapple.network.BossMusicStopPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.fmllegacy.network.PacketDistributor;

public abstract class AbstractPassiveSkizzikStage extends AbstractSkizzikStage {
    public AbstractPassiveSkizzikStage(Skizzik skizzik) {
        super(skizzik);
    }

    @Override
    public PA_BossEvent.PA_BossBarColor barColor() {
        return PA_BossEvent.PA_BossBarColor.WHITE;
    }

    @Override
    public PA_BossEvent.PA_BossBarOverlay barOverlay() {
        return PA_BossEvent.PA_BossBarOverlay.PROGRESS;
    }

    @Override
    public int armorValue() {
        return 0;
    }
    
    @Override
    public int skullLevel() {
        return 0;
    }

    @Override
    public int skizzieSpawnTicks() {
        return 0;
    }

    @Override
    public boolean playMusic() {
        return false;
    }

    @Override
    public boolean attackStatically() {
        return false;
    }
    
    @Override
    public boolean attackDirectly() {
        return false;
    }

    @Override
    public void begin(SkizzikStageManager stageManager) {
        skizzik.setHealth(this.maxStageHealth());
        skizzik.setEyeHeight(this.eyeHeight());
        
        if (!(stageManager.getCurrentStage() instanceof SkizzikSleeping)) {
            skizzik.setTransitionsTicks(this.transitionTime());
            skizzik.setTransitioning(true);
        }
        
        if (skizzik.level instanceof ServerLevel) {
            PA_PacketRegistry.INSTANCE.send(PacketDistributor.TRACKING_ENTITY.with(() -> this.skizzik), new BossMusicStopPacket());
        }
    }

    @Override
    public void skizzieSpawning() {}
}
