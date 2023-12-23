package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Боб");
        ReportGeneration reportGeneration = new ReportGeneration();
        reportGeneration.generateReport(user);
        Persister persister = new Persister(user);
        persister.save(user);
    }
}