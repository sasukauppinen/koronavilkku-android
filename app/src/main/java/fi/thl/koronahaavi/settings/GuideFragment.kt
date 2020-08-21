package fi.thl.koronahaavi.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import fi.thl.koronahaavi.R
import fi.thl.koronahaavi.databinding.FragmentGuideBinding

class GuideFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentGuideBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Using activity.layoutInflater instead of inflater because otherwise the button style
        // isn't the one defined in styles - https://issuetracker.google.com/issues/37042151
        val root = requireActivity().layoutInflater.inflate(R.layout.fragment_guide, container, false)
        binding = FragmentGuideBinding.bind(root)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listOf(binding.buttonGuideBack, binding.buttonGuideClose).forEach { closeButton ->
            closeButton.setOnClickListener {
                dismiss()
            }
        }
    }
}
