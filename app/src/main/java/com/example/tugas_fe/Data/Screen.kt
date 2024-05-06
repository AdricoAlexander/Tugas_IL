sealed class Screen(val route : String){
    object Home : Screen("lazycolumnrow")
    object Search : Screen("lazyGrid")
    object About : Screen("about")
    object Detail : Screen("detail")
    object foodDetail : Screen("foodDetail")
    object tripDetail : Screen("picDetail")

}