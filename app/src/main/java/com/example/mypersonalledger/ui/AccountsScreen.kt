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
fun AccountsScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Accounts Screen")
        Button(onClick = { navController.navigate("main") }) {
            Text("Go to Main Screen")
        }
        Button(onClick = { navController.navigate("settings") }) {
            Text("Go to Settings")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AccountsScreenPreview() {
    // Preview for AccountsScreen
    AccountsScreen(navController = rememberNavController())
}