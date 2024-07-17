package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHaliskiaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer bone;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer shoulder;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftwing1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing5membrance2;
    private final ModelRenderer lefthand2;
    private final ModelRenderer leftwing4membrance;
    private final ModelRenderer leftwing3membrance;
    private final ModelRenderer leftwing1membrance;
    private final ModelRenderer rightwing1;
    private final ModelRenderer rightwing2;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing5membrance2;
    private final ModelRenderer righthand2;
    private final ModelRenderer rightwing4membrance;
    private final ModelRenderer rightwing3membrance;
    private final ModelRenderer rightwing1membrance;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;

    public ModelSkeletonHaliskiaFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -7.8F, 6.3F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.3054F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.2469F, -0.3036F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, -1.309F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 27, -0.1F, -0.6F, -2.5F, 1, 1, 5, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 30, -1.0F, 0.3F, -1.1F, 1, 1, 2, -0.15F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, -0.075F, -0.1694F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.659F, 0.0793F, -0.341F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 4.9933F, 0.7866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9397F, 0.2917F, 0.1681F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 5.5665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.2999F, 0.0804F, -0.024F);


        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, -0.075F, -0.1694F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.5098F, -0.1455F, 0.5036F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 4.9933F, 0.7866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.1142F, -0.2917F, -0.1681F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 5.5665F, 0.196F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.2999F, -0.0804F, 0.024F);


        this.rightlegwing2 = new ModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.4691F, 0.092F, 0.4536F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing1 = new ModelRenderer(this);
        this.rightlegwing1.setRotationPoint(0.6039F, 0.0711F, 1.1119F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1367F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.5558F, 0.8424F, 0.9592F);
        this.hips.addChild(bone);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -1.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.6F, -2.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4014F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 17, 0.0F, 0.6F, 0.2F, 1, 1, 3, -0.15F, false));

        this.shoulder = new ModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, -1.1F, -2.6F);
        this.body.addChild(shoulder);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.2F, -1.7F);
        this.shoulder.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 9, 0.0F, 0.5564F, 0.4318F, 1, 1, 2, -0.15F, false));

        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, 0.775F, -2.5694F);
        this.shoulder.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.3677F, 0.2329F, 0.0918F);


        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(5.7709F, -0.2894F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.2449F, 1.2281F, -2.7303F);


        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.7415F, 7.654F, -0.649F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.1116F, 0.2137F, 0.6075F);


        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.2828F, 7.0557F, 0.701F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.9745F, -0.6044F, 3.1231F);


        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0799F, 0.4836F, 11.346F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1458F, -0.0059F, 0.1856F);


        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.0594F, 0.0781F, 0.2095F);


        this.leftwing5membrance2 = new ModelRenderer(this);
        this.leftwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.leftwing6.addChild(leftwing5membrance2);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(0.0413F, -0.1155F, 0.5237F);
        this.leftwing4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, 1.2451F, 1.4993F, -2.6545F);


        this.leftwing4membrance = new ModelRenderer(this);
        this.leftwing4membrance.setRotationPoint(-12.2799F, 3.7836F, 3.946F);
        this.leftwing4.addChild(leftwing4membrance);


        this.leftwing3membrance = new ModelRenderer(this);
        this.leftwing3membrance.setRotationPoint(0.5397F, 0.1609F, 0.9501F);
        this.leftwing2.addChild(leftwing3membrance);


        this.leftwing1membrance = new ModelRenderer(this);
        this.leftwing1membrance.setRotationPoint(1.3496F, 0.2368F, 2.9355F);
        this.leftwing1.addChild(leftwing1membrance);
        this.setRotateAngle(leftwing1membrance, 0.0021F, -0.3752F, -0.0093F);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.4F, 0.475F, -2.5694F);
        this.shoulder.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.3865F, 0.2253F, 0.3957F);


        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-5.7709F, -0.2894F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.0543F, -1.3093F, 2.6221F);


        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.7415F, 7.654F, -0.649F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.0355F, -0.2352F, -0.3398F);


        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.2828F, 7.0557F, 0.701F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.6774F, 0.6337F, 2.9489F);


        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0799F, 0.4836F, 11.346F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1458F, 0.0059F, -0.1856F);


        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.0594F, -0.0781F, -0.2095F);


        this.rightwing5membrance2 = new ModelRenderer(this);
        this.rightwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.rightwing6.addChild(rightwing5membrance2);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(-0.0413F, -0.1155F, 0.5237F);
        this.rightwing4.addChild(righthand2);
        this.setRotateAngle(righthand2, 1.2451F, -1.4993F, 2.6545F);


        this.rightwing4membrance = new ModelRenderer(this);
        this.rightwing4membrance.setRotationPoint(12.2799F, 3.7836F, 3.946F);
        this.rightwing4.addChild(rightwing4membrance);


        this.rightwing3membrance = new ModelRenderer(this);
        this.rightwing3membrance.setRotationPoint(-0.5397F, 0.1609F, 0.9501F);
        this.rightwing2.addChild(rightwing3membrance);


        this.rightwing1membrance = new ModelRenderer(this);
        this.rightwing1membrance.setRotationPoint(-1.3496F, 0.2368F, 2.9355F);
        this.rightwing1.addChild(rightwing1membrance);
        this.setRotateAngle(rightwing1membrance, 0.0021F, 0.3752F, 0.0093F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.7F, -2.4F);
        this.shoulder.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.0873F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.1708F, -0.0961F);
        this.neck3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.5708F, 0.0524F, 1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 42, -1.2F, -0.5F, -2.5F, 1, 1, 5, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6729F, -0.0176F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.6232F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 46, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.16F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.3F, -1.4F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 45, -0.5F, -0.2F, 0.4F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1F, -1.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1309F, -0.0436F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.3F, -1.9F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3665F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 52, 0.0F, 0.7F, 0.0F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.7F, -1.9F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1309F, 0.0873F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.8F, -1.7F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2094F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 57, 6, 0.0F, 0.5F, -0.2F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8F, -1.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0426F, 0.4264F, 0.0233F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 1.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1232F, 0.1299F, -0.016F);
        this.tail.cubeList.add(new ModelBox(tail, 45, 12, -0.5F, 0.4F, -0.6F, 1, 1, 3, -0.15F, false));

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
