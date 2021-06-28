package services;

import javax.servlet.http.Cookie;

public class CookieServices {


    public static Cookie getCookieByName(Cookie[] cookies,String name){
        if(cookies == null){
            return null;
        }
        for (Cookie c: cookies) {
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
}
