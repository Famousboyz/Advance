package se233.chapter1.model.item;

import se233.chapter1.model.DamageType;

public class Weapon extends  BasedEquipment{
    private int power;
    private DamageType damageType;
    public Weapon(String name, int power, DamageType damageType, String imagepath){
        this.name = name;
        this.imagepath = imagepath;
        this.setPower(power);
        this.setDamageType(damageType);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    @Override
    public String toString(){
        return  name;
    }
}
