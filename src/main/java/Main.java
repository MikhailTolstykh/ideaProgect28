import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {




    public static void main(String[] args) {
        Monster monster = new Monster(1);
        monster.voice(2,"хуй");
        System.out.println(monster.hands);

       Set<String> set =new HashSet<>();
       set.add("Oleg");
       set.add("Misha");
       set.add("Dima");
       set.add("marina");
       set.add("Evgenhhyi");
        for (String a:set
             ) {
            System.out.println(a);

        }

    }
}
