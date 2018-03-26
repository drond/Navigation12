package ru.shirmanov.navigation12;

/**
 * Created by dimka_m707i6q on 17.10.2017.
 */

public class System {
    private String name;
    private int imageResourceId;

    public static final System[] systems = {
            new System("Android", R.drawable.android),
            new System("IPhone", R.drawable.iphone),
            new System("Windows Phone", R.drawable.windows),
            new System("Blackberry", R.drawable.black)
    };

    private System(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
