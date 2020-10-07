package com.example.capstoneproject.model;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
    public static List<Model> movielist() {
        Model mov1 = new Model("Money Heist: The Phenomenon", 10, "https://fitshop-production.s3.ap-southeast-1.amazonaws.com/wp-content/uploads/2020/04/20202149/Telur-Ayam.jpg");
        Model mov2 = new Model("A Whisker Away", 2, "https://akcdn.detik.net.id/visual/2020/07/24/ilustrasi-sabun-batangan-1_169.jpeg?w=650");
        Model mov3 = new Model("37 Seconds", 5, "https://ichef.bbci.co.uk/news/640/cpsprodpb/4D0C/production/_103642791_41843a55-c79b-4955-9c4b-16685f1f3f61.jpg");
        Model mov4 = new Model("Hitman: Agent Jun", 2, "https://static.republika.co.id/uploads/images/inpicture_slide/secangkir-teh-_190524103045-721.jpg");

        List<Model> movielist = new ArrayList<>();

        movielist.add(mov1);
        movielist.add(mov2);
        movielist.add(mov3);
        movielist.add(mov4);

        return movielist;
    }
}
