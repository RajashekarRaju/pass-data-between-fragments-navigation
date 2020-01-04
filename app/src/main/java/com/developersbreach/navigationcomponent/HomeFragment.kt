package com.developersbreach.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val firstFragmentCardView: CardView = view.findViewById(R.id.first_fragment_card_view)
        val passTextDataCardView: CardView = view.findViewById(R.id.pass_data_card_view)
        val recyclerViewCardView: CardView = view.findViewById(R.id.recycler_view_card_view)

        firstFragmentCardView.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_firstFragment)
        }

        passTextDataCardView.setOnClickListener {
            val passDataTextView: TextView = view.findViewById(R.id.pass_data_text_view)
            val textData: String = passDataTextView.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToPassDataFragment(textData)
            view.findNavController().navigate(action)
        }

        recyclerViewCardView.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_colorListFragment)
        }

        return view
    }

}
