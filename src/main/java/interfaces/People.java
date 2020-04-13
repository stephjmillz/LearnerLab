package interfaces;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class People implements Iterable {

    List<Person> personList = new ArrayList<>();


    public void add(Person m) {
        personList.add(m);
    }

    public Person findById(Long id) {
        for (Person person : personList) {
            if (person.getId().equals(id))
                return person;
        }

        return null;
    }

    public boolean contains(Person m){
        for (Person person : personList){
            if (person.equals(m))
                return true;
        }

        return false;
    }

    public void remove(Person m){
        if(contains(m))
            personList.remove((int)getIndexOf(m));
    }

    public void remove(Long id){
        Person m = findById(id);
        if (m != null)
            personList.remove((int)getIndexOf(m));
    }

    public Integer getIndexOf(Person m){
        for (int r = 0; r < personList.size(); r++){
            if (personList.get(r).equals(m))
                return r;
        }
        return -1;
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }
        public Person[] toArray(){
            Person[] res = (Person[])personList.toArray();
            return res;
        }

        public Iterator iterator() {
            return personList.iterator();


        }
}
