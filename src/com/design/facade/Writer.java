package com.design.facade;

public class Writer {
    String fileName;

    public Writer(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Write %s 로 연결 합니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s  연결 종료 합니다.", fileName);
        System.out.println(msg);
    }

    public void write(){
        String msg = String.format("Writer %s 로 파일 쓰기를 합니다.", fileName);
        System.out.println(msg);
    }
}
