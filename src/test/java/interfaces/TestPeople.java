package interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TestPeople {

    @Test
    public void testAdd() {
        List<Person> personList = new ArrayList<>();
        Person expected = new Person(1L,"Lokus");
        personList.add(expected);

        Assert.assertTrue(personList.contains(expected));
    }

    @Test
    public void testFindById() {
        List<Person> personList = new ArrayList<>();
        Person expected = new Person(1L,"Duku");
        Person expected2 = new Person(2L,"Hello");

        People peopleTest = new People();
        Person expected3 = new Person(3L,"Naut");
        personList.add(expected);
        personList.add(expected2);
        peopleTest.add(expected3);
        Person search = peopleTest.findById(3L);

        boolean testing = false;
        Assert.assertEquals(expected3,search);
    }


    public void testRemove() {

            List<Person> personList = new ArrayList<>();
            Person expected = new Person(1L,"Monger");
            personList.add(expected);
            personList.remove(expected);


            Assert.assertFalse(personList.contains(expected));


    }
}


