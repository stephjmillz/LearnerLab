package interfaces;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){

        Instructor testing = new Instructor();
        Boolean newTest = testing instanceof Teacher;
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
        Instructor testing2 = new Instructor(6L, "Brogud");
        Student stundent = new Student(5L, "Bronum");

        testing2.teach(stundent,5);
        Assert.assertEquals(5.0, stundent.getTotalStudyTime(),2000.00);

    }

    @Test
    public void testLecture(){
        Instructor testing3 = new Instructor(1L,"Mikea");
        Student testing4 = new Student(1L, "Delia");
        Student testing5 = new Student(2L, "Heretic");
        Student[] classroom = {testing4, testing5};
        testing3.lecture(classroom,6);
        Assert.assertEquals(3.0, testing4.getTotalStudyTime(),2000.00);

    }
}
