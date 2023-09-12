package org.example;

import com.opencsv.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ReadFile {
    private static final String BASE_URL = "https://dog.ceo/api/breeds/image/random/";

    public static void main(String[] args) {


    }
    private void loadImageDog(String path){
        Thread thread = new Thread(()->{
            try{
                URL url = new URL(path);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                BufferedReader bf = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String result;
                StringBuilder data = new StringBuilder();
                do{
                    result = bf.readLine();
                    if(result != null){
                        data.append(result);
                    }
                }while (result != null);



                bf.close();
            }catch (Exception e){

            }
        });
        thread.start();

    }
}
