// Generated by Dagger (https://dagger.dev).
package com.atomtesttask.chargingstationslist.navigation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class FeatureCharingStationsImpl_Factory implements Factory<FeatureCharingStationsImpl> {
  @Override
  public FeatureCharingStationsImpl get() {
    return newInstance();
  }

  public static FeatureCharingStationsImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FeatureCharingStationsImpl newInstance() {
    return new FeatureCharingStationsImpl();
  }

  private static final class InstanceHolder {
    private static final FeatureCharingStationsImpl_Factory INSTANCE = new FeatureCharingStationsImpl_Factory();
  }
}
