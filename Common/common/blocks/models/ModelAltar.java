package common.blocks.models;

import java.util.List;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class ModelAltar extends ModelBase {
    // fields
    ModelRenderer Shape1;

    public ModelAltar() {
        textureWidth = 96;
        textureHeight = 48;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 16, 16, 32);
        Shape1.setRotationPoint(0F, 0F, 0F);
        Shape1.setTextureSize(96, 48);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 1.570796F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
