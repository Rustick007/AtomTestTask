package com.atomtesttask.chargingstationslist.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/atomtesttask/chargingstationslist/di/NavigationModule;", "", "()V", "providerFeatureCharingStations", "Lcom/atomtesttask/chargingstationslist/navigation/FeatureCharingStationsApi;", "impl", "Lcom/atomtesttask/chargingstationslist/navigation/FeatureCharingStationsImpl;", "chargingstationslist_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NavigationModule {
    
    public NavigationModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.atomtesttask.chargingstationslist.navigation.FeatureCharingStationsApi providerFeatureCharingStations(@org.jetbrains.annotations.NotNull()
    com.atomtesttask.chargingstationslist.navigation.FeatureCharingStationsImpl impl) {
        return null;
    }
}