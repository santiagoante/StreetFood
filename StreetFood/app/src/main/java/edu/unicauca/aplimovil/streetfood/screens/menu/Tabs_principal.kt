package edu.unicauca.aplimovil.streetfood.screens.menu

import android.annotation.SuppressLint
import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.*
import edu.unicauca.aplimovil.streetfood.R
import edu.unicauca.aplimovil.streetfood.navigation.AppScreens
import  edu.unicauca.aplimovil.streetfood.screens.menu.Tabs_item.*
import edu.unicauca.aplimovil.streetfood.ui.theme.Gris_claro
import edu.unicauca.aplimovil.streetfood.ui.theme.Gris_oscuro
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.filled.ShoppingCart


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun menu_lateral() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar(scope, scaffoldState)},
        drawerContent = {Drawer()}
    ) {
    }
}

@Composable
fun TopBar(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState
) {
    TopAppBar(
        title = { Text(text = "")},
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Icono menu")
            }
        },
    )
}
@Composable
fun Drawer() {
    val menu_items = listOf(
        "Usuario",
        "Historial",
        "Borrar historial",
        "Cerrar sesión"
    )
    Column() {
        menu_items.forEach { item ->
            TextButton(onClick = { }) {
                Text(
                    item,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }

        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs_principal(navController: NavController) {
    val tabs = listOf(
        Tabs_item.item_comidas,
        Tabs_item.item_bebidas,
        Tabs_item.item_antojos,
    )
    val pagerState = rememberPagerState()
    Column() {
        Tabs(tabs,pagerState)

    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(tabs:List<Tabs_item>, pagerState: PagerState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Gris_claro),

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center,

        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menú",
                modifier = Modifier
                    .padding(vertical = 20.dp, horizontal = 20.dp)
                    .size(35.dp)
                    .align(Alignment.TopStart)
            )
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Compra",
                modifier = Modifier
                    .padding(vertical = 20.dp, horizontal = 20.dp)
                    .size(35.dp)
                    .align(Alignment.TopEnd).clickable {  }

            )
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Mi imagen",
                modifier = Modifier.size(150.dp)
            )


        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "¿Que se te antoja?")
            Button(
                onClick = { },
                shape = RoundedCornerShape(50),
                modifier = Modifier.size(width = 300.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ) {
                Text(text = "Buscar", color = Color.White, style = MaterialTheme.typography.body1)

            }
            val scope = rememberCoroutineScope()
            TabRow(
                selectedTabIndex = pagerState.currentPage,
                backgroundColor = Color.Transparent,
                contentColor = Color.Black,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        Modifier.pagerTabIndicatorOffset(
                            pagerState,
                            tabPositions
                        )
                    )
                }
            ) {
                tabs.forEachIndexed { index, tabsItem ->
                    LeadingIconTab(
                        selected = pagerState.currentPage == index,
                        onClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        },
                        icon = {
                            Icon(
                                modifier = Modifier.size(25.dp),
                                painter = painterResource(
                                    id = tabsItem.icon,
                                ),
                                contentDescription = ""
                            )
                        },
                        text = { Text(tabsItem.title, fontSize = 15.sp) })
                }
            }
            HorizontalPager(
                state = pagerState,
                count = tabs.size
            ) { page ->
                tabs[page].screen()

            }
        }
    }
}









