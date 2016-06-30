package org.erickzarat.android.twiterclient.images.ui;

import org.erickzarat.android.twiterclient.entities.Image;

import java.util.List;

/**
 * Created by zarathos on 29/06/16
 */
public interface ImagesView {
    void showImages();
    void hideImages();
    void showProgress();
    void hideProgress();

    void onError(String error);
    void setContent(List<Image> items);
}
