package com.github.pig.waterq.common.util;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by liuchong on 2016/5/27.
 */
public class NetUtil {
    /**
     * http请求交互类
     *
     * @param strurl
     *            地址
     * @param params
     *            参数
     * @return
     */
    public static String getJsonFromUrl(String strUrl, Map<String, String> params) {
        String result = "";
        URL url = null;
        try {
            url = new URL(strUrl);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setUseCaches(false);
            urlConnection.setInstanceFollowRedirects(false);
            urlConnection.setConnectTimeout(10000);
            urlConnection.setReadTimeout(30000);
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            urlConnection.setRequestProperty("Pragma", "no-cache");
            urlConnection.setRequestProperty("Cache-Control", "no-cache");
            int temp = Integer.parseInt(Math.round(Math.random()*7)+"");
            urlConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");//只接受text/html类型，当然也可以接受图片,pdf,*/*任意，就是tomcat/conf/web里面定义那些
            urlConnection.connect();
            DataOutputStream outputStream = null;
            String content = "";
            if (params != null) {
                outputStream = new DataOutputStream(urlConnection
                        .getOutputStream());
                for (String key : params.keySet()) {
                    content += key;
                    content += "=";
                    content += URLEncoder.encode(params.get(key).toString(), "UTF-8");
                    content += "&";
                }
                outputStream.writeBytes(content);
                outputStream.flush();
                outputStream.close();
            }
            if (urlConnection.getResponseCode() == 200) {

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(urlConnection.getInputStream(),
                                "utf-8"));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    result += line;
                }
                reader.close();
            } else {
                result = null;
            }
            urlConnection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }

}
