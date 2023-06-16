package edu.unicauca.aplimovil.streetfood.screens.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.unicauca.aplimovil.streetfood.R

@Composable
fun Comida(navController: NavController.Companion) {

    LazyColumn(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .width(200.dp)
                        .height(220.dp)
                        .padding(5.dp)
                        .background(Color.White, shape = RoundedCornerShape(30.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(R.drawable.c1),
                            contentDescription = " item 1 ",
                            Modifier.size(150.dp)
                        )

                        Text(
                            text = "Hamburguesa Mix",
                            color = Color.Black,
                            style = MaterialTheme.typography.body1
                        )

                        Text(
                            text = "15.000 Cop",
                            color = Color.Black,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }


                Box(
                    modifier = Modifier
                        .width(200.dp)
                        .height(220.dp)
                        .padding(5.dp)
                        .background(Color.White, shape = RoundedCornerShape(30.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(R.drawable.c2),
                            contentDescription = " item 1 ",
                            Modifier.size(150.dp)
                        )

                        Text(
                            text = "Pizza peperoni",
                            color = Color.Black,
                            style = MaterialTheme.typography.body1

                        )

                        Text(
                            text = "48.000 Cop",
                            color = Color.Black,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .width(200.dp)
                        .height(220.dp)
                        .padding(5.dp)
                        .background(Color.White, shape = RoundedCornerShape(30.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(R.drawable.c3),
                            contentDescription = " item 1 ",
                            Modifier.size(150.dp)
                        )

                        Text(
                            text = "1/2 Pollo + papas",
                            color = Color.Black,
                            style = MaterialTheme.typography.body1

                        )

                        Text(
                            text = "35.000 Cop",
                            color = Color.Black,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .width(200.dp)
                        .height(220.dp)
                        .padding(5.dp)
                        .background(Color.White, shape = RoundedCornerShape(30.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(R.drawable.c4),
                            contentDescription = " item 1 ",
                            Modifier.size(150.dp)
                        )

                        Text(
                            text = "Sandwich pollo",
                            color = Color.Black,
                            style = MaterialTheme.typography.body1
                        )

                        Text(
                            text = "16.000 Cop",
                            color = Color.Black,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    color = Color.Black,
                    thickness = 2.dp
                )

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(20),
                    modifier = Modifier.size(width = 400.dp, height = 80.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
                ) {
                    Text(
                        text = "ESPACIO PUBLICITARIO",
                        color = Color.White,
                        style = MaterialTheme.typography.body1
                    )
                }
            }
        }
    }
}
