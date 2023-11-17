package com.androidcourse.androidlabs.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.androidcourse.androidlabs.R
import com.androidcourse.androidlabs.databinding.FragmentDetailsBinding
import com.bumptech.glide.Glide


class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: DetailsFragmentArgs by navArgs()

        with(binding) {
            Glide.with(view)
                .load(args.animalModel.icon)
                .centerCrop()
                .placeholder(imageView.drawable)
                .error(R.drawable.ic_broken_image)
                .fallback(R.drawable.ic_no_image)
                .into(imageView)

            textName.text = args.animalModel.name
            textAge.text = args.animalModel.age.toString()
            textDescription.text = args.animalModel.description
        }
    }

}