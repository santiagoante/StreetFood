package edu.unicauca.aplimovil.streetfood.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import edu.unicauca.aplimovil.streetfood.R

// Set of Material typography styles to start with

private val Konit = FontFamily(
    Font(R.font.kanit_bolditalic, FontWeight.Normal),
    Font(R.font.kanit_italic, FontWeight.Normal),
    Font(R.font.kanit_bolditalic, FontWeight.SemiBold)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Konit,
        fontWeight = FontWeight.SemiBold,
        fontSize = 48.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = Konit,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)