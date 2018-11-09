package supercoder79.supertech.api.material;

import java.util.ArrayList;

public class Materials {
    public static int NONE = 0;
    public static int GEN_DUST = 1;
    public static int GEN_DUST_SMALL = 2;
    public static int GEN_INGOT = 3;
    public static int GEN_GEM = 5;

    //Registry of all the materials. Don't stick anything in here! let Material do that for you.
    public static ArrayList<Material> materialRegistry = new ArrayList<>();

    //Vanilla materials
    public static Material Iron = new Material("iron", GEN_DUST);
    public static Material Gold = new Material("gold", GEN_DUST);
    public static Material Redstone = new Material("redstone", GEN_DUST_SMALL);
    public static Material Lapis = new Material("lapis", GEN_DUST);
    public static Material Diamond = new Material("diamond", GEN_DUST);
    public static Material Emerald = new Material("emerald", GEN_DUST);

    //Mod materials
    public static Material Lead = new Material("lead", GEN_INGOT);
    public static Material Bauxite = new Material("bauxite", GEN_DUST);
    public static Material Titanium = new Material("titanium", GEN_INGOT);
    public static Material Copper = new Material("copper", GEN_INGOT);
    public static Material Tetrahedrite = new Material("tetrahedrite", GEN_DUST);
    public static Material Ruby = new Material("ruby", GEN_GEM);
    public static Material Sapphire = new Material("sapphire", GEN_GEM);
}
