package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentsTeam implements Iterable<StudentGroup> {
    private List<StudentGroup> team;
    private Integer teamNum;
  /**
   * Класс описывающий студенчесике потоки
   * @param team Студенческий поток
   * @param teamNum Номер студенческого потока
   */
    public StudentsTeam(List<StudentGroup> team, Integer teamNum) {
        this.team = team;
        this.teamNum = teamNum;
    }

    public List<StudentGroup> getTeam() {
        return team;
    }

    public Integer getTeamNum() {
        return teamNum;
    }

    public void setSteam(List<StudentGroup> team) {
        this.team = team;
    }

    public void setTeamNum(Integer teamNum) {
        this.teamNum = teamNum;
    }

    @Override
    public Iterator<StudentGroup> iterator() { //метод подключения итератора к классу
        return new StudensTeamIterator(team);
    }

    @Override
    public String toString() {
        return "StudentsTeam "+ teamNum +" \n" 
                + team +
                "\n";
    }

    

}
