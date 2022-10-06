package com.danamon.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.danamon.common.base.viewmodel.BaseViewModel
import com.google.android.material.snackbar.Snackbar

abstract class BaseFragment<VB: ViewDataBinding, VM: BaseViewModel> : Fragment() {

    abstract fun setupView()
    abstract fun subscribeState()

    abstract val binding: VB
    abstract val viewModel: VM

    override fun onStart() {
        super.onStart()
        viewModel.showSnack.observe(this) { Snackbar.make(this.requireView(), it, Snackbar.LENGTH_SHORT).show() }
        viewModel.showToast.observe(this) { Toast.makeText(activity, it, Toast.LENGTH_SHORT).show() }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        subscribeState()
        performDataBinding()
    }

    private fun performDataBinding() {
        binding.lifecycleOwner = this
        binding.executePendingBindings()
    }

}