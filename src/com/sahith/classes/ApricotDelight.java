package com.sahith.classes;

import com.sahith.interfaces.Restaurant;

public class ApricotDelight implements Restaurant
{

    @Override
    public void dish()
    {
        System.out.println("Apricot Delight is ready to serve");
    }
}
