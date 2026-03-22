public class Student implements Comparable <Student>{
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


    public int compareTo(Student st2){
       int rezFormatie = this.formatieDeStudiu.compareTo(st2.formatieDeStudiu);

       if (rezFormatie !=0 ){
           return rezFormatie;
       }
       return this.nume.compareTo(st2.nume);
    }

}

