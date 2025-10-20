//public class Main{
//    public static void main(String[] args){
//        int age = -12312;
//        var hour = -3;
//        if(hour<6){
//            System.out.println("сечасноч");
//        }if(hour>=6&&hour<12){
//            System.out.println("сечасудро");
//        }if(hour>=12&&hour<18){
//            System.out.println("сечасден");
//        }if(hour>=18&&hour<24){
//            System.out.println("сечавэчэр");
//        }
//    }
//}
public class Main{
    public static void main(String[] args){
        for (int i=0;i<=7;i++){
            for(int c=0;c<=3;c++){
                if ((i+c)%2==0){
                    System.out.print("■");
                }else{
                    System.out.print("□");
                }
            }
            System.out.println();
        }
    }
}