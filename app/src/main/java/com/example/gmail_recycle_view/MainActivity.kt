package com.example.gmail_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data  = ArrayList<ItemViewModel>()
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        data.add(ItemViewModel("PAPAKEN", "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt", "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ", "10:04AM"))
        val adapter = ItemAdapter(data)
        recyclerView.adapter = adapter
    }
}