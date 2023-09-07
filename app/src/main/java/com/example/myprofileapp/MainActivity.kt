package com.example.myprofileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myprofileapp.ui.theme.MyProfileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProfileAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProfileApp()
                }
            }
        }
    }
}

@Composable
fun ProfileApp() {
    ProfileAppMainScreen(
        image = painterResource(id = R.drawable.slackprofileimage),
        modifier = Modifier,
        slackName = stringResource(id = R.string.full_name),
        intro = stringResource(id = R.string.intro_text)
    )

}

@Composable
fun ProfileAppMainScreen(
    modifier: Modifier,
    image: Painter,
    slackName: String,
    intro: String
) {
    // background gradient val declaration
    val brush = Brush.verticalGradient(
        listOf
            (
            colorResource(id = R.color.top_background_color),
            colorResource(id = R.color.bottom_background_color)
        )
    )
    // custom font declaration
    val fontFamily = FontFamily(Font(R.font.n))


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .background(brush)
            .padding(top = 100.dp, bottom = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Image(
            painter = image,
            contentDescription = "Profile Image",
            modifier = Modifier
                .padding(3.dp)
                .clip(CircleShape)
                .size(100.dp)
                .border(
                    width = 1.dp,
                    color = Color.White,
                    shape = CircleShape
                )
        )

        Text(
            text = slackName,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
            fontFamily = fontFamily
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = intro,
            color = Color.White,
            fontSize = 15.sp,
            fontFamily = fontFamily
        )

        Spacer(modifier = Modifier.height(35.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                //.background(Color.White)
                .width(300.dp)
                .height(50.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.White)


        ) {
            Text(
                text = "Open GitHub",
                color = Color.Black,
                fontSize = 20.sp,
                modifier = Modifier.padding(end = 10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.github),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = Color.Black
            )

        }

        Spacer(modifier = Modifier.height(35.dp))


        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                // .background(Color.White)
                .width(250.dp)
                .height(50.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.White)


        ) {
            Text(
                text = "Twitter",
                color = Color.Black,
                fontSize = 20.sp,
                modifier = Modifier.padding(end = 10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.x_twitter),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = Color.Black
            )

        }

        Spacer(modifier = Modifier.height(35.dp))


        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                //.background(Color.White)
                .width(200.dp)
                .height(50.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.White)


        ) {
            Text(
                text = "Slack",
                color = Color.Black,
                fontSize = 20.sp,
                modifier = Modifier.padding(end = 10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.slack),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = Color.Black
            )

        }

        Spacer(modifier = Modifier.height(15.dp))


            Text(text = "Made with love by 0xcode...", color = Color.White, textAlign = TextAlign.Right)


    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyProfileAppTheme {

    }
}