package example.irina.coinapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val contactNemeTextView: TextView =
        itemView.findViewById(R.id.contact_name_text_view)


    fun bind(name:String){
        contactNemeTextView.text = name

    }
}