package com.example.navigationdemo.screens
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavHostController

import com.example.navigationdemo.NavRoutes

@Composable
fun Welcome(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Welcome", style = MaterialTheme.typography.h5)
            
            Spacer(modifier = Modifier.size(30.dp))
            
            Button(onClick = {}) {
                Text(text = "Set up your Profile")
            }
        }
    }
}