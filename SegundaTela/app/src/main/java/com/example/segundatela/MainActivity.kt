package com.example.segundatela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.segundatela.ui.theme.SegundaTelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SegundaTelaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tela()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Tela() {
    Column(
        Modifier
            .fillMaxWidth() // Adquirir o tamanho máximo da tela

    ) {
        // Primeira linha (navbar)
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(7.dp),
            verticalAlignment = Alignment.CenterVertically // Alinhamento vertical central
        ) {
            // Adição de imagem (ícone)
            val imagem1 =
                painterResource(R.drawable.icone) // Variável que armazena o recurso da imagem
            Image(
                painter = imagem1,
                contentDescription = null, // Descrição de conteúdo para acessibilidade
                contentScale = ContentScale.Crop,
                alpha = 1.0f, // Valor de alpha válido entre 0 (transparente) e 1 (opaco)
                modifier = Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.width(120.dp))

            // Texto de escolha de nacionalidade
            Text(
                text = "BRL",
                modifier = Modifier.offset(y = 3.5.dp),
                style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.White,
                )
            )

            // Adição de imagem (nacionalidade)
            val imagem2 =
                painterResource(R.drawable.nacionalidade) // Variável que armazena o recurso da imagem
            Image(
                painter = imagem2,
                contentDescription = null, // Descrição de conteúdo para acessibilidade
                contentScale = ContentScale.Crop,
                alpha = 1.0f, // Valor de alpha válido entre 0 (transparente) e 1 (opaco)
                modifier = Modifier.size(30.dp) // Definir o tamanho da imagem
            )

            Spacer(modifier = Modifier.weight(0.5f)) // Adicionar um espaçamento flexível antes do botão

            // Adição de um botão
            Button(onClick = { /*TODO*/ }) {
                Text(
                    text = "Anuncie Aqui!",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                    )
                )
            }
        }
    }

    // Nova coluna com card
    Column(
        Modifier
            .fillMaxWidth()
            .padding(
                top = 100.dp, // Padding apenas na parte superior
                start = 20.dp,
                end = 20.dp,
                bottom = 16.dp
            )
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp), // Espaçamento interno do card
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(4.dp) // Elevação do card
        ) {
            Column(
                modifier = Modifier.padding(16.dp) // Espaçamento interno do conteúdo do card
            ) {
                // Imagem do card
                val imagem3 =
                    painterResource(R.drawable.foto1) // Variável que armazena o recurso da imagem
                Image(
                    painter = imagem3,
                    contentDescription = null, // Descrição de conteúdo para acessibilidade
                    contentScale = ContentScale.Crop,
                    alpha = 1.0f, // Valor de alpha válido entre 0 (transparente) e 1 (opaco)
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(RoundedCornerShape(16.dp)) // Arredondar a borda da imagem
                        .border(
                            2.dp,
                            Color.White,
                            RoundedCornerShape(16.dp)
                        ) // Definir borda arredondada da imagem
                        .padding(2.dp) // Espaço interno entre a borda e a imagem
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Texto de dentro do card
                Text(
                    text = "Transforme seus planos em lar, alugue com facilidade!",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.Black,
                    )
                )
                Text(
                    text = "Procure por:",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black,
                    )
                )

                // Criação de uma linha para deixar todos os botões
                Row() {

                    // Botão1
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(width = 80.dp, height = 50.dp) // Tamanho personalizado do botão
                            .padding(top = 5.dp)
                    ) {
                        Text(
                            text = "Solo",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.White,
                            )
                        )
                    }

                    // Botão2
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(width = 80.dp, height = 50.dp) // Tamanho personalizado do botão
                            .padding(top = 5.dp, start = 5.dp)
                    ) {
                        Text(
                            text = "Duo",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.White,
                            )
                        )
                    }

                    // Botão3
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(width = 80.dp, height = 50.dp) // Tamanho personalizado do botão
                            .padding(top = 5.dp, start = 5.dp)
                    ) {
                        Text(
                            text = "Kids",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.White,
                            )
                        )
                    }
                    // Botão4
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(width = 80.dp, height = 50.dp) // Tamanho personalizado do botão
                            .padding(top = 5.dp, start = 5.dp)
                    ) {
                        Text(
                            text = "+3",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.White,
                            )
                        )
                    }
                }
            }

        }

        // Colunas para os campos de texto
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp) // padding horizontal
        ) {
            // TextField abaixo do card
            OutlinedTextField(
                value = "", // valor inicial do TextField
                onValueChange = { /* função para modificar o valor do TextField */ },
                label = { Text("Localização:") }, // label do TextField
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp) // padding horizontal
            )
            // Linha para deixar os campos no mesmo espaço
            Row () {

                // TextField (Check-in)
                OutlinedTextField(
                    value = "", // valor inicial do TextField
                    onValueChange = { /* função para modificar o valor do TextField */ },
                    label = { Text("Check-in:") }, // label do TextField
                    modifier = Modifier
                        .width(170.dp) // Define a largura do campo de texto
                        .padding(horizontal = 20.dp) // padding horizontal
                )
                // TextField (Check-out)
                OutlinedTextField(
                    value = "", // valor inicial do TextField
                    onValueChange = { /* função para modificar o valor do TextField */ },
                    label = { Text("Check-in:") }, // label do TextField
                    modifier = Modifier
                        .width(170.dp) // Define a largura do campo de texto
                        .padding(end = 20.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize(), // Ocupar todo o espaço disponível
                contentAlignment = Alignment.Center // Centralizar o conteúdo dentro do Box
            ) {
                Button(
                    onClick = { /*TODO*/ },

                ) {
                    Text(
                        text = "Buscar",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.White,
                        )
                    )
                }
        }
}    }
}

@Preview(showBackground = true)
@Composable
fun TelaPreview() {
    SegundaTelaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Tela()
        }
    }
}