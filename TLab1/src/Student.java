import java.util.List;

public class Student {
    private int numarMatricol;
    private String prenume;
    private String nume;
    private String formatieDeStudiu;

    public Student (int numarMatricol,String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol=numarMatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieDeStudiu;
    }
    public String toString(){
        return "Student: " + numarMatricol+ ", "+  prenume +", "+ nume + ", " + formatieDeStudiu;
    }
    @Override
    public boolean equals (Object obj){
        Student nou = (Student) obj; //Transform obiectul primit intr un Student
        return this.prenume.equals(nou.prenume) &&
                this.nume.equals(nou.nume)&&
                this.formatieDeStudiu.equals(nou.formatieDeStudiu);

    }
    @Override
    public int hashCode(){
        return (prenume + nume + formatieDeStudiu ).hashCode();
    }


}

