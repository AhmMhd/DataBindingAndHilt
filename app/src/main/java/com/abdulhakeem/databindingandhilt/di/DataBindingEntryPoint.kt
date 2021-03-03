package com.abdulhakeem.databindingandhilt.di

import com.abdulhakeem.databindingandhilt.databinding.GlideImageAdapter
import com.abdulhakeem.databindingandhilt.di.scope.BindingScope
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@BindingScope
@InstallIn(BindingComponent::class)
interface DataBindingEntryPoint {

    @BindingScope
    fun getGlideImageAdapter() : GlideImageAdapter
}
