package net.prehistoricnaturefossils.client.render.skeletons;


import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.client.model.ModelSkeletonAmargasaurus;
import net.prehistoricnaturefossils.client.model.ModelSkeletonAmargasaurusFrame;
import net.prehistoricnaturefossils.client.render.general.RenderArrows;
import net.prehistoricnaturefossils.tile.TileEntityFossilAmargasaurus;
import net.prehistoricnaturefossils.tile.TileEntityFossilAmargasaurus;

public class RenderFossilAmargasaurus extends TileEntitySpecialRenderer<TileEntityFossilAmargasaurus> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage5.png");
    private static final ResourceLocation TEXTURE6 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage6.png");
    private static final ResourceLocation TEXTURE7 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage7.png");
    private static final ResourceLocation TEXTURE8 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage8.png");
    private static final ResourceLocation TEXTURE9 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage9.png");
    private static final ResourceLocation TEXTURE10 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage10.png");
    private static final ResourceLocation TEXTURE11 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage11.png");
    private static final ResourceLocation TEXTURE12 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage12.png");
    private static final ResourceLocation TEXTURE13 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage13.png");
    private static final ResourceLocation TEXTURE14 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage14.png");
    private static final ResourceLocation TEXTURE15 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage15.png");
    private static final ResourceLocation TEXTURE16 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage16.png");
    private static final ResourceLocation TEXTURE17 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage17.png");
    private static final ResourceLocation TEXTURE18 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage18.png");
    private static final ResourceLocation TEXTURE19 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage19.png");
    private static final ResourceLocation TEXTURE20 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_stage20.png");
    private static final ResourceLocation FRAME = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/amargasaurus_frame.png");

    private final ModelSkeletonAmargasaurus modelSkeleton;
    private final ModelSkeletonAmargasaurusFrame modelSkeletonFrame;

    public RenderFossilAmargasaurus() {
        this.modelSkeletonFrame = new ModelSkeletonAmargasaurusFrame();
        this.modelSkeleton = new ModelSkeletonAmargasaurus();
    }

    @Override
    public void render(TileEntityFossilAmargasaurus entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        int currentStage = 0;
        boolean frame = false;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            currentStage = entity.getTileData().getInteger("stage");
            if (entity.getTileData().hasKey("frame") && PrehistoricNatureFossils.doFrames) {
                frame = entity.getTileData().getBoolean("frame");
            }
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        switch (currentStage) {

            case 1: default:
                this.bindTexture(TEXTURE1);
                break;

            case 2:
                this.bindTexture(TEXTURE2);
                break;

            case 3:
                this.bindTexture(TEXTURE3);
                break;

            case 4:
                this.bindTexture(TEXTURE4);
                break;

            case 5:
                this.bindTexture(TEXTURE5);
                break;
            case 6:
                this.bindTexture(TEXTURE6);
                break;
            case 7:
                this.bindTexture(TEXTURE7);
                break;
            case 8:
                this.bindTexture(TEXTURE8);
                break;
            case 9:
                this.bindTexture(TEXTURE9);
                break;
            case 10:
                this.bindTexture(TEXTURE10);
                break;
            case 11:
                this.bindTexture(TEXTURE11);
                break;
            case 12:
                this.bindTexture(TEXTURE12);
                break;
            case 13:
                this.bindTexture(TEXTURE13);
                break;
            case 14:
                this.bindTexture(TEXTURE14);
                break;
            case 15:
                this.bindTexture(TEXTURE15);
                break;
            case 16:
                this.bindTexture(TEXTURE16);
                break;
            case 17:
                this.bindTexture(TEXTURE17);
                break;
            case 18:
                this.bindTexture(TEXTURE18);
                break;
            case 19:
                this.bindTexture(TEXTURE19);
                break;
            case 20:
                this.bindTexture(TEXTURE20);
                break;
        }

        GlStateManager.enableAlpha();
        ModelSkeletonAmargasaurus modelSkeleton = this.modelSkeleton;
        double scale = 1F * RenderDisplayWallMount.scaler;

        GlStateManager.translate(x + 0.5, y + 1.28, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);

        modelSkeleton.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Frame:
        if (frame) {
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableRescaleNormal();
            this.bindTexture(FRAME);
            GlStateManager.enableAlpha();
            ModelSkeletonAmargasaurusFrame modelSkeletonFrame = this.modelSkeletonFrame;
            scale = 1F * RenderDisplayWallMount.scaler;
            GlStateManager.translate(x + 0.5, y + 1.28, z + 0.5);
            GlStateManager.scale(scale,scale,scale);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
            modelSkeletonFrame.renderAll(Minecraft.getMinecraft().player.ticksExisted);
            GlStateManager.disableAlpha();
            GlStateManager.disableRescaleNormal();
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
        }
        //Arrow to show location:
        RenderArrows.showArrows(x, y, z);
    }
}