package com.example.neele.readingchallenge2015;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ShowBook extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book);
        Intent intent = getIntent();
        String _name = intent.getStringExtra(MainActivity.AUTHORNAME);
        String _title = intent.getStringExtra(MainActivity.BOOKNAME);
        String _year = intent.getStringExtra(MainActivity.PYEAR);
        String _rating = intent.getStringExtra(MainActivity.RATING);
        String _date = intent.getStringExtra(MainActivity.FINISHINGDATE);
        String _pages = intent.getStringExtra(MainActivity.PAGES);

        TextView tv = (TextView)this.findViewById(R.id.txtAuthorName);
        TextView tv2 = (TextView)this.findViewById(R.id.txtBookTitle);
        TextView tv3 = (TextView)this.findViewById(R.id.txtPYear);
        TextView tv4 = (TextView)this.findViewById(R.id.txtPages);
        TextView tv5 = (TextView)this.findViewById(R.id.txtFinishing);
        RatingBar rbar = (RatingBar)this.findViewById(R.id.ratingBar2);

        tv.setText(_name);
        tv2.setText(_title);
        tv3.setText(_year);
        tv4.setText(_pages);
        tv5.setText(_date);
        rbar.setRating(Integer.parseInt(_rating));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_book, menu);
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
}
