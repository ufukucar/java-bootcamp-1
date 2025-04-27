package com.ufukucar.WorkBooks_MovieStore;

import com.ufukucar.WorkBooks_MovieStore.models.Movie;
import com.ufukucar.WorkBooks_MovieStore.models.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    Store store;

    @BeforeEach
    public void setup() {

        store  = new Store();
        store.addMovie(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2));
        store.addMovie(new Movie("The Godfather", "Blue-Ray", 9.2));
    }

    @Test
    public void movieAdded() {
        assertTrue(store.contains(new Movie("The Godfather", "Blue-Ray", 9.2)));
    }

    @Test
    public void sellMovieTest(){
        store.sellMovie("The Shawshank Redemption");
        assertFalse(store.contains(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2)));
    }

    @Test
    public void rentMovieTest() {
        store.rentMovie("The Godfather");
        assertFalse(store.getMovie(1).isAvailable());
    }

    @Test
    public void  movieNotinStock(){

        assertThrows(IllegalStateException.class, ()-> {
            store.rentMovie("The Godfather");
            store.sellMovie("The Godfather");
        });
    }


}
