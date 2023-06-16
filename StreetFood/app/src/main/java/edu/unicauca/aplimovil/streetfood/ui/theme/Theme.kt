package edu.unicauca.aplimovil.streetfood.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    /*
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
    */
    primary = Rojo_oscuro,
    primaryVariant = Rojo,
    secondary = Gris_oscuro,
    secondaryVariant = Gris,
)

private val LightColorPalette = lightColors(

    /*
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
    */
    primary = Rojo_claro,
    primaryVariant = Rojo,
    secondary = Gris_claro,
    secondaryVariant = Gris,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun StreetFoodTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes2,
        content = content
    )
}