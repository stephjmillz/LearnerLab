package interfaces;

public class Student extends Person implements Learner  {

    private double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);
        totalStudyTime = 0.0;
    }



    public void learn(double numberOfHours) {
        totalStudyTime = numberOfHours;

    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}