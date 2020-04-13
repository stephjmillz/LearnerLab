package interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

        String name = "Niqq";
        Long id = Long.valueOf(222);
        Person person1 = new Person(id, name);
        String expected = "Niqq";
        String actual = person1.getName();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testSetName(){
        String name = "Doh";
        Long id = Long.valueOf(233);
        Person person2 = new Person(id, name);

        person2.setName("Namo");



    }

}
