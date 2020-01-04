package com.developersbreach.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass.
 */
class ColorListFragment : Fragment() {

    private lateinit var colorList: List<Color>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_color_list, container, false)

        colorList = listOf(
            Color("Red"), Color("Green"), Color("Blue"),
            Color("Yellow"), Color("Black"), Color("White"),
            Color("Brown"), Color("Orange"), Color("Grey"),
            Color("Purple"), Color("Green"), Color("Pink"),
            Color("Amber"), Color("Cyan"), Color("Teal")
        )

        val recyclerView: RecyclerView = view.findViewById(R.id.color_recycler_view)
        val adapter = ColorAdapter(colorList, ColorAdapter.OnClickListener { colorName ->
            view.findNavController().navigate(
                ColorListFragmentDirections.actionColorListFragmentToColorDetailFragment(colorName)
            )
        })
        recyclerView.adapter = adapter

        return view
    }

}
