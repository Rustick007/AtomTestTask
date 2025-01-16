package com.atomtesttask.citylist.dataprovider;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H&J\u000e\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&\u00a8\u0006\r"}, d2 = {"Lcom/atomtesttask/citylist/dataprovider/IDataProvider;", "", "getAllData", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/atomtesttask/domain/model/ChargingStationsModel;", "getUniqCitiesList", "", "observeUniqCities", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAllData", "data", "citylist_debug"})
public abstract interface IDataProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<java.util.List<com.atomtesttask.domain.model.ChargingStationsModel>> getAllData();
    
    public abstract void setAllData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.atomtesttask.domain.model.ChargingStationsModel> data);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object observeUniqCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getUniqCitiesList();
}