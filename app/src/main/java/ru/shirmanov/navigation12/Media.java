package ru.shirmanov.navigation12;
/**
 * Created by dimka_ar on 17.10.2017.
 */

public class Media {
    private String name;
    private int imageResourceId;

    public static final Media[] medias = {
            new Media("Telegram", R.drawable.tl),
            new Media("Facebook", R.drawable.fb),
            new Media("VKontakte", R.drawable.vk),
            new Media("Instagram", R.drawable.inst)
    };

    private Media(String name, int imageResourceId) {
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
