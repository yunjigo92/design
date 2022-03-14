package com.design;

import com.company.design.adapter.*;
import com.design.adapter.*;

public class Main {

    public static void main(String[] args) {
/******************** 싱글톤 패턴 ***********************/
/*        AClass aClass = new AClass();
        BClass bClass = new BClass();
        CClass cClass = new CClass();

        SocketClient aClient = aClass.getSocketClient();
        SocketClient bClient = bClass.getSocketClient();
        SocketClient cClient = cClass.getSocketClient();

        System.out.println("두 객체가 동일한가?");
        //동일하다.
        System.out.println(aClient.equals(bClient));
        //객체를 새로 만든애는 다르다.
        System.out.println(aClient.equals(cClient));*/

/******************** 어댑터 패턴 ***********************/

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

    }

    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

}
