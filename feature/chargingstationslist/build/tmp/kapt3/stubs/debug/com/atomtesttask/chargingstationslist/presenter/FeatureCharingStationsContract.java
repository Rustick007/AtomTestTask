package com.atomtesttask.chargingstationslist.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract;", "", "()V", "Effect", "Event", "State", "chargingstationslist_debug"})
public final class FeatureCharingStationsContract {
    
    public FeatureCharingStationsContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Effect;", "Lcom/atomtesttask/core/base/ViewSideEffect;", "()V", "chargingstationslist_debug"})
    public static abstract class Effect implements com.atomtesttask.core.base.ViewSideEffect {
        
        private Effect() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event;", "Lcom/atomtesttask/core/base/ViewEvent;", "()V", "ActionsEvent", "ServiceEvent", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ActionsEvent;", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ServiceEvent;", "chargingstationslist_debug"})
    public static abstract class Event implements com.atomtesttask.core.base.ViewEvent {
        
        private Event() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ActionsEvent;", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event;", "()V", "GoToBack", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ActionsEvent$GoToBack;", "chargingstationslist_debug"})
        public static abstract class ActionsEvent extends com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event {
            
            private ActionsEvent() {
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ActionsEvent$GoToBack;", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ActionsEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "chargingstationslist_debug"})
            public static final class GoToBack extends com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event.ActionsEvent {
                @org.jetbrains.annotations.NotNull()
                public static final com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event.ActionsEvent.GoToBack INSTANCE = null;
                
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
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event$ServiceEvent;", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$Event;", "()V", "chargingstationslist_debug"})
        public static abstract class ServiceEvent extends com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.Event {
            
            private ServiceEvent() {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0010"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$State;", "Lcom/atomtesttask/core/base/ViewState;", "isShowTopBar", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "chargingstationslist_debug"})
    public static final class State implements com.atomtesttask.core.base.ViewState {
        private final boolean isShowTopBar = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.State.Companion Companion = null;
        
        public State(boolean isShowTopBar) {
            super();
        }
        
        public final boolean isShowTopBar() {
            return false;
        }
        
        public State() {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.atomtesttask.chargingstationslist.presenter.FeatureCharingStationsContract.State copy(boolean isShowTopBar) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$State$Companion;", "", "()V", "default", "Lcom/atomtesttask/chargingstationslist/presenter/FeatureCharingStationsContract$State;", "chargingstationslist_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}