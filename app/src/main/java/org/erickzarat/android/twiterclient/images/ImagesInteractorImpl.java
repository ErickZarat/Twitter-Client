package org.erickzarat.android.twiterclient.images;

/**
 * Created by zarathos on 29/06/16
 */
public class ImagesInteractorImpl implements ImagesInteractor {
   private ImagesRepository repository;

    public ImagesInteractorImpl(ImagesRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        repository.getImages();
    }
}
