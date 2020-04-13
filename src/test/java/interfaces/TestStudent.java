package interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestStudent {

    @Test

    public void testImplementation(){
        Student student1 = new Student(232322, "Jonn");
        System.out.println(student1 instanceof Learner);


    }

    @Test
    public void testInheritance(){
        Student student2 = new Student(284823, "Json");
        System.out.println(student2 instanceof Person);

    }

    @Test
    public void testLearn(){
        Student student3 = new Student(232424, "Slack");
        Double in = 20.0;
        Double expected = 20.0;
        student3.learn(in);
    }
}
