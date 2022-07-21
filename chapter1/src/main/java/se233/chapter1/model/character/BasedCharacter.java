package se233.chapter1.model.character;

import se233.chapter1.model.DamageType;
import se233.chapter1.model.item.Armor;
import se233.chapter1.model.item.Weapon;

public class BasedCharacter {
    protected String name, imagepath;
    protected DamageType type;
    protected Integer fullHp, basedPow, basedDef, basedRes;
    protected Integer hp, power, defense, resistance;
    protected Weapon weapon;
    protected Armor armor;

    public String getName() {
        return name;
    }

    public Integer getFullHp() {
        return fullHp;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getResistance() {
        return resistance;
    }

    public String getImagepath() {
        return imagepath;
    }
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
        this.power = this.basedPow + weapon.getPower();
    }
    public void equipArmor(Armor armor){
        this.armor = armor;
        this.defense = this.basedDef + armor.getDefense();
        this.resistance = this.basedRes + armor.getResistance();
    }
    @Override
    public  String toString(){
        return  name;
    }
    public DamageType getType(){
        return  type;
    }

    //Excercise 4
    public void reset(){
        this.power = this.basedPow;
        this.resistance = this.basedRes;
        this.defense = this.basedDef;
    }
}
