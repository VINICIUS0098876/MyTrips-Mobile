package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun TelaHome(controleDeNavegacao: NavHostController) {
    MyTripsTheme {
        Surface {

            var pesquisarState = remember {
                mutableStateOf("")
            }

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
                    value = pesquisarState.value,
                    onValueChange = {
                        pesquisarState.value = it
                    },
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
                                        modifier = Modifier.padding(
                                            horizontal = 10.dp,
                                            vertical = 2.dp
                                        ),
                                        color = Color(0xffCF06F0),
                                        fontSize = 18.sp,
                                        text = "London, 2019"
                                    )
                                    Text(
                                        modifier = Modifier.padding(
                                            horizontal = 10.dp,
                                            vertical = 2.dp
                                        ),
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
    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaHomePreview() {
    MyTripsTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            //TelaHome(controleDeNavegacao)
        }
    }
}