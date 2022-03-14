package com.design;

import com.design.adapter.*;
import com.design.aop.AopBrower;
import com.design.decorator.*;
import com.design.proxy.Browser;
import com.design.proxy.BrowserProxy;
import com.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

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
/*

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
*/
    /******************** 프록시 패턴 ***********************/
    //특히 AOP가 대표적인 프록시 패턴이다.
/*

        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        IBrowser browserProxy = new BrowserProxy("www.naver.com");
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
*/
/*    // 프록시 패턴 내에 AOP 활용해본 예제
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrower  = new AopBrower("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBrower.show();
        System.out.println("loading first time : "+ end.get());

        aopBrower.show();
        System.out.println("loading second time : "+ end.get());*/

        /******************** 데코레이터 패턴 ***********************/
        ICar audi = new Audi(1000);
        audi.showPrice();

        //a3
        ICar audi3 = new A3(audi,"A3");
        audi3.showPrice();

        //a4
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();

        //a5
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();


    }

}
