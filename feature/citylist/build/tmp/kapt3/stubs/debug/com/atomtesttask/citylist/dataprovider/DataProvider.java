package com.atomtesttask.citylist.dataprovider;

/**
 * Класс провайдер данных
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u000bH\u0016J\u000e\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/atomtesttask/citylist/dataprovider/DataProvider;", "Lcom/atomtesttask/citylist/dataprovider/IDataProvider;", "()V", "allData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/atomtesttask/domain/model/ChargingStationsModel;", "listOfUniqCities", "", "", "getAllData", "Lkotlinx/coroutines/flow/StateFlow;", "getUniqCitiesList", "observeUniqCities", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAllData", "data", "citylist_debug"})
public final class DataProvider implements com.atomtesttask.citylist.dataprovider.IDataProvider {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.atomtesttask.domain.model.ChargingStationsModel>> allData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> listOfUniqCities = null;
    
    @javax.inject.Inject()
    public DataProvider() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.StateFlow<java.util.List<com.atomtesttask.domain.model.ChargingStationsModel>> getAllData() {
        return null;
    }
    
    @java.lang.Override()
    public void setAllData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.atomtesttask.domain.model.ChargingStationsModel> data) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object observeUniqCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getUniqCitiesList() {
        return null;
    }
}