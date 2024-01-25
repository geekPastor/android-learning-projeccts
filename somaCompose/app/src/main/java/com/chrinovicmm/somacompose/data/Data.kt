package com.chrinovicmm.somacompose.data

import com.chrinovicmm.somacompose.model.DataAnalitics
import com.chrinovicmm.somacompose.model.DataRevenue

object Data {
    val analiticsData = listOf(
        DataAnalitics("Vues","86.6 K"),
        DataAnalitics("Revenus", "250 K \$US")
    )

    val revenueData = listOf(
        DataRevenue("Mars (en cours)", 450f),
        DataRevenue("Fevrier", 428f),
        DataRevenue("Janvier", 250f),
    )
}