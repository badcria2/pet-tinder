package com.pettinder.app.modules.screenfour.`data`.model

import com.pettinder.app.R
import com.pettinder.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenfourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindyourdoga: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_dog_a)

)
