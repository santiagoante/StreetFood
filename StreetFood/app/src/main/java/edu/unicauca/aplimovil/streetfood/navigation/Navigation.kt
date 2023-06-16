package edu.unicauca.aplimovil.streetfood.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.unicauca.aplimovil.streetfood.screens.home.Bienvenida
import edu.unicauca.aplimovil.streetfood.screens.login.Login
import edu.unicauca.aplimovil.streetfood.screens.login.Register
import edu.unicauca.aplimovil.streetfood.screens.login.SplashScreen
import edu.unicauca.aplimovil.streetfood.screens.menu.Antojo
import edu.unicauca.aplimovil.streetfood.screens.menu.Comida
import edu.unicauca.aplimovil.streetfood.screens.menu.Bebida

import edu.unicauca.aplimovil.streetfood.screens.menu.Tabs_principal

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(
    navController = navController,
    startDestination = AppScreens.SplashScreen.route
    ){
        composable(route = AppScreens.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(route = AppScreens.Bienvenida.route){
            Bienvenida(navController = navController)
        }
        composable(route = AppScreens.Login.route){
            Login(navController = navController)
        }
        composable(route = AppScreens.Register.route){
            Register(navController = navController)
        }

        composable(route = AppScreens.Tabs.route){
            Tabs_principal(navController = navController)
        }

        composable(route = AppScreens.Comida.route){
            Comida(navController = NavController)
        }
        composable(route = AppScreens.Bebida.route){
            Bebida(navController = NavController)
        }
        composable(route = AppScreens.Antojo.route){
            Antojo(navController = NavController)
        }
        /*
        composable(Screens.StreedFoodSplashScreen.name){
            SplashScreen(navController = navController)
        }
        composable(Screens.StreedFoodBienvenida.name){
            Bienvenida(navController = navController)
        }
        composable(Screens.StreedFoodLogin.name){
            Login(navController = navController)
        }
        composable(Screens.StreedFoodRegister.name){
            Register(navController = navController)
        }*/
    }

}