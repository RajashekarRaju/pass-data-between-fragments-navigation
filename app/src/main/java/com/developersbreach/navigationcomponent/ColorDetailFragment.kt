package com.developersbreach.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


/**
 * A simple [Fragment] subclass.
 */
class ColorDetailFragment : Fragment() {

    private val color: ColorDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val colorNameTextView: TextView = view.findViewById(R.id.color_name_detail_text_vew)
        val color: Color = color.colorDataArgs
        colorNameTextView.text = color.colorName
    }
}
