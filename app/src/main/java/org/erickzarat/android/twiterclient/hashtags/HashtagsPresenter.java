package org.erickzarat.android.twiterclient.hashtags;

import org.erickzarat.android.twiterclient.hashtags.events.HashtagsEvent;

/**
 * Created by zarathos on 30/06/16
 */
public interface HashtagsPresenter {
    void onResume();
    void onPause();
    void onDestroy();
    void getHashtagTweets();
    void onEventMainThread(HashtagsEvent event);
}
