package com.bixspace.ciclodevida.data.remote;

import com.bixspace.ciclodevida.data.ApiConstants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceFactory {

    public static final String API_BASE_URL = ApiConstants.URL_BASE;
    public static final String API_BASE_ALTERNATIVEL = ApiConstants.URL_ALTERNATIVE;


    private static OkHttpClient httpClient = new OkHttpClient();
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit.Builder builder_off =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_ALTERNATIVEL)
                    .addConverterFactory(GsonConverterFactory.create());



    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient).build();
        return retrofit.create(serviceClass);
    }

    public static <S> S createServiceAlternative(Class<S> serviceClass) {
        Retrofit retrofit = builder_off.client(httpClient).build();
        return retrofit.create(serviceClass);
    }
}