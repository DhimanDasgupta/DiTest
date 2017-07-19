package com.dhimandasgupta.ditest.app;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by dhimandasgupta on 20/07/17.
 */

/**
 * Application component refers to application level modules only
 */
@Component(modules = {
        /* Use AndroidInjectionModule.class if you're not using support library */
        AndroidSupportInjectionModule.class,
        DiTestAppModule.class,
        BuildersModule.class
})
public interface DiTestAppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(DiTestApplication application);
        DiTestAppComponent build();
    }
    void inject(DiTestApplication app);
}
