package org.erickzarat.android.twiterclient;

import android.app.Application;
import android.support.v4.app.Fragment;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;
import org.erickzarat.android.twiterclient.images.di.DaggerImagesComponent;
import org.erickzarat.android.twiterclient.images.di.ImagesComponent;
import org.erickzarat.android.twiterclient.images.di.ImagesModule;
import org.erickzarat.android.twiterclient.images.ui.ImagesView;
import org.erickzarat.android.twiterclient.images.ui.adapters.OnItemClickListener;
import org.erickzarat.android.twiterclient.lib.base.di.LibsModule;

/**
 * Created by zarathos on 25/06/16
 */
public class TwitterClientApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        initFabric();
    }

    private void initFabric() {
        TwitterAuthConfig authConfig = new TwitterAuthConfig(BuildConfig.TWITTER_KEY, BuildConfig.TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
    }

    public ImagesComponent getImagesComponent(Fragment fragment, ImagesView view, OnItemClickListener clickListener){
        return DaggerImagesComponent
                .builder()
                .libsModule(new LibsModule(fragment))
                .imagesModule(new ImagesModule(view, clickListener))
                .build();
    }
}
