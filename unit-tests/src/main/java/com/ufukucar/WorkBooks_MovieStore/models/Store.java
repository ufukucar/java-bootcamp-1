package com.ufukucar.WorkBooks_MovieStore.models;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public boolean contains(Movie movie) {
        return this.movies.contains(movie);
    }

    public void sellMovie (String name) {
        /*for ( int i = 0; i < this.movies.size(); i++ ) {
            if ( this.movies.get(i).getName().equals(name) ) {
                this.movies.remove(i);
            }
        }*/
        if ( !this.movies.get(getMovieIndex(name)).isAvailable()) {
            throw new IllegalStateException("Cannot sell rented movie");
        }
        this.movies.removeIf(movie -> movie.getName().equals(name));
    }

    public int getMovieIndex(String name) {
        /*for ( int i = 0; i < this.movies.size(); i++ ) {
            if ( this.movies.get(i).getName().equals(name) ) {
                return i;
            }
        }
        return -1;*/

        return IntStream.range(0, this.movies.size())
                .filter(i -> this.movies.get(i).getName().equals(name))
                .findFirst()
                .orElse(-1);

    }

    public void rentMovie (String name) {
        this.movies.get(getMovieIndex(name)).setAvailable(false);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }

}
