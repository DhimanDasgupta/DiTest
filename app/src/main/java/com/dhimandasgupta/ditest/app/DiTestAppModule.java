package com.dhimandasgupta.ditest.app;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhimandasgupta on 20/07/17.
 */

/**
 * Application module refers to sub components and provides application level dependencies.
 */
@Module
public class DiTestAppModule {
    // Add application level bindings here, e.g.: RestClientApi, Repository, etc.

    @Provides
    Context provideContext(DiTestApplication application) {
        return application.getApplicationContext();
    }
}
