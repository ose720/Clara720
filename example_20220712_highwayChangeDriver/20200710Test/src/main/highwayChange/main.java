package highwayChange;

import highwayChange.check.CheckPrint;
import highwayChange.driver.*;

public class main {
    public static void main(String[] arg) {
        String[] goway = {"천안", "고속도로", "고속도로", "고속도로", "서울", "알수없음"};

        Car startCar = new Car();

        highwaySimulation(startCar, goway);
    }

    private static void highwaySimulation(Car startCar, String[] goway) {
        for(String index : goway) {
            System.out.println("현재 위치는 "+index+"입니다");
            System.out.println(CheckPrint.viewLocation(index));
//            System.out.println("도시 안입니다.");
            startCar.setDriver(CheckPrint.fixDriver(index));
            System.out.println("[현재 최고 속도는]");
            System.out.println(CheckPrint.getLimitSpeed(startCar.getDriver()));
            System.out.println("[입니다]");
        }
    }
}
