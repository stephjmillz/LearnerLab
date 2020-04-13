package interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name) {
        super(id, name);
    }

    public Instructor(){
        super(null, null);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }


    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(int beet = 0; beet < learners.length; beet++){
            teach(learners[beet], numberOfHoursPerLearner);
        }




    }
}
