package com.danamon.common.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import com.danamon.common.base.viewmodel.BaseViewModel

abstract class BaseActivity <VB: ViewDataBinding, VM: BaseViewModel> : AppCompatActivity() {

    abstract fun setupView()
    abstract fun subscribeState()

    abstract val binding: VB
    abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
    }

    private fun setupBinding(){
        setContentView(binding.root)
        setupView()
        subscribeState()
        binding.executePendingBindings()
    }

}