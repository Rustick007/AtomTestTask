package com.atomtesttask.citylist.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListViewModel;", "Lcom/atomtesttask/core/base/FeatureViewModel;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$State;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Effect;", "navigationManager", "Lnavigation/compose/NavigationManager;", "getChargingStationsDataUseCase", "Lcom/atomtesttask/domain/usecases/GetChargingStationsDataUseCase;", "dataProvider", "Lcom/atomtesttask/citylist/dataprovider/DataProvider;", "(Lnavigation/compose/NavigationManager;Lcom/atomtesttask/domain/usecases/GetChargingStationsDataUseCase;Lcom/atomtesttask/citylist/dataprovider/DataProvider;)V", "getData", "", "handleEvents", "event", "onErrorHandler", "exception", "", "onEventSelected", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent;", "onEventService", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent;", "onObservers", "setInitialState", "setListOfUniqCities", "citylist_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FeatureCityListViewModel extends com.atomtesttask.core.base.FeatureViewModel<com.atomtesttask.citylist.presenter.FeatureCityListContract.Event, com.atomtesttask.citylist.presenter.FeatureCityListContract.State, com.atomtesttask.citylist.presenter.FeatureCityListContract.Effect> {
    @org.jetbrains.annotations.NotNull()
    private final navigation.compose.NavigationManager navigationManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.atomtesttask.domain.usecases.GetChargingStationsDataUseCase getChargingStationsDataUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.atomtesttask.citylist.dataprovider.DataProvider dataProvider = null;
    
    @javax.inject.Inject()
    public FeatureCityListViewModel(@org.jetbrains.annotations.NotNull()
    navigation.compose.NavigationManager navigationManager, @org.jetbrains.annotations.NotNull()
    com.atomtesttask.domain.usecases.GetChargingStationsDataUseCase getChargingStationsDataUseCase, @org.jetbrains.annotations.NotNull()
    com.atomtesttask.citylist.dataprovider.DataProvider dataProvider) {
        super();
    }
    
    private final void getData() {
    }
    
    private final void setListOfUniqCities() {
    }
    
    private final void onObservers() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.atomtesttask.citylist.presenter.FeatureCityListContract.State setInitialState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onErrorHandler(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable exception) {
    }
    
    @java.lang.Override()
    public void handleEvents(@org.jetbrains.annotations.NotNull()
    com.atomtesttask.citylist.presenter.FeatureCityListContract.Event event) {
    }
    
    private final void onEventSelected(com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ActionsEvent event) {
    }
    
    private final void onEventService(com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ServiceEvent event) {
    }
}