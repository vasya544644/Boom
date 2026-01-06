import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

//public class vitya {
//    public static void main(String[] args){
//        int vasya = 1123;
//        switch (vasya){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            default:
//                System.out.println("3");
//                break;
//        }
//        String ans = (vasya<13)?")":"(";
//        System.out.println(ans);
//    }
//}
//       byte a = 10;
//       short b = 100;
//       long d = 1000;
//       float e = (float) 1.7;
//       double f = 3.7;
//       System.out.println("Значение переменной a с типом byte равно "+a);
//       System.out.println("Значение переменной b с типом short равно "+b);
//       System.out.println("Значение переменной c с типом int равно "+c);
//       System.out.println("Значение переменной d с типом long равно "+d);
//       System.out.println("Значение переменной e с типом float равно "+e);
//       System.out.println("Значение переменной f с типом double равно "+f);
//
//       var Banans = 5*80;
//       var Milk = 2*105;
//       var Ice = 2*100;
//       var Eggs = 4*70;
//       var weight = Banans+Milk+Ice+Eggs;
//       float weightKg = (float) weight/1000;
//       System.out.println();
//       System.out.println("Все киллограммы за смузи - "+weightKg);
//
//       var Masha = 67760 / 10;
//       var MashaN = 67760 + Masha;
//       var Den = 83690 / 10;
//       var DenN = 83690 + Den;
//       var Kris = 76230 / 10;
//       var KrisN = 76230 + Kris;
//       System.out.println();
//       System.out.println("Маша теперь получает = "+MashaN+". Годовой доход вырос на "+Masha+" рублей.");
//       System.out.println("Денис теперь получает = "+DenN+". Годовой доход вырос на "+Den+" рублей.");
//       System.out.println("Кристина теперь получает = "+KrisN+". Годовой доход вырос на "+Kris+" рублей.");
//Домашняя работа
//public class vitya {
//    public static void main(String[] args){
//        int age = 18;
//        if(age>=2&&age<=6){
//            System.out.println("Если возраст человека равен "+ age+", то ему нужно ходить в садик");
//        }if(age>6&&age<=17){
//            System.out.println("Если возраст человека равен "+ age+", то ему нужно ходить в школу");
//        }if(age>17&&age<=24){
//            System.out.println("Если возраст человека равен "+ age+", то ему нужно ходить в университет");
//        }if(age>24) {
//            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
//        }
//        System.out.println();
//        int a = 45;
//        int train = 102;
//        int seat = 60;
//        if(a>60){
//            System.out.println("В вагоне нет сидячих мест");
//        }else{
//            System.out.println("В вагоне есть сидячие места");
//        }
//        System.out.println();
//        int year = 2021;
//        if(year>1584) {
//            if (year % 100 == 0) {
//                System.out.println("Год не является високосным");
//            } else {
//                if (year % 4 == 0) {
//                    System.out.println("Год является високосным");
//                }else {
//                    System.out.println("Год не является високосным");
//                }
//            }
//        }else{
//            System.out.println("Год не является високосным");
//        }
//        System.out.println();
//        int monthNumber = 12;
//        switch(monthNumber){
//            case 1:
//                System.out.println("Зима");
//                break;
//            case 2:
//                System.out.println("Зима");
//                break;
//            case 3:
//                System.out.println("Весна");
//                break;
//            case 4:
//                System.out.println("Весна");
//                break;
//            case 5:
//                System.out.println("Весна");
//                break;
//            case 6:
//                System.out.println("Лето");
//                break;
//            case 7:
//                System.out.println("Лето");
//                break;
//            case 8:
//                System.out.println("Лето");
//                break;
//            case 9:
//                System.out.println("Осень");
//                break;
//            case 10:
//                System.out.println("Осень");
//                break;
//            case 11:
//                System.out.println("Осень");
//                break;
//            case 12:
//                System.out.println("Зима");
//                break;
//        }
//        if(monthNumber<1){
//            System.out.println("В году только 12 месяцев");
//        }if(monthNumber>12){
//          System.out.println("В году только 12 месяцев");
//        }
//    }
//}
//public class vitya{
//    public static void main(String[] args){
//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }
//        System.out.println();
//        for(int a=0;a<=21;a+=2){
//            System.out.println(a);
//        }
//        System.out.println();
//        for(int b=7;b<=100;b+=7){
//            System.out.println(b);
//        }
//        System.out.println();
//        int bank = 0;
//        int year = 0;
//        for(int c=0;c<=12;c++){
//            bank+=12000;
//            year+=1;
//            System.out.println("Месяц "+year+",сумма накопления равна "+bank+" рублей.");
//        }
//    }
//}
//public class vitya{
//    public static void main(String[] args){
//        int i=0;
//        while(i<=50){
//            i+=1;
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
//
//        System.out.println();
//
//        int number = 0;
//        int kol = 0;
//        do{
//            number++;
//            if(number%7==0){
//                kol+=1;
//            }
//        }while(number<=100);
//        System.out.println(kol);
//
//        System.out.println();
//
//        int s=1;
//        int sum=0;
//        while(s<101){
//            sum+=s;
//            s++;
//        }
//        System.out.println(sum);
//
//        System.out.println();
//
//        int num;
//        int a=0;
//        do{
//            num=(int)(Math.random()*21);
//            a++;
//            System.out.println(num);
//        }while(num!=15);
//        a-=1;
//        System.out.println("Кол-во num до наденного числа - "+a);
//    }

