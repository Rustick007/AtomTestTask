package navigation.compose

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

enum class NavigationAction {
    BACK,
    FORWARD,
    REPLACE,
    REPLACE_CURRENT,
}

data class NavigationCommand(val action: NavigationAction, val destination: String? = null)

class NavigationManager {
    private var _commands =
        MutableSharedFlow<NavigationCommand>(
            1,
            1,
            onBufferOverflow = BufferOverflow.DROP_OLDEST,
        )
    val commands = _commands.asSharedFlow()

    fun navigate(direction: String) {
        _commands.tryEmit(NavigationCommand(NavigationAction.FORWARD, direction))
    }

    fun back() {
        _commands.tryEmit(NavigationCommand(NavigationAction.BACK))
    }

    fun replace(direction: String) {
        _commands.tryEmit(NavigationCommand(NavigationAction.REPLACE, direction))
    }

    fun replaceCurrent(direction: String) {
        _commands.tryEmit(NavigationCommand(NavigationAction.REPLACE_CURRENT, direction))
    }
    @OptIn(ExperimentalCoroutinesApi::class)
    fun resetCache() {
        _commands.resetReplayCache()
    }
}