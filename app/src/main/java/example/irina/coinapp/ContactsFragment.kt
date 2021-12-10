package example.irina.coinapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ContactsFragment : Fragment() {

    lateinit var contactsRecyclerView: RecyclerView
    lateinit var webSiteButton: Button
    lateinit var callButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_contacts, container, false)

        val contactsNams: List<String> = listOf("Ivan", "Fyodor")

        webSiteButton = view.findViewById(R.id.website_button)
        callButton = view.findViewById(R.id.call_button)

        contactsRecyclerView = view.findViewById(R.id.contacts_recycler_view)
        contactsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        contactsRecyclerView.adapter = ContactsAdapter(contactsNams)
        webSiteButton.setOnClickListener {
            val link = Uri.parse("https://google.com/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        callButton.setOnClickListener {
            val phoneNumber = Uri.parse("tel:+79219909090")
            val callIntent = Intent(Intent.ACTION_DIAL,phoneNumber)
            context?.startActivity(callIntent)
        }

        return view
    }


}