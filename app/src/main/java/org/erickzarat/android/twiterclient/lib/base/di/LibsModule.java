package org.erickzarat.android.twiterclient.lib.base.di;

import android.support.v4.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import dagger.Module;
import dagger.Provides;
import org.erickzarat.android.twiterclient.lib.GlideImageLoader;
import org.erickzarat.android.twiterclient.lib.GreenRobotEventBus;
import org.erickzarat.android.twiterclient.lib.base.EventBus;
import org.erickzarat.android.twiterclient.lib.base.ImageLoader;

import javax.inject.Singleton;

/**
 * Created by zarathos on 26/06/16
 */
@Module
public class LibsModule {

    private Fragment fragment;

    public LibsModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @Singleton
    ImageLoader providesImageLoader(RequestManager requestManager){
        return new GlideImageLoader(requestManager);
    }

    @Provides
    @Singleton
    RequestManager providesRequestManager(Fragment fragment){
        return Glide.with(fragment);
    }

    @Provides
    @Singleton
    Fragment providesFragment(){
        return this.fragment;
    }

    @Provides
    @Singleton
    EventBus providesEventBus(org.greenrobot.eventbus.EventBus eventBus){
        return new GreenRobotEventBus(eventBus);
    }

    @Provides
    @Singleton
    org.greenrobot.eventbus.EventBus providesLibraryEventBus(){
        return org.greenrobot.eventbus.EventBus.getDefault();
    }
}
