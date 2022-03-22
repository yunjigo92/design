package com.design.facade;

public class Ftp {
    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path){
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect(){
        System.out.println("FTP host : " + host + ", port : " + port +"로 연결 합니다.");
    }

    public void moveDir(){
        System.out.println(path +"로 이동합니다.");

    }
    public void disconnect(){
        System.out.println("연결을 종료합니다.");
    }
}
