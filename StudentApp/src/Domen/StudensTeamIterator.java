package Domen;

import java.util.Iterator;
import java.util.List;

public class StudensTeamIterator implements Iterator {

    private int counter;
    private final List<StudentGroup> team;
/**
 * Класс перебора студенческих групп в потоке
 * @param team Студенческие группы
 */
    public StudensTeamIterator(List<StudentGroup> team) {
        this.team = team;
    }

    @Override
    public boolean hasNext() {
        return counter < team.size();        
    }

    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        return team.get(counter++);
    }

}
