package com.example.worldclock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public Switch formatswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout switchLayout = findViewById(R.id.switchlayout);
        formatswitch = switchLayout.findViewById(R.id.formatswitch);

        ////////////////////////////////////////////////////////////
        ConstraintLayout sydney = findViewById(R.id.sydney);
        TextView sydText = sydney.findViewById(R.id.textView);
        sydText.setText(R.string.sydney_text);

        TextClock sydClock = sydney.findViewById(R.id.textClock);
        sydClock.setTimeZone("Australia/ACT");

        ImageView sydImage = sydney.findViewById(R.id.imageView);
        sydImage.setImageResource(R.drawable.operahouse);
        ////////////////////////////////////////////////////////////
        ConstraintLayout tokyo = findViewById(R.id.tokyo);
        TextView tokyoText = tokyo.findViewById(R.id.textView);
        tokyoText.setText(R.string.tokyo_text);

        TextClock tokyoClock = tokyo.findViewById(R.id.textClock);
        tokyoClock.setTimeZone("Asia/Tokyo");

        ImageView tokyoImage = tokyo.findViewById(R.id.imageView);
        tokyoImage.setImageResource(R.drawable.tokyotower);
        //////////////////////////////////////////////////////////////
        ConstraintLayout singapore = findViewById(R.id.singapore);
        TextView singaporeText = singapore.findViewById(R.id.textView);
        singaporeText.setText(R.string.singapore_text);

        TextClock singaporeClock = singapore.findViewById(R.id.textClock);
        singaporeClock.setTimeZone("Asia/Singapore");

        ImageView singaporeImage = singapore.findViewById(R.id.imageView);
        singaporeImage.setImageResource(R.drawable.merlion);
        //////////////////////////////////////////////////////////////
        ConstraintLayout delhi = findViewById(R.id.newDelhi);
        TextView delhiText = delhi.findViewById(R.id.textView);
        delhiText.setText(R.string.delhi_text);

        TextClock delhiClock = delhi.findViewById(R.id.textClock);
        delhiClock.setTimeZone("Asia/Calcutta");

        ImageView delhiImage = delhi.findViewById(R.id.imageView);
        delhiImage.setImageResource(R.drawable.taj);
        //////////////////////////////////////////////////////////////
        ConstraintLayout dubai = findViewById(R.id.dubai);
        TextView dubaiText = dubai.findViewById(R.id.textView);
        dubaiText.setText(R.string.dubai_text);

        TextClock dubaiClock = dubai.findViewById(R.id.textClock);
        dubaiClock.setTimeZone("Asia/Dubai");

        ImageView dubaiImage = dubai.findViewById(R.id.imageView);
        dubaiImage.setImageResource(R.drawable.burj);
        //////////////////////////////////////////////////////////////
        ConstraintLayout rome = findViewById(R.id.rome);
        TextView romeText = rome.findViewById(R.id.textView);
        romeText.setText(R.string.rome_text);

        TextClock romeClock = rome.findViewById(R.id.textClock);
        romeClock.setTimeZone("Europe/Rome");

        ImageView romeImage = rome.findViewById(R.id.imageView);
        romeImage.setImageResource(R.drawable.coliseum);
        //////////////////////////////////////////////////////////////
        ConstraintLayout paris = findViewById(R.id.paris);
        TextView parisText = paris.findViewById(R.id.textView);
        parisText.setText(R.string.paris_text);

        TextClock parisClock = paris.findViewById(R.id.textClock);
        parisClock.setTimeZone("Europe/Paris");

        ImageView parisImage = paris.findViewById(R.id.imageView);
        parisImage.setImageResource(R.drawable.eiffel);
        //////////////////////////////////////////////////////////////
        ConstraintLayout london = findViewById(R.id.london);
        TextView londonText = london.findViewById(R.id.textView);
        londonText.setText(R.string.london_text);

        TextClock londonClock = london.findViewById(R.id.textClock);
        londonClock.setTimeZone("Europe/London");

        ImageView londonImage = london.findViewById(R.id.imageView);
        londonImage.setImageResource(R.drawable.bigben);
        //////////////////////////////////////////////////////////////
        ConstraintLayout rio = findViewById(R.id.rio);
        TextView rioText = rio.findViewById(R.id.textView);
        rioText.setText(R.string.rio_text);

        TextClock rioClock = rio.findViewById(R.id.textClock);
        rioClock.setTimeZone("America/Buenos_Aires");

        ImageView rioImage = rio.findViewById(R.id.imageView);
        rioImage.setImageResource(R.drawable.christ);
        //////////////////////////////////////////////////////////////
        ConstraintLayout nyc = findViewById(R.id.newYorkCity);
        TextView nycText = nyc.findViewById(R.id.textView);
        nycText.setText(R.string.nyc_text);

        TextClock nycClock = nyc.findViewById(R.id.textClock);
        nycClock.setTimeZone("America/New_York");

        ImageView nycImage = nyc.findViewById(R.id.imageView);
        nycImage.setImageResource(R.drawable.liberty);
    }
    @Override
    protected void onStart(){
        super.onStart();

        ConstraintLayout switchLayout = findViewById(R.id.switchlayout);
        formatswitch = switchLayout.findViewById(R.id.formatswitch);

        formatswitch.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)  {

            if(formatswitch.isChecked()) { // set to 12 Hour Format Time
                ConstraintLayout sydney = findViewById(R.id.sydney);
                TextClock sydClock = sydney.findViewById(R.id.textClock);
                sydClock.setFormat12Hour("H:mm");

                ConstraintLayout tokyo = findViewById(R.id.tokyo);
                TextClock tokyoClock = tokyo.findViewById(R.id.textClock);
                tokyoClock.setFormat12Hour("H:mm");

                ConstraintLayout singapore = findViewById(R.id.singapore);
                TextClock sinClock = singapore.findViewById(R.id.textClock);
                sinClock.setFormat12Hour("H:mm");

                ConstraintLayout delhi = findViewById(R.id.newDelhi);
                TextClock delhiClock = delhi.findViewById(R.id.textClock);
                delhiClock.setFormat12Hour("H:mm");

                ConstraintLayout dubai = findViewById(R.id.dubai);
                TextClock dubaiClock = dubai.findViewById(R.id.textClock);
                dubaiClock.setFormat12Hour("H:mm");

                ConstraintLayout rome = findViewById(R.id.rome);
                TextClock romeClock = rome.findViewById(R.id.textClock);
                romeClock.setFormat12Hour("H:mm");

                ConstraintLayout paris = findViewById(R.id.paris);
                TextClock parisClock = paris.findViewById(R.id.textClock);
                parisClock.setFormat12Hour("H:mm");

                ConstraintLayout london = findViewById(R.id.london);
                TextClock lonClock = london.findViewById(R.id.textClock);
                lonClock.setFormat12Hour("H:mm");

                ConstraintLayout rio = findViewById(R.id.rio);
                TextClock rioClock = rio.findViewById(R.id.textClock);
                rioClock.setFormat12Hour("H:mm");

                ConstraintLayout nyc = findViewById(R.id.newYorkCity);
                TextClock nycClock = nyc.findViewById(R.id.textClock);
                nycClock.setFormat12Hour("H:mm");


            } else {
                ConstraintLayout sydney = findViewById(R.id.sydney);
                TextClock sydClock = sydney.findViewById(R.id.textClock);
                sydClock.setFormat12Hour("H:mm a");

                ConstraintLayout tokyo = findViewById(R.id.tokyo);
                TextClock tokyoClock = tokyo.findViewById(R.id.textClock);
                tokyoClock.setFormat12Hour("H:mm a");

                ConstraintLayout singapore = findViewById(R.id.singapore);
                TextClock sinClock = singapore.findViewById(R.id.textClock);
                sinClock.setFormat12Hour("H:mm a");

                ConstraintLayout delhi = findViewById(R.id.newDelhi);
                TextClock delhiClock = delhi.findViewById(R.id.textClock);
                delhiClock.setFormat12Hour("H:mm a");

                ConstraintLayout dubai = findViewById(R.id.dubai);
                TextClock dubaiClock = dubai.findViewById(R.id.textClock);
                dubaiClock.setFormat12Hour("H:mm a");

                ConstraintLayout rome = findViewById(R.id.rome);
                TextClock romeClock = rome.findViewById(R.id.textClock);
                romeClock.setFormat12Hour("H:mm a");

                ConstraintLayout paris = findViewById(R.id.paris);
                TextClock parisClock = paris.findViewById(R.id.textClock);
                parisClock.setFormat12Hour("H:mm a");

                ConstraintLayout london = findViewById(R.id.london);
                TextClock lonClock = london.findViewById(R.id.textClock);
                lonClock.setFormat12Hour("H:mm a");

                ConstraintLayout rio = findViewById(R.id.rio);
                TextClock rioClock = rio.findViewById(R.id.textClock);
                rioClock.setFormat12Hour("H:mm a");

                ConstraintLayout nyc = findViewById(R.id.newYorkCity);
                TextClock nycClock = nyc.findViewById(R.id.textClock);
                nycClock.setFormat12Hour("H:mm a");
            }
            }
        });
    }
}
