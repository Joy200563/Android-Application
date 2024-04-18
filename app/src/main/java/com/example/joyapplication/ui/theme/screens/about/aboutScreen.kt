package com.example.joyapplication.ui.theme.screens.about

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.joyapplication.navigation.ROUTE_HOME

@Composable
fun AboutScreen(navController: NavController){
    Column {
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = "About Us Screen")
            
            
        }
        Button(onClick = { navController.navigate(ROUTE_HOME) },
            colors = ButtonDefaults.buttonColors(Color.Green)) {
            Text(text = "To HOME SCREEN")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}