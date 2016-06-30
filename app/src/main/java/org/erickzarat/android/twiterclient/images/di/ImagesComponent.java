package org.erickzarat.android.twiterclient.images.di;

import dagger.Component;
import org.erickzarat.android.twiterclient.images.ImagesPresenter;
import org.erickzarat.android.twiterclient.images.ui.ImagesFragment;
import org.erickzarat.android.twiterclient.lib.base.di.LibsModule;

import javax.inject.Singleton;

/**
 * Created by zarathos on 29/06/16
 */
@Singleton
@Component(modules = {LibsModule.class, ImagesModule.class})
public interface ImagesComponent {
    void inject(ImagesFragment fragment);
    ImagesPresenter getPresenter();
}
