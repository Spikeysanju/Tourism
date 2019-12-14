package www.sanju.tourism.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.rv_layout.view.*
import www.sanju.tourism.Model.Places
import www.sanju.tourism.R

class TourAdapter (val context: Context?, private val places: ArrayList<Places>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        holder.itemView.tour_image.clipToOutline = true
        Picasso.get().load(places[position].url).into(holder.itemView.tour_image)
        holder.itemView.tour_title.text = places[position].title
        holder.itemView.tour_description.text = places[position].description
        holder.itemView.ratingBar.rating = places[position].rating!!



        //Image Animation
        //  holder.newsImageUrl.animation = AnimationUtils.loadAnimation(context,R.anim.fade_image)


        //Card Animation
        // holder.card.animation = AnimationUtils.loadAnimation(context,R.anim.card_fade)    }



    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rv_layout, parent, false)
        return ViewHolder(v)


    }

    override fun getItemCount(): Int {
        return places.size
    }

}

class ViewHolder(v: View?) : RecyclerView.ViewHolder(v!!),View.OnClickListener {
    override fun onClick(v: View?) {



    }

    init {
        itemView.setOnClickListener(this)
    }


    val image = itemView.tour_image!!
    val title = itemView.tour_image!!
    val desc = itemView.tour_image!!





}