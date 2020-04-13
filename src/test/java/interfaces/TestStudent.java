package interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestStudent {

    @Test

    public void testImplementation(){
        Student student1 = new Student(2, "Jonn");
        Boolean newTest = student1 instanceof Person;
        Assert.assertTrue(newTest);


    }

    @Test
    public void testInheritance(){
        Student student2 = new Student(4, "Json");
        Boolean newTest = student2 instanceof Person;
        Assert.assertTrue(newTest);

    }

    @Test
    public void testLearn(){
        Student student3 = new Student(232424, "Slack");
        student3.learn(5);
        Assert.assertEquals(5.0, student3.getTotalStudyTime(),2000.00);
    }
}
