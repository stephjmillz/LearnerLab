package interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

        Person testPerson = new Person(1L,"Niko");
        Assert.assertEquals(java.util.Optional.of(1L), testPerson.getId());


    }

    @Test
    public void testSetName(){
        Person testPerson = new Person(1L,"Niko");
        testPerson.setName("Beecho");
        Assert.assertEquals("Beecho", testPerson.getName());



    }

}
