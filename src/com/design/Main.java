package com.design;

import com.design.adapter.*;
import com.design.aop.AopBrower;
import com.design.decorator.*;
import com.design.facade.Ftp;
import com.design.facade.Reader;
import com.design.facade.SftpClient;
import com.design.facade.Writer;
import com.design.observer.Button;
import com.design.observer.IButtonListener;
import com.design.proxy.Browser;
import com.design.proxy.BrowserProxy;
import com.design.proxy.IBrowser;
import com.design.strategy.AppendStrategy;
import com.design.strategy.Base64Strategy;
import com.design.strategy.Encoder;
import com.design.strategy.EncofingStrategy;
import com.design.strategy.NomalStrategy;

import java.util.concurrent.atomic.AtomicLong;

import javax.swing.border.EmptyBorder;

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
        /*
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
        */

        /******************** 옵저버 패턴 ***********************/
        /*
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {

            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
            
        });

        button.click("메세지 전달 : click 1");
        button.click("메세지 전달 : click 2");
        button.click("메세지 전달 : click 3");
        button.click("메세지 전달 : click 4");
        */

        /******************** 파사드 패턴 ***********************/
        /* 파사드 패턴 적용 전 사용법
        Ftp ftpClient = new Ftp("www.yunji.com",22, "home/etc");
        ftpClient.connect();
        ftpClient.moveDir();

        Writer writer = new Writer("test.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disconnect(); */

         /* 파사드 패턴 적용 후 사용법
        SftpClient sftpClient = new SftpClient("www.yunji.com",22,"home/etc","test.tmp");

        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();
        */

        Encoder encoder = new Encoder();
        
        //base64
        EncofingStrategy base64 = new Base64Strategy();
        //nomal
        EncofingStrategy normal = new NomalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }

}
