import androidx.compose.ui.graphics.painter.Painter

data class NavItem(
    val tittle: String,
    val icon: Painter,
    val selectedIcon : Painter,
    val screen: Screen
)