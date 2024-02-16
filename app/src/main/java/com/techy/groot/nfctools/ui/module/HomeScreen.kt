package com.techy.groot.nfctools.ui.module

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.techy.groot.nfctools.ui.theme.NfcToolsTheme

@Composable
fun HomeScreen() {


    Column(modifier = Modifier.fillMaxSize()) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f)
        ) {

            Column {
                Text(
                    text = "Read NFC",
                    style = MaterialTheme.typography.bodyMedium
                )


            }
        }


    }

}


@Composable
fun HomeScreenPreview() {
    NfcToolsTheme {
        HomeScreen()
    }
}