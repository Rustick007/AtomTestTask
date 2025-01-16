package com.atomtesttask.citylist.di;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(
    topLevelClass = CityListModule.class
)
@InstallIn(SingletonComponent.class)
@Module(
    includes = CityListModule.class
)
public final class HiltWrapper_CityListModule {
}
