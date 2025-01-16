// Generated by Dagger (https://dagger.dev).
package com.atomtesttask.chargingstationslist.di;

import com.atomtesttask.chargingstationslist.navigation.FeatureCharingStationsApi;
import com.atomtesttask.chargingstationslist.navigation.FeatureCharingStationsImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NavigationModule_ProviderFeatureCharingStationsFactory implements Factory<FeatureCharingStationsApi> {
  private final NavigationModule module;

  private final Provider<FeatureCharingStationsImpl> implProvider;

  public NavigationModule_ProviderFeatureCharingStationsFactory(NavigationModule module,
      Provider<FeatureCharingStationsImpl> implProvider) {
    this.module = module;
    this.implProvider = implProvider;
  }

  @Override
  public FeatureCharingStationsApi get() {
    return providerFeatureCharingStations(module, implProvider.get());
  }

  public static NavigationModule_ProviderFeatureCharingStationsFactory create(
      NavigationModule module, Provider<FeatureCharingStationsImpl> implProvider) {
    return new NavigationModule_ProviderFeatureCharingStationsFactory(module, implProvider);
  }

  public static FeatureCharingStationsApi providerFeatureCharingStations(NavigationModule instance,
      FeatureCharingStationsImpl impl) {
    return Preconditions.checkNotNullFromProvides(instance.providerFeatureCharingStations(impl));
  }
}