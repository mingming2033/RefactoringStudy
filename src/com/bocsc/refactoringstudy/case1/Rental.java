package com.bocsc.refactoringstudy.case1;

/**
 * Created by lgm5464 on 2015/12/28.
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public void setDaysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }

    public Movie getMovie(){
        return _movie;
    }

    public void setMovie(Movie movie){
        this._movie = movie;
    }
}
