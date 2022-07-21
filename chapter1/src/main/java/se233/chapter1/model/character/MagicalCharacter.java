package se233.chapter1.model.character;

import se233.chapter1.model.DamageType;

public class MagicalCharacter extends  BasedCharacter{
    public MagicalCharacter(String name, String imagepath, int basedDef, int basedRes){
        this.name = name;
        this.type = DamageType.magical;
        this.imagepath = imagepath;
        this.fullHp = 30;
        this.basedPow = 50;
        this.basedDef = basedDef;
        this.basedRes = basedRes;
        this.hp = this.fullHp;
        this.power = this.basedPow;
        this.defense = basedDef;
        this.resistance = basedRes;
    }

}
