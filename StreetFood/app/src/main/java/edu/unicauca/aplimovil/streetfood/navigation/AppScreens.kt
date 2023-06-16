package edu.unicauca.aplimovil.streetfood.navigation

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object Bienvenida: AppScreens("bienvenida")
    object Login: AppScreens("login")
    object Register: AppScreens("Register")
    object Tabs: AppScreens("Tabs")
    object Comida: AppScreens("Comida")
    object Bebida: AppScreens("Bebida")
    object Antojo: AppScreens("Antojo")
}
