package me.nihalismail.picpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

import me.nihalismail.picpo.starter.R;

public class findActivity extends AppCompatActivity {

    public void getFindDetails(View view)
    {
        EditText enteredColourFind=(EditText)findViewById(R.id.colorInputFound);
        EditText enteredCompanyFind=(EditText)findViewById(R.id.companyInputFound);
        EditText enteredAddressFind=(EditText)findViewById(R.id.addressInputFound);
        String colourFind=enteredColourFind.getText().toString();
        String companyFind=enteredCompanyFind.getText().toString();
        String addressFind=enteredAddressFind.getText().toString();
        Intent i=getIntent();
        String activeUserName=i.getStringExtra("username");
        Log.i("Mava",activeUserName);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        ArrayList<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("Electronics");
        spinnerArray.add("Wallet");
        spinnerArray.add("Vehicle");

        Spinner spinner =(Spinner)findViewById(R.id.spinnerFound);
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinnerArray);
        spinner.setAdapter(spinnerArrayAdapter);
    }
}
