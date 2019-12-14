package www.sanju.tourism

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import www.sanju.tourism.Adapter.CenterZoomLayoutManager
import www.sanju.tourism.Adapter.TourAdapter
import www.sanju.tourism.Model.Places

class MainActivity : AppCompatActivity() {



    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  toursRV = findViewById<RecyclerView>(R.id.tours_RV)

        val linearLayoutManager = CenterZoomLayoutManager(this)


        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        linearLayoutManager.reverseLayout = true
        linearLayoutManager.stackFromEnd = true
        toursRV.layoutManager = linearLayoutManager// here u have to add




        //auto center views
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(toursRV)
        toursRV.isNestedScrollingEnabled = false



//
//        toursRV.layoutManager = LinearLayoutManager(
//            this,
//            LinearLayout.HORIZONTAL, false
//        )



        val places = ArrayList<Places>()

        places.add(Places("Los Angles","Los Angeles is a sprawling Southern California city and the center of the nation’s film and television industry. Near its iconic Hollywood sign, studios such as Paramount Pictures, Universal and Warner Brothers offer behind-the-scenes tours.",4.5f,"https://images.unsplash.com/photo-1554143091-c41d76e3da15?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80"))
        places.add(Places("China","China, officially the People's Republic of China, is a country in East Asia and is the world's most populous country, with a population of around 1.428 billion in 2017.",4.5f,"https://images.unsplash.com/photo-1529921879218-f99546d03a9d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80"))
        places.add(
            Places(
                "Tuvalu ",
                "Tuvalu, in the South Pacific, is an independent island nation within the British Commonwealth. Its 9 islands comprise small, thinly populated atolls and reef islands with palm-fringed beaches and WWII sites.",
                5f,
                "https://images.unsplash.com/photo-1483683804023-6ccdb62f86ef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80"
            )
        )
        places.add(Places("Tokyo","Tokyo, Japan’s busy capital, mixes the ultramodern and the traditional, from neon-lit skyscrapers to historic temples. The opulent Meiji Shinto Shrine is known for its towering gate and surrounding woods.",3.5f,"" +
                "https://images.unsplash.com/photo-1540959733332-eab4deabeeaf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1071&q=80"))



        toursRV.adapter = TourAdapter(this, places)




    }

}
