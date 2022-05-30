package com.sahith.classes;

import com.sahith.interfaces.Restaurant;

public class ChickenBiryani implements Restaurant
{
    @Override
    public void dish()
    {
        System.out.println("Chicken Biryani has been cooked");
    }
}
