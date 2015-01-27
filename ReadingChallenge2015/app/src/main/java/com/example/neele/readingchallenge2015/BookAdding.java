package com.example.neele.readingchallenge2015;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.RatingBar.OnRatingBarChangeListener;



public class BookAdding extends ActionBarActivity{
    AddBook book = new AddBook();
    private RatingBar ratingBar;
    private TextView txtRatingValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_adding);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar rtBar, float rating,boolean fromUser) {
                int _rating = (int) rating;
            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book_adding, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public String titleChoice(){
        RadioButton bt = (RadioButton)this.findViewById(R.id.radioButton);
        RadioButton bt2 = (RadioButton)this.findViewById(R.id.radioButton2);
        RadioButton bt3 = (RadioButton)this.findViewById(R.id.radioButton3);
        RadioButton bt4 = (RadioButton)this.findViewById(R.id.radioButton4);
        RadioButton bt5 = (RadioButton)this.findViewById(R.id.radioButton5);
        RadioButton bt6 = (RadioButton)this.findViewById(R.id.radioButton6);
        RadioButton bt7 = (RadioButton)this.findViewById(R.id.radioButton7);
        RadioButton bt8 = (RadioButton)this.findViewById(R.id.radioButton8);
        RadioButton bt9 = (RadioButton)this.findViewById(R.id.radioButton9);
        RadioButton bt10 = (RadioButton)this.findViewById(R.id.radioButton10);
        RadioButton bt11 = (RadioButton)this.findViewById(R.id.radioButton11);
        RadioButton bt12 = (RadioButton)this.findViewById(R.id.radioButton12);
        RadioButton bt13 = (RadioButton)this.findViewById(R.id.radioButton13);
        RadioButton bt14 = (RadioButton)this.findViewById(R.id.radioButton14);
        RadioButton bt15 = (RadioButton)this.findViewById(R.id.radioButton15);
        RadioButton bt16 = (RadioButton)this.findViewById(R.id.radioButton16);
        RadioButton bt17 = (RadioButton)this.findViewById(R.id.radioButton17);
        RadioButton bt18 = (RadioButton)this.findViewById(R.id.radioButton18);
        RadioButton bt19 = (RadioButton)this.findViewById(R.id.radioButton19);
        RadioButton bt20 = (RadioButton)this.findViewById(R.id.radioButton20);
        RadioButton bt21 = (RadioButton)this.findViewById(R.id.radioButton21);
        RadioButton bt22 = (RadioButton)this.findViewById(R.id.radioButton22);
        RadioButton bt23 = (RadioButton)this.findViewById(R.id.radioButton23);
        RadioButton bt24 = (RadioButton)this.findViewById(R.id.radioButton24);
        RadioButton bt25 = (RadioButton)this.findViewById(R.id.radioButton25);
        RadioButton bt26 = (RadioButton)this.findViewById(R.id.radioButton26);
        RadioButton bt27 = (RadioButton)this.findViewById(R.id.radioButton27);
        RadioButton bt28 = (RadioButton)this.findViewById(R.id.radioButton28);
        RadioButton bt30 = (RadioButton)this.findViewById(R.id.radioButton30);
        RadioButton bt31 = (RadioButton)this.findViewById(R.id.radioButton31);
        RadioButton bt32 = (RadioButton)this.findViewById(R.id.radioButton32);
        RadioButton bt33 = (RadioButton)this.findViewById(R.id.radioButton33);
        RadioButton bt34 = (RadioButton)this.findViewById(R.id.radioButton34);
        RadioButton bt35 = (RadioButton)this.findViewById(R.id.radioButton35);
        RadioButton bt36 = (RadioButton)this.findViewById(R.id.radioButton36);
        RadioButton bt37 = (RadioButton)this.findViewById(R.id.radioButton37);
        RadioButton bt38 = (RadioButton)this.findViewById(R.id.radioButton38);
        RadioButton bt39 = (RadioButton)this.findViewById(R.id.radioButton39);
        RadioButton bt40 = (RadioButton)this.findViewById(R.id.radioButton40);
        RadioButton bt41 = (RadioButton)this.findViewById(R.id.radioButton41);
        RadioButton bt42 = (RadioButton)this.findViewById(R.id.radioButton42);
        RadioButton bt43 = (RadioButton)this.findViewById(R.id.radioButton43);
        RadioButton bt44 = (RadioButton)this.findViewById(R.id.radioButton44);
        RadioButton bt45 = (RadioButton)this.findViewById(R.id.radioButton45);
        RadioButton bt46 = (RadioButton)this.findViewById(R.id.radioButton46);
        RadioButton bt47 = (RadioButton)this.findViewById(R.id.radioButton47);
        RadioButton bt48 = (RadioButton)this.findViewById(R.id.radioButton48);
        RadioButton bt49 = (RadioButton)this.findViewById(R.id.radioButton49);

        if (bt.isChecked())
            return "500Pages";
        else if (bt2.isChecked())
           return "ClassicRomance";
        else if (bt3.isChecked())
           return "Movie";
        else if (bt4.isChecked())
            return "ThisYear";
        else if (bt5.isChecked())
           return "Number";
        else if (bt6.isChecked())
           return "Under30";
        else if (bt7.isChecked())
            return "Nonhuman";
        else if (bt8.isChecked())
            return "Funny";
        else if (bt9.isChecked())
            return "Female";
        else if (bt10.isChecked())
            return "MystThrill";
        else if (bt11.isChecked())
            return "OneWord";
        else if (bt12.isChecked())
            return "ShortStory";
        else if (bt13.isChecked())
            return "DiffWorld";
        else if (bt14.isChecked())
            return "NonFic";
        else if (bt15.isChecked())
           return "PopFirst";
        else if (bt16.isChecked())
            return "AuthLove";
        else if (bt17.isChecked())
            return "RecomFriend";
        else if (bt18.isChecked())
            return "PuliWin";
        else if (bt19.isChecked())
            return "TrueStory";
        else if (bt20.isChecked())
            return "BottomList";
        else if (bt21.isChecked())
            return "MumLoves";
        else if (bt22.isChecked())
            return "Scary";
        else if (bt23.isChecked())
            return "OldBook";
        else if (bt24.isChecked())
            return "CoverBook";
        else if (bt25.isChecked())
            return "Memoir";
        else if (bt26.isChecked())
            return "FinishDay";
        else if (bt27.isChecked())
            return "AntoTitle";
        else if (bt28.isChecked())
            return "WishVisit";
        else if (bt30.isChecked())
            return "YearBorn";
        else if (bt31.isChecked())
            return "BadReview";
        else if (bt32.isChecked())
            return "Trilogy";
        else if (bt33.isChecked())
            return "Childhood";
        else if (bt34.isChecked())
            return "LoveTriangle";
        else if (bt35.isChecked())
            return "Future";
        else if (bt36.isChecked())
            return "HighSchool";
        else if (bt37.isChecked())
            return "ColorBook";
        else if (bt38.isChecked())
            return "CryBook";
        else if (bt39.isChecked())
            return "MagicBook";
        else if (bt40.isChecked())
            return "Graphic";
        else if (bt41.isChecked())
            return "NeverRead";
        else if (bt42.isChecked())
            return "Hometown";
        else if (bt43.isChecked())
            return "DiffLang";
        else if (bt44.isChecked())
            return "Christmas";
        else if (bt45.isChecked())
            return "InitBook";
        else if (bt46.isChecked())
            return "Play";
        else if (bt47.isChecked())
            return "Banned";
        else if (bt48.isChecked())
            return "TV";
        else if (bt49.isChecked())
            return "NeverFinished";
        else
            return "Failure";
    }
    public void btnAdding (View v){
        TextView _title = (TextView)this.findViewById(R.id.txtTitle);
        TextView _author = (TextView)this.findViewById(R.id.txtAuthor);
        TextView _year = (TextView)this.findViewById(R.id.txtYear);
        TextView _pages = (TextView)this.findViewById(R.id.txtPages);
        TextView _date = (TextView)this.findViewById(R.id.txtFinished);
        book.setRating((int)ratingBar.getRating());


        try {
            book.setTitle(_title.getText().toString());
            book.setAuthor(_author.getText().toString());
            book.setYear(Integer.parseInt(_year.getText().toString()));
            book.setPages(Integer.parseInt(_pages.getText().toString()));
            book.setDate(_date.getText().toString());

            if (titleChoice() == "Failure")
                Toast.makeText(this, "Not a valid category", Toast.LENGTH_LONG).show();

            else
                book.setType(titleChoice());
        }
        catch(Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

        MainActivity.bookcollection.add(book);
    }

}
