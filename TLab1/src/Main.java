import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(300, "Mihaela", "Popescu", "ISM Grupa 21");
        System.out.println(student1);
        Student student2 = new Student(210, "Bianca", "Florescu", "ISM Grupa 21");
        Student student3 = new Student(90, "Maria", "Zidu", "ISM Grupa 21");
        Student student4 = new Student(157, "Ana", "Berea", "ISM Grupa 21");

        List<Student> ListaStudenti = new ArrayList();
        ListaStudenti.add(student1);
        ListaStudenti.add(student2);
        ListaStudenti.add(student3);
        ListaStudenti.add(student4);

        for (Student s : ListaStudenti)
            System.out.println(s);


    }
}
