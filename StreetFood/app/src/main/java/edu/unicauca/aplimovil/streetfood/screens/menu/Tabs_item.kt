package edu.unicauca.aplimovil.streetfood.screens.menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import edu.unicauca.aplimovil.streetfood.R


typealias Mifuncion = @Composable () -> Unit
sealed class Tabs_item(
    var icon: Int,
    var title: String,
    var screen: Mifuncion
) {
    object item_comidas : Tabs_item(R.drawable.restaurante,
        "Comida",
        { Comida(navController = NavController) })

    object item_bebidas : Tabs_item(R.drawable.agua,
        "Bebidas",
        { Bebida(navController = NavController) })
    object item_antojos : Tabs_item(R.drawable.meriendas,
        "Antojos",
        { Antojo(navController = NavController) })
}