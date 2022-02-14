package HttpUrlConnection;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HttpUrlConnectionService {

    public static HttpURLConnection getHttpURLConnection(String url, Map<String, String> requestPropertyMap) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        httpURLConnection.setReadTimeout(7000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("GET");
        for (Map.Entry<String, String> entry : requestPropertyMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            requestPropertyMap.put(key, value);
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public static String getResponseBody(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == httpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                String inputLine;
                while ((inputLine = reader.readLine()) != null) {
                    stringBuffer.append(inputLine);
                }
                reader.close();
            } else {
                return "Request not worked. Response Code : "+responseCode;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public static List<String> regexOperation(String regex, String stringToCheck) {
        List<String> matchingList = new ArrayList<>();
        if(!stringToCheck.contains("Request not worked. Response Code : ")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(stringToCheck);
            while (matcher.find()) {
                matchingList.add(matcher.group(1));
            }
            return matchingList;
        }
        matchingList.add(stringToCheck);
        return matchingList;
    }

    public static void printData(List<String> dataList) {
        if (dataList!= null && !dataList.contains("Request not worked. Response Code : ")) {
            System.out.println(dataList.stream().collect(Collectors.toList()));
        }
    }

    public static void main(String[] args) {
        try {
            String url = "http://192.168.27.101:8080/userActivity/home";
            Map<java.lang.String, java.lang.String> requestPropertyMap = new HashMap<>();
            requestPropertyMap.put("Content-Type", "*/*");
            requestPropertyMap.put("accept", "*/*");
            requestPropertyMap.put("Authorization", "Basic MTowMTAwMWhATUAxMUNU");
            requestPropertyMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36");
            HttpURLConnection httpURLConnection = getHttpURLConnection(url, requestPropertyMap);
            String responseBody = getResponseBody(httpURLConnection);
            String regex;
//            Regex to get anchor tag
            regex = "<a[^>]*?href\\s*=\\s*((\'|\")(.*?)(\'|\"))[^>]*?(?!/)>";
            List<String> matchedValue = regexOperation(regex, responseBody);
            printData(matchedValue);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
