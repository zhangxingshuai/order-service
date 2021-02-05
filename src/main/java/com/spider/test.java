package com.spider;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            InputStream ins = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(ins));
            StringBuilder sb = new StringBuilder();
            String len = "";
            while ((len = br.readLine())!= null) {
                sb.append(len);
            }
            ins.close();
            System.out.println(sb.toString());
            String regex = "\\w*";
            System.out.println(sb.toString().matches(regex));
            String text = "北京市(海淀区)(朝阳区)(西城区)";
            Pattern pattern = Pattern.compile("<(\\S*?)[^>]*>.*?</>|<.*? />");
            Matcher matcher = pattern.matcher(sb.toString());
            if (matcher.find()) {
                System.out.println(matcher.group(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
