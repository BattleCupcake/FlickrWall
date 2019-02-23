package com.example.flickrwall;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class PhotoDetailActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);

        activateToolbar(true);
    }
}
