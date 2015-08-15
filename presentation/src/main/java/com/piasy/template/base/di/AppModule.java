package com.piasy.template.base.di;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Piasy{github.com/Piasy} on 15/7/23.
 */
@Module
public class AppModule {

    private final Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return this.mApplication;
    }

    @Provides
    Resources provideResources() {
        return this.mApplication.getResources();
    }

    @Provides
    Context provideContext() {
        return this.mApplication;
    }
}
