package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers (
        {
            "Content-Type:application/json",
            "Authorization:key=AAAAW7Xsy_A:APA91bGTe452ocA2G9RGZ6e4ez8JoRCBo-_mM1q5hFOlPS_ytpJe58VjFKIpORyHIkcLINzVJTT0bFApi9wOzqxW2xF3NpxkfgYdaUEqf5rG9WEopk9n2u7TlInI_A4V0UyTFtrPqx3n"
        }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
