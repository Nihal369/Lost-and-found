package me.nihalismail.picpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

import me.nihalismail.picpo.starter.R;

public class lostActivity extends AppCompatActivity {


    public void getLostDetails(View view)
    {
        EditText enteredColourLost=(EditText)findViewById(R.id.colorInput);
        EditText enteredCompanyLost=(EditText)findViewById(R.id.companyInput);
        EditText enteredAddressLost=(EditText)findViewById(R.id.addressInput);
        String colourLost=enteredColourLost.getText().toString();
        String companyLost=enteredCompanyLost.getText().toString();
        String addressLost=enteredAddressLost.getText().toString();
        Intent lostIntent=new Intent(this,ViewActivity.class);
        lostIntent.putExtra("lostColour",colourLost);
        lostIntent.putExtra("lostCompany",companyLost);
        lostIntent.putExtra("lostAddress",addressLost);
        lostIntent.putExtra("TypeLost","Lost");
        Spinner spinner=(Spinner)findViewById(R.id.spinnerLost);
        String selectedInputOfLostSpinner=spinner.getSelectedItem().toString();
        lostIntent.putExtra("lostSpinnerData",selectedInputOfLostSpinner);
        startActivity(lostIntent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);
        ArrayList<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("Electronics");
        spinnerArray.add("Wallet");
        spinnerArray.add("Vehicle");

        Spinner spinner = (Spinner)findViewById(R.id.spinnerLost);
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinnerArray);
        spinner.setAdapter(spinnerArrayAdapter);
    }
}