//public class vitya{
//    public static void main(String[] args) {
//       1
//        int[] a = {1, 4, 2, 4};
//        int b = 0;
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//            b += a[i];
//        }
//        float c = (float) b / 2;
//        System.out.println("Среднее значение массива: " + c);
//
//        System.out.println();
//       2
//        int[] d = {-1, -3, -5, -84};
//        for (int i = 0; i < d.length; i++) {
//            if (d[i] < 0) {
//                System.out.println(d[i] * -1);
//            } else {
//                System.out.println(d[i]);
//            }
//        }
//       3
//        System.out.println();
//
//        int[][] f = {
//                {12, 412, 4, 35},
//                {12, 12, 3, 0},
//                {1, 2, 3, 4},
//                {9, 8, 7, 6}
//        };
//        int h = 0;
//        for (int i = 0; i < f.length; i++) {
//            for (int u = 0; u < f[i].length; u++) {
//                h += f[i][u];
//            }
//        }
//        System.out.println(h);
//        4
//        System.out.println();
//        int[] age = {2, 60, 16, 54};
//        int max = age[0];
//        for (int i = 1; i < age.length; i++)
//            max = Math.max(max, age[i]);
//        System.out.println(max);
//        5
//        System.out.println();
//        int[] mass={5,1,2,3,5,2,3};
//        int n = mass[0];
//        for(int i=0;i<mass.length;i++){
//            for(int j=i+1;j<mass.length;j++){
//                if(mass[i]==mass[j]){
//                    System.out.println(mass[i]+" встречается больше одного раза");
//                }
//            }
//        }
//    }
//}
//public class vitya{
//    public static void main(String[] args){
//        int[] mass = {1,2,3,4,5,6};
//        for(int Mas:mass){
//            System.out.print(Mas+" ");
//        }
//        System.out.println();
//        for(int i=0;i< mass.length;i++){
//            System.out.print(mass[i]*2+" ");
//        }
//    }
//}
//public class vitya{
//    public static void main(String[] args){
//        String text = "Я пишу код на Java";
//        int index = text.indexOf("Java");
//        String a;
//        if(index>0){
//            a = "Да";
//        }else{
//            a = "Нет";
//        }
//        System.out.println("Длина строки - "+text.length()+". Первый символ - "+text.charAt(0)+". Содержит Java: "+a);
//
//        System.out.println();
//
//        String str = "Java";
//        System.out.println(str.substring(3));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.indexOf(0));
//
//        System.out.println();
//
//        String name = "Eggs";
//        int num = 10;
//        int one = 7;
//        int all = 7*10;
//        String shop = String.format("Вы купили %s, количество: %d, итоговая стоимость: %d.",name,num,all);
//        System.out.println(shop);
//    }
//}
//class Library{
//    private String[] books=new String[5];
//    private int index = 0;
//    public String[] getBooks(){
//        return books;
//    }
//    public void setBooks(String[] books){
//        this.books = books;
//    }
//    public int getIndex(){
//        return index;
//    }
//    public void setIndex(int index){
//        this.index=index;
//    }
//    public void addBook(String bookTitle){
//        if(index<books.length){
//            books[index]=bookTitle;
//            index++;
//            System.out.println("Книга "+bookTitle+" добавлена.");
//        }else{
//            System.out.println("Библиотека заполнена");
//        }
//    }
//    public void allBooks(){
//        System.out.println("Список всех книг");
//        if(index==0){
//            System.out.println("Библиотека пуста");
//        }else{
//            for(String allBooks:books){
//                System.out.println(allBooks);
//            }
//        }
//    }
//    public void searchBooks(String title){
//        boolean v = false;
//        for(String Title:books){
//            if(Title==title){
//                v=true;
//                System.out.println("Книга найдена");
//                break;
//            }
//        }
//        if(!v){
//            System.out.println("Книга не найдена");
//        }
//    }
//}
//public class Main{
//    public static int multiplay(int a,int b){
//        return a*b;
//    }
//    public static int dum(int n){
//        if(n==0){
//            return 0;
//        }
//        return n+dum(n-1);
//    }
//    public static void product(String name){
//        System.out.println(name);
//    }
//    public static void product(String name,int price){
//        System.out.println(name+"/n"+price);
//    }
//    public static void main(String[] args){
//        System.out.println(multiplay(1,2));
//        System.out.println(dum(13));
//        product("dad");
//        product("momo",1);
//    }
//    public static int sum(int a) {
//        if (a < 10) {
//            return a;
//        } else {
//            return a % 10 + sum(a / 10);
//        }
//    }
//    public static int P(int a){
//        return a*4;
//    }
//}
//class Car{
//    String brand;
//    String color;
//    int year;
//    void drive(){
//        System.out.println(brand+" едет.");
//    }
//    void stopDrive(){
//        System.out.println(brand+" не едет.");
//    }
//    void displayInfo(){
//        System.out.println("Марка: "+brand+". Цвет: "+color+". Год выпуска: "+year);
//    }
//}
//
//class ElectricCar extends Car{
//    @Override
//    void drive(){
//        System.out.println("Двигатель запущен");
//    }
//    void stopDrive(){
//        System.out.println("Двигатель остановлен");
//    }
//    private double battery;
//    public void Bat(double battery){
//        if(battery<20){
//            System.out.println("Батарея разряжена, требуется зарядка");
//        }
//    }
//}
//
//public class vitya{
//    public static void main(String[] args){
//        Car car1 = new Car();
//        car1.brand = "Reno";
//        car1.color = "seroburomalinovyi";
//        car1.year = 1543;
//        car1.drive();
//        car1.stopDrive();
//        car1.displayInfo();
//        ElectricCar tesla = new ElectricCar();
//        tesla.drive();
//        tesla.stopDrive();
//        tesla.Bat(13);
//    }
//}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Недопустимый возраст");
        }
    }
}

class Employee extends Person{
    private double salary;
    public Employee(String name, int age,double salary){
        super(name, age);
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
    }
}

public class vitya{
    public static void main(String[] args){
        Person person = new Person("Dima",12);
        Person person1 = new Employee("Kolya",21,64000);
    }
}

