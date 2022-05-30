package com.sahith.classes;

public class Chef
{
    public ChickenBiryani chickenBiryani;
    public ApricotDelight apricotDelight;

    public Chef()
    {
        chickenBiryani = new ChickenBiryani();
        apricotDelight = new ApricotDelight();
    }

    public void cookBiryani()
    {
        chickenBiryani.dish();
    }

    public void prepareDessert()
    {
        apricotDelight.dish();
    }
}
