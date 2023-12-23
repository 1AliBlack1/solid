package homework;

public class User implements Reportable{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(Savable savable){
        savable.save(this);
    }


    @Override
    public void report() {
        ReportGeneration reportGeneration = new ReportGeneration();
        reportGeneration.generateReport(this);
    }
}
