package edu.unicauca.aplimovil.streetfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.google.accompanist.pager.*
import edu.unicauca.aplimovil.streetfood.ui.theme.StreetFoodTheme

import edu.unicauca.aplimovil.streetfood.navigation.Navigation
import edu.unicauca.aplimovil.streetfood.screens.menu.Tabs_item
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StreetFoodTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    Navigation()

                }
            }
        }
    }
}

@Composable
fun App(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .padding(top = 46.dp),
        color = MaterialTheme.colors.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Navigation()
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun Previewlogin(){
    StreetFoodTheme {
        Login()
    }
}*/


/*
@Preview(showBackground = true)
@Composable
fun PreviewBienvenida(){
    StreetFoodTheme {
        Bienvenida()
    }
}*/



/*
@Preview (showBackground = true)
@Composable
fun PreviewComidas(){
    StreetFoodTheme() {
        Comidas()
    }
}*/




/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StreetFoodTheme {
        Greeting("Android")
    }
}*/