package interfaces;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){

        Instructor testing = new Instructor();
        Boolean = newTest = testing instanceof Teacher;
        Assert.assertTrue(newTest);

    }

    @Test
    public void testInheritance(){
        Instructor testing1 = new Instructor();
        Boolean newTest = testing1 instanceof Person;
        Assert.assertTrue(newTest);
    }

    @Test
    public void testTeach(){
        Instructor testing1 = new Instructor();
        Student testing2 = new Student(2233233, "Roger");
    }
}
