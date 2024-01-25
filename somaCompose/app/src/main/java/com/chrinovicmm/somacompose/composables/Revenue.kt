package com.chrinovicmm.somacompose.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chrinovicmm.somacompose.data.Data
import com.chrinovicmm.somacompose.model.DataRevenue

@Composable
fun Revenue(listDataRevenue: List<DataRevenue> = Data.revenueData){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = "Vos revenus",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Estimation 3 derniers mois",
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Ellipsis
        )
        Card(
            //elevation = 1.dp,
            modifier = Modifier.padding(8.dp),
            shape = RoundedCornerShape(8.dp)
        ) {

            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                val maxValue = listDataRevenue.maxBy {
                    it.amount
                }

                listDataRevenue.forEach {
                    RevenueByMonthItem(
                        revenueData = it,
                        ratio =it.amount / maxValue.amount
                    )
                }
            }

        }
    }
}

@Composable
fun RevenueByMonthItem(revenueData: DataRevenue, ratio: Float){
    Row() {
        Text(
            text = revenueData.month,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
            modifier = Modifier.weight(1F)
        )

        Row(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ){
            Box(modifier = Modifier
                .height(20.dp)
                .fillMaxWidth(ratio)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.secondary))

        }
    }
    
    Text(
        text = "${revenueData.amount} \$US",
        //modifier = Modifier.weight(1f),
        textAlign = TextAlign.End,
        //modifier = Modifier.weight(1f)
    )
}

@Preview(showBackground = true)
@Composable
fun RevenuePreview(){
    Revenue()
}