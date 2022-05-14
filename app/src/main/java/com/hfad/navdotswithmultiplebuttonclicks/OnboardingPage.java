package com.hfad.navdotswithmultiplebuttonclicks;

public class OnboardingPage {
    private String description;
    private int imageResourceId;

    public static final OnboardingPage[] onboardingPages = {
            new OnboardingPage("We provide 100% original products",
                    R.drawable.original),
            new OnboardingPage("Espresso, hot milk, and a steamed milk foam",
                    R.drawable.homedelivery),
            new OnboardingPage("Highest quality beans roasted and brewed fresh",
                    R.drawable.factory)
    };

    public OnboardingPage(String description, int imageResourceId){
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
}
