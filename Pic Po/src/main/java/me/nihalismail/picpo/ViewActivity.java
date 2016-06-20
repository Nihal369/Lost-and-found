package me.nihalismail.picpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import me.nihalismail.picpo.starter.R;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        String passedLostColour=getIntent().getExtras().getString("lostColour");
        String passedLostCompany=getIntent().getExtras().getString("lostCompany");
        String passedLostAddress=getIntent().getExtras().getString("lostAddress");
        String passedTypeLost=getIntent().getExtras().getString("TypeLost");
        String passedLostSpinner=getIntent().getExtras().getString("lostSpinnerData");

        String passedFindColour=getIntent().getExtras().getString("findColour");
        String passedFindCompany=getIntent().getExtras().getString("findCompany");
        String passedFindAddress=getIntent().getExtras().getString("findAdddress");
        String passedTypeFind=getIntent().getExtras().getString("TypeFind");
        String passedFindSpinner=getIntent().getExtras().getString("findSpinnerData");
        
    }
}
