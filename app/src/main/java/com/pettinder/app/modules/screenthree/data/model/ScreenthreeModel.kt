package com.pettinder.app.modules.screenthree.`data`.model

import com.pettinder.app.R
import com.pettinder.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenthreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGettoknow: String? = MyApp.getInstance().resources.getString(R.string.msg_get_to_know_your)

)
