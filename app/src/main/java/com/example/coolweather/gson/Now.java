package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Bam on 2018/1/3.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
