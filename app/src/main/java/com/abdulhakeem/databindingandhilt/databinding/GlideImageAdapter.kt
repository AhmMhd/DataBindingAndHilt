package com.abdulhakeem.databindingandhilt.databinding

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.abdulhakeem.databindingandhilt.di.qualifiers.GlideGeneral
import com.abdulhakeem.databindingandhilt.di.qualifiers.GlideProfile
import com.bumptech.glide.RequestBuilder
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class GlideImageAdapter @Inject constructor(
    @GlideProfile var glidePofile: RequestBuilder<Drawable?>,
    @GlideGeneral var glide: RequestBuilder<Drawable?>
) {

    @BindingAdapter("loadProfile")
    fun loadProfile(view: ImageView, url: String) {
        glidePofile.load(url).into(view)
    }

    @BindingAdapter("load")
    fun load(view: ImageView, url: String) {
        glide.load(url).into(view)
    }

}