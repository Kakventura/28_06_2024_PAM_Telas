package com.example.primeiratela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primeiratela.ui.theme.PrimeiraTelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeiraTelaTheme {
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
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp) // padding horizontal
    ) {
        // TextField para localização
        OutlinedTextField(
            value = "",
            onValueChange = { /* função para modificar o valor do TextField */ },
            label = { Text("Localização:") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp) // padding horizontal
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Linha para Check-in e Check-out
        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            // TextField para Check-in
            OutlinedTextField(
                value = "",
                onValueChange = { /* função para modificar o valor do TextField */ },
                label = { Text("Check-in:") },
                modifier = Modifier
                    .width(170.dp) // Define a largura do campo de texto
                    .padding(horizontal = 20.dp) // padding horizontal
            )
            // TextField para Check-out
            OutlinedTextField(
                value = "",
                onValueChange = { /* função para modificar o valor do TextField */ },
                label = { Text("Check-out:") },
                modifier = Modifier
                    .width(170.dp) // Define a largura do campo de texto
                    .padding(end = 20.dp)
            )
        }
    }

    // LazyColumn para os cards
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 160.dp)
    ) {
        items(4) { index ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp), // Espaçamento entre os cards
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp) // Elevação do card
            ) {
                Column(
                    modifier = Modifier.padding(16.dp) // Espaçamento interno do conteúdo do card
                ) {
                    // Imagem do card
                    val imagem1 = painterResource(R.drawable.foto01) // Variável que armazena o recurso da imagem
                    Image(
                        painter = imagem1,
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
                        text = "Casa de Praia em Ipanema ",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            color = Color.Black,
                        )
                    )
                    Text(
                        text = "Anfitrião (ã): Karinne Angelo",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = Color.Gray,
                        )
                    )
                    Text(
                        text = "R$360",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            color = Color.Black,
                        )
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Botão Ver Mais
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp) // Tamanho personalizado do botão
                    ) {
                        Text(
                            text = "Ver Mais...",
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
    }
}


@Preview(showBackground = true)
@Composable
fun TelaPreview() {
    PrimeiraTelaTheme {
        Tela()
    }
}