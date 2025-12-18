public class Employee{
    private static int nextId=1;
    private int  id;
    private String fullName;
    private int otdel;
    private double salary;

    public Employee(String fullName,int otdel, double salary){
        this.id = nextId;
        nextId++;
        this.fullName = fullName;
        this.otdel = otdel;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public int getOtdel() {
        return otdel;
    }
    public double getSalary() {
        return salary;
    }
    public void setOtdel(int newOtdel){
        otdel=newOtdel;
    }
    public void setSalary(double newSalary) {
        salary=newSalary;
    }
    public String toString(){
        return "ID: "+id+". ФИО: "+fullName+". Отдел: "+otdel+". Зарплата: "+salary;
    }
}