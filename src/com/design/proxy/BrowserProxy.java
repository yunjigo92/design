package com.design.proxy;

public class BrowserProxy implements IBrowser{

    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;
    }


    @Override
    public Html show() {

        if(html == null){
            this.html = new Html(url);
            System.out.println("browser proxy loading html from :" +  url);
        }
        System.out.println("browser proxy use cache html :" +  url);

        return html;
    }
}
