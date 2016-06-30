package org.erickzarat.android.twiterclient.hashtags.di;

import dagger.Component;
import org.erickzarat.android.twiterclient.hashtags.ui.HashtagsFragment;
import org.erickzarat.android.twiterclient.hashtags.HashtagsPresenter;
import org.erickzarat.android.twiterclient.lib.base.di.LibsModule;

import javax.inject.Singleton;

/**
 * Created by zarathos on 30/06/16
 */
@Singleton
@Component(modules = {LibsModule.class, HashtagsModule.class})
public interface HashtagsComponent {
    void inject(HashtagsFragment fragment);
}
