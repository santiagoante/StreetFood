package edu.unicauca.aplimovil.streetfood.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import edu.unicauca.aplimovil.streetfood.R
import edu.unicauca.aplimovil.streetfood.navigation.AppScreens
import edu.unicauca.aplimovil.streetfood.screens.menu.Tabs_principal
import edu.unicauca.aplimovil.streetfood.ui.theme.Gris_claro

@Composable
fun Register(navController: NavController) {
    var nombre by remember { mutableStateOf("Santiago360") }
    var correo by remember { mutableStateOf("antesantiago@unicauca.edu.co") }
    var contraseña by remember { mutableStateOf("********") }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Gris_claro)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
            ) {
                Image(
                    painter = painterResource(R.drawable.fondologin),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()
                )

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {

                    Image(
                        painter = painterResource(id = R.drawable.icono),
                        contentDescription = "logo", Modifier.size(200.dp),
                    )
                }
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(color = Gris_claro),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Spacer(modifier = Modifier.height(200.dp))
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
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

        }

        Box(
            modifier = Modifier
                .width(360.dp)
                .height(470.dp)
                .padding(5.dp)
                .background(Color.White, shape = RoundedCornerShape(30.dp))
                .align(Alignment.Center)
        ) {
            Column(modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                Text(text = "Bienvenido a Street Food", style = MaterialTheme.typography.body2)
                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = nombre,
                    onValueChange = { nombre },
                    label = { Text(text = "Nombre") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = correo,
                    onValueChange = { correo },
                    label = { Text(text = "Correo") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = contraseña,
                    onValueChange = { contraseña },
                    label = { Text(text = "Contraseña") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(40.dp))

                Button(
                    onClick = { navController.navigate(route = AppScreens.Tabs.route)},
                    shape = RoundedCornerShape(50),
                    modifier = Modifier.size(width = 150.dp, height = 50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red) ) {
                    Text(
                        text = "Registrate",
                        color = Color.White,
                        style = MaterialTheme.typography.body2
                    )
                }
                Text(text = "¿Olvido su contraseña?", style = MaterialTheme.typography.body1)
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}
