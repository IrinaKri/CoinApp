package example.irina.coinapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(private val contactNames:List<String>):
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
       val itemView=LayoutInflater.from(parent.context)
           .inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val name=contactNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
     return contactNames.size
    }
}