package com.triton.johnson_tap_app;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.triton.johnson_tap_app.activity.Daily_Collection_DetailsActivity;
import com.triton.johnson_tap_app.activity.LoginActivity;
import com.triton.johnson_tap_app.api.APIInterface;
import com.triton.johnson_tap_app.api.RetrofitClient;
import com.triton.johnson_tap_app.responsepojo.LoginResponse;
import com.triton.johnson_tap_app.utils.RestUtils;

import java.util.List;

import es.dmoral.toasty.Toasty;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Main2Activity extends AppCompatActivity {

    Button btn;
   // private List<BreedTypeResponse.DataBean> breedTypedataBeanList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        btn = (Button) findViewById(R.id.button);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                breedTypeResponseByPetIdCall("L-I8257");
//            }
//        });
//    }
//
////        private void breedTypeResponseByPetIdCall(String petTypeId) {
////
////            APIInterface apiInterface = RetrofitClient.getClient().create(APIInterface.class);
////            Call<BreedTypeResponse> call = apiInterface.breedTypeResponseByPetIdCall(RestUtils.getContentType(),breedTypeRequest(petTypeId));
////            Log.w(TAG,"url  :%s"+ call.request().url().toString());
////
////            call.enqueue(new Callback<BreedTypeResponse>() {
////                @SuppressLint("SetTextI18n")
////                @Override
////                public void onResponse(@NonNull Call<BreedTypeResponse> call, @NonNull Response<BreedTypeResponse> response) {
////                    Log.w(TAG, "BreedTypeResponse" + "--->" + new Gson().toJson(response.body()));
////
////                    if (response.body() != null) {
////                        if (200 == response.body().getCode()) {
////                            if(response.body().getData() != null) {
////                                breedTypedataBeanList = response.body().getData();
////                                Log.w(TAG, "BreedTypeResponse1111" + "--->" +  response.body().getData());
////                            }
////                            if(breedTypedataBeanList != null && breedTypedataBeanList.size()>0){
//////                                setBreedTypeView(breedTypedataBeanList);
////                                Log.w(TAG, "job" + "--->" + breedTypedataBeanList);
////                            }else{
////
////                            }
////
////                        }
////
////                    }
////
////                }
////
////
////
////                @Override
////                public void onFailure(@NonNull Call<BreedTypeResponse> call, @NonNull Throwable t) {
////
////                    Log.w(TAG,"BreedTypeResponse flr"+"--->" + t.getMessage());
////                }
////            });
////
////        }
//
//    private void breedTypeResponseByPetIdCall(String petTypeId) {
//
//        APIInterface apiInterface = RetrofitClient.getClient().create(APIInterface.class);
//        Call<BreedTypeResponse> call = apiInterface.breedTypeResponseByPetIdCall(RestUtils.getContentType(), breedTypeRequest(petTypeId));
//        Log.w(TAG, "SignupResponse url  :%s" + " " + call.request().url().toString());
//
//        call.enqueue(new Callback<BreedTypeResponse>() {
//            @SuppressLint("LogNotTimber")
//            @Override
//            public void onResponse(@NonNull Call<BreedTypeResponse> call, @NonNull Response<BreedTypeResponse> response) {
//
//                Log.w(TAG, "SignupResponse" + new Gson().toJson(response.body().getData()));
//                if (response.body() != null) {
//                  String  message = response.body().getMessage();
//                    if (200 == response.body().getCode()) {
//                        if (response.body().getData() != null) {
//                       //     userid = response.body().getData().getJob_no();
//
//                          String  status = response.body().getStatus();
//                            breedTypeRequest(petTypeId);
//                        }
//
//
//                    } else {
//                        Toasty.warning(getApplicationContext(), "" + message, Toasty.LENGTH_LONG).show();
//
//                    }
//                }
//
//
//            }
//
//            @Override
//            public void onFailure(@NonNull Call<BreedTypeResponse> call, @NonNull Throwable t) {
//                Log.e("OTP", "--->" + t.getMessage());
//                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//        private BreedTypeRequest breedTypeRequest(String petTypeId) {
//            BreedTypeRequest breedTypeRequest = new BreedTypeRequest();
//            breedTypeRequest.setJob_no(petTypeId);
//            Log.w(TAG,"breedTypeRequest"+ "--->" + new Gson().toJson(breedTypeRequest));
//           // Log.w(TAG,"breed"+ "--->" + breedTypeRequest.getCon());
//            return breedTypeRequest;
        }

}