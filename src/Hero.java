public abstract  class Hero implements HavingSuperAbility {

    int health;

    private int damage;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHeroesAttackType(String heroesAttackType) {
        this.heroesAttackType = heroesAttackType;
    }

    private String heroesAttackType;
}
