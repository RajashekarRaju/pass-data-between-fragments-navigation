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
class PassDataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_pass_data, container, false)

        val receiveDataTextView: TextView = view.findViewById(R.id.receive_data_text_view)
        val dataString: String? = PassDataFragmentArgs.fromBundle(arguments!!).passDataFragmentArgs
        receiveDataTextView.text = dataString

        return view
    }

}
