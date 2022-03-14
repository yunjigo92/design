package com.design.aop;

import com.design.proxy.Html;
import com.design.proxy.IBrowser;

public class AopBrower implements IBrowser {

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;


    public AopBrower (String url, Runnable before, Runnable after){
        this.url = url;
        this.before = before;
        this.after = after;
    }


    @Override
    public Html show() {

        before.run();

        if(html == null){
            this.html = new Html(url);
            System.out.println("Aop Browser html loading from : " + url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Aop Browser html using cache : " + url);

        after.run();

        return html;
    }
}
