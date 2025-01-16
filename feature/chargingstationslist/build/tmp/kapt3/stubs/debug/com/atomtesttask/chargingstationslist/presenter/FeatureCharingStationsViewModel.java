package com.atomtesttask.chargingstationslist.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsViewModel;", "Lcom/atomtesttask/core/base/FeatureViewModel;", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event;", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$State;", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Effect;", "navigationManager", "Lnavigation/compose/NavigationManager;", "(Lnavigation/compose/NavigationManager;)V", "handleEvents", "", "event", "onErrorHandler", "exception", "", "onEventSelected", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ActionsEvent;", "onEventService", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ServiceEvent;", "setInitialState", "chargingstationslist_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FeatureCharingStationsViewModel extends com.atomtesttask.core.base.FeatureViewModel<com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event, com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.State, com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Effect> {
    @org.jetbrains.annotations.NotNull()
    private final navigation.compose.NavigationManager navigationManager = null;
    
    @javax.inject.Inject()
    public FeatureCharingStationsViewModel(@org.jetbrains.annotations.NotNull()
    navigation.compose.NavigationManager navigationManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.State setInitialState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onErrorHandler(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable exception) {
    }
    
    @java.lang.Override()
    public void handleEvents(@org.jetbrains.annotations.NotNull()
    com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event event) {
    }
    
    private final void onEventSelected(com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event.ActionsEvent event) {
    }
    
    private final void onEventService(com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event.ServiceEvent event) {
    }
}