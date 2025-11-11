package es.fpsumma.dam2.myapplication.ui.screens.viewprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import es.fpsumma.dam2.myapplication.R
import es.fpsumma.dam2.myapplication.ui.navigation.Routes
import es.fpsumma.dam2.myapplication.ui.theme.Pink40


val avatarId = R.drawable.avatar
val rosa=Pink40
@OptIn(ExperimentalMaterial3Api::class)
@Composable


fun ViewProfileScreen(navController: NavController) {

    Column(
        modifier= Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {6


        Image(
            painter = painterResource(id=R.drawable.avatar),
            contentDescription = ("Avatar de usuario"),
            contentScale = ContentScale.Crop,
            modifier=Modifier
                .size(120.dp)
        )

        Text(
            text = (nombre),
            color =rosa
        )

        Button(
            onClick = { navController.navigate(Routes.EDITPROFILE) },
            modifier = Modifier.fillMaxWidth().padding(top = 60.dp).padding(start = 60.dp)
                .padding(end = 60.dp)

        ) {
            Text("editar perfil")
        }

        }


    }





