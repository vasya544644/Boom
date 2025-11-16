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
public class vitya{
    public static void main(String[] args){
        int i=0;
        while(i<=50){
            i+=1;
            if(i%2==0){
                System.out.println(i);
            }
        }

        System.out.println();

        int number = 0;
        int kol = 0;
        do{
            number++;
            if(number%7==0){
                kol+=1;
            }
        }while(number<=100);
        System.out.println(kol);

        System.out.println();

        int s=1;
        int sum=0;
        while(s<101){
            sum+=s;
            s++;
        }
        System.out.println(sum);

        System.out.println();

        int num;
        int a=0;
        do{
            num=(int)(Math.random()*21);
            a++;
            System.out.println(num);
        }while(num!=15);
        a-=1;
        System.out.println("Кол-во num до наденного числа - "+a);
    }
}