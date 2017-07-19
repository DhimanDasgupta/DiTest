package com.dhimandasgupta.ditest.app;

import com.dhimandasgupta.ditest.main.MainActivity;
import com.dhimandasgupta.ditest.main.MainActivityModule;
import com.dhimandasgupta.ditest.second.SecondActivity;
import com.dhimandasgupta.ditest.second.SecondActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by dhimandasgupta on 20/07/17.
 */

/**
 * This module contains all the binding to the sub component builders in the app
 */
@Module
public abstract class BuildersModule {
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    public abstract MainActivity contributeMainActivityInjector();

    @ContributesAndroidInjector(modules = {SecondActivityModule.class})
    public abstract SecondActivity contributeSecondActivityInjector();
}
