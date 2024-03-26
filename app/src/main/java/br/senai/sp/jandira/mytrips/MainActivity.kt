package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                    Greeting2()
                    Greeting3()

                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 10.dp)
                )
                .size(height = 40.dp, width = 120.dp)


        )


    }
    Column(
        modifier = Modifier.padding(top = 160.dp, start = 10.dp),

        ) {
        Text(
            text = "Login",
            modifier = Modifier,
            color = Color(0xffCF06F0),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Please sign in to continue",
            modifier = Modifier,
            color = Color(0xffA09C9C),
            fontSize = 21.sp
        )
        Column(
            modifier = Modifier

                .size(height = 350.dp, width = 500.dp)
                .padding(top = 100.dp, end = 10.dp, start = 10.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp),//padding(start = 42.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = ""
                    )


                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                    )

            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .padding(top = 10.dp)
                    .size(width = 350.dp, height = 65.dp),//padding(start = 42.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        modifier = Modifier,
                        imageVector = Icons.Filled.Lock,
                        contentDescription = ""
                    )


                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                    )
            )

            Button(
                modifier = Modifier
                    .align(Alignment.End)
                    .size(height = 75.dp, width = 170.dp)
                    .padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults
                    .buttonColors(
                        containerColor = Color(0xffCF06F0)
                    ),
                onClick = { /*TODO*/ }
            ) {
                Text(
                    modifier = Modifier,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18.sp,
                    text = "SING IN"
                )
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = ""
                )


            }
            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 10.dp, top = 10.dp)
            ) {
                Text(
                    modifier = Modifier,
                    color = Color(0xffA09C9C),
                    text = "Don’t have an account?"
                )
                Text(
                    modifier = Modifier,
                    color = Color(0xffCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                    text = "Sign up"
                )
            }

        }

    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xffCF06F0),
                    shape = RoundedCornerShape(topEnd = 10.dp)
                )
                .size(height = 40.dp, width = 120.dp)


        )


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        Greeting()

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Greeting2() {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 10.dp)
                )
                .size(height = 40.dp, width = 120.dp)


        )
    }

    Column(
        modifier = Modifier
            .padding(top = 50.dp, start = 0.dp)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color(0xffCF06F0),
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            text = "Sign up"
        )

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = Color(0xffA09C9C),
            fontSize = 15.sp,
            text = "Create a new account"
        )

        Card(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(height = 120.dp, width = 100.dp)
                .padding(top = 20.dp),
            shape = CircleShape
        ) {
            Image(
                modifier = Modifier.size(height = 120.dp, width = 100.dp),
                painter = painterResource(id = R.drawable.group), contentDescription = ""
            )

        }
        Image(
            modifier = Modifier
                .offset(x = 198.dp, y = -30.dp)
                .size(height = 30.dp, width = 30.dp),
            painter = painterResource(id = R.drawable.photo), contentDescription = ""
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.CenterHorizontally)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),//padding(start = 42.dp),
                label = { Text(text = "Username") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                    )

            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),//padding(start = 42.dp),
                label = { Text(text = "Telephone") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Call,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                    )

            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),//padding(start = 42.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                    )

            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .size(width = 350.dp, height = 65.dp)
                    .padding(start = 20.dp, end = 10.dp),//padding(start = 42.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                    )

            )

            Row {
                Button(
                    modifier = Modifier
                        .size(height = 30.dp, width = 50.dp)
                        .padding(40.dp)
                        .border(0.dp, color = Color(0xffCF06F0)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),

                    onClick = { /*TODO*/ }
                ) {

                }

                Text(
                    modifier = Modifier.padding(top = 30.dp, start = 30.dp),
                    fontSize = 17.sp,
                    text = "Over 18?"
                )


            }

            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(height = 80.dp, width = 330.dp)
                    .padding(top = 30.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffCF06F0)
                ),
                onClick = { /*TODO*/ }
            ) {
                Text(
                    modifier = Modifier,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 16.sp,
                    text = "CREATE ACCOUNT"
                )
            }

            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 30.dp, top = 10.dp)
            ) {
                Text(
                    modifier = Modifier,
                    color = Color(0xffA09C9C),
                    text = "Already have an account?"
                )
                Text(
                    modifier = Modifier,
                    color = Color(0xffCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                    text = "Sign in"
                )
            }

            Box(
                contentAlignment = Alignment.BottomStart,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            color = Color(0xffCF06F0),
                            shape = RoundedCornerShape(topEnd = 10.dp)
                        )
                        .size(height = 40.dp, width = 120.dp)


                )


            }

        }

    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Greeting3() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color(0xffF6F6F6))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.paris
                ),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Card(

                    modifier = Modifier
                        .size(height = 60.dp, width = 60.dp),
                    shape = CircleShape
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.susana),
                        contentDescription = ""
                    )
                }
                Text(
                    text = "Susanna Hoffs",
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )
                Column(

                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Bottom


                ) {
                    Row(
                        modifier = Modifier
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier.size(height = 20.dp, width = 20.dp)
                        )
                        Text(
                            text = "You're in Paris",
                            color = Color.White
                        )
                    }
                    Text(
                        modifier = Modifier
                            .width(110.dp)
                            .padding(start = 10.dp),
                        text = "My Trips",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


            }
        }
        Column {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Categories",
                color = Color.Black,
                fontSize = 16.sp
            )

            Row {
                LazyRow {
                    item() {
                        Card(
                            modifier = Modifier.padding(horizontal = 8.dp)
                        ) {
                            Column(

                                modifier = Modifier
                                    .size(height = 80.dp, width = 130.dp)
                                    .background(color = Color(0xffCF06F0))
                                    .padding(20.dp)
                                    .padding(start = 20.dp),
                            ) {
                                Icon(
                                    modifier = Modifier.padding(start = 10.dp),
                                    imageVector = Icons.Default.Landscape,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Text(
                                    text = "Montain",
                                    color = Color.White
                                )
                            }
                        }

                    }
                    item() {
                        Card(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Column(

                                modifier = Modifier
                                    .size(height = 80.dp, width = 130.dp)
                                    .background(color = Color(0xffEAABF4))
                                    .padding(20.dp)
                                    .padding(start = 20.dp),
                            ) {
                                Icon(
                                    modifier = Modifier.padding(start = 10.dp),
                                    imageVector = Icons.Default.DownhillSkiing,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Text(
                                    modifier = Modifier.padding(start = 7.dp),
                                    text = "Snow",
                                    color = Color.White
                                )
                            }
                        }

                    }
                    item() {
                        Card(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Column(

                                modifier = Modifier
                                    .size(height = 80.dp, width = 130.dp)
                                    .background(color = Color(0xffEAABF4))
                                    .padding(20.dp)
                                    .padding(start = 20.dp),
                            ) {
                                Icon(
                                    modifier = Modifier.padding(start = 10.dp),
                                    imageVector = Icons.Default.BeachAccess,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Text(
                                    modifier = Modifier.padding(start = 7.dp),
                                    text = "Beach",
                                    color = Color.White

                                )
                            }
                        }

                    }
                }
            }
        }
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 8.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White
            ),
            shape = RoundedCornerShape(50.dp),
            placeholder = {
                Text(
                    text = "Search your destiny",
                    color = Color(0xffB7B7B7)
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    tint = Color(0xffB7B7B7)
                )
            },

            )

        Column {
            Text(
                modifier = Modifier.padding(start = 13.dp, bottom = 8.dp),
                text = "Past Trips",
                color = Color.Black,
                fontSize = 16.sp
            )

            LazyColumn() {
                items(2) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp)
                    ) {
                        Column(
                            modifier = Modifier
                        ) {
                            Card(
                                modifier = Modifier
                                    .height(100.dp)
                                    .fillMaxWidth()
                                    .padding(8.dp)
                            ) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.london),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            
                            Text(
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp),
                                color = Color(0xffCF06F0),
                                fontSize = 18.sp,
                                text = "London, 2019"
                            )
                            Text(
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp),
                                color = Color(0xffA09C9C),
                                text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million."
                            )

                            Text(
                                modifier = Modifier.padding(start = 240.dp, top = 5.dp),
                                color = Color(0xffCF06F0),
                                text = "18 Feb - 21 Feb"
                            )
                        }
                    }

                }
            }
        }


    }
}