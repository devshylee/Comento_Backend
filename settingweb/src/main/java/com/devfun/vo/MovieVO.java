package com.devfun.vo;

public class MovieVO {
    private int movieId;
    private String movieName;
    private String director;
    private String types;

    // Getter and Setter functions for movieId
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    // Getter and Setter functions for movieName
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    // Getter and Setter functions for director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Getter and Setter functions for types
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "MovieVO [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", types=" + types
                + "]";
    }
}
