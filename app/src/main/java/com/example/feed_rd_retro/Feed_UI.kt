package com.example.feed_rd_retro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Feed_UI() {

    Scaffold(
        topBar = {
            TopAppBar(
                {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "Users Directory",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.width(12.dp))


                        Text(
                            text = "248",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier
                                .clip(RoundedCornerShape(50.dp))
                                .background(color = Color(0xFFADD8E6))
                                .padding(horizontal = 10.dp, vertical = 2.dp)
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Icon(
                            painter = painterResource(android.R.drawable.ic_menu_search),
                            tint = Color.Black,
                            contentDescription = "Search Icon",
                            modifier = Modifier.size(25.dp)
                        )

                        Spacer(modifier = Modifier.width(4.dp))

                        Icon(
                            painter = painterResource(android.R.drawable.ic_menu_save),
                            tint = Color.Black,
                            contentDescription = "Search Icon",
                            modifier = Modifier.size(25.dp)
                        )
                    }

                }
            )
        }

    ) {

            paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Icon(
                            painter = painterResource(android.R.drawable.ic_menu_search),
                            tint = Color.Black,
                            contentDescription = "Search Icon",
                            modifier = Modifier.size(25.dp)
                        )

                        Spacer(Modifier.width(4.dp))

                        Text(
                            text = "Filter posts or search keywords...",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(modifier = Modifier.fillMaxWidth()) {

                Text(
                    text = "ALL Posts (6)",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(color = Color.Black)
                        .padding(horizontal = 14.dp, vertical = 4.dp)
                )

                Spacer(Modifier.width(6.dp))

                val prompt = listOf<String>(
                    "User #1",
                    "Recent Activity",
                    "Discussion Activity"
                )

                LazyRow() {
                    items(prompt) { prompt ->
                        Row_Items(prompt)
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {

                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(color = Color(0xFF006400))
                        .size(15.dp)
                )

                Spacer(modifier = Modifier.width(6.dp))

                Text(
                    text = "FEED LIVE",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = "Sorted by chronological sequence",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )

            }

            Spacer(Modifier.height(16.dp))

            LazyColumn() {
                item {
                    Card_View()
                }

            }
        }
    }
}

@Composable
fun Row_Items(prompt : String){

    Text(text = prompt,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier
            .clip(RoundedCornerShape(50.dp))
            .background(color = Color.White)
            .padding(horizontal = 14.dp, vertical = 4.dp)
    )

    Spacer(Modifier.width(6.dp))

}

@Composable
fun Card_View(){

    Card(modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)) {

        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth()
                .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Text(text = "U1",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(color = Color(0xFFADD8E6))
                        .padding(horizontal = 14.dp, vertical = 4.dp)
                )

                Spacer(modifier = Modifier.width(6.dp))

                Text(text = "User #1",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.width(6.dp))

                Text(text = "#1",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(color = Color(0xFFADD8E6))
                        .padding(horizontal = 14.dp, vertical = 4.dp)
                )

            }

            Spacer(modifier = Modifier.width(6.dp))

            Text(text = "Title",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(text = "Description",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(6.dp))

            Row(modifier = Modifier.fillMaxWidth()) {

                Row_Items(
                    icon = painterResource(android.R.drawable.ic_menu_send),
                    text = "8"
                )

                Spacer(Modifier.width(20.dp))

                Row_Items(
                    icon = painterResource(android.R.drawable.ic_menu_save),
                    text = "8"
                )

                Spacer(Modifier.width(20.dp))

                Row_Items(
                    icon = painterResource(android.R.drawable.ic_menu_my_calendar),
                    text = "3m read"
                )

                Spacer(Modifier.weight(1f))

                Icon(
                    painter = painterResource(android.R.drawable.ic_menu_revert),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(color = Color(0xFFADD8E6))
                        .padding(horizontal = 14.dp, vertical = 4.dp)
                        .size(25.dp)
                )
            }
        }

    }

    Spacer(Modifier.height(20.dp))

}

@Composable
fun Row_Items(
    icon: Painter,
    text: String,
){

    Row(modifier = Modifier) {

        Icon(
            painter = icon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.size(25.dp)
        )

        Spacer(Modifier.width(6.dp))

        Text(text = text,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )

    }

}
