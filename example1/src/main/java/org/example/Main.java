package org.example;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient();  //just initialization of the tcp connection

        String url = "https://jsonplaceholder.typicode.com/posts";

        Request request = new Request.Builder().url(url).build();;  /* this is a builder design patter  */

        try{
            //here the tcp connection is getting made when new call is called

            Response response = client.newCall(request).execute();
            if(!response.isSuccessful()){
                System.out.println("something went wrong");
            }
            System.out.println(response.body().string());
        }
        catch(IOException e ){
            e.printStackTrace();

        }


    }
}