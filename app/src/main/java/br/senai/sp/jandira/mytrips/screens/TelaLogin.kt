package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.model.Cadastro
import br.senai.sp.jandira.mytrips.repository.CadastroRepository
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {
    MyTripsTheme {
        Surface {
            val cr = CadastroRepository(LocalContext.current)

            var nomeState = remember {
                mutableStateOf("")
            }

            var senhaState = remember {
                mutableStateOf("")
            }

            var mensagemErroState = remember {
                mutableStateOf("")
            }

            var isErrorState = remember {
                mutableStateOf(false)
            }

            var loginError = remember {
                mutableStateOf(false)
            }

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
                        value = nomeState.value,
                        onValueChange = {
                            nomeState.value = it

                        },
                        modifier = Modifier
                            .size(width = 350.dp, height = 65.dp),//padding(start = 42.dp),
                        label = { Text(text = "Nome") },

                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Email,
                                contentDescription = ""
                            )


                        },
                        isError = isErrorState.value,
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xffCF06F0),
                            )

                    )

                    OutlinedTextField(
                        value = senhaState.value,
                        onValueChange = {
                            senhaState.value = it
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            capitalization = KeyboardCapitalization.Sentences
                        ),
                        visualTransformation = PasswordVisualTransformation(),
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
                        isError = isErrorState.value,
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xffCF06F0),
                            )
                    )
                    Text(text = mensagemErroState.value, color = Color.Red)

                    Button(
                        modifier = Modifier
                            .align(Alignment.End)
                            .size(height = 68.dp, width = 170.dp)
                            .padding(10.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xffCF06F0)
                            ),
                        onClick = {
                            val login = cr.logar(email = nomeState.value, senha = senhaState.value)
                            if(login == null){
                                isErrorState.value = true
                            }else{
                                cr.logar(email = login.email, senha = login.senha)
                                controleDeNavegacao.navigate("home")
                            }
                        }
                    ) {
                        Text(
                            modifier = Modifier,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 18.sp,
                            text = "SIGN IN"
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = ""
                        )


                    }
                    Row(
                        modifier = Modifier
                            .align(Alignment.End)
//                            .padding(end = 10.dp, top = 10.dp)
                    ) {
                        Text(
                            modifier = Modifier,
                            color = Color(0xffA09C9C),
                            text = "Don’t have an account?"
                        )
                        Text(
                            modifier = Modifier.clickable { controleDeNavegacao.navigate("singup") },
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
    }
}

@Preview
@Composable
fun TelaLoginPreview() {
    MyTripsTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            //TelaLogin(controleDeNavegacao)
        }
    }
}