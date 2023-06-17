package edu.unicauca.aplimovil.streetfood.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import edu.unicauca.aplimovil.streetfood.R.drawable
import edu.unicauca.aplimovil.streetfood.navigation.AppScreens

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.ui.geometry.Size


@Composable
fun Bienvenida(navController: NavHostController) {


    Image(
        painter = painterResource(id = drawable.fondologin),
        contentDescription = "fondo",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Image(
            painter = painterResource(id = drawable.icono),
            contentDescription = "logo", Modifier.size(250.dp),
        )
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "STREET FOOD",
            color = Color.White,
            style = MaterialTheme.typography.h1)
        Text(
            text = "Bienvenido, usuario",
            color = Color.LightGray,
            style = MaterialTheme.typography.body2)

        Spacer(modifier = Modifier.height(120.dp))

        IconButton(
            onClick = { navController.navigate(route = AppScreens.Tabs.route) },
            modifier = Modifier
                .size(56.dp)
                .background(Color.White, CircleShape),
            content = {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Arrow",
                    tint = Color.Red,
                    modifier =  Modifier.size(30.dp)
                )
            }
        )
        Spacer(modifier = Modifier.height(150.dp))
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom

    ) {


        Row() {
            Button(onClick = { navController.navigate(route = AppScreens.Register.route) },
                shape = RoundedCornerShape(50),
                modifier = Modifier.size(width = 150.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White) ) {
                Text(text = "Registrate", color = Color.Red, style = MaterialTheme.typography.body2 )
            }

            Spacer(modifier = Modifier.width(20.dp))



            Button(
                onClick = { navController.navigate(route = AppScreens.Login.route) } ,
                shape = RoundedCornerShape(50),
                modifier = Modifier.size(width = 150.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red) ) {
                Text(text = "Ingresa", color = Color.White, style = MaterialTheme.typography.body2 )
            }




        }
            Spacer(modifier = Modifier.height(100.dp))
    }
}





/*
@Preview(showBackground = true)
@Composable
fun PreviewBienvenida() {
    StreetFoodTheme {
        Bienvenida()
    }
}*/