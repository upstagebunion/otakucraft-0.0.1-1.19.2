package net.upstagebunion.otakucraft.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.upstagebunion.otakucraft.Otakucraft;

public class ModPaintings {
    public static final PaintingVariant ARIANA_GRANDE_1  = registerPainting("ariana_grande_1", new PaintingVariant(16, 32));
    public static final PaintingVariant OTAKUCRAFT_P  = registerPainting("otakucraft_p", new PaintingVariant(32, 32));
    public static final PaintingVariant WOMAN_M = registerPainting("woman_m", new PaintingVariant(16, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant){
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(Otakucraft.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings (){
        Otakucraft.LOGGER.debug("Registrando Pinturas para " + Otakucraft.MOD_ID);
    }
}
