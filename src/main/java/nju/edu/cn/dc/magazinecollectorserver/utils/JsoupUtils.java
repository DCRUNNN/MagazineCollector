package nju.edu.cn.dc.magazinecollectorserver.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupUtils {

    private static Document getDocument(String URL) {
        try{
            return Jsoup.connect(URL).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
