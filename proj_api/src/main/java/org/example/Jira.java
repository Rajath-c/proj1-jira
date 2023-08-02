package org.example;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Jira {

    public static void main(String[] args) throws UnirestException {


        // This code sample uses the  'Unirest' library:
// http://unirest.io/java.html
        HttpResponse<JsonNode> response = Unirest.get("https://chittirajath.atlassian.net/rest/api/3/project/search")
                .basicAuth("chittirajath@gmail.com", "ATATT3xFfGF0_0sIkeC3dOe6No4nAvZLyW4D8jXlIJhG23GRON3lkXpieMnxWtJuMcCliwZpY7vF6IUH-YrR080MutqnVzDzmZuO2k3-ctGc9OE8art2C52DXo5oC_nr1SKjcD9wgLnmQmT6XYPctwD8Y6jtzdqjeMyf8SVqDJ5w3aIqxrPvGu4=5A2F3F71")
                .header("Accept", "application/json")
                .asJson();


        System.out.println(response.getBody());
    }


}