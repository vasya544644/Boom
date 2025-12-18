public class Main1{
    private static Employee[] employees = new Employee[10];
    private static int n=0;
    public static void addEmployee(String name,int otdel,double salary){
        if(n<employees.length){
            employees[n]=new Employee(name,otdel,salary);
            n++;
        }else{
            System.out.println("НЕЛЬЗЯ добавить сотрудника");
        }
    }
    public static void showEmployees(){
        for(int i=0;i<n;i++){
           System.out.println(employees[i]);
        }
    }
    public static void showFullName(){
        for(int i=0;i<n;i++) {
            System.out.println(employees[i].getFullName());
        }
    }
    public static double sumSalary(){
        double sum=0;
        for(int i=0;i<n;i++) {
            sum+=employees[i].getSalary();
        }
        return sum;
    }
    public static void minSalary(){
        Employee mainEmployee = employees[0];
        for(int i=0;i<n;i++) {
            if(employees[i].getSalary()>mainEmployee.getSalary()){
                mainEmployee=employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: "+mainEmployee);
    }
    public static void maxSalary(){
        Employee mainEmployee = employees[0];
        for(int i=0;i<n;i++) {
            if(employees[i].getSalary()<mainEmployee.getSalary()){
                mainEmployee=employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: "+mainEmployee);
    }
    public static double everageSalary(){
        return sumSalary()/n;
    }
    public static void main(String[] args){
        addEmployee("Вася Пупкин Сергеевич",3,1150);
        addEmployee("Попов Виктор Семёнович",1,1149);
        addEmployee("Иванов Иван Иванович",4,1148);
        addEmployee("Антонов Антон Антонвич",2,1001);
        addEmployee("Суворов Михаил Михайлович",5,231);

        System.out.println("Сотрудники все");
        showEmployees();

        System.out.println("ФИО сотрудников: ");
        showFullName();

        System.out.println("зп:");
        System.out.println("Общая сумма: "+sumSalary()+" тенге");
        System.out.println("Средняя зп: "+everageSalary()+" тенге");
        minSalary();
        maxSalary();
    }
}
