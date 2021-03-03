package com.abdulhakeem.databindingandhilt.di

import androidx.databinding.DataBindingComponent
import com.abdulhakeem.databindingandhilt.di.scope.BindingScope
import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent

@BindingScope
@DefineComponent(parent = SingletonComponent::class)
interface BindingComponent : DataBindingComponent
