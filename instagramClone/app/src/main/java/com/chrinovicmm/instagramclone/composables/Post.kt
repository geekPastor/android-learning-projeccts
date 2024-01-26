package com.chrinovicmm.instagramclone.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chrinovicmm.instagramclone.R



@Composable
fun Posts(){
    Post()
    Post()
    Post()
}
@Composable
fun Post(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column {
            PostHeader()
            PostContent()
            PostFooter()
        }
    }
}

@Composable
fun PostHeader(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Surface(
                shape = RoundedCornerShape(50),
                modifier = Modifier.size(50.dp),
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

            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "Geek Pastor")
                Text(text = "Sponsored")
            }
        }

        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = ""
            )
        }
    }
}

@Composable
fun PostContent(){
    val maxWidth = Modifier.fillMaxWidth()
    Image(
        painter = painterResource(R.drawable.chrinovicmm),
        contentDescription = "",
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(shape = RoundedCornerShape(4.dp))
    )
}

@Composable
fun PostFooter(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription =""
                )
            }

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription =""
                )
            }

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Send,
                    contentDescription =""
                )
            }
        }

        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = ""
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostHeaderPrev(){
    PostHeader()
}

@Preview(showBackground = true)
@Composable
fun PostContentPrev(){
    PostContent()
}


@Preview(showBackground = true)
@Composable
fun PostFooterPrev(){
    PostFooter()
}
@Preview(showBackground = true)
@Composable
fun PostPrev(){
    Post()
}