package singleton;

import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Settings settings1 = Settings.getInsstance();

        Settings settings2 = Settings.getInsstance();

        //Settings settings3 = new Settings("AAAA", 12, false);

    }

}
