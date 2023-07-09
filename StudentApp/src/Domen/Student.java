package Domen;


public class Student extends Person implements Comparable<Student> {

    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    // private int age;
    // private String name;

    
    

    // public int getAge() {
    //     return age;
    // }

    // public String getName() {
    //     return name;
    // }

    public int getId() {
        return id;
    }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nStudent [name=" + super.getName() + ", age=" + super.getAge() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }


    
    
    
}


