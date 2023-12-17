package com.devfun.settingweb_boot.service;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@Component
public class OpenApiExplorer {

    public JSONObject getHolidayExplorer(String solYear, String solMonth) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B090041/openapi/service/SpcdeInfoService/getRestDeInfo");
        urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=******"); 
        urlBuilder.append("&" + URLEncoder.encode("solYear", "UTF-8") + "=" + URLEncoder.encode(solYear, "UTF-8")); 
        urlBuilder.append("&" + URLEncoder.encode("solMonth", "UTF-8") + "=" + URLEncoder.encode(solMonth, "UTF-8")); 

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());

        BufferedReader rd;
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }

        StringBuilder xmlSb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            xmlSb.append(line);
        }
        rd.close();
        conn.disconnect();

        JSONObject jsonSb = XML.toJSONObject(xmlSb.toString());

        return jsonSb;
    }
}
