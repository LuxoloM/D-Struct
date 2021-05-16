package za.ac.cput;

import org.junit.Test;
import static org.junit.Assert.*;

public class GroupTest {

    Group gr1 = new Group();
    Group gr2 = new Group("David", "567890");

    @Test
    public void map() {
        Groups map1 = new Groups("Busiswa", "122213");
        Groups map2 = new Groups("Luxolo", "141516");

        gr1.map(map1);
        gr1.map(map2);

        gr1.displayMap("Luxolo");
        gr1.displayMap("Busiswa");
        gr1.deleteMap("Busiswa");
    }

    @Test
    public void list() {
        gr1.list(1);
        gr1.list(2);
        gr1.displayList();
    }

    @Test
    public void removeList() {
        gr1.list(1);
        gr1.list(2);
        gr1.removeList();
    }

    @Test
    public void set() {
        gr1.set("Bob");
        gr1.set("Phumza");
        gr1.set("54321");
        gr1.displaySet();
    }

    @Test
    public void removeSet() {
        gr1.set("Bob");
        gr1.set("Phumza");
        gr1.removeSet();
    }





}
