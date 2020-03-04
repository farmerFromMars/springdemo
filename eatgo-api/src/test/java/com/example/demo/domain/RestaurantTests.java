package com.example.demo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restarunt = new Restaurant(1004L,"Bob zip","Seoul");
        assertThat(restarunt.getId(), is(1004L));
        assertThat(restarunt.getName(), is("Bob zip"));
        assertThat(restarunt.getAddress(), is("Seoul"));
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");

        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
    }

}