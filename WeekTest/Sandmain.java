package WeekTest;

import WeekTest.Sandday.*;  //자바책 254쪽 참고

public class Sandmain {

    public static void main(String[] args) {

        //객체 생성
        Monday mon = new Monday("빵,버터,","블루베리,베이컨)");
        Tuesday tue = new Tuesday("빵,버터,","상추,베이컨)");
        Wednesday wed = new Wednesday("빵,버터,","단호박)");
        Thursday thu = new Thursday("빵,버터,","계란,샐러드)");
        Friday fri = new Friday("빵,버터,","아보카도,계란)");        


        //베열
        String[] weekday ={"월","화","수","목","금"};
        String[] sandkind ={"블루베리베이컨","상추베이컨","단호박","에그샐러드","아보카도에그"};


        for(int i=0; i<=weekday.length; i++){
            for(int j=0; j<=sandkind.length; j++){

            if(i==j)
            System.out.println(i+"요일에는"+j+"샌드위치(재료:"+mon.BreadButter+mon.BluberryBacon);
            System.out.println(i+"요일에는"+j+"샌드위치(재료:"+tue.BreadButter+tue.SangchuBacon);
            System.out.println(i+"요일에는"+j+"샌드위치(재료:"+wed.BreadButter+wed.Pumpkin);
            System.out.println(i+"요일에는"+j+"샌드위치(재료:"+thu.BreadButter+thu.EggSalad);
            System.out.println(i+"요일에는"+j+"샌드위치(재료:"+fri.BreadButter+fri.AvocadoEgg);
            }
        }
    }     

}   