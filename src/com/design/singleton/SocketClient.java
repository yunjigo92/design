package com.design.singleton;

public class SocketClient {
    private static SocketClient socketClient = null;

    //default 생성자를 private 으로 선언
    private SocketClient(){}

    public static SocketClient getInstance(){
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }
}
