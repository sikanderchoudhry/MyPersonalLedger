package com.example.mypersonalledger.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Main Screen")
        Button(onClick = { navController.navigate("settings") }) {
            Text("Go to Settings")
        }
        Button(onClick = { navController.navigate("accounts") }) {
            Text("Go to Accounts")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    // Preview for MainScreen (NavController is not needed for preview)
    MainScreen(navController = rememberNavController())
}