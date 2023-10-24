package com.example.eard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.eard.ui.theme.EardTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan, modifier = Modifier.padding(24.dp)) {
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EardTheme {
        Greeting("Mary")
    }
    GreetingPreview()
}

/*
*新しいプロジェクトを作成するには、Android Studio を開き、[New Project] > [Empty Compose Activity] > [Next] をクリックし、プロジェクトの名前を入力して設定を行います。
*アプリの外観を確認するには、[Preview] ペインを使用します。
*コンポーズ可能な関数は、通常の関数と似てはいますが少し異なります。関数名は大文字で始め、関数の前に @Composable アノテーションを追加します。@Composable 関数は何も返しません。
*Modifier は、コンポーザブルを拡張または装飾するために使用します。
 */