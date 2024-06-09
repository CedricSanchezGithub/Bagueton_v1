package com.example.bagueton_v1.ui.viewmodel

import ContactsViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.bagueton_v1.ui.AccountViewModel
import com.example.bagueton_v1.ui.AppNavigation
import com.example.bagueton_v1.ui.BaguetonViewModel
import com.example.bagueton_v1.ui.CalendarViewModel
import com.example.bagueton_v1.ui.WeatherViewModel
import com.example.bagueton_v1.ui.screens.Bagueton_v1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bagueton_v1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation(
                        baguetonViewModel = BaguetonViewModel(),
                        accountViewModel = AccountViewModel(),
                        weatherViewModel = WeatherViewModel(),
                        contactsViewModel = ContactsViewModel(),
                        calendarViewModel = CalendarViewModel()
                    )
                }
            }
        }
    }
}