/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.pruebagit2.ejemplocookie;

import javax.servlet.http.Cookie;

/**
 *
 * @author hernando
 */
public class Utilidades {

    public static String devuelveValorCookie(Cookie[] cookies, String nombreCookie) {
        String valor = "";
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (nombreCookie.equals(cookie.getName())) {
                    return (cookie.getValue());
                }
            }
        }
        return (valor);
    }

    public static Cookie devuelveCookie(Cookie[] cookies, String nombreCookie) {
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (nombreCookie.equals(cookie.getName())) {
                    return (cookie);
                }
            }
        }
        return (null);
    }

}
