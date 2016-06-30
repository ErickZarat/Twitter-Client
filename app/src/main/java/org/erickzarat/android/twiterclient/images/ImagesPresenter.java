package org.erickzarat.android.twiterclient.images;

import org.erickzarat.android.twiterclient.images.events.ImagesEvent;

/**
 * Created by zarathos on 29/06/16
 */
public interface ImagesPresenter {
    void onResume();
    void onPause();
    void onDestroy();
    void getImageTweets();
    void onEventMainThread(ImagesEvent event);
}
