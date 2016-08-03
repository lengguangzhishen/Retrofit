package com.jyt.retrofitdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent();
        new Intent(intent);
    }

    /**
     * 请求的接口是: http://app.daydayacc.com/home/star?classType=cj, 如果?号后边的参数多的话, 直接在申请接口中@querymap, 这样可以作为封装的前提
     * @param view
     */
    public void net(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://app.daydayacc.com/")
                .build();
    //teacher/star/

        TeacherService service = retrofit.create(TeacherService.class);
        Call<Teacher> call = service.getTeacher("star", "cj");
        call.enqueue(new Callback<Teacher>() {
            @Override
            public void onResponse(Call<Teacher> call, Response<Teacher> response) {

                Teacher body = response.body();
                Log.e(TAG, body + "" + response.code());
            }

            @Override
            public void onFailure(Call<Teacher> call, Throwable t) {
                Log.e(TAG, "failure");
            }
        });
    }

    /**
     * 请求参数(就是问号后边的一堆)定义成querymap, 这样调用者自定义参数的多少或者有无
     * @param view
     */
    public void map(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://app.daydayacc.com/")
                .build();

        Map<String, String> map = new HashMap<>();
        map.put("classType", "cj");
        TeacherMapService service = retrofit.create(TeacherMapService.class);
        service.getTeacher("star", map).enqueue(new Callback<Teacher>() {
            @Override
            public void onResponse(Call<Teacher> call, Response<Teacher> response) {
                if (response.code() == 200) {
                    Log.e(TAG, response.body().getStatus());
                }
            }

            @Override
            public void onFailure(Call<Teacher> call, Throwable t) {

            }
        });

    }
}

interface TeacherMapService{
    @POST("home/{homeId}")
    Call<Teacher> getTeacher(
            @Path("homeId") String homeId,
            @QueryMap Map<String, String> map);
}

interface TeacherService{
    @POST("home/{homeId}")
    Call<Teacher> getTeacher(
            @Path("homeId") String homeId,
            @Query("classType") String nodeId);
}


