package es.fpsumma.dam2.myapplication.ui.screens.editprofile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState // Importar para el scroll
import androidx.compose.foundation.verticalScroll // Importar para el scroll
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.* // Usar * para TopAppBar, Scaffold, Icon, IconButton
import androidx.compose.runtime.Composable
// ... (Otros imports que ya tenías)
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import es.fpsumma.dam2.myapplication.state.ProfileState.correo
import es.fpsumma.dam2.myapplication.state.ProfileState.formacion
import es.fpsumma.dam2.myapplication.state.ProfileState.nombre
import es.fpsumma.dam2.myapplication.state.ProfileState.profesion
import es.fpsumma.dam2.myapplication.state.ProfileState.telefono
import es.fpsumma.dam2.myapplication.state.ProfileState.ubicacion
import es.fpsumma.dam2.myapplication.ui.navigation.Routes




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditProfileScreen(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Editar Perfil") },
                // Botón de Volver Atrás
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Volver Atrás"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->


        Column(

            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        )  {

            OutlinedTextField(

                value = nombre,

                onValueChange = { nuevoTexto -> nombre = nuevoTexto },

                modifier = Modifier.fillMaxWidth().padding(top =30.dp ).padding(start =20.dp).padding(end =20.dp ),

                label = {

                    Text("Nombre Completo")

                }



            )

            OutlinedTextField(

                value = profesion,

                onValueChange = { nuevoTexto -> profesion = nuevoTexto },

                modifier = Modifier.fillMaxWidth().padding(top =30.dp ).padding(start =20.dp).padding(end =20.dp ),

                label = {

                    Text("Profesion")

                }



            )

            OutlinedTextField(

                value = correo,

                onValueChange = { nuevoTexto -> correo = nuevoTexto },

                modifier = Modifier.fillMaxWidth().padding(top =30.dp ).padding(start =20.dp).padding(end =20.dp ),

                label = {

                    Text("Correo electronico")

                }



            )



            OutlinedTextField(

                value = telefono,

                onValueChange = { nuevoTexto -> telefono = nuevoTexto },

                modifier = Modifier.fillMaxWidth().padding(top =30.dp ).padding(start =20.dp).padding(end =20.dp ),

                label = {

                    Text("telefono")

                }



            )



            OutlinedTextField(

                value = ubicacion,

                onValueChange = { nuevoTexto -> ubicacion = nuevoTexto },

                modifier = Modifier.fillMaxWidth().padding(top =30.dp ).padding(start =20.dp).padding(end =20.dp ),

                label = {

                    Text("ubicacion")

                },

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)



            )



            OutlinedTextField(

                value = formacion,

                onValueChange = { nuevoTexto -> formacion = nuevoTexto },

                modifier = Modifier.fillMaxWidth().padding(top =30.dp ).padding(start =20.dp).padding(end =20.dp ),

                label = {

                    Text("Formacion academica")

                }



            )



            Button(

                onClick = {navController.navigate(Routes.PROFILE)},

                modifier = Modifier.padding(start = 300.dp).padding(top = 30.dp)

            ){

                Text("Guardar")

            }



        }

    }
}