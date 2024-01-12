package com.chrinovicmm.somacompose.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chrinovicmm.somacompose.data.Data
import com.chrinovicmm.somacompose.model.DataAnalitics

@Composable
fun Analitics(
    listDataAnalitics: List<DataAnalitics> = Data.analiticsData
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Donnees analitique du createur",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(2F),
                softWrap = false,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = "28 derniers jours",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .size(height = 20.dp, width = 100.dp)
                    .weight(1F)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row {
            listDataAnalitics.forEach{
                CardElement(data = it, modifier = Modifier.weight(1F))
            }
        }
    }
}

@Composable
fun CardElement(
    data: DataAnalitics,
    modifier: Modifier = Modifier
){
    Card(
        //elevation = 1.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
    ){
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = data.title,
                style = MaterialTheme.typography.headlineSmall
            )
            Row {
                Text(
                    text = data.value,
                    style = MaterialTheme.typography.headlineMedium
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = ""
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AnaliticsPreview(){
    Analitics()
}