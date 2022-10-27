package com.example.lab8;


//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return list {@link CustomList}
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * Tests the hasCity method by adding a city
     * Raises exception if list does not have city
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City mockcity = new City("Edmonton", "AB");
        list.addCity(mockcity);
        assertTrue(list.hasCity(mockcity));
    }

    /**
     * Tests the deleteCity method by removing a city
     * Raises exception if list still has a city
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City mockcity = new City("Edmonton", "AB");
        list.addCity(mockcity);
        list.deleteCity(mockcity);
        assertEquals(0, list.getCount());
    }

    /**
     * Tests the countCities method buy adding a city then getting the amount of cities
     * Raise exception if count is not 1.
     */
    @Test
    public void countCitiesTest(){
        list = MockCityList();
        City mockcity = new City("Edmonton", "AB");
        list.addCity(mockcity);
        assertEquals(1, list.countCities());
    }

}
