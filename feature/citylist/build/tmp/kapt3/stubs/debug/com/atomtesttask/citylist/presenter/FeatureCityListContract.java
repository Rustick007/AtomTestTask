package com.atomtesttask.citylist.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract;", "", "()V", "Effect", "Event", "State", "citylist_debug"})
public final class FeatureCityListContract {
    
    public FeatureCityListContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Effect;", "Lcom/atomtesttask/core/base/ViewSideEffect;", "()V", "citylist_debug"})
    public static abstract class Effect implements com.atomtesttask.core.base.ViewSideEffect {
        
        private Effect() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event;", "Lcom/atomtesttask/core/base/ViewEvent;", "()V", "ActionsEvent", "ServiceEvent", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent;", "citylist_debug"})
    public static abstract class Event implements com.atomtesttask.core.base.ViewEvent {
        
        private Event() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event;", "()V", "CityClicked", "GoToBack", "GoToSecondScreen", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent$CityClicked;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent$GoToBack;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent$GoToSecondScreen;", "citylist_debug"})
        public static abstract class ActionsEvent extends com.atomtesttask.citylist.presenter.FeatureCityListContract.Event {
            
            private ActionsEvent() {
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent$CityClicked;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "citylist_debug"})
            public static final class CityClicked extends com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ActionsEvent {
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String name = null;
                
                public CityClicked(@org.jetbrains.annotations.NotNull()
                java.lang.String name) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getName() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent$GoToBack;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "citylist_debug"})
            public static final class GoToBack extends com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ActionsEvent {
                @org.jetbrains.annotations.NotNull()
                public static final com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ActionsEvent.GoToBack INSTANCE = null;
                
                private GoToBack() {
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override()
                @org.jetbrains.annotations.NotNull()
                public java.lang.String toString() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent$GoToSecondScreen;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ActionsEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "citylist_debug"})
            public static final class GoToSecondScreen extends com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ActionsEvent {
                @org.jetbrains.annotations.NotNull()
                public static final com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ActionsEvent.GoToSecondScreen INSTANCE = null;
                
                private GoToSecondScreen() {
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override()
                @org.jetbrains.annotations.NotNull()
                public java.lang.String toString() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event;", "()V", "AddUniqCitiesToState", "OnLoadData", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent$AddUniqCitiesToState;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent$OnLoadData;", "citylist_debug"})
        public static abstract class ServiceEvent extends com.atomtesttask.citylist.presenter.FeatureCityListContract.Event {
            
            private ServiceEvent() {
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent$AddUniqCitiesToState;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent;", "citiesList", "", "", "(Ljava/util/List;)V", "getCitiesList", "()Ljava/util/List;", "citylist_debug"})
            public static final class AddUniqCitiesToState extends com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ServiceEvent {
                @org.jetbrains.annotations.NotNull()
                private final java.util.List<java.lang.String> citiesList = null;
                
                public AddUniqCitiesToState(@org.jetbrains.annotations.NotNull()
                java.util.List<java.lang.String> citiesList) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.String> getCitiesList() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent$OnLoadData;", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$Event$ServiceEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "citylist_debug"})
            public static final class OnLoadData extends com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ServiceEvent {
                @org.jetbrains.annotations.NotNull()
                public static final com.atomtesttask.citylist.presenter.FeatureCityListContract.Event.ServiceEvent.OnLoadData INSTANCE = null;
                
                private OnLoadData() {
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override()
                @org.jetbrains.annotations.NotNull()
                public java.lang.String toString() {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$State;", "Lcom/atomtesttask/core/base/ViewState;", "clickedCity", "", "allData", "", "Lcom/atomtesttask/domain/model/ChargingStationsModel;", "listOfUniqCities", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAllData", "()Ljava/util/List;", "getClickedCity", "()Ljava/lang/String;", "getListOfUniqCities", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "citylist_debug"})
    public static final class State implements com.atomtesttask.core.base.ViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String clickedCity = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.atomtesttask.domain.model.ChargingStationsModel> allData = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> listOfUniqCities = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.atomtesttask.citylist.presenter.FeatureCityListContract.State.Companion Companion = null;
        
        public State(@org.jetbrains.annotations.NotNull()
        java.lang.String clickedCity, @org.jetbrains.annotations.NotNull()
        java.util.List<com.atomtesttask.domain.model.ChargingStationsModel> allData, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> listOfUniqCities) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClickedCity() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.atomtesttask.domain.model.ChargingStationsModel> getAllData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getListOfUniqCities() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.atomtesttask.domain.model.ChargingStationsModel> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.atomtesttask.citylist.presenter.FeatureCityListContract.State copy(@org.jetbrains.annotations.NotNull()
        java.lang.String clickedCity, @org.jetbrains.annotations.NotNull()
        java.util.List<com.atomtesttask.domain.model.ChargingStationsModel> allData, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> listOfUniqCities) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$State$Companion;", "", "()V", "default", "Lcom/atomtesttask/citylist/presenter/FeatureCityListContract$State;", "citylist_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}