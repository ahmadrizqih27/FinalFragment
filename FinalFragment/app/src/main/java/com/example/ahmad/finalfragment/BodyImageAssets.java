package com.example.ahmad.finalfragment;

/**
 * Created by ahmad on 27/09/2018.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmad on 14/09/2018.
 */

public class BodyImageAssets {
    //variable ini untuk mengumpulkan gambar body jadi 1
    private static List<Integer> bodys = new ArrayList<Integer>(){{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
        add(R.drawable.body5);
        add(R.drawable.body6);

    }
    };

    //variable ini untuk mengumpulkan gambar legs jadi 1
    private static List<Integer> legss = new ArrayList<Integer>(){{
        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);
        add(R.drawable.legs4);
        add(R.drawable.legs5);


    }
    };
    //untuk mengambil body
    public static List<Integer> getBodys() {
        return bodys;
    }
    //untuk mengambil Legs
    public static List<Integer> getLegss() {return legss; }
}
