import java.util.ArrayList;
import java.util.List;

static class Student13{
    int id;
    String name;
    int mark;

    public Student13(int id, String name, int mark){
        this.id = id;
        this.name = name;
        this.mark = mark;

    }
}

public static void main(){
    List<Student13> list = new ArrayList();
    list.add(new Student13(1, "john", 50));
    list.add(new Student13(2, "marry", 60));
    list.add(new Student13(3, "joy", 75));

    System.out.println(list.stream().map(this::getStudentName).toList());
}


public <Student1> void getStudentName(int id, String name, int mark ){

}

