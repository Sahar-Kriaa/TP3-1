package com.example.tp31;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.util.Calendar;

public class
 MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker=new DatePickerFragement();
                datePicker.show(getSupportFragmentManager(),"date Picker");
            }
        });
        Log.d("Question1","menu_main.xml");
        Log.d("Question2","onOptionsItemSelected(MenuItem item)");
        Log.d("Question3","myAlertBuilder.setTitle(\"Alert\");");
        Log.d("question 4","onCreate dans l'extension de DialogFragment");
    }


    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
     Calendar c= Calendar.getInstance();
     c.set(Calendar.YEAR,i);
     c.set(Calendar.MONTH,i1);
     c.set(Calendar.DAY_OF_MONTH,i2);
     String current= DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());


        Context conetxt=getApplicationContext();

      int duration= Toast.LENGTH_SHORT;
      Toast toast=Toast.makeText(conetxt,current,duration);
      toast.show();
      toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);



    }

}