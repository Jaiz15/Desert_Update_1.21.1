package jaiz.desertupdate.item.custom;


import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents{

    public static final FoodComponent RARE_SPICES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 0.9f).build();
    public static final FoodComponent GOURMET_MEAL = new FoodComponent.Builder().nutrition(12).saturationModifier(1.4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 0.1f).build();
}
