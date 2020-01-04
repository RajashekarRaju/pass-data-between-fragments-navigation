package com.developersbreach.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class ColorDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_color_detail, container, false)

        val colorNameTextView: TextView = view.findViewById(R.id.color_name_detail_text_vew)
        val color: Color = ColorDetailFragmentArgs.fromBundle(arguments!!).colorDetailFragmentArgs
        colorNameTextView.text = color.colorName

        return view
    }


}
