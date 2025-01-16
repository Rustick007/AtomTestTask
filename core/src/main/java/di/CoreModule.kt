package di

import android.content.Context

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import navigation.compose.NavigationManager
import java.util.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CoreModule {
    @Provides
    fun provideContext(@ApplicationContext context: Context): Context = context

    @Singleton
    @Provides
    fun provideComposeNavigationManger(): NavigationManager = NavigationManager()
}
