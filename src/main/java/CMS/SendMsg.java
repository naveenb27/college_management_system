package CMS;

import java.io.BufferedReader;

import java.sql.*;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpResponse;

import javax.net.ssl.HttpsURLConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendMsg {
	public void sendMsg(String phone, String msg) {
		try {
					System.out.println(phone);
                    String SenderID ="FastSMS";
                    String language = "english";
                    String router = "p";
                    String api ="AFyWUQG1Rd6BbljkLpqVhxXcnDP49Z50Swe2H8ECJN7tvTo3uKGR1Arf7gn9yXL4IHJpzmkCSoYE2TOt";
                    String message = msg;
                    String ph = phone;
                    message = URLEncoder.encode(message, "UTF-8");

                    String url  = "https://www.fast2sms.com/dev/bulkV2?authorization=" + api +"&sender_id="+SenderID+"&message="+message+"&route="+router+"&numbers="+ph;

                    URL ur= new URL(url);

                    HttpsURLConnection con = (HttpsURLConnection)ur.openConnection();
                    con.setRequestMethod("GET");

                    con.setRequestProperty("User-Agent", "Mozilla/5.0");
                    con.setRequestProperty("cache-control", "no-cache");

                    int responseCode = con.getResponseCode();
                    System.out.println(responseCode);

                    StringBuffer  response  = new StringBuffer();

                    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream())) ;

                    while(true) {
                        String line = br.readLine();
                        if(line==null) {
                            break;
                        }
                        response.append(line);
                    }
                }catch(Exception e) {
                    System.out.println(e);
                }

                //HttpResponse response = Unirest.get("https://www.fast2sms.com/dev/bulkV2?authorization=YOUR_API_KEY&sender_id=DLT_SENDER_ID&message=YOUR_MESSAGE_ID&variables_values=12345|asdaswdx&route=dlt&numbers=9999999999,8888888888,7777777777")
                //	  .header("cache-control", "no-cache")
                //  .asString();
            }
        }