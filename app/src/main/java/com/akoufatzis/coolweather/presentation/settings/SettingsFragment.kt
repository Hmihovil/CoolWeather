package com.akoufatzis.coolweather.presentation.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.akoufatzis.coolweather.databinding.FragmentSettingsBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SettingsFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val settingsViewModel: SettingsViewModel by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProvider(this, viewModelFactory).get(SettingsViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentSettingsBinding.inflate(inflater, container, false)

        settingsViewModel.viewState.observe(viewLifecycleOwner, Observer {
            if (it.data != null) {
                when (it.data) {
                    TemperatureUnit.CELSIUS -> {
                        binding.tbTempUnit.isChecked = true
                    }
                    TemperatureUnit.FAHRENHEIT -> {
                        binding.tbTempUnit.isChecked = false
                    }
                }
            }
        })

        binding.tbTempUnit.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                settingsViewModel.setTemperatureUnit(TemperatureUnit.CELSIUS)
            } else {
                settingsViewModel.setTemperatureUnit(TemperatureUnit.FAHRENHEIT)
            }
        }
        return binding.root
    }
}
