package com.example.neele.readingchallenge2015;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

static ArrayList<AddBook> bookcollection = new ArrayList<AddBook>();
    public static final String AUTHORNAME =
            "com.example.neele.readingchallenge2015.AUTHORNAME";
    public static final String BOOKNAME =
            "com.example.neele.readingchallenge2015.BOOKNAME";
    public static final String PYEAR =
            "com.example.neele.readingchallenge2015.PYEAR";
    public static final String PAGES=
            "com.example.neele.readingchallenge2015.PAGES";
    public static final String FINISHINGDATE =
            "com.example.neele.readingchallenge2015.FINISHDATE";
    public static final String RATING =
            "com.example.neele.readingchallenge2015.RATING";

private String _aname, _btitle, _puyear, _prating, _npages, _comdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillingAccomps();
    }

    public void fillingAccomps (){
        TextView tv = (TextView)this.findViewById(R.id.five_complete);
        TextView tv2 = (TextView)this.findViewById(R.id.rom_complete);
        TextView tv3 = (TextView)this.findViewById(R.id.movie_complete);
        TextView tv4 = (TextView)this.findViewById(R.id.year_complete);
        TextView tv5 = (TextView)this.findViewById(R.id.number_complete);
        TextView tv6 = (TextView)this.findViewById(R.id.thirty_complete);
        TextView tv7 = (TextView)this.findViewById(R.id.nonhuman_complete);
        TextView tv8 = (TextView)this.findViewById(R.id.funny_complete);
        TextView tv9 = (TextView)this.findViewById(R.id.female_complete);
        TextView tv10 = (TextView)this.findViewById(R.id.mystthril_complete);
        TextView tv11 = (TextView)this.findViewById(R.id.one_complete);
        TextView tv12 = (TextView)this.findViewById(R.id.short_complete);
        TextView tv13 = (TextView)this.findViewById(R.id.diff_complete);
        TextView tv14 = (TextView)this.findViewById(R.id.nonfiction_complete);
        TextView tv15 = (TextView)this.findViewById(R.id.pop_complete);
        TextView tv16 = (TextView)this.findViewById(R.id.love_complete);
        TextView tv17 = (TextView)this.findViewById(R.id.recom_complete);
        TextView tv18 = (TextView)this.findViewById(R.id.puli_complete);
        TextView tv19 = (TextView)this.findViewById(R.id.true_complete);
        TextView tv20 = (TextView)this.findViewById(R.id.bottom_complete);
        TextView tv21 = (TextView)this.findViewById(R.id.mum_complete);
        TextView tv22 = (TextView)this.findViewById(R.id.scary_complete);
        TextView tv23 = (TextView)this.findViewById(R.id.old_complete);
        TextView tv24 = (TextView)this.findViewById(R.id.cover_complete);
        TextView tv25 = (TextView)this.findViewById(R.id.memoir_complete);
        TextView tv26 = (TextView)this.findViewById(R.id.day_complete);
        TextView tv27 = (TextView)this.findViewById(R.id.anto_complete);
        TextView tv28 = (TextView)this.findViewById(R.id.wish_complete);
        TextView tv30 = (TextView)this.findViewById(R.id.born_complete);
        TextView tv31 = (TextView)this.findViewById(R.id.bad_complete);
        TextView tv32 = (TextView)this.findViewById(R.id.trilogy_complete);
        TextView tv33 = (TextView)this.findViewById(R.id.child_complete);
        TextView tv34 = (TextView)this.findViewById(R.id.triangle_complete);
        TextView tv35 = (TextView)this.findViewById(R.id.future_complete);
        TextView tv36 = (TextView)this.findViewById(R.id.school_complete);
        TextView tv37 = (TextView)this.findViewById(R.id.color_complete);
        TextView tv38 = (TextView)this.findViewById(R.id.cry_complete);
        TextView tv39 = (TextView)this.findViewById(R.id.magic_complete);
        TextView tv40 = (TextView)this.findViewById(R.id.graphic_complete);
        TextView tv41 = (TextView)this.findViewById(R.id.never_complete);
        TextView tv42 = (TextView)this.findViewById(R.id.home_complete);
        TextView tv43 = (TextView)this.findViewById(R.id.lang_complete);
        TextView tv44 = (TextView)this.findViewById(R.id.christmas_complete);
        TextView tv45 = (TextView)this.findViewById(R.id.init_complete);
        TextView tv46 = (TextView)this.findViewById(R.id.play_complete);
        TextView tv47 = (TextView)this.findViewById(R.id.banned_complete);
        TextView tv48 = (TextView)this.findViewById(R.id.tv_complete);
        TextView tv49 = (TextView)this.findViewById(R.id.nefinished_complete);

        ImageView im = (ImageView)this.findViewById(R.id.imageView);
        ImageView im2 = (ImageView)this.findViewById(R.id.imageView2);
        ImageView im3 = (ImageView)this.findViewById(R.id.imageView3);
        ImageView im4 = (ImageView)this.findViewById(R.id.imageView4);
        ImageView im5 = (ImageView)this.findViewById(R.id.imageView5);
        ImageView im6 = (ImageView)this.findViewById(R.id.imageView6);
        ImageView im7 = (ImageView)this.findViewById(R.id.imageView7);
        ImageView im8 = (ImageView)this.findViewById(R.id.imageView8);
        ImageView im9 = (ImageView)this.findViewById(R.id.imageView9);
        ImageView im10 = (ImageView)this.findViewById(R.id.imageView10);
        ImageView im11 = (ImageView)this.findViewById(R.id.imageView11);
        ImageView im12 = (ImageView)this.findViewById(R.id.imageView12);
        ImageView im13 = (ImageView)this.findViewById(R.id.imageView13);
        ImageView im14 = (ImageView)this.findViewById(R.id.imageView14);
        ImageView im15 = (ImageView)this.findViewById(R.id.imageView15);
        ImageView im16 = (ImageView)this.findViewById(R.id.imageView16);
        ImageView im17 = (ImageView)this.findViewById(R.id.imageView17);
        ImageView im18 = (ImageView)this.findViewById(R.id.imageView18);
        ImageView im19 = (ImageView)this.findViewById(R.id.imageView19);
        ImageView im20 = (ImageView)this.findViewById(R.id.imageView20);
        ImageView im21 = (ImageView)this.findViewById(R.id.imageView21);
        ImageView im22 = (ImageView)this.findViewById(R.id.imageView22);
        ImageView im23 = (ImageView)this.findViewById(R.id.imageView23);
        ImageView im24 = (ImageView)this.findViewById(R.id.imageView24);
        ImageView im25 = (ImageView)this.findViewById(R.id.imageView25);
        ImageView im26 = (ImageView)this.findViewById(R.id.imageView26);
        ImageView im27 = (ImageView)this.findViewById(R.id.imageView27);
        ImageView im28 = (ImageView)this.findViewById(R.id.imageView28);
        ImageView im30 = (ImageView)this.findViewById(R.id.imageView30);
        ImageView im31 = (ImageView)this.findViewById(R.id.imageView31);
        ImageView im32 = (ImageView)this.findViewById(R.id.imageView32);
        ImageView im33 = (ImageView)this.findViewById(R.id.imageView33);
        ImageView im34 = (ImageView)this.findViewById(R.id.imageView34);
        ImageView im35 = (ImageView)this.findViewById(R.id.imageView35);
        ImageView im36 = (ImageView)this.findViewById(R.id.imageView36);
        ImageView im37 = (ImageView)this.findViewById(R.id.imageView37);
        ImageView im38 = (ImageView)this.findViewById(R.id.imageView38);
        ImageView im39 = (ImageView)this.findViewById(R.id.imageView39);
        ImageView im40 = (ImageView)this.findViewById(R.id.imageView40);
        ImageView im41 = (ImageView)this.findViewById(R.id.imageView41);
        ImageView im42 = (ImageView)this.findViewById(R.id.imageView42);
        ImageView im43 = (ImageView)this.findViewById(R.id.imageView43);
        ImageView im44 = (ImageView)this.findViewById(R.id.imageView44);
        ImageView im45 = (ImageView)this.findViewById(R.id.imageView45);
        ImageView im46 = (ImageView)this.findViewById(R.id.imageView46);
        ImageView im47 = (ImageView)this.findViewById(R.id.imageView47);
        ImageView im48 = (ImageView)this.findViewById(R.id.imageView48);
        ImageView im49 = (ImageView)this.findViewById(R.id.imageView49);

        for (int i = 0; i < bookcollection.size(); i++){
            if (bookcollection.get(i).getType() == "500Pages"){
                tv.setText(bookcollection.get(i).getTitle());
                im.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "ClassicRomance"){
                tv2.setText(bookcollection.get(i).getTitle());
                im2.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Movie"){
                tv3.setText(bookcollection.get(i).getTitle());
                im3.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "ThisYear"){
                tv4.setText(bookcollection.get(i).getTitle());
                im4.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Number"){
                tv5.setText(bookcollection.get(i).getTitle());
                im5.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Under30"){
                tv6.setText(bookcollection.get(i).getTitle());
                im6.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Nonhuman"){
                tv7.setText(bookcollection.get(i).getTitle());
                im7.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Funny"){
                tv8.setText(bookcollection.get(i).getTitle());
                im8.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Female"){
                tv9.setText(bookcollection.get(i).getTitle());
                im9.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "MystThrill"){
                tv10.setText(bookcollection.get(i).getTitle());
                im10.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "OneWord"){
                tv11.setText(bookcollection.get(i).getTitle());
                im11.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "ShortStory"){
                tv12.setText(bookcollection.get(i).getTitle());
                im12.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "DiffWorld"){
                tv13.setText(bookcollection.get(i).getTitle());
                im13.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "NonFic"){
                tv14.setText(bookcollection.get(i).getTitle());
                im14.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "PopFirst"){
                tv15.setText(bookcollection.get(i).getTitle());
                im15.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "AuthLove"){
                tv16.setText(bookcollection.get(i).getTitle());
                im16.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "RecomFriend"){
                tv17.setText(bookcollection.get(i).getTitle());
                im17.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "PuliWin"){
                tv18.setText(bookcollection.get(i).getTitle());
                im18.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "TrueStory"){
                tv19.setText(bookcollection.get(i).getTitle());
                im19.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "BottomList"){
                tv20.setText(bookcollection.get(i).getTitle());
                im20.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "MumLoves"){
                tv21.setText(bookcollection.get(i).getTitle());
                im21.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Scary"){
                tv22.setText(bookcollection.get(i).getTitle());
                im22.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "OldBook"){
                tv23.setText(bookcollection.get(i).getTitle());
                im23.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "CoverBoo"){
                tv24.setText(bookcollection.get(i).getTitle());
                im24.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Memoir"){
                tv25.setText(bookcollection.get(i).getTitle());
                im25.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "FinishDay"){
                tv26.setText(bookcollection.get(i).getTitle());
                im26.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "AntoTitle"){
                tv27.setText(bookcollection.get(i).getTitle());
                im27.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "WishVisit"){
                tv28.setText(bookcollection.get(i).getTitle());
                im28.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "YearBorn"){
                tv30.setText(bookcollection.get(i).getTitle());
                im30.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "BadReview"){
                tv31.setText(bookcollection.get(i).getTitle());
                im31.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Trilogy"){
                tv32.setText(bookcollection.get(i).getTitle());
                im32.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Childhood"){
                tv33.setText(bookcollection.get(i).getTitle());
                im33.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "LoveTriangle"){
                tv34.setText(bookcollection.get(i).getTitle());
                im34.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Future"){
                tv35.setText(bookcollection.get(i).getTitle());
                im35.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "HighSchool"){
                tv36.setText(bookcollection.get(i).getTitle());
                im36.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "ColorBook"){
                tv37.setText(bookcollection.get(i).getTitle());
                im37.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "CryBook"){
                tv38.setText(bookcollection.get(i).getTitle());
                im38.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "MagicBook"){
                tv39.setText(bookcollection.get(i).getTitle());
                im39.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Graphic"){
                tv40.setText(bookcollection.get(i).getTitle());
                im40.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "NeverRead"){
                tv41.setText(bookcollection.get(i).getTitle());
                im41.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Hometown"){
                tv42.setText(bookcollection.get(i).getTitle());
                im42.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "DiffLang"){
                tv43.setText(bookcollection.get(i).getTitle());
                im43.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Christmas"){
                tv44.setText(bookcollection.get(i).getTitle());
                im44.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "InitBook"){
                tv45.setText(bookcollection.get(i).getTitle());
                im45.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Play"){
                tv46.setText(bookcollection.get(i).getTitle());
                im46.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "Banned"){
                tv47.setText(bookcollection.get(i).getTitle());
                im47.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "TV"){
                tv48.setText(bookcollection.get(i).getTitle());
                im48.setVisibility(ImageView.VISIBLE);
            }
            if (bookcollection.get(i).getType() == "NeverFinished"){
                tv49.setText(bookcollection.get(i).getTitle());
                im49.setVisibility(ImageView.VISIBLE);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void btnClick (View v){
        Intent intent = new Intent(this, BookAdding.class);
        startActivity(intent);

    }
/*
    public void btnView (View v){
        ImageButton im = (ImageButton)this.findViewById(R.id.imageView);
        ImageButton im2 = (ImageButton)this.findViewById(R.id.imageView2);
        ImageButton im3 = (ImageButton)this.findViewById(R.id.imageView3);


        im.setOnClickListener(onClickListener);
        im2.setOnClickListener(onClickListener);
        im3.setOnClickListener(onClickListener);


        Intent intent = new Intent(this, ShowBook.class);
        intent.putExtra(BOOKNAME, _btitle);
        intent.putExtra(AUTHORNAME, _aname);
        intent.putExtra(PAGES, _npages);
        intent.putExtra(PYEAR, _puyear);
        intent.putExtra(RATING, _prating);
        intent.putExtra(FINISHINGDATE, _comdate);
        startActivity(intent);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.imageView:
                    _aname = bookcollection.get(0).getAuthor();
                    _btitle = bookcollection.get(0).getTitle();
                    _puyear = String.valueOf(bookcollection.get(0).getYear());
                    _npages = String.valueOf(bookcollection.get(0).getPages());
                    _prating = String.valueOf(bookcollection.get(0).getRating());
                    _comdate = bookcollection.get(0).getDate();
                    break;
                case R.id.imageView2:
                    _aname = bookcollection.get(1).getAuthor();
                    _btitle = bookcollection.get(1).getTitle();
                    _puyear = String.valueOf(bookcollection.get(1).getYear());
                    _npages = String.valueOf(bookcollection.get(1).getPages());
                    _prating = String.valueOf(bookcollection.get(1).getRating());
                    _comdate = bookcollection.get(1).getDate();
                    break;
                case R.id.imageView3:
                    _aname = bookcollection.get(3).getAuthor();
                    _btitle = bookcollection.get(3).getTitle();
                    _puyear = String.valueOf(bookcollection.get(3).getYear());
                    _npages = String.valueOf(bookcollection.get(3).getPages());
                    _prating = String.valueOf(bookcollection.get(3).getRating());
                    _comdate = bookcollection.get(3).getDate();
                    break;
            }

        }
    };
    */
}
