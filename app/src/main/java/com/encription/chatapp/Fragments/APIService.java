package com.encription.chatapp.Fragments;

import com.encription.chatapp.Notifications.MyResponse;
import com.encription.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAPklvClE:APA91bHlHdbspjMniC3smFVk0IVNlDRvmsb11J49Li0pdw3V2vuzrgLMcwRg3mTJDB7GdOjNAVVCxKOP-2Eg20dePp2qDbMXeWzjQZOtM3rIq1xHvVYnRPNLAfkbdLBMO66PI3sl-dmA"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
