package com.chrinovicmm.yves_challenge

import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.provider.MediaStore.Images
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

        Surface(
            shape = CircleShape,
            modifier = Modifier.size(40.dp),
            color = Color.Blue
        ) {
            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
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

@Composable
fun StatusComponents(
    modifier: Modifier = Modifier,
    names: List<String> = List(7) {"Chrinovic"}
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
        ){
            Image(
                painter = painterResource(R.drawable.chris),
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
fun SootheBottomNavigation(modifier: Modifier = Modifier) {
    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.surfaceVariant
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = "Home"
                )
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = "Cart"
                )
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = "Product"
                )
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = "Profile"
                )
            }
        )
    }
}



@Composable
fun StoriesComponents(
    modifier: Modifier = Modifier,
    names: List<String> = List(20) {"Chrinovic MM"}
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySootheAppPortrait() {
    YveschallengeTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ){padding->
            HomeScreen(Modifier.padding(padding))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(text = "My profile")
        },
        navigationIcon = {
            IconButton(onClick = {  }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = null
                )
            }
        },
        actions = {
            IconButton(onClick = {}){
                Icon(
                    imageVector = Icons.Filled.List,
                    contentDescription =""
                )
            }
        }
    )
}


@Composable
fun StoriesSection(
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
fun Conversation(
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(15.dp),
    ) {
        Surface(
            shape = CircleShape,
            modifier = modifier
                .padding(4.dp)
                .size(100.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription ="",
                modifier = modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Column(
            modifier = Modifier.padding(10.dp)
        ){
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Chrinovic MM",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "10:10 AM")
            }
            Text(
                text = "Hey, take a look at Jetpack Compose, it's great!"
            )
        }

    }

}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier.verticalScroll(rememberScrollState())
    ) {
        topBar()
        //Spacer(modifier.height(16.dp))
        StoriesSection(title = "Friends online"){
            StatusComponents()
        }
        StoriesSection(title = "Friends Stories"){
            StoriesComponents()
        }
        StoriesSection(title = "Friends Stories"){
            Conversation()
            Conversation()
        }
    }
}

@Composable
fun App(){
    MySootheAppPortrait()
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
fun ConversationPreview(){
    YveschallengeTheme {
        Conversation()
    }
}

/*@Preview(showBackground = true)
@Composable
fun ConversationComponentsPreview(){
    YveschallengeTheme {
        ConversationComponents(msg = Message("Chrinovic MM", "n'importe quoi", "10:10PM"))
    }
}*/

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    YveschallengeTheme {
        MySootheAppPortrait()
    }
}