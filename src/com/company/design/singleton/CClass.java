package com.company.design.singleton;

public class CClass {

    private SocketClient socketClient;

    // private 으로 생성한 생성자는 바로 호출되지 않기 때문에
    // socket 생성자를 default 로 변경 후 비교해본다.
    public CClass(){
       // this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
