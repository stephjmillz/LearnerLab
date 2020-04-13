package interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class TestPeople {

    @Test
    public void testAdd(){
        People people = new People();
        people.add(new Person(1L, "Millo"));
        people.add(new Person(2L, "Nobo"));
        people.add(new Person(3L, "Helo"));
        Assert.assertEquals(Integer.valueOf(3), people.count());
    }

    public void testRemove(){
        ArrayList<Person> ti = new ArrayList<>();

        ti.add(new Person(1L, "Gecko"));
        ti.add(new Person(2L, "Lepo"));
        People people = new People();
        Person droke = new Person(3L, "Dohko");
        people.add(droke);
        people.remove(droke);
        Assert.assertFalse(people.contains(droke));



    }

    @Test
    public void testFindById(){
        ArrayList<Person> ki = new ArrayList<>();
        ki.add(new Person(1L,"Leroy"));
        ki.add(new Person(2L, "Neroy"));
    }
}
