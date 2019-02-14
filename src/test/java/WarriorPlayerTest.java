import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class WarriorPlayerTest {
    WarriorPlayer warriorPlayer;

    @Before
    public void setUp() throws Exception {
        warriorPlayer = new WarriorPlayer("Rex Dangervest", Race.HUMAN);
    }
}
