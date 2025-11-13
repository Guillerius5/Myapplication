package es.fpsumma.dam2.myapplication.ui.screens.viewprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import es.fpsumma.dam2.myapplication.R
import es.fpsumma.dam2.myapplication.state.ProfileState.correo
import es.fpsumma.dam2.myapplication.state.ProfileState.formacion
import es.fpsumma.dam2.myapplication.state.ProfileState.nombre
import es.fpsumma.dam2.myapplication.state.ProfileState.profesion
import es.fpsumma.dam2.myapplication.state.ProfileState.telefono
import es.fpsumma.dam2.myapplication.state.ProfileState.ubicacion
import es.fpsumma.dam2.myapplication.ui.navigation.Routes
import es.fpsumma.dam2.myapplication.ui.theme.Pink80


val avatarId = R.drawable.avatar
val rosa= Pink80
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
            color =rosa,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp

        )

        Text(
            text=(profesion),
            )

        Column(
            modifier = Modifier.padding(start = 10.dp).padding(end = 10.dp)
        ) {

            Row()

            {
                Text(
                    text = ("correo")
                )
                Spacer(modifier = Modifier.width(120.dp))
                Text(
                    text = (correo)
                )
            }

            Row(

            )

            {
                Text(
                    text = ("telefono")
                )
                Spacer(modifier = Modifier.width(120.dp))
                Text(
                    text = (telefono)
                )
            }

            Row()

            {
                Text(
                    text = ("ubicacion")
                )
                Spacer(modifier = Modifier.width(120.dp))
                Text(
                    text = (ubicacion)
                )
            }

            Row()

            {
                Text(
                    text = ("formacion")
                )
                Spacer(modifier = Modifier.width(120.dp))
                Text(
                    text = (formacion)
                )
            }




        }



        Button(
            onClick = { navController.navigate(Routes.EDITPROFILE) },
            modifier = Modifier.fillMaxWidth().padding(top = 60.dp).padding(start = 120.dp)
                .padding(end = 120.dp)

        ) {
            Text("editar perfil")
        }

    }







        }








