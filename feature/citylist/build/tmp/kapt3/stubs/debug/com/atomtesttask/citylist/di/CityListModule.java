package com.atomtesttask.citylist.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/atomtesttask/citylist/di/CityListModule;", "", "bindCityListDataProvider", "Lcom/atomtesttask/citylist/dataprovider/IDataProvider;", "impl", "Lcom/atomtesttask/citylist/dataprovider/DataProvider;", "citylist_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface CityListModule {
    
    @javax.inject.Singleton()
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.atomtesttask.citylist.dataprovider.IDataProvider bindCityListDataProvider(@org.jetbrains.annotations.NotNull()
    com.atomtesttask.citylist.dataprovider.DataProvider impl);
}