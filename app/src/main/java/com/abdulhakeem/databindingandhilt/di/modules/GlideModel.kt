package com.abdulhakeem.databindingandhilt.di.modules

import android.content.Context
import android.graphics.drawable.Drawable
import com.abdulhakeem.databindingandhilt.di.qualifiers.GlideGeneral
import com.abdulhakeem.databindingandhilt.di.qualifiers.GlideProfile
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GlideModel {

    @Provides
    @Singleton
    @GlideGeneral
    fun provideGlideProfileRequestManager(@ApplicationContext context: Context): RequestBuilder<Drawable> =
        Glide.with(context).asDrawable()


    @Provides
    @Singleton
    @GlideProfile
    fun provideGlideGeneralRequestManager(@ApplicationContext context: Context): RequestBuilder<Drawable> =
        Glide.with(context).asDrawable().centerCrop().override(100,100)


}