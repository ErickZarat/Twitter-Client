package org.erickzarat.android.twiterclient.lib.base;

/**
 * Created by zarathos on 26/06/16
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
