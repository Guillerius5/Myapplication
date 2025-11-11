package es.fpsumma.dam2.myapplication.ui.screens.viewprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import es.fpsumma.dam2.myapplication.ui.navigation.Routes
import es.fpsumma.dam2.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProfileScreen(navController: NavController) {

    Column {

        Image(
            // 💡 Aquí usas R.drawable.avatar
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Foto de perfil de Juan Pérez",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
            // Puedes añadir .border si quieres el anillo
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




