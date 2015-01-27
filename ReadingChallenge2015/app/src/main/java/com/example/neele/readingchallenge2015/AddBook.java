package com.example.neele.readingchallenge2015;

/**
 * Created by Neele on 1/26/2015.
 */
public class AddBook {
    private String _title, _date, _author,_type;
    private int _pyear, _pages, _rating;

    public AddBook(){}

    public void setTitle(String title){
        _title = title;
    }

    public String getTitle(){
        return _title;
    }

    public void setAuthor(String author){
        _author = author;
    }

    public String getAuthor(){
        return _author;
    }

    public void setDate(String date){
        _date = date;
    }

    public String getDate(){
        return _date;
    }

    public void setYear(int year){
        _pyear = year;
    }

    public int getYear(){
        return _pyear;
    }

    public void setPages(int pages){
        _pages = pages;
    }

    public int getPages(){
        return _pages;
    }

    public void setRating(int rating){
        _rating = rating;
    }

    public int getRating(){
        return _rating;
    }

    public void setType(String type){
        _type = type;
    }

    public String getType(){
        return _type;
    }
}
