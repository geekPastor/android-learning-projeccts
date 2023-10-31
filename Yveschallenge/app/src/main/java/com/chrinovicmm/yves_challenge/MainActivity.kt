package com.chrinovicmm.yves_challenge

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chrinovicmm.yves_challenge.ui.theme.YveschallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YveschallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    App()
                }
            }
        }
    }
}

@Composable
fun StatusComponent(
    modifier: Modifier = Modifier,
    name: String
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = name,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp)
        )
    }
}

@Composable
fun StatusComponents(
    modifier: Modifier = Modifier,
    names: List<String> = List(20) {"$it"}
){
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(items = names) { name ->
            StatusComponent(modifier = Modifier.padding(8.dp), name)
        }
    }
}

@Composable
fun StoriesComponent(
    modifier: Modifier = Modifier,
    name: String
){
    Surface(
        shape = MaterialTheme.shapes.medium,
        modifier = modifier,
        color = MaterialTheme.colorScheme.surfaceVariant
    ) {
        Column(
            modifier = Modifier.width(100.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = name,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .padding(start = 10.dp)
            )
        }
    }
}



@Composable
fun StoriesComponents(
    modifier: Modifier = Modifier,
    names: List<String> = List(20) {"$it"}
){
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ){
        items(items = names){name->
            StoriesComponent(modifier = Modifier.padding(8.dp), name)
        }
    }
}



@Composable
fun HomeSection(
    modifier: Modifier = Modifier,
    title: String,
    content: @Composable ()-> Unit
){
    Column(modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                .padding(horizontal = 16.dp)
        )
        content()
    }
}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier.verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier.height(16.dp))
        HomeSection(title = "Friends online"){
            StatusComponents()
        }
        HomeSection(title = "Friends Stories"){
            StoriesComponents()
        }
    }
}

@Composable
fun App(){
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun StatusComponentPreview() {
    YveschallengeTheme {
        StatusComponent(name="Chironovic")
    }
}

@Preview(showBackground = true)
@Composable
fun StoriesComponentPreview() {
    YveschallengeTheme {
        StoriesComponent(name="Mukeba")
    }
}

@Preview(showBackground = true)
@Composable
fun StatusComponentsPreview(){
    YveschallengeTheme {
        StatusComponents()
    }
}

@Preview(showBackground = true)
@Composable
fun StoriesComponentsPreview(){
    YveschallengeTheme {
        StoriesComponents()
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    YveschallengeTheme {
        HomeScreen()
    }
}