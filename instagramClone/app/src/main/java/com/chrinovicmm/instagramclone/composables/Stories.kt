package com.chrinovicmm.instagramclone.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chrinovicmm.instagramclone.R

@Composable
fun Stories(
    modifier: Modifier = Modifier,
    names: List<String> =  List(5){"Chrinovic"}
){
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ){
        items(items = names){name->
            Story(modifier = Modifier.padding(8.dp) ,name)
        }
    }

}


@Composable
fun Story(
    modifier: Modifier = Modifier,
    name: String
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Surface(
            shape = RoundedCornerShape(50),
            modifier = Modifier.size(100.dp),
            color = Color.Blue
        ) {
            Image(
                painter = painterResource(R.drawable.chrinovicmm),
                contentDescription = null,
                modifier = Modifier
                    //.padding(2.dp)
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        Text(
            text = name,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp)
        )

    }
}



@Preview(showBackground = true)
@Composable
fun StoryPreview(){
    Story(name = "Chrinovic")
}

@Preview(showBackground = true)
@Composable
fun StoriesPreview(){
    Stories()
}