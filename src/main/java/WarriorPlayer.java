public class WarriorPlayer extends AbstractPlayer {
    public WarriorPlayer(String name, Race race) {
        super(name, race);
        initialise();
    }

    private void initialise(){
        setPlayerClass(PlayerClass.WARRIOR);
        addMaxHealth(20);
        addMaxStamina(10);
        subtractMaxMana(30);
        addStrength(4);
        addAgility(2);
        subtractIntellect(6);
        addMaxWeapons(1);
        addMaxInventory(4);
    }
}
