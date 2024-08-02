package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSynthetocerasFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer leftHorn;
    private final ModelRenderer rightHorn;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonSynthetocerasFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -25.0F, 11.2F, 1, 25, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -22.0F, -12.1F, 1, 22, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -15.5F, -11.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.5F, -3.5F, -0.5F, 1, 8, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -7.5F, -4.5F, 22.8F, 1, 10, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -25.0F, 11.0F);
        this.fossil.addChild(hips);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.7F, -4.3F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -0.5F, 0.4F, 0.0F, 1, 1, 6, -0.154F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.4F, 2.6F, 1.1F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3578F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.6769F, 0.2997F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.2915F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.0737F, -0.8446F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 6.3414F, -0.0063F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.925F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4F, -0.2629F, -4.5144F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.4F, 2.6F, 1.1F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.7941F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.6769F, 0.2997F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2915F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.0737F, -0.8446F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5672F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 6.3414F, -0.0063F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.925F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4F, -0.2629F, -4.5144F);
        this.rightLeg4.addChild(rightLeg5);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.4F, -4.2F);
        this.hips.addChild(body2);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.8F, -6.0F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 3, -0.5F, 0.7F, 0.2F, 1, 1, 6, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2F, -6.0F);
        this.body2.addChild(body);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.1F, -0.8F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 9, -0.5F, 0.4F, -5.8F, 1, 1, 7, -0.154F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.1F, -6.8F);
        this.body.addChild(chest);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.4F, -5.4F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, -1, -0.5F, -0.189F, -0.2323F, 1, 1, 7, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.6F, 6.9651F, -5.6441F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.5411F, 0.0F, 0.0F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 4.5389F, 2.1847F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.7418F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 7.3551F, 0.2659F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.6894F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 4.8F, -0.1F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.2618F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.6F, 6.9651F, -5.6441F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.1484F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 4.5389F, 2.1847F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.5236F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 7.3551F, 0.2659F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2094F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 4.8F, -0.1F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.6981F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.8F, -5.1F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, -0.2182F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.9F, -2.8F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5061F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, -1, -0.5F, -0.3F, -0.5F, 1, 1, 4, -0.154F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.4F, -2.5F);
        this.neck3.addChild(neck2);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.2F, -1.9F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.9687F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 33, -0.5F, 0.5319F, 0.0279F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.9F, -2.1F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2182F, -0.3927F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.7F, -2.0F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.8727F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 65, 64, -0.5F, -0.3753F, -1.1709F, 1, 3, 1, -0.154F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.4F, -2.0F);
        this.neck.addChild(head);


        this.leftHorn = new ModelRenderer(this);
        this.leftHorn.setRotationPoint(2.3F, -1.8514F, -2.4533F);
        this.head.addChild(leftHorn);
        this.setRotateAngle(leftHorn, -0.0349F, -0.1047F, 0.0F);


        this.rightHorn = new ModelRenderer(this);
        this.rightHorn.setRotationPoint(-2.3F, -1.8514F, -2.4533F);
        this.head.addChild(rightHorn);
        this.setRotateAngle(rightHorn, -0.0349F, 0.1047F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.6F, -1.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 1.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3491F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 33, 43, -0.5F, 0.4503F, -0.0853F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0497F, 2.8147F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.5411F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 9, -0.5F, 0.4598F, 0.0768F, 1, 1, 3, -0.154F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.6109F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 57, 47, -0.5F, 0.4F, 0.0F, 1, 1, 2, -0.15F, false));

    }

    public void renderAll(float f) {
        this.fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
