package com.triton.johnson_tap_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Agent_ProfileActivity extends AppCompatActivity {

    ImageView iv_back;
    Button submit;
    EditText agent_code, agent_name, agent_status;
    String s_agent_code, s_agent_name, s_agent_status;
    AlertDialog alertDialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_agent_profile);

        iv_back = (ImageView) findViewById(R.id.iv_back);
        submit = (Button) findViewById(R.id.submit);
        agent_code = (EditText)findViewById(R.id.agent_code);
        agent_name = (EditText)findViewById(R.id.agent_name);
        agent_status = (EditText)findViewById(R.id.agent_status);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent send = new Intent(Agent_ProfileActivity.this, Main_Menu_ServicesActivity.class);
                startActivity(send);

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s_agent_code = agent_code.getText().toString();
                s_agent_name = agent_name.getText().toString();
                s_agent_status = agent_status.getText().toString();

                if (s_agent_code.equals("") || s_agent_name.equals("") || s_agent_status.equals("")){

                    alertDialog = new AlertDialog.Builder(Agent_ProfileActivity.this)

                            .setMessage("Please Fill the All Values")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    alertDialog.dismiss();
                                }
                            })
                            .show();
                }
                else {

                    Toast.makeText(getApplicationContext(), "Your Agent Code is : " + s_agent_code + "\n" + "Your Agent Name is :" + s_agent_name + "\n" + "Your Agent Status is :" + s_agent_status, Toast.LENGTH_LONG).show();

                    Intent send = new Intent(Agent_ProfileActivity.this, Main_Menu_ServicesActivity.class);
                    startActivity(send);
                }
            }
        });
    }
}