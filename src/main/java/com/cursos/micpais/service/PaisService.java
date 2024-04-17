package com.cursos.micpais.service;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;


@Service
public class PaisService {


    private final OkHttpClient client;

    public PaisService() {
        this.client = new OkHttpClient.Builder().build();
    }

    public String getPais() {

        String url = "https://restcountries.com/v3.1/all";
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
