import java.util.ArrayList;

public abstract class AbstractPlayer {
    private String name;
    private Race race;
    private PlayerClass playerClass;
    private int level;
    private int experience;
    private int gold;
    private int currentHealth;
    private int maxHealth;
    private int currentStamina;
    private int maxStamina;
    private int currentMana;
    private int maxMana;
    private int strength;
    private int agility;
    private int intellect;
    private AbstractWeapon currentWeapon;
    private ArrayList<AbstractWeapon> allWeapons;
    private int maxWeapons;
//    private ArrayList<WeaponSkill> weaponSkills;
//    private int maxWeaponSkills;
    private ArrayList<Skill> currentSkills;
    private ArrayList<Skill> allSkills;
    private int maxSkills;
    private ArrayList<AbstractSpell> currentSpells;
    private ArrayList<AbstractSpell> allSpells;
    private int maxSpells;
    private ArrayList<IInventory> inventory;
    private int maxInventory;


    public AbstractPlayer(String name, Race race) {
        this.name = name;
        this.race = race;
        this.playerClass = null;
        this.level = 1;
        this.experience = 0;
        this.gold = 0;
        this.currentHealth = 50;
        this.maxHealth = 50;
        this.currentStamina = 50;
        this.maxStamina = 50;
        this.currentMana = 50;
        this.maxMana = 50;
        this.strength = 10;
        this.agility = 10;
        this.intellect = 10;
        this.currentWeapon = null;
        this.allWeapons = new ArrayList<AbstractWeapon>();
        this.maxWeapons = 1;
        this.currentSkills = new ArrayList<Skill>();
        this.allSkills = new ArrayList<Skill>();
        this.maxSkills = 1;
        this.currentSpells = new ArrayList<AbstractSpell>();
        this.allSpells = new ArrayList<AbstractSpell>();
        this.maxSpells = 0;
        this.inventory = new ArrayList<IInventory>();
        this.maxInventory = 10;
    }

    protected void setPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }
    
    protected void addMaxHealth(int gain){
        maxHealth += gain;
    }
    protected void addMaxStamina(int gain){
        maxStamina += gain;
    }
    protected void addMaxMana(int gain){
        maxMana += gain;
    }
    protected void addStrength(int gain){
        strength += gain;
    }
    protected void addAgility(int gain){
        agility += gain;
    }
    protected void addIntellect(int gain){
        intellect += gain;
    }
    protected void addExperience(int gain){
        experience += gain;
    }
    protected void addGold(int gain){
        gold += gain;
    }
    protected void addMaxWeapons(int gain){
        maxWeapons += gain;
    }
    protected void addMaxSkills(int gain){
        maxSkills += gain;
    }
    protected void addMaxSpells(int gain){
        maxSpells += gain;
    }
    protected void addMaxInventory(int gain){
        maxInventory += gain;
    }

    protected void subtractMaxHealth(int loss){
        maxHealth -= loss;
    }
    protected void subtractMaxStamina(int loss){
        maxStamina -= loss;
    }
    protected void subtractMaxMana(int loss){
        maxMana -= loss;
    }
    protected void subtractStrength(int loss){
        strength -= loss;
    }
    protected void subtractAgility(int loss){
        agility -= loss;
    }
    protected void subtractIntellect(int loss){
        intellect -= loss;
    }
    protected void subtractExperience(int loss){
        experience -= loss;
    }
    protected void subtractGold(int loss){
        gold -= loss;
    }
    protected void subtractMaxWeapons(int loss){
        maxWeapons -= loss;
    }
    protected void subtractMaxSkills(int loss){
        maxSkills -= loss;
    }
    protected void subtractMaxSpells(int loss){
        maxSpells -= loss;
    }
    protected void subtractMaxInventory(int loss){
        maxInventory -= loss;
    }

    protected int weaponsCount(){
        return allWeapons.size();
    }
    protected int skillsCount() {
        return allSkills.size();
    }
    protected int spellsCount() {
        return allSpells.size();
    }
    protected int inventoryCount(){
        return inventory.size();
    }

    protected boolean gainItem(IInventory item){
        if (inventoryCount() < maxInventory){
            inventory.add(item);
            return true;
        }
        return false;
    }
    protected boolean gainItem(AbstractWeapon weapon){
        if (inventoryCount() < maxInventory){
                if (weaponsCount() < maxWeapons){
                    gainWeapon(weapon);
                    inventory.add(weapon);
                    return true;
                }
                return false;
        }
        return false;
    }
    protected void gainWeapon(AbstractWeapon weapon){
        allWeapons.add(weapon);
    }
    protected void dropWeapon(AbstractWeapon weapon){
        if (allWeapons.remove(weapon)){
            if (currentWeapon == weapon){
                currentWeapon = null;
            }
        }
    }
    protected void equipWeapon(AbstractWeapon weapon){
        if (allWeapons.contains(weapon)){
            currentWeapon = weapon;
        }
    }


}
