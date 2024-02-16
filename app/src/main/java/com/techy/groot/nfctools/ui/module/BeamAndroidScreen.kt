package com.techy.groot.nfctools.ui.module

import android.nfc.NdefMessage
import android.nfc.NdefRecord
import android.nfc.NfcAdapter
import android.nfc.NfcEvent
import android.nfc.Tag
import android.nfc.tech.Ndef
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun BeamAndroidScreen() {

    val context = LocalContext.current
    val nfcAdapter = NfcAdapter.getDefaultAdapter(context)


    Column(modifier = Modifier.fillMaxSize()) {
        DisposableEffect(key1 = Unit) {


           


            onDispose {

            }
        }
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp),
            text = "Bring Phone with enabled NFC near to beam and tap on Button"
        )


        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp),
            onClick = {

            },
            content = {
                Text(text = "Beam Android")
            })

    }
}