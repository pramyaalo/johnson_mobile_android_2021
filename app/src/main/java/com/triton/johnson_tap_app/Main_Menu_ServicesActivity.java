package com.triton.johnson_tap_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.triton.johnson_tap_app.activity.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class Main_Menu_ServicesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

   LinearLayout menu_service, menu_view_status, menu_change_password, menu_agent_profile;
   ImageView logout,iv_back,profile_gray,profile_green;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main_menu_services);

        menu_service = (LinearLayout) findViewById(R.id.menu_service);
        menu_view_status = (LinearLayout) findViewById(R.id.menu_view_status);
        menu_change_password = (LinearLayout) findViewById(R.id.menu_change_password);
        menu_agent_profile = (LinearLayout) findViewById(R.id.menu_agent_profile);
        logout = (ImageView) findViewById(R.id.logout);
        iv_back = (ImageView) findViewById(R.id.iv_back);
        profile_gray = (ImageView) findViewById(R.id.profile_gray);
        profile_green = (ImageView) findViewById(R.id.profile_green);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent send = new Intent(Main_Menu_ServicesActivity.this, Dashbaord_MainActivity.class);
                startActivity(send);

            }
        });

        profile_gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Main_Menu_ServicesActivity.this);
                alertDialogBuilder.setMessage("Your Profile Login?");
                        alertDialogBuilder.setPositiveButton("yes",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface arg0, int arg1) {

                                        profile_gray.setVisibility(View.GONE);
                                        profile_green.setVisibility(View.VISIBLE);
                                    }
                                });

                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        profile_gray.setVisibility(View.VISIBLE);
                        profile_green.setVisibility(View.GONE);
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        menu_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent send = new Intent(Main_Menu_ServicesActivity.this, ServicesActivity.class);
                startActivity(send);

            }
        });

        menu_view_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent send = new Intent(Main_Menu_ServicesActivity.this, Job_StatusActivity.class);
                startActivity(send);

            }
        });

        menu_change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent send = new Intent(Main_Menu_ServicesActivity.this, Change_PasswordActivity.class);
                startActivity(send);

            }
        });

        menu_agent_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent send = new Intent(Main_Menu_ServicesActivity.this, Agent_ProfileActivity.class);
                startActivity(send);

            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main_Menu_ServicesActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_logout, null);
                final Spinner spinner = (Spinner) mView.findViewById(R.id.spinner);
                Button yes = (Button) mView.findViewById(R.id.btn_yes);
                Button no = (Button) mView.findViewById(R.id.btn_no);

                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();

                spinner.setOnItemSelectedListener(Main_Menu_ServicesActivity.this);

                List categories = new ArrayList();
                categories.add("Day out");
                categories.add("Leave");
                categories.add("Permission");
                categories.add("Office/Training");
                categories.add("STANDBY");

                ArrayAdapter dataAdapter = new ArrayAdapter (Main_Menu_ServicesActivity.this, R.layout.spinner_item, categories);

                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner.setAdapter(dataAdapter);

                yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(Main_Menu_ServicesActivity.this, "success", Toast.LENGTH_SHORT).show();
                        profile_gray.setVisibility(View.VISIBLE);
                        profile_green.setVisibility(View.GONE);
                        dialog.dismiss();

                    }
                });

                no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        profile_gray.setVisibility(View.GONE);
                        profile_green.setVisibility(View.VISIBLE);
                        Toast.makeText(Main_Menu_ServicesActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();

                    }
                });
            }
        });
    }

    public void onItemSelected(AdapterView parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView arg0) {

    }
}