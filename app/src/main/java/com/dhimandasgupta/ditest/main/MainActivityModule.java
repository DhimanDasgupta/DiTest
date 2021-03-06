package com.dhimandasgupta.ditest.main;

import dagger.Binds;
import dagger.Module;

/**
 * Created by dhimandasgupta on 20/07/17.
 */

/**
 * Feature level module holds all the bindings needed for this feature.
 */

@Module
public abstract class MainActivityModule {
    @Binds
    abstract MainActivityView provideMainActivityView(MainActivity activity);
}
